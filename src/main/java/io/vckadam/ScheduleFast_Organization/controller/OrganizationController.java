package io.vckadam.ScheduleFast_Organization.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.vckadam.ScheduleFast_Organization.model.Organization;
import io.vckadam.ScheduleFast_Organization.repository.OrganizationRepository;


@RestController
@RequestMapping("/schedulefast")
public class OrganizationController {
	
	@Autowired
	private OrganizationRepository organizationRepository;
	
	//get list of all the organization
	@RequestMapping(value="organizations", method=RequestMethod.GET)
	public @ResponseBody List<Organization> getAllOrganization() {
		return this.organizationRepository.findAll();
	}
	
	//get an organization by given id
	@RequestMapping(value="organizations/{id}", method=RequestMethod.GET)
	public @ResponseBody Optional<Organization> getOrganization(@PathVariable Long id) {
		return this.organizationRepository.findById(id);
	}
	
	//create an organization
	@RequestMapping(value="organizations", method=RequestMethod.POST)
	public @ResponseBody Organization creatOrganization(@RequestParam String name, @RequestParam String description) {
		Organization organization = new Organization(name, description);
		return this.organizationRepository.save(organization);
	}
	
	//update an organization by given id with provided request body
	@RequestMapping(value="organizations/{id}", method=RequestMethod.PUT)
	public @ResponseBody Organization updateOrganization(@PathVariable int id, @RequestBody Organization organization) {
		return null;
	}
	
	//delete an organization by given id
	@RequestMapping(value="organizations/{id}", method=RequestMethod.DELETE)
	public @ResponseBody Organization deleteOrganization(@PathVariable Long id) {
		return null;
		
	}
}
