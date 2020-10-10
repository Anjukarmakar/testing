package com.poc.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@Entity
@XmlRootElement(name = "Person")
public class Person {
	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String jobTitle;

	private String jobDescription;

	private String country;

	private String state;

	private String availability;

	private Integer replyRate;

	private Integer payRate;

	private Integer experience;

	private String skills;

	private String language;

	private String jobType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public Integer getReplyRate() {
		return replyRate;
	}

	public void setReplyRate(Integer replyRate) {
		this.replyRate = replyRate;
	}

	public Integer getPayRate() {
		return payRate;
	}

	public void setPayRate(Integer payRate) {
		this.payRate = payRate;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

}
