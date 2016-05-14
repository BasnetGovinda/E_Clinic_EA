package com.e_clinic.DAO;

import com.e_clinic.domain.Schedule;

public interface IScheduleDao {
	public abstract void add(Schedule scheduleId);

	public abstract Schedule get(int id);

	public abstract void update(int id, Schedule scheduleId);

	public abstract void delete(int scheduleId);
}
