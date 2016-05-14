package com.e_clinic.DAO;

import com.e_clinic.domain.Patient;

public interface IPatientDao {

	public abstract void add(Patient patient);

	public abstract Patient get(int id);

	public abstract void update(int id, Patient patient);

	public abstract void delete(int patientId);
}
