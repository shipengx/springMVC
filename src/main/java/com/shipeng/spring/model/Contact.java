package com.shipeng.spring.model;

public class Contact {
	private int id;
	private String name;
	private String email;
	private String address;
	private String telephone;

	public Contact() {
	}

	public Contact(String name, String email, String address, String telephone) {
		this.name      = name;
		this.email     = email;
		this.address   = address;
		this.telephone = telephone;
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int value) {
		this.id = value;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String value) {
		this.address = value;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String value) {
		this.telephone = value;
	}

}
