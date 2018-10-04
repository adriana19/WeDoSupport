package controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import model.Eid;
import services.EidServiceImpl;

/**
 * Handles requests for the application home page.
 */


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/eids")
public class MainController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(method = RequestMethod.GET, headers="Accept=application/json")
	public List<Eid> getAllEids() {
		
		EidServiceImpl eidService = new EidServiceImpl();
		List<Eid> allEids = eidService.getAllEids();
		
		System.out.println(allEids);
		
		return allEids;
		
	}
	
}
