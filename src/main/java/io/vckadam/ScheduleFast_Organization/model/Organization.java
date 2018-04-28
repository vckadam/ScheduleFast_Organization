package io.vckadam.ScheduleFast_Organization.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Organization {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name, description;
	
	public Organization() { }
	
	public Organization(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public Long getOrganization_id() {
		return id;
	}
	public void setOrganization_id(Long id) {
		this.id = id;
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
