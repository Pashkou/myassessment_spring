package siarhei.pashkou.versteigerung.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import siarhei.pashkou.versteigerung.shab.json.model.list.Content;
import siarhei.pashkou.versteigerung.shab.json.model.list.RegistrationOffice;
import siarhei.pashkou.versteigerung.shab.json.model.list.SearchResult;
import siarhei.pashkou.versteigerung.shab.json.model.single.Codebeautify;

@Service
public class SHABService {

	private static final String SHAB_LIST_URL = "https://www.shab.ch/api/v1/publications?allowRubricSelection=true&includeContent=false&pageRequest.page=0&pageRequest.size=100&publicationDate.end=2019-07-07&publicationDate.start=2019-07-01&publicationStates=PUBLISHED&publicationStates=CANCELLED&searchPeriod=LAST7DAYS&subRubrics=SB01";
	private static final String SHAB_SINGE_RESULT_URL = "https://www.shab.ch/api/v1/publications/d65b2f4e-0337-4096-9d83-f0f1bb7b288b/xml";
	
	//Check this site
	//https://www.shab.ch/#!/search/publications/detail/d65b2f4e-0337-4096-9d83-f0f1bb7b288b

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
	
	public Object getSingleResult() throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
		
		ResponseEntity<Codebeautify> forEntity = restTemplate.getForEntity(SHAB_SINGE_RESULT_URL, Codebeautify.class);
		return forEntity;
		
	}

}
