package com.e_clinic.controller;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.e_clinic.domain.Doctor;
import com.e_clinic.domain.MedicalRecord;
import com.e_clinic.domain.Patient;
import com.e_clinic.service.DoctorService;
import com.e_clinic.service.MedicalRecordService;
import com.e_clinic.service.PatientService;

@Controller
@RequestMapping(value = "/records")
public class MedicalRecordController {

	@Autowired
	private MedicalRecordService medicalRecordService;

	@Autowired
	private PatientService patientService;
	
	@Autowired
	private DoctorService doctorService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		// binder.registerCustomEditor(Date.class, new
		// CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/doctor/{id}/patientsList", method = RequestMethod.GET)
	public String forDoctor(@PathVariable int id, Model model) {
		
		
		return "redirect:/patient/list";
	}
	
	@RequestMapping(value = "/patient/{id}", method = RequestMethod.GET)
	public String showEdit(@PathVariable int id, Model model) {
		
		Doctor doctor = new Doctor();
		doctor.setEmail("z@c.com");
		doctor.setDateOfBirth(new Date());
		doctor.setFirstName("fn");
		doctor.setLastName("ln");
		doctor.setSepcialization("spec");
		
		doctorService.save(doctor);
		int doctor_id = doctor.getId();
		
		System.out.println("zzzz--->>>"+patientService.find(id).getFirstName());
		return "redirect:/records/patient/list/"+doctor_id+"/"+id;
	}
	

	@RequestMapping(value = "/patient/list/{doctor_id}/add/{id}", method = RequestMethod.GET)
	public String getPatient(@PathVariable int doctor_id, @PathVariable int id, Model model) {
		MedicalRecord record = new MedicalRecord();
		
		record.setDate(new Date());

		model.addAttribute("recordForm", record);
		model.addAttribute("patient_id", id);
		model.addAttribute("doctor_id", doctor_id);

		return "records/addRecords";
	}

	@RequestMapping(value = "/patient/list/{doctor_id}/add/{id}", method = RequestMethod.POST)
	public String addPatientPost(@PathVariable int doctor_id, @PathVariable int id, @ModelAttribute("recordForm") MedicalRecord record) {

		Patient p = patientService.find(id);
		Doctor d =doctorService.find(doctor_id);
		record.setPatientId(p);
		record.setDoctorId(d);
		
//		patientService.save(p);
//		doctorService.save(d);
		
		medicalRecordService.save(record);

		return "redirect:/records/patient/list/"+doctor_id+"/"+id;
	}
	
	@RequestMapping(value = "/patient/list/add/{id}")
	public String addPatientRecord(@PathVariable int doctor_id, @PathVariable int id) {

		// System.out.println(patient.getTempdate());

//		medicalRecordService.save(record);

		return "redirect:/records/patient/add/"+id;
		// System.out.println("test");
	}

	@RequestMapping(value = "/patient/list/{doctor_id}/{id}", method = RequestMethod.GET)
	public String getPatientlist(@PathVariable int doctor_id, @PathVariable int id, Model model) {
		System.out.println("---------");
		List<MedicalRecord> records = medicalRecordService.getallData();
		JOptionPane.showMessageDialog(null, "record of "+doctor_id+", patient = "+id);
		
		model.addAttribute("record", records);
		model.addAttribute("patient_id", id);
		model.addAttribute("doctor_id", doctor_id);
		
		return "records/listRecords";
	}

//	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
//	public String showEdit(@PathVariable int id, Model model) {
//		System.out.println(id);
//		System.out.println("++++++++++++++++++++++++++++++++++++");
//		Patient pp = patientService.find(id);
//
//		System.out.println(pp);
//
//		model.addAttribute("patient", pp);
//		return "/updatePatient";
//
//	}
//
//	@RequestMapping(value = "/update", method = RequestMethod.POST)
//	public String showEdit(@ModelAttribute("patient") Patient patient) {
//		patientService.update(patient);
//
//		return "redirect:/patient/list";
//
//	}
//
//	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
//	public String deletePatient(@PathVariable int id) {
//		patientService.delete(id);
//
//		return "redirect:/patient/list";
//
//	}

}
