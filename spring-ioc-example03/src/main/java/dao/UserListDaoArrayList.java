package dao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import domain.User;

public class UserListDaoArrayList implements UserDao {
	private List<User> listUsers;
	
	public UserListDaoArrayList() {
		listUsers = new ArrayList<User>();
	}
	
	public void save(User user) {
		listUsers.add(user);
		
	}

}
