package com.e_clinic.controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.e_clinic.domain.Patient;
import com.e_clinic.service.PatientService;
import com.mysql.fabric.xmlrpc.base.Data;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		// binder.registerCustomEditor(Date.class, new
		// CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getPatient(Model model) {
		Patient pat = new Patient();
		model.addAttribute("patientForm", pat);
		return "patient/addPatient";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPatientPost(@ModelAttribute("patientForm") Patient patient) {

		// System.out.println(patient.getTempdate());
		System.out.println(patient.getEmail());

		patientService.save(patient);

		return "redirect:/list";
		// System.out.println("test");
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getPatientlist(Model model) {
		System.out.println("---------");
		List<Patient> pp = patientService.getallData();

		model.addAttribute("patient", pp);

		return "patientList";

	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String showEdit(@PathVariable int id, Model model) {
		System.out.println(id);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		Patient pp = patientService.find(id);

		System.out.println(pp);

		model.addAttribute("patient", pp);
		return "/updatePatient";

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String showEdit(@ModelAttribute("patient") Patient patient) {
		patientService.update(patient);

		return "redirect:/patient/list";

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deletePatient(@PathVariable int id) {
		patientService.delete(id);

		return "redirect:/patient/list";

	}

}
