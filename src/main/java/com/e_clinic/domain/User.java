package com.e_clinic.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private String role;
	@OneToOne
	@JoinColumn(name = "p_id")
	private Patient patient;
	@OneToOne
	@JoinColumn(name = "d_id")
	private Doctor doctor;	
	private boolean enabled;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public User(String username, String password, String role, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
		this.enabled = enabled;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Patient getpId() {
		return patient;
	}

	public void setpId(Patient pId) {
		this.patient = pId;
	}

	public Doctor getdId() {
		return doctor;
	}

	public void setdId(Doctor dId) {
		this.doctor = dId;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
