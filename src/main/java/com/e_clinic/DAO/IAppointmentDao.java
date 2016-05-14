package com.e_clinic.DAO;

import com.e_clinic.domain.Appointment;

public interface IAppointmentDao {

	public abstract void add(Appointment appointment);

	public abstract Appointment get(int id);

	public abstract void update(int id, Appointment appointment);

	public abstract void delete(int appointmentId);
}
