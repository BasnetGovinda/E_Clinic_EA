package com.e_clinic.service;

import java.util.List;

import com.e_clinic.domain.Appointment;

public interface AppointmentService {

	void save(Appointment appointment);

	void save(int pid, int sid);

	List<Appointment> findall();

	void delete(int id);

}
