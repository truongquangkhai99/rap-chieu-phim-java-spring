package com.qnu.dto;

import java.util.Date;

public class ScheduleDTO extends AbstractDTO<ScheduleDTO>{
	
	private Long idFilm;
	private Long idCinema;
	private Date timeStart;
	
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
	public Date getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}
}
