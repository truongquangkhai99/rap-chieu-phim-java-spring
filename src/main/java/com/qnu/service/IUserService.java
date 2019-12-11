package com.qnu.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.qnu.dto.FilmDTO;
import com.qnu.dto.UserDTO;

public interface IUserService {
	List<UserDTO> findAll(Pageable pageable);
	int getTotalItem();
	UserDTO save(UserDTO dto);
}