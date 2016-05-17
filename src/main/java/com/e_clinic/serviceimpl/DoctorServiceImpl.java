package com.e_clinic.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.e_clinic.dao.DoctorDao;
import com.e_clinic.domain.Doctor;
import com.e_clinic.service.DoctorService;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorDao doctorDAO;

	@Override
	public void save(Doctor doctor) {
		// TODO Auto-generated method stub
		// Doctor p = pp;
/*		String ss = doctor.getTempdate();
		String[] test = ss.split("-");

		// String newdate = test[2] + "/" + test[1] + "/" + test[0];

		int year = Integer.parseInt(test[2]);
		int month = Integer.parseInt(test[1]);
		int day = Integer.parseInt(test[0]);

		Date dd = new Date(year, month, day);
		System.out.println(dd);
		doctor.setDateOfBirth(dd);*/
		doctorDAO.save(doctor);

	}

	@Override
	public List<Doctor> getallData() {
		// TODO Auto-generated method stub
		return doctorDAO.findAll();

	}

	@Override
	public Doctor find(int id) {
		// TODO Auto-generated method stub
		return doctorDAO.findOne(id);
	}

	@Override
	public void update(Doctor doctor) {
		doctorDAO.update(doctor);

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		doctorDAO.delete(id);
	}

}
