package com.e_clinic.controller;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.e_clinic.domain.Doctor;
import com.e_clinic.domain.Patient;
import com.e_clinic.domain.User;
import com.e_clinic.service.IDoctorService;
import com.e_clinic.service.PatientService;
import com.e_clinic.service.UserService;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	@Autowired
	private UserService userService;

	@Autowired
	private IDoctorService doctorService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		// binder.registerCustomEditor(Date.class, new
		// CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getPatient(Model model) {
		Patient pat = new Patient();
		pat.setDateOfBirth(new Date());
		model.addAttribute("patientForm", pat);
		return "patient/addPatient";

	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		return "patient/home";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPatientPost(@ModelAttribute("patientForm") Patient patient, @RequestParam("un") String un , @RequestParam("pw") String pw) {

		User user = new User(un, pw, "ROLE_USER", true);
		user.setpId(patient);
		
		patientService.save(patient);
		userService.save(user);

		return "redirect:/home";
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
	
	@RequestMapping(value = "/records/{id}", method = RequestMethod.GET)
	public String records(@PathVariable int id, Model model) {
		return "redirect:/records/patient/"+id;

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
