package org.ticket.bean;

import java.util.Date;

public class Orders {
	private Integer ordersId;
	private Integer ticketId;
	private Integer ordersNum;
	private Date ordersDate;
	public Integer getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public Integer getOrdersNum() {
		return ordersNum;
	}
	public void setOrdersNum(Integer ordersNum) {
		this.ordersNum = ordersNum;
	}
	public Date getOrdersDate() {
		return ordersDate;
	}
	public void setOrdersDate(Date ordersDate) {
		this.ordersDate = ordersDate;
	}
	
	public Orders() {
		super();
	}
	public Orders(Integer ordersId, Integer ticketId, Integer ordersNum, Date ordersDate) {
		super();
		this.ordersId = ordersId;
		this.ticketId = ticketId;
		this.ordersNum = ordersNum;
		this.ordersDate = ordersDate;
	}
	@Override
	public String toString() {
		return "Orders [ordersId=" + ordersId + ", ticketId=" + ticketId + ", ordersNum=" + ordersNum + ", ordersDate="
				+ ordersDate + "]";
	}
}
