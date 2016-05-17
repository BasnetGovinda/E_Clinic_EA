package com.e_clinic.service;

import java.util.List;

import com.e_clinic.domain.Doctor;

public interface DoctorService {

	void save(Doctor pp);

	List<Doctor> getallData();

	Doctor find(int id);

	void update(Doctor doctor);

	void delete(int id);
	
	

}
