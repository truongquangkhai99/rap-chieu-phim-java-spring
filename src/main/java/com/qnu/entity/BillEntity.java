package com.qnu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class BillEntity extends BaseEntity{
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcustomer")
	private UserEntity user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idfilm")
	private FilmEntity film;
	
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name = "idcinema")
	private CinemaEntity cinema;
	
	@Column(name = "seat")
	private String seat;
	
	@Column(name = "price")
	private Long price;

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public FilmEntity getFilm() {
		return film;
	}

	public void setFilm(FilmEntity film) {
		this.film = film;
	}

	public CinemaEntity getCinema() {
		return cinema;
	}

	public void setCinema(CinemaEntity cinema) {
		this.cinema = cinema;
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
