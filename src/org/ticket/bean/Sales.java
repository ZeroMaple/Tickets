package org.ticket.bean;

import java.util.Date;

/**
 * 
 * @author Zero
 *@info ���۱�
 *
 */
public class Sales {
	private Integer salesId;		//����ID
	private Integer ticketId;		//��ƱID
	private Integer salesNum;		//��������
	private Date salesDate;			//����ʱ��
	public Integer getSalesId() {
		return salesId;
	}
	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public Integer getSalesNum() {
		return salesNum;
	}
	public void setSalesNum(Integer salesNum) {
		this.salesNum = salesNum;
	}
	public Date getSalesDate() {
		return salesDate;
	}
	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}
	
	public Sales() {
		super();
	}
	public Sales(Integer salesId, Integer ticketId, Integer salesNum, Date salesDate) {
		super();
		this.salesId = salesId;
		this.ticketId = ticketId;
		this.salesNum = salesNum;
		this.salesDate = salesDate;
	}
	@Override
	public String toString() {
		return "Sales [salesId=" + salesId + ", ticketId=" + ticketId + ", salesNum=" + salesNum + ", salesDate="
				+ salesDate + "]";
	}
}
