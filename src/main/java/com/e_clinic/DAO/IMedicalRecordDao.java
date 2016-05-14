package com.e_clinic.DAO;

import com.e_clinic.domain.MedicalRecord;

public interface IMedicalRecordDao {
	public abstract void add(MedicalRecord medicalRecord);

	public abstract MedicalRecord get(int id);

	public abstract void update(int id, MedicalRecord medicalRecord);

	public abstract void delete(int medicalRecordId);
}
