package com.e_clinic.daoimpl;

import org.springframework.stereotype.Repository;

import com.e_clinic.dao.PatientDao;
import com.e_clinic.domain.Patient;

@Repository
public class PatientDaoImpl extends GenericDaoImpl<Patient> implements PatientDao {

	public PatientDaoImpl() {
		super.setDaoType(Patient.class);
	}
	
}
