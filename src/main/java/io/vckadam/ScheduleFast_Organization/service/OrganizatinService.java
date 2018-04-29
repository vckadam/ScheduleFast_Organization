package io.vckadam.ScheduleFast_Organization.service;

import java.util.List;


import io.vckadam.ScheduleFast_Organization.model.Organization;

public interface OrganizatinService {
	List<Organization> getAllOrganization();
	Organization getOrganization(Long id);
	Organization creatOrganization(Organization organization);
	Organization updateOrganization(Long id, Organization organization);
	void deleteOrganization(Long id);
}
