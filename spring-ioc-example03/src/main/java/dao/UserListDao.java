package dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import domain.User;

public class UserListDao implements UserDao {
	private List<User> listUsers;
	
	public UserListDao() {
		listUsers = new LinkedList<User>();
	}
	
	public void save(User user) {
		listUsers.add(user);
		
	}

}
