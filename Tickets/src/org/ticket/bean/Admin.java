package org.ticket.bean;
/**
 * 
 * @author Zero
 *@info 主站信息表
 *
 */
public class Admin {
	private Integer adminId;		//主站ID
	private String adminAccount;	//主站账号
	private String adminPassWord;	//主站密码
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminAccount() {
		return adminAccount;
	}
	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}
	public String getAdminPassWord() {
		return adminPassWord;
	}
	public void setAdminPassWord(String adminPassWord) {
		this.adminPassWord = adminPassWord;
	}
	
	public Admin() {
		super();
	}
	public Admin(Integer adminId, String adminAccount, String adminPassWord) {
		super();
		this.adminId = adminId;
		this.adminAccount = adminAccount;
		this.adminPassWord = adminPassWord;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminAccount=" + adminAccount + ", adminPassWord=" + adminPassWord
				+ "]";
	}
}
