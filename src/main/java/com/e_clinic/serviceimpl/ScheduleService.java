package com.e_clinic.serviceimpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.e_clinic.dao.IScheduleDao;
import com.e_clinic.domain.Doctor;
import com.e_clinic.domain.Schedule;
import com.e_clinic.service.IScheduleService;

@Service
@Transactional
public class ScheduleService implements IScheduleService{

	@Autowired
	private IScheduleDao scheduleDao;	
	
	@Override
	public void save(Schedule schedule) {
		// TODO Auto-generated method stub
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		Date date = null;
		try {
			date = simpleDateFormat.parse(schedule.getTempdate());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
		schedule.setDate(date);
		scheduleDao.save(schedule);
		
	}

	@Override
	public void update(Schedule schedule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Schedule> findAll() {
		// TODO Auto-generated method stub
		return (List<Schedule>)scheduleDao.findAll();
	}

	@Override
	public Schedule findOne(int id) {
		// TODO Auto-generated method stub
		return scheduleDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
