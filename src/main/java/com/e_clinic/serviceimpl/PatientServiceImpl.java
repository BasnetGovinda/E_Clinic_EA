package com.e_clinic.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.e_clinic.dao.PatientDao;
import com.e_clinic.domain.Patient;
import com.e_clinic.service.PatientService;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientDao patientDAO;

	@Override
	public void save(Patient patient) {
		// TODO Auto-generated method stub
		// Patient p = pp;
		String ss = patient.getTempdate();
		String[] test = ss.split("-");

		// String newdate = test[2] + "/" + test[1] + "/" + test[0];

		int year = Integer.parseInt(test[2]);
		int month = Integer.parseInt(test[1]);
		int day = Integer.parseInt(test[0]);

		Date dd = new Date(year, month, day);
		System.out.println(dd);
		patient.setDateOfBirth(dd);
		patientDAO.save(patient);

	}

	@Override
	public List<Patient> getallData() {
		// TODO Auto-generated method stub
		return patientDAO.findAll();

	}

	@Override
	public Patient find(int id) {
		// TODO Auto-generated method stub
		return patientDAO.findOne(id);
	}

	@Override
	public void update(Patient patient) {
		patientDAO.update(patient);

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		patientDAO.delete(id);
	}

}
