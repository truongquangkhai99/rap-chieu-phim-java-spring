package com.qnu.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;

import com.qnu.dto.FilmDTO;

public interface IFilmService {
	Map<String, String> findAll();
	List<FilmDTO> findAll(Pageable pageable);
	int getTotalItem();
	FilmDTO findById(long id);
	FilmDTO save(FilmDTO dto);
	void delete(long[] ids);
	List<FilmDTO> findAlll();
}
