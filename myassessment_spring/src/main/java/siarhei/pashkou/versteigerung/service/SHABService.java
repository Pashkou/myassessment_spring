package siarhei.pashkou.versteigerung.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import siarhei.pashkou.versteigerung.shab.json.model.Content;
import siarhei.pashkou.versteigerung.shab.json.model.RegistrationOffice;
import siarhei.pashkou.versteigerung.shab.json.model.SearchResult;

@Service
public class SHABService {

	private static final String SHAB_LIST_URL = "https://www.shab.ch/api/v1/publications?allowRubricSelection=true&includeContent=false&pageRequest.page=0&pageRequest.size=100&publicationDate.end=2019-07-07&publicationDate.start=2019-07-01&publicationStates=PUBLISHED&publicationStates=CANCELLED&searchPeriod=LAST7DAYS&subRubrics=SB01";
	private static final String SHAB_SINGE_RESULT_URL = "https://www.shab.ch/api/v1/publications/";


	public List<RegistrationOffice> getList() throws IOException {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<SearchResult> response = restTemplate.getForEntity(SHAB_LIST_URL, SearchResult.class);
		List<RegistrationOffice> result = new ArrayList<>();
		SearchResult searchResult = response.getBody();
		for (Content content : searchResult.getContent()) {
			result.add(content.getMeta().getRegistrationOffice());
		}
		return result;

	}

}
