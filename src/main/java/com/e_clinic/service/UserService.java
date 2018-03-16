package com.e_clinic.service;

import java.util.List;

import com.e_clinic.domain.Patient;
import com.e_clinic.domain.User;

public interface UserService {

	void save(User pp);

	List<User> getallData();

	User find(int id);

	void update(User patient);

	void delete(int id);

}
