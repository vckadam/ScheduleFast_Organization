package io.vckadam.ScheduleFast_Organization.model;

public class Organization {
	private int organization_id;
	private String name, description;
	public Organization(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public int getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(int organization_id) {
		this.organization_id = organization_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
