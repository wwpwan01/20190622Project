package com.wwp.service;

import java.util.Map;

import com.wwp.domain.Users;

public interface UserService {

	Map<String, Object> login(Users user);

}
