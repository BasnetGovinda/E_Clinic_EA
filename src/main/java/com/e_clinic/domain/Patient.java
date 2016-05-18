package com.e_clinic.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Patient{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String lastName;

	@Transient
	private String tempdate;
	private String firstName;
	// @DateTimeFormat(pattern = "MM/dd/yyyy")
	// @Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private double height;
	private double weight;
	private String bloodType;
	private String email;
	private long phoneNo;
	@OneToMany(mappedBy = "patientId")
	private List<MedicalRecord> medicalRecord;
	public void setId(int id) {
		this.id = id;
	}

	@OneToMany(mappedBy = "patientId")
	private List<Appointment> appointment;

	public Patient(String lastName, String tempdate, String firstName, double height, double weight, String bloodType,
			String email, long phoneNo) {
		this.lastName = lastName;
		this.tempdate = tempdate;
		this.firstName = firstName;
		this.height = height;
		this.weight = weight;
		this.bloodType = bloodType;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public String getTempdate() {
		return tempdate;
	}

	public void setTempdate(String tempdate) {
		this.tempdate = tempdate;
	}

	public Patient() {
		super();
	}

	public int getId() {
		return id;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<MedicalRecord> getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(List<MedicalRecord> medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

}
