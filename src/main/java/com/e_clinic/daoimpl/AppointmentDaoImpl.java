package com.e_clinic.daoimpl;

import org.springframework.stereotype.Repository;

import com.e_clinic.dao.AppointmentDao;
import com.e_clinic.domain.Appointment;
import com.e_clinic.domain.Doctor;
@Repository
public class AppointmentDaoImpl extends GenericDaoImpl<Appointment> implements AppointmentDao {
	public AppointmentDaoImpl() {
		super.setDaoType(Appointment.class);
	}
}
