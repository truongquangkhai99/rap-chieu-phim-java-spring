package com.qnu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedules")
public class ScheduleEntity extends BaseEntity{
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idfilm")
	private FilmEntity film;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcinema")
	private CinemaEntity cinema;
	
	@Column(name = "timestart")
	private Date timeStart;

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

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}
}
