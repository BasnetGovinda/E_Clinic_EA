package com.e_clinic.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.e_clinic.dao.MedicalRecordDao;
import com.e_clinic.domain.MedicalRecord;
import com.e_clinic.service.MedicalRecordService;

@Service
@Transactional
public class MedicalServiceImpl implements MedicalRecordService {

	@Autowired
	private MedicalRecordDao medicalRecordDAO;

	@Override
	public void save(MedicalRecord medicalRecord) {
		// TODO Auto-generated method stub
		// MedicalRecord p = pp;
//		String ss = medicalRecord.getTempdate();
//		String[] test = ss.split("-");

		// String newdate = test[2] + "/" + test[1] + "/" + test[0];

//		int year = Integer.parseInt(test[2]);
//		int month = Integer.parseInt(test[1]);
//		int day = Integer.parseInt(test[0]);
//
//		Date dd = new Date(year, month, day);
//		System.out.println(dd);
//		medicalRecord.setDateOfBirth(dd);
		
		medicalRecordDAO.save(medicalRecord);

	}

	@Override
	public List<MedicalRecord> getallData() {
		return medicalRecordDAO.findAll();

	}

	@Override
	public MedicalRecord find(int id) {
		return medicalRecordDAO.findOne(id);
	}

	@Override
	public void update(MedicalRecord medicalRecord) {
		medicalRecordDAO.update(medicalRecord);

	}

	@Override
	public void delete(int id) {
		medicalRecordDAO.delete(id);
	}

}
