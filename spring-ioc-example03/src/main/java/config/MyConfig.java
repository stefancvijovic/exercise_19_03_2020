package config;

import org.springframework.context.annotation.Bean;

import dao.UserDao;
import dao.UserListDao;
import dao.UserListDaoArrayList;
import domain.User;
import main.Main;
import service.UserService;
import service.impl.UserServiceImpl;

public class MyConfig {
	@Bean(name = "main")
	public Main getMain() {
		return new Main();
	}
	
	@Bean(name="user")
	public User getUser() {
		return new User();
	}
	
	@Bean(name="userService")
	public UserService getUserService() {
		return new UserServiceImpl();
	}
	
	@Bean(name="arrayListDao")
	public UserDao getArrayListDao() {
		return new UserListDaoArrayList();
	}
	
	@Bean(name="linkedListDao")
	public UserDao getLinkedListDao() {
		return new UserListDao();
	}
}
