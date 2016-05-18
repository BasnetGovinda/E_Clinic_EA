package com.e_clinic.service;

import java.util.List;

import com.e_clinic.domain.Schedule;


public interface IScheduleService {
	public void save( Schedule schedule) ;
	public void update( Schedule schedule);
	public List<Schedule> findAll();
	public Schedule findOne(int id);
	void delete(int id);
}
