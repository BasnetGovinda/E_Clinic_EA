package com.e_clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e_clinic.domain.Doctor;
import com.e_clinic.domain.Schedule;
import com.e_clinic.service.AppointmentService;
import com.e_clinic.service.IDoctorService;

@Controller
public class DoctorController {
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private AppointmentService appService;
	
	@RequestMapping("/doctorList")
	public String allApp(Model model){
		List<Doctor> allDoctors = doctorService.findAll();
		model.addAttribute("doctors", allDoctors);
		return "doctor";
	}
	
	@RequestMapping("/doctor")
	public String allDoctor(Model model){
		List<Doctor> allDoctors = doctorService.findAll();
		model.addAttribute("doctors", allDoctors);
		return "doctor";
	}
	
	@RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET)
	public String get(@PathVariable int id, Model model){		
		model.addAttribute("doctor",doctorService.findOne(id));
		return "/doctorDetails";
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public String update(@ModelAttribute("doctor") Doctor doctor){
		doctorService.update(doctor);
		return "redirect:/doctor";
	}
	
	@RequestMapping(value = "/getlistDoctor", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Doctor> restDoctor() {
		// System.out.println(category);

		return doctorService.findAll();
	}

	@RequestMapping(value = "/getlistdate/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody List<Schedule> restDoctorDate(@PathVariable int id) {
		// System.out.println(category);

		return doctorService.getDate(id);
	}
}
