package siarhei.pashkou.versteigerung.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import siarhei.pashkou.versteigerung.service.SHABService;
import siarhei.pashkou.versteigerung.shab.json.model.RegistrationOffice;

@RestController
public class SHABController {

	@Autowired
	SHABService shabService;
	
	@RequestMapping("/list")
    public List<RegistrationOffice> getList() throws IOException {
        return shabService.getList();
    }
}
