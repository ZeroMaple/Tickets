package org.ticket.service;

import java.util.List;

import org.ticket.bean.Users;

public interface UsersService {
	public Users getUsersByUsersAccountAndUsersPassWord(Users user);
	public void addUsers(Users user);
	public List<Users> viewUsers();
	public Users serachUsers(Users user);
}
