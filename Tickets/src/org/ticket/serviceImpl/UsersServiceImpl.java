package org.ticket.serviceImpl;

import org.ticket.bean.Users;
import org.ticket.dao.UsersDao;
import org.ticket.service.UsersService;

public class UsersServiceImpl implements UsersService {
	private UsersDao usersDao;
	public UsersDao getUsersDao() {
		return usersDao;
	}
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}
	@Override
	public Users getUsersByUsersAccountAndUsersPassWord(Users user) {
		// TODO Auto-generated method stub
		return null;
	}
}
