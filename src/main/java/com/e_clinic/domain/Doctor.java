package com.e_clinic.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Doctor {
	@Id 
	@GeneratedValue
	private int id;
	private String lastName;
	private String firstName;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private String sepcialization;
	private String email;
	@OneToMany(mappedBy = "doctorId",fetch=FetchType.EAGER)
	@JsonIgnore
	private List<Appointment> appointment;
	@OneToMany(mappedBy = "doctorId",fetch=FetchType.EAGER)
	@JsonIgnore
	private List<Schedule> schedule;

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

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public List<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(List<Schedule> schedule) {
		this.schedule = schedule;
	}

}
