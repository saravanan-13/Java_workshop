package com.sapient.pe.model;

public class Address {
	private String door_no;
	private String street;
	private String area;
	private String city;
	private String zipcode;
	
	public Address(String street, String area, String city, String zipcode) {
		this.street = street;
		this.area = area;
		this.city = city;
		this.zipcode = zipcode;
	}

	public String getDoor_no() {
		return door_no;
	}

	public void setDoor_no(String door_no) {
		this.door_no = door_no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String displayAddress() {
		String address = door_no+" "+street+" "+area+" "+city+" "+zipcode;
		return address;
	 }
	
}
