package com.qnu.converter;

import org.springframework.stereotype.Component;

import com.qnu.dto.FilmDTO;
import com.qnu.entity.FilmEntity;

@Component
public class FilmConverter {

	public FilmDTO toDto(FilmEntity entity) {
		FilmDTO result = new FilmDTO();
		result.setId(entity.getId());
		result.setTitle(entity.getTitle());
		result.setThumbnail(entity.getThumbnail());
		result.setCast(entity.getCast());
		result.setGenre(entity.getGenre());
		result.setDirector(entity.getDirector());
		result.setTrailer(entity.getTrailer());
		result.setRated(entity.getRated());
		result.setDescription(entity.getDescription());
		result.setReleaseDate(entity.getReleaseDate());
		result.setRunningTime(entity.getRunningTime());
		return result;
	}
	
	public FilmEntity toEntity(FilmDTO dto) {
		FilmEntity result = new FilmEntity();
		result.setTitle(dto.getTitle());
		result.setThumbnail(dto.getThumbnail());
		result.setCast(dto.getCast());
		result.setGenre(dto.getGenre());
		result.setDirector(dto.getDirector());
		result.setTrailer(dto.getTrailer());
		result.setRated(dto.getRated());
		result.setDescription(dto.getDescription());
		result.setReleaseDate(dto.getReleaseDate());
		result.setRunningTime(dto.getRunningTime());
		return result;
	}
	
	public FilmEntity toEntity(FilmEntity result, FilmDTO dto) {
		result.setTitle(dto.getTitle());
		result.setThumbnail(dto.getThumbnail());
		result.setCast(dto.getCast());
		result.setGenre(dto.getGenre());
		result.setDirector(dto.getDirector());
		result.setTrailer(dto.getTrailer());
		result.setRated(dto.getRated());
		result.setDescription(dto.getDescription());
		result.setReleaseDate(dto.getReleaseDate());
		result.setRunningTime(dto.getRunningTime());
		return result;
	}
}
