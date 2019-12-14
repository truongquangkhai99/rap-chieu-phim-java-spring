package com.qnu.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cinema")
public class CinemaEntity extends BaseEntity{
	
	@Column(name = "name")
	private String name;

	@Column(name = "description", columnDefinition = "TEXT")
	private String description;
	
	@OneToMany(mappedBy = "cinema")
	private List<BillEntity> bills = new ArrayList<>();
	
	@OneToMany(mappedBy = "cinema")
	private List<ScheduleEntity> schedules = new ArrayList<>();
	public List<BillEntity> getBills() {
		return bills;
	}

	public void setBills(List<BillEntity> bills) {
		this.bills = bills;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ScheduleEntity> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<ScheduleEntity> schedules) {
		this.schedules = schedules;
	}
	
}
