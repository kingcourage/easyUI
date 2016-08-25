package com.wcy.dao;

import java.util.List;
import java.util.Map;

import com.wcy.entity.User;

public interface UserMapper {
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(int id);
	public List<User> selectUser(Map map);
}
