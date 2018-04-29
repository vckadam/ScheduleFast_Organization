package io.vckadam.ScheduleFast_Organization.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.vckadam.ScheduleFast_Organization.model.Organization;
import io.vckadam.ScheduleFast_Organization.service.OrganizatinService;


@RestController
@RequestMapping("/schedulefast")
public class OrganizationController {
	
	@Autowired
	private OrganizatinService organizationService;
	
	//get list of all the organization
	@RequestMapping(value="organizations", method=RequestMethod.GET)
	public @ResponseBody List<Organization> getAllOrganization() {
		return this.organizationService.getAllOrganization();
	}
	
	//get an organization by given id
	@RequestMapping(value="organizations/{id}", method=RequestMethod.GET)
	public @ResponseBody Organization getOrganization(@PathVariable Long id) {
		return this.organizationService.getOrganization(id);
	}
	
	//create an organization
	@RequestMapping(value="organizations", method=RequestMethod.POST)
	public @ResponseBody Organization creatOrganization(@RequestBody Organization organization) {
		return this.organizationService.creatOrganization(organization);
	}
	
	//update an organization by given id with provided request body
	@RequestMapping(value="organizations/{id}", method=RequestMethod.PUT)
	public @ResponseBody Organization updateOrganization(@PathVariable Long id, @RequestBody Organization organization) {
		return this.organizationService.updateOrganization(id, organization);
	}
	
	//delete an organization by given id
	@RequestMapping(value="organizations/{id}", method=RequestMethod.DELETE)
	public void deleteOrganization(@PathVariable Long id) {
		this.organizationService.deleteOrganization(id);
	}
}
