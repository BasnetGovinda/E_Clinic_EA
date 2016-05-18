package com.e_clinic.domain;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
public class Schedule {
	@Id
	@GeneratedValue
	private int id;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Doctor doctorId;
	//@Temporal(TemporalType.DATE)
	private Date date;
	
	@Transient
	private String tempdate;
	
	@Temporal(TemporalType.TIME)
	private Date time;
	
	boolean available;

	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Doctor getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getTempdate() {
		return tempdate;
	}

	public void setTempdate(String tempdate) {
		this.tempdate = tempdate;
	}
	
	

}
