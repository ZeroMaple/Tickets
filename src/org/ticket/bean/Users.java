package org.ticket.bean;

import java.util.Date;
/**
 * 
 * @author Zero
 * @info ��վ��Ϣ��
 *
 */
public class Users {
	private Integer userId;			//��վID
	private String userName;		//��վ����
	private String userAccount;		//��վ�˺�
	private String userPassWord;	//��վ����
	private String userAddress;		//��վ��ַ
	private String userPhone;		//��վ�绰
	private Date userDate;			//��վ����
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserPassWord() {
		return userPassWord;
	}
	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
	public Users() {
		super();
	}
	public Users(Integer userId, String userName, String userAccount, String userPassWord, String userAddress,
			String userPhone, Date userDate) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAccount = userAccount;
		this.userPassWord = userPassWord;
		this.userAddress = userAddress;
		this.userPhone = userPhone;
		this.userDate = userDate;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userAccount=" + userAccount + ", userPassWord="
				+ userPassWord + ", userAddress=" + userAddress + ", userPhone=" + userPhone + ", userDate=" + userDate
				+ "]";
	}
}
