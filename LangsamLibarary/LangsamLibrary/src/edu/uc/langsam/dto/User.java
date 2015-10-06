package edu.uc.langsam.dto;

import java.util.List;

public class User {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBearcatId() {
		return bearcatId;
	}
	public void setBearcatId(String bearcatId) {
		this.bearcatId = bearcatId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public List<LibraryItem> getBorrowed() {
		return borrowed;
	}
	public void setBorrowed(List<LibraryItem> borrowed) {
		this.borrowed = borrowed;
	}
	private int id;
	private String bearcatId;
	private String firstName;
	private String lastName;
	private String college;
	private List<LibraryItem> borrowed;
}
