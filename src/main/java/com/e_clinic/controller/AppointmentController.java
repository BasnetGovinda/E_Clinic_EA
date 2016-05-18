package com.e_clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.e_clinic.domain.Appointment;
import com.e_clinic.service.AppointmentService;

@Controller
@RequestMapping(value = "/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

	@RequestMapping(value = "/make", method = RequestMethod.GET)
	public String showAppointmentForm(Model model) {

		/*
		 * List<TestingCode> dd = new ArrayList<TestingCode>(); dd.add(new
		 * TestingCode("ram bdr", "11/12/2012")); dd.add(new TestingCode(
		 * "ram bdr1", "01/12/2012")); dd.add(new TestingCode("ram bdr2",
		 * "02/12/2012")); dd.add(new TestingCode("ram bdr3", "33/12/2012"));
		 * 
		 * 
		 */ //model.addAttribute("app", new Test());

		return "createAppointment";

	}

//	@RequestMapping(value = "/getdata", method = RequestMethod.GET, headers = "Accept=application/json")
//	public @ResponseBody List<TestingCode> restPatientList() {
//		RestController app = new RestController();
//		return app.restCarCategoryList();
//	}

	@RequestMapping(value = "/makeAppointment", method = RequestMethod.GET)
	public String makeAppointment(@RequestParam("optStatus") int pid, @RequestParam("opttime") int sid) {
		System.out.println(pid);

		appointmentService.save(pid, sid);

		return "redirect:/appointments/getlistofappointment";
	}

	@RequestMapping(value = "/getlistofappointment", method = RequestMethod.GET)
	public String getAllAppointment(Model model) {
		List<Appointment> appointments = appointmentService.findall();
		model.addAttribute("appointments", appointments);
		return "appointmentlist";
	}
	
	@RequestMapping(value = "/getlistofappointment/{id}", method = RequestMethod.GET)
	public String getAllAppointmentId(Model model) {
		List<Appointment> appointments = appointmentService.findall();
		model.addAttribute("appointments", appointments);
		return "appointmentlist";
	}

	/*
	 * @RequestMapping(value = "/get", method = RequestMethod.GET, headers =
	 * "Accept=application/json") public @ResponseBody List<Patient>
	 * restDoctorList() { RestController app = new RestController(); return
	 * app.restDoctor(); }
	 */
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id)

	{
		appointmentService.delete(id);

		return "redirect:/appointment/getlistofappointment";

	}

	/*@RequestMapping(value = "/ticket", method = RequestMethod.POST)
	public String processeConformation(Model m) {
		try {
			Object mailSenderService;
			mailSenderService.sendMail("nwlf53@gmail.com", "Conformation", "This mail is just for conformation.");
		} catch (Exception ex) {
			String error = ex.getMessage();
			m.addAttribute("errorMessage", error);
			System.out.println(error);
		} finally {
			return "test";
		}

	}
*/
}
