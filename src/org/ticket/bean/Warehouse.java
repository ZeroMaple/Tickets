package org.ticket.bean;
/**
 * 
 * @author Zero
 *@info �ֿ��
 *
 */
public class Warehouse {
	private Integer warehouseId;		//�ֿ�ID
	private Integer ticketId;			//��ƱID
	private Integer warehouseNum;		//�ֿ�����
	public Integer getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(Integer warehouseId) {
		this.warehouseId = warehouseId;
	}
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public Integer getWarehouseNum() {
		return warehouseNum;
	}
	public void setWarehouseNum(Integer warehouseNum) {
		this.warehouseNum = warehouseNum;
	}
	public Warehouse() {
		super();
	}
	public Warehouse(Integer warehouseId, Integer ticketId, Integer warehouseNum) {
		super();
		this.warehouseId = warehouseId;
		this.ticketId = ticketId;
		this.warehouseNum = warehouseNum;
	}
	@Override
	public String toString() {
		return "Warehouse [warehouseId=" + warehouseId + ", ticketId=" + ticketId + ", warehouseNum=" + warehouseNum
				+ "]";
	}
}
