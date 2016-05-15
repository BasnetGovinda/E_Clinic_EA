package com.e_clinic.service;

import java.util.List;

import com.e_clinic.domain.Patient;

public interface PatientService {

	void save(Patient pp);

	List<Patient> getallData();

	Patient find(int id);

	void update(Patient patient);

	void delete(int id);
	
	

}
