package org.ticket.serviceImpl;

import java.util.List;

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
		return usersDao.getUsersByUsersAccountAndUsersPassWord(user);
	}
	@Override
	public void addUsers(Users user) {
		// TODO Auto-generated method stub
		usersDao.addUsers(user);
	}
	@Override
	public List<Users> viewUsers() {
		// TODO Auto-generated method stub
		return usersDao.viewUsers();
	}
	@Override
	public Users serachUsers(Users user) {
		// TODO Auto-generated method stub
		return usersDao.serachUsers(user);
	}
}
