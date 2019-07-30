package siarhei.pashkou.versteigerung.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SHABController {

	@RequestMapping("/shab")
    public String index() {
        return "Greetings from Spring Boot 4";
    }
}
