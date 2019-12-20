package com.qnu.dto;

public class BillDTO extends AbstractDTO<BillDTO>{
	
	private Long idCustomer;
	private Long idSchedule;
	private String seat;
	private Long price;
	private String status;
	
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getIdSchedule() {
		return idSchedule;
	}
	public void setIdSchedule(Long idSchedule) {
		this.idSchedule = idSchedule;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
