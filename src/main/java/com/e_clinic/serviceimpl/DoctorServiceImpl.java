package com.e_clinic.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.e_clinic.dao.IDoctorDao;
import com.e_clinic.dao.IScheduleDao;
import com.e_clinic.domain.Doctor;
import com.e_clinic.domain.Schedule;
import com.e_clinic.service.IDoctorService;

@Service
@Transactional
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorDao doctorDao;	
	@Autowired
	private IScheduleDao scheduleDao;
	
	public void save( Doctor doctor) {  		
		doctorDao.save(doctor);
	}
	
	
    public void update( Doctor doctor) {  		
    	doctorDao.update(doctor);
	}
	
	
	public List<Doctor> findAll() {
		return (List<Doctor>)doctorDao.findAll();
	}

 	public Doctor findOne(int id) {
		return doctorDao.findOne(id);
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("null")
	@Override
	public List<Schedule> getDate(int id) {
		// TODO Auto-generated method stub
		List<Schedule> dd = scheduleDao.findAll();
		List<Schedule> newsch = new ArrayList<>();
		for (Schedule sch : dd) {
			if (sch.getDoctorId().getId() == id && sch.isAvailable()) {
				newsch.add(sch);
				// System.out.println(doctor.getId());
			}
		}

		return newsch;
	}

}

