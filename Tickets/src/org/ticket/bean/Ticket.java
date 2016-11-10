package org.ticket.bean;
/**
 * 
 * @author Zero
 *@info ²ÊÆ±±í
 *
 */
public class Ticket {
	private Integer ticketId;		//²ÊÆ±ID
	private String ticketName;		//²ÊÆ±Ãû³Æ
	private String ticketPrice;		//²ÊÆ±¼Û¸ñ
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getTicketName() {
		return ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public Ticket() {
		super();
	}
	public Ticket(Integer ticketId, String ticketName, String ticketPrice) {
		super();
		this.ticketId = ticketId;
		this.ticketName = ticketName;
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", ticketName=" + ticketName + ", ticketPrice=" + ticketPrice + "]";
	}
	
}
