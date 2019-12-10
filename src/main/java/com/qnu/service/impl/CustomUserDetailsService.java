package com.qnu.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.qnu.constant.SystemConstant;
import com.qnu.dto.MyUser;
import com.qnu.entity.UserEntity;
import com.qnu.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserEntity userEntity = userRepository.findOneByUserNameAndStatus(username, SystemConstant.ACTIVE_STATUS);
		
		if (userEntity == null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		List<GrantedAuthority> authorities = new ArrayList<>();
//		for(RoleEntity role : userEntity.getRole()) {
//			authorities.add(new SimpleGrantedAuthority(role.getCode()));
//		}
		
		authorities.add(new SimpleGrantedAuthority(userEntity.getRole().getCode()));
		MyUser user = new MyUser(userEntity.getUserName(), userEntity.getPassWord(), true, 
				true, true, true, authorities);
		user.setFullName(userEntity.getFullName());
		return user;
	}

}
