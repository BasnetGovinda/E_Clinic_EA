package com.e_clinic.service;

import java.util.List;

import com.e_clinic.domain.Doctor;
import com.e_clinic.domain.Schedule;

public interface IDoctorService {

	public void save( Doctor doctor) ;
	public void update( Doctor doctor);
	public List<Doctor> findAll();
	public Doctor findOne(int id);
	void delete(int id);
	public List<Schedule> getDate(int id);
}
