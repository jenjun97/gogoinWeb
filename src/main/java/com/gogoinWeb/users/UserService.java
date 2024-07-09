package com.gogoinWeb.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public List<UserModel> getUserById(Integer id) {
		return userDao.findUserById(id);
	}
}
