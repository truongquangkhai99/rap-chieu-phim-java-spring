package com.qnu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qnu.converter.UserConverter;
import com.qnu.dto.UserDTO;
import com.qnu.entity.RoleEntity;
import com.qnu.entity.UserEntity;
import com.qnu.repository.RoleRepository;
import com.qnu.repository.UserRepository;
import com.qnu.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserConverter userConverter;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<UserDTO> findAll(Pageable pageable) {
		List<UserDTO> models = new ArrayList<>();
		List<UserEntity> entities = userRepository.findAll(pageable).getContent();
		for(UserEntity item : entities) {
			UserDTO userDTO = new UserDTO();
			userDTO.setEmail(item.getEmail());
			userDTO.setFullName(item.getFullName());
			userDTO.setPhone(item.getPhone());
			userDTO.setStatus(item.getStatus());
			userDTO.setUserName(item.getUserName());
			userDTO.setRoleName(item.getRole().getName());
			models.add(userDTO);
		}
		return models;
	}

	@Override
	public int getTotalItem() {
		return (int) userRepository.count();
	}

	@Override
	@Transactional
	public UserDTO save(UserDTO dto) {
		RoleEntity roleEntity = roleRepository.findOneById(2l); 
		UserEntity userEntity = new UserEntity();
		userEntity = userConverter.toEntity(dto);
		userEntity.setPassWord(passwordEncoder.encode(userEntity.getPassWord()));
		userEntity.setStatus(1);
		userEntity.setRole(roleEntity);
		return userConverter.toDto(userRepository.save(userEntity));
	}

}
