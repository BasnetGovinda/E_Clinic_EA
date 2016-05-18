package com.e_clinic.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.e_clinic.dao.UserDao;
import com.e_clinic.domain.User;
import com.e_clinic.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDAO;

	@Override
	public void save(User user) {
		userDAO.save(user);
	}

	@Override
	public List<User> getallData() {
		return userDAO.findAll();

	}

	@Override
	public User find(int id) {
		return userDAO.findOne(id);
	}

	@Override
	public void update(User user) {
		userDAO.update(user);

	}

	@Override
	public void delete(int id) {
		userDAO.delete(id);
	}

}
