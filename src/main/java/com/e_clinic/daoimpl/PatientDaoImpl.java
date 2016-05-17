package com.e_clinic.daoimpl;

import org.springframework.stereotype.Repository;

import com.e_clinic.dao.DoctorDao;
import com.e_clinic.domain.Doctor;

@Repository
public class PatientDaoImpl extends GenericDaoImpl<Doctor> implements DoctorDao {

	public PatientDaoImpl() {
		super.setDaoType(Doctor.class);
	}
	
}
