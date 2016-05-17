package com.e_clinic.daoimpl;

import org.springframework.stereotype.Repository;

import com.e_clinic.dao.MedicalRecordDao;
import com.e_clinic.domain.MedicalRecord;

@Repository
public class MedicalRecordImpl extends GenericDaoImpl<MedicalRecord> implements MedicalRecordDao {

	public MedicalRecordImpl() {
		super.setDaoType(MedicalRecord.class);
	}
	
}
