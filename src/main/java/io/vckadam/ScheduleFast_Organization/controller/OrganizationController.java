package io.vckadam.ScheduleFast_Organization.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import io.vckadam.ScheduleFast_Organization.model.Organization;
import java.util.List;


@RestController
public class OrganizationController {
	
	//get list of all the organization
	@RequestMapping(value="organizations", method=RequestMethod.GET)
	public @ResponseBody List<Organization> getAllOrganization() {
		
	}
	
	//get an organization by given id
	@RequestMapping(value="organizations/{id}", method=RequestMethod.GET)
	public @ResponseBody Organization getOrganization(@PathVariable int id) {
		
	}
	
	//create an organization
	@RequestMapping(value="organizations", method=RequestMethod.POST)
	public @ResponseBody Organization creatOrganization(@RequestBody Organization organization) {
		
	}
	
	//update an organization by given id with provided request body
	@RequestMapping(value="organizations/{id}", method=RequestMethod.PUT)
	public @ResponseBody Organization updateOrganization(@PathVariable int id, @RequestBody Organization organization) {
		
	}
	
	//delete an organization by given id
	@RequestMapping(value="organizations/{id}", method=RequestMethod.DELETE)
	public @ResponseBody Organization deleteOrganization(@PathVariable int id) {
		
	}
}
