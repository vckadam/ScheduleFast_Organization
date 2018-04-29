package io.vckadam.ScheduleFast_Organization.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public @ResponseBody Organization creatOrganization(@RequestBody Organization organization) {
		return this.organizationRepository.save(organization);
	}
	
	//update an organization by given id with provided request body
	@RequestMapping(value="organizations/{id}", method=RequestMethod.PUT)
	public @ResponseBody Organization updateOrganization(@PathVariable Long id, @RequestBody Organization organization) {
		Optional<Organization> existingOrganization = this.organizationRepository.findById(id);
		Organization org = existingOrganization.get();
		if(organization.getName() != null) org.setName(organization.getName());
		if(organization.getDescription() != null) org.setDescription(organization.getDescription());
		return this.organizationRepository.save(org);
	}
	
	//delete an organization by given id
	@RequestMapping(value="organizations/{id}", method=RequestMethod.DELETE)
	public void deleteOrganization(@PathVariable Long id) {
		this.organizationRepository.deleteById(id);
	}
}
