package com.e_clinic.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.e_clinic.dao.IDoctorDao;
import com.e_clinic.domain.Doctor;
import com.e_clinic.domain.Patient;

public class Doctor_DAO extends GenericDaoImpl<Doctor> implements IDoctorDao {

	public Doctor_DAO() {
		super.setDaoType(Doctor.class);
	}
	
}
