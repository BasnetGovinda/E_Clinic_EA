package com.e_clinic.service;

import java.util.List;

import com.e_clinic.domain.MedicalRecord;
import com.e_clinic.domain.Patient;

public interface MedicalRecordService {

	void save(MedicalRecord pp);

	List<MedicalRecord> getallData();

	MedicalRecord find(int id);

	void update(MedicalRecord patient);

	void delete(int id);

}
