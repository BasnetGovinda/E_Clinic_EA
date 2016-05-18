package com.e_clinic.daoimpl;

import org.springframework.stereotype.Repository;

import com.e_clinic.dao.UserDao;
import com.e_clinic.domain.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User> implements UserDao {

	public UserDaoImpl() {
		super.setDaoType(User.class);
	}
	
}
