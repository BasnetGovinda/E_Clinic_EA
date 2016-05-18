package com.e_clinic.serviceimpl;

import java.util.Date;
import java.util.List;
import java.util.function.BinaryOperator;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.e_clinic.dao.AppointmentDao;
import com.e_clinic.dao.IDoctorDao;
import com.e_clinic.dao.IScheduleDao;
import com.e_clinic.dao.PatientDao;
import com.e_clinic.daoimpl.ScheduleDAO;
import com.e_clinic.domain.Appointment;
import com.e_clinic.domain.Patient;
import com.e_clinic.domain.Schedule;
import com.e_clinic.domain.User;
import com.e_clinic.service.AppointmentService;
import com.e_clinic.service.UserService;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	private static final Patient NULL = null;
	@Autowired
	private AppointmentDao appointmentdao;
	@Autowired
	private IScheduleDao scheduledao;
	@Autowired
	private IDoctorDao doctorDao;
	@Autowired
	private PatientDao patientDAO;
	
	@Autowired
	private UserService userService;
//	@Autowired
//	private IMailSenderService maiilservice;

	@Override
	public void save(int pid, int sid) {
		// TODO Auto-generated method stub

		Schedule ss = scheduledao.findOne(sid);
   
	      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName();
	      
	     List<User> users = userService.getallData();
			
	     User user = users.stream().filter(u->u.getUsername().equalsIgnoreCase(name)).distinct().reduce((t,u)->u).get();
	     
	      JOptionPane.showMessageDialog(null, user.getRole()+" --- "+ user.getpId().getId());
	      
		Patient PP = patientDAO.findOne(user.getpId().getId());
		Appointment app = new Appointment(user.getpId(), doctorDao.findOne(pid), ss.getDate());
		ss.setAvailable(false);
		scheduledao.update(ss);
		Date da = ss.getDate();

		String mesageStrings = "Your Appointment Have confirm for  " + da;
		//maiilservice.sendMail("govinda2049@yahoo.com", "Appointment conformation", mesageStrings);
		// new app

		appointmentdao.save(app);

	}

	@Override
	public void save(Appointment appointment) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Appointment> findall() {
		// TODO Auto-generated method stub
		return appointmentdao.findAll();
	}

	@Override
	public void delete(int id) {

		Appointment aa = appointmentdao.findOne(id);
		// Schedule ss= scheduledao.findOne(aa.ge)
		// TODO Auto-generated method stub

		appointmentdao.delete(aa);
	}

}
