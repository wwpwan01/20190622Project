package com.wwp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wwp.dao.UsersMapper;
import com.wwp.domain.Users;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersMapper userMapper;
	@Override
	public Map<String, Object> login(Users user) {
		Map<String, Object> map = new HashMap<>();
		boolean flag = false;
		user = userMapper.selectByPrimary(user);
		if(user != null){
			map.put("obj", user);
			flag = true;
		}
		map.put("flag", flag);
		return map;
	}
}