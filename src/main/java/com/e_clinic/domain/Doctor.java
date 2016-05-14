package com.e_clinic.domain;

import java.util.Date;

public class Doctor {
	private int id;
	private String lastName;
	private String firstName;
	private Date dateOfBirth;
	private String sepcialization;
	private String email;

	public Doctor() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSepcialization() {
		return sepcialization;
	}

	public void setSepcialization(String sepcialization) {
		this.sepcialization = sepcialization;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
