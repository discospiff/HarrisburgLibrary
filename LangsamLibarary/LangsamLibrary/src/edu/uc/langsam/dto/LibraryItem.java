package edu.uc.langsam.dto;

public class LibraryItem {

	public static final String CHECKED_IN = "Available";
	public static final String CHECKED_OUT = "Checked Out";
	
	private int itemNumber;
	private String title;
	private String type;
	private String status;
	
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return title;
	}
	
	
}
