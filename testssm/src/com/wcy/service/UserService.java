package com.wcy.service;

import java.util.List;
import java.util.Map;

import com.wcy.entity.User;

public interface UserService {
	
	public List<User> getUser(Map map);
	public int deleteUser(int id);
	public int insertUser(User user);
	public int updateUser(User user);
}
