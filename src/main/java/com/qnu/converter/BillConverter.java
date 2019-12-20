package com.qnu.converter;

import org.springframework.stereotype.Component;

import com.qnu.dto.BillDTO;
import com.qnu.dto.ScheduleDTO;
import com.qnu.entity.BillEntity;
import com.qnu.entity.ScheduleEntity;

@Component
public class BillConverter {

	public BillDTO toDto(BillEntity entity) {
		BillDTO result = new BillDTO();
		result.setId(entity.getId());
		result.setIdCustomer(entity.getUser().getId());
		result.setIdSchedule(entity.getSchedules().getId());
		result.setSeat(entity.getSeat());
		result.setPrice(entity.getPrice());
		result.setStatus(entity.getStatus());
		return result;
	}
	
	public BillEntity toEntity(BillDTO dto) {
		BillEntity result = new BillEntity();
		result.setSeat(dto.getSeat());
		result.setPrice(dto.getPrice());
		result.setStatus(dto.getStatus());
		return result;
	}
	
	public BillEntity toEntity(BillEntity result, BillDTO dto) {
		result.setSeat(dto.getSeat());
		result.setPrice(dto.getPrice());
		result.setStatus(dto.getStatus());
		return result;
	}
}
