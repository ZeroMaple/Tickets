package org.ticket.bean;
/**
 * 
 * @author Zero
 *@info ��վ��Ϣ��
 *
 */
public class Admin {
	private Integer adminId;		//��վID
	private String adminAccount;	//��վ�˺�
	private String adminPassWord;	//��վ����
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
