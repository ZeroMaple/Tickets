package org.ticket.dao;

import org.ticket.bean.Users;

public interface UsersDao {
	public Users getUsersByUsersAccountAndUsersPassWord(Users user);
}
