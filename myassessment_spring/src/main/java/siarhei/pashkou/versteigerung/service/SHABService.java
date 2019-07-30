package siarhei.pashkou.versteigerung.service;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import siarhei.pashkou.versteigerung.shab.db.model.SHABEntry;
import siarhei.pashkou.versteigerung.shab.json.model.Content;
import siarhei.pashkou.versteigerung.shab.json.model.Meta;
import siarhei.pashkou.versteigerung.shab.json.model.RegistrationOffice;
import siarhei.pashkou.versteigerung.shab.json.model.SearchResult;

@Service
public class SHABService {

	private static final String SHAB_LIST_URL = "https://www.shab.ch/api/v1/publications?allowRubricSelection=true&includeContent=false&pageRequest.page=0&pageRequest.size=100&publicationDate.end=2019-07-07&publicationDate.start=2019-07-01&publicationStates=PUBLISHED&publicationStates=CANCELLED&searchPeriod=LAST7DAYS&subRubrics=SB01";
	private static final String SHAB_SINGE_RESULT_URL = "https://www.shab.ch/api/v1/publications/";

//	@Autowired
	//SHABEntryRepository shabEntryRepository;

	@PostConstruct
	public void init() {
		try {
			getList();
			// retrieveAllResults();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getList() throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<SearchResult> response = restTemplate.getForEntity(SHAB_LIST_URL, SearchResult.class);

		SearchResult searchResult = response.getBody();
		for (Content content : searchResult.getContent()) {
			SHABEntry entry = new SHABEntry();
			fillMetaData(entry, content.getMeta());
			
			RegistrationOffice registrationOffice = content.getMeta().getRegistrationOffice();
			
			System.out.println(registrationOffice.toString());

			//shabEntryRepository.save(entry);
		}

	}

	private void fillMetaData(SHABEntry entry, Meta meta) {
		entry.setMetaId(meta.getId());
		entry.setRubric(meta.getRubric());
		entry.setSubRubric(meta.getSubRubric());
		entry.setLanguage(meta.getLanguage());
		entry.setCreationDate(meta.getCreationDate());
		entry.setUpdateDate(meta.getUpdateDate());
	}

	/*public void retrieveAllResults() throws IOException {
		RestTemplate restTemplate = new RestTemplate();

		for (SHABEntry shabEntry : shabEntryRepository.findAll()) {
			ResponseEntity<String> response = restTemplate
					.getForEntity(SHAB_SINGE_RESULT_URL + shabEntry.getMetaId() + "/xml", String.class);

		}

	}*/
}
