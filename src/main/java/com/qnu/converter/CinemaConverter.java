package com.qnu.converter;

import org.springframework.stereotype.Component;

import com.qnu.dto.CinemaDTO;
import com.qnu.entity.CinemaEntity;

@Component
public class CinemaConverter {

	public CinemaDTO toDto(CinemaEntity entity) {
		CinemaDTO result = new CinemaDTO();
		result.setId(entity.getId());
		result.setName(entity.getName());
		return result;
	}
	
	public CinemaEntity toEntity(CinemaDTO dto) {
		CinemaEntity result = new CinemaEntity();
		result.setName(dto.getName());
		return result;
	}
	
	public CinemaEntity toEntity(CinemaEntity result, CinemaDTO dto) {
		result.setName(dto.getName());
		return result;
	}
}
