package io.vckadam.ScheduleFast_Organization.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.vckadam.ScheduleFast_Organization.model.Organization;
import io.vckadam.ScheduleFast_Organization.repository.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizatinService {

	@Autowired
	private OrganizationRepository organizationRepository;
	
	@Override
	public List<Organization> getAllOrganization() {
		return this.organizationRepository.findAll();
	}

	@Override
	public Organization getOrganization(Long id) {
		return this.organizationRepository.findById(id).orElse(null);
	}

	@Override
	public Organization creatOrganization(Organization organization) {
		return this.organizationRepository.save(organization);
	}

	@Override
	public Organization updateOrganization(Long id, Organization organization) {
		Organization existingOrganization = this.getOrganization(id);
		if(existingOrganization  != null) {
			if(organization.getName() != null) 
				existingOrganization.setName(organization.getName());
			if(organization.getDescription() != null) 
				existingOrganization.setDescription(organization.getDescription());
			return this.organizationRepository.save(existingOrganization);
		}
		return null;
	}

	@Override
	public void deleteOrganization(Long id) {
		this.organizationRepository.deleteById(id);
	}
	
	
}
