package com.e_clinic.daoimpl;

import org.springframework.stereotype.Repository;

import com.e_clinic.dao.PatientDao;
import com.e_clinic.domain.Patient;

@Repository
public class DoctorDaoImpl extends GenericDaoImpl<Patient> implements PatientDao {

	public DoctorDaoImpl() {
		super.setDaoType(Patient.class);
	}
	
}
