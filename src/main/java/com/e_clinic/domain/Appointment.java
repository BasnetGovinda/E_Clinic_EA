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
public class Appointment {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Appointment patientId;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Doctor doctorId;
	@Temporal(TemporalType.DATE)
	private Date appointmentDate;
	@Temporal(TemporalType.TIME)
	private Date appointmentTime;

	public Appointment() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Appointment getPatientId() {
		return patientId;
	}

	public void setPatientId(Appointment patientId) {
		this.patientId = patientId;
	}

	public Doctor getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Date getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

}
