package siarhei.pashkou.versteigerung.service;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import siarhei.pashkou.versteigerung.shab.model.Content;
import siarhei.pashkou.versteigerung.shab.model.SearchResult;

@Service
public class SHABService {

	private static final String SHAB_LIST_URL = "https://www.shab.ch/api/v1/publications?allowRubricSelection=true&includeContent=false&pageRequest.page=0&pageRequest.size=100&publicationDate.end=2019-07-07&publicationDate.start=2019-07-01&publicationStates=PUBLISHED&publicationStates=CANCELLED&searchPeriod=LAST7DAYS&subRubrics=SB01";
	private static final String SHAB_SINGE_RESULT_URL = "https://www.shab.ch/api/v1/publications/005c2551-9361-4bc5-9e52-8bae8ba4e796/xml";

	
	@PostConstruct
	public void init() {
		try {
			getList();
			retrieveSingleResponse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getList() throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<SearchResult> response
		  = restTemplate.getForEntity(SHAB_LIST_URL, SearchResult.class);
		

		SearchResult searchResult = response.getBody();
		List<Content> searchList = searchResult.getContent();
		
	}

	
	
	public void retrieveSingleResponse() throws IOException {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response
		  = restTemplate.getForEntity(SHAB_SINGE_RESULT_URL, String.class);
	
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(response.getBody());
		JsonNode name = root.path("name");
	}
}
