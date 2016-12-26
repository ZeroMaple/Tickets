package org.ticket.dao;

import java.util.List;

import org.ticket.bean.Users;

public interface UsersDao {
	public Users getUsersByUsersAccountAndUsersPassWord(Users user);
	public void addUsers(Users user);
	public List<Users> viewUsers();
	public Users serachUsers(Users user);
}
