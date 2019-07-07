package siarhei.pashkou.myassessment_spring;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import siarhei.pashkou.versteigerung.repository.InventoryRepository;
import siarhei.pashkou.versteigerung.repository.MerchandiseEntity;

@RestController
public class HelloController {

	
	@Autowired
	InventoryRepository inventoryRepository;
	
    @RequestMapping("/")
    public String index() {
    	test();
        return "Greetings from Spring Boot!";
    }
    
    public void test() {
		

		 
		MerchandiseEntity pants = new MerchandiseEntity("Pair of Pants", 1L);
		pants = inventoryRepository.save(pants);
		Optional<MerchandiseEntity> findById = inventoryRepository.findById(1L);
		System.out.println();
}

}
