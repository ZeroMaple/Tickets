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
	//�Զ����
	@Autowired
	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}
	//�û���¼��ת
	@RequestMapping("Web/Application/login")
	public String login(){
		return "Web/Application/Index";
	}
	//�û���¼��֤
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
			System.out.println("��¼�ɹ���flag="+flag);
			return new JSONPObject(callback, flag);	
		}
		System.out.println("��¼ʧ�ܣ�flag="+flag);
		return new JSONPObject(callback, flag);
	}
	//ע���û�
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
			System.out.println("ע���û�ʧ��~");
		}
		return new JSONPObject(callback, flag);
	}
	//�û��б���ʾ
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
	//����ID���ҷ�վ����
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
