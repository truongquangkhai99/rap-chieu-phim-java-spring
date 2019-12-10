package com.qnu.dto;

public class BillDTO extends AbstractDTO<BillDTO>{
private Long idCustomer;
	
	private Long idFilm;
	private Long idCinema;
	private String seat;
	private Long price;
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	public Long getIdFilm() {
		return idFilm;
	}
	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}
	public Long getIdCinema() {
		return idCinema;
	}
	public void setIdCinema(Long idCinema) {
		this.idCinema = idCinema;
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
}
