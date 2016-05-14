package com.e_clinic.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class MedicalRecord {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Patient patientId;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Doctor doctorId;
	private String sickness;
	private String medication;
	@Temporal(TemporalType.DATE)
	private Date date;

	public MedicalRecord() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	public Doctor getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}

	public String getSickness() {
		return sickness;
	}

	public void setSickness(String sickness) {
		this.sickness = sickness;
	}

	public String getMedication() {
		return medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
