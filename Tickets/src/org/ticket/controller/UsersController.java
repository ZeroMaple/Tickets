package org.ticket.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.ticket.bean.Users;
import org.ticket.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * @author zero
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;

@Controller
public class UsersController {
	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}
	//自动填充
	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	//用户登录跳转
	@RequestMapping("Web/Application/login")
	public String login(){
		return "Web/Application/Index";
	}
	//用户登录验证
	@RequestMapping("Web/Application/verifyLogin")
	@ResponseBody
	public JSONPObject verifyLogin(Users user,@RequestParam String callback,HttpSession session){
		Users us = usersService.getUsersByUsersAccountAndUsersPassWord(user);
		System.out.println(us);
		boolean flag = false;
		if(null!=us)
		{
			flag = true;
			session.setAttribute("login", us);
			System.out.println("登录成功！flag="+flag);
			return new JSONPObject(callback, flag);	
		}
		System.out.println("登录失败！flag="+flag);
		return new JSONPObject(callback, flag);
	}
	//注册用户
	@RequestMapping("Web/Application/registered")
	@ResponseBody
	public JSONPObject registered(Users user,@RequestParam String callback){
		boolean flag = false;
		try {
			usersService.addUsers(user);	
			flag = true;
			return new JSONPObject(callback,flag);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("注册用户失败~");
		}
		return new JSONPObject(callback, flag);
	}
	//用户列表显示
	@RequestMapping("Web/Application/viewUsers")
	@ResponseBody
	public JSONPObject viewUsers(@RequestParam String callback){
		List<Users> users=new ArrayList<Users>();
		boolean flag = false;
		users=usersService.viewUsers();
		if(null!= users){
			flag = true;
			return new JSONPObject(callback,users);
		}
		System.out.println(flag);
		return new JSONPObject(callback, flag);
	}
	//根据ID查找分站详情
	@RequestMapping("Web/Application/serachUsers")
	@ResponseBody
	public JSONPObject serachUsers(Users user,@RequestParam String callback){
		Users users = usersService.serachUsers(user);
		boolean flag = false;
		if(null!= users){
			flag = true;
			return new JSONPObject(callback,users);
		}
		return new JSONPObject(callback, flag);
	}
}
