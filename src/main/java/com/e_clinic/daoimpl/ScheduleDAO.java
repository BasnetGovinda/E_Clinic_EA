package com.e_clinic.daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.e_clinic.dao.IScheduleDao;
import com.e_clinic.domain.Doctor;
import com.e_clinic.domain.Schedule;

public class ScheduleDAO extends GenericDaoImpl<Schedule> implements IScheduleDao {
	
	public ScheduleDAO() {
		super.setDaoType(Schedule.class);
	}
}
