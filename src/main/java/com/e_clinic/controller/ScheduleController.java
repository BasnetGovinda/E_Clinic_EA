package com.e_clinic.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.e_clinic.domain.Doctor;
import com.e_clinic.domain.Schedule;
import com.e_clinic.service.IScheduleService;

@Controller
public class ScheduleController {

	@Autowired
	private IScheduleService scheduleService;

	@RequestMapping("/schedule")
	public String schedule(Model model) {
		Schedule s = new Schedule();
		model.addAttribute("schedulle",s);
		return "schedule";
	}
	
	@RequestMapping("/showSchedule")
	public String showAllSchedule(Model model) {		
			List<Schedule> allSchedule = scheduleService.findAll();
			model.addAttribute("schedule", allSchedule);
			return "showSchedule";
	}

	@RequestMapping(value = "/schedules", method = RequestMethod.POST)
	public String addSchedule(@ModelAttribute Schedule schedule,BindingResult result,
			final RedirectAttributes redirectAttributes) {
		
		schedule.setAvailable(true);
		scheduleService.save(schedule);
		return "redirect:/showSchedule";
	}

	@RequestMapping(value = "/schedule/{id}", method = RequestMethod.GET)
	public String get(@PathVariable int id, Model model){
		model.addAttribute("schedule",scheduleService.findOne(id));
		return "/scheduleDetails";
	}
	
	@RequestMapping(value = "/updated/{id}", method = RequestMethod.POST)
	public String update(@PathVariable int id, @ModelAttribute("schedule")  Schedule schedule){
		
		//scheduleService.update(schedule);
		
		JOptionPane.showMessageDialog(null, "");
		return "redirect:/schedule";
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat timeFormat = new SimpleDateFormat("MM/dd/yyyy h:mm:ss aaa");
		timeFormat.setLenient(true);
		
		binder.registerCustomEditor(Date.class, "schedule.tempdate", new CustomDateEditor(timeFormat, true));
		
	}

}
