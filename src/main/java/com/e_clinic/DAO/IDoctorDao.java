package com.e_clinic.DAO;

import com.e_clinic.domain.Doctor;

public interface IDoctorDao {

	public abstract void add(Doctor doctor);

	public abstract Doctor get(int id);

	public abstract void update(int id, Doctor doctor);

	public abstract void delete(int doctorId );
}
