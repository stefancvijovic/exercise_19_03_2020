package service.impl;

import dao.UserDao;
import domain.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public void save(User user) {
		userDao.save(user);
		
	}
	
	//print

}
