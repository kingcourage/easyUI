package com.wcy.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wcy.entity.User;
import com.wcy.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	UserService userService;
	
	@RequestMapping("/getAllUser")
	@ResponseBody
	public List<User> getAllUser(){
	/*	User user1 = new User("张三","男",21,"123432@qq.com","武汉");
		User user2 = new User("李四","女",24,"123d242@qq.com","北京");
		User user3 = new User("王五","男",22,"1fdsf32@qq.com","上海");
		User user4 = new User("赵六","女",23,"127772@qq.com","深圳");*/				
		List<User> users = new ArrayList();
		Map map = new HashMap();		
		users = userService.getUser(map);
		return users;
	} 
	
	@RequestMapping("/deleteUser")
	@ResponseBody
	public Map deleteUser(int id){
		int i = userService.deleteUser(id);
		Map map = new HashMap();
		if(i>0){
			map.put("msg", "success");
		}else{
			map.put("msg", "删除失败");
		}
		return map;
	}
	@RequestMapping("/updateUser")
	@ResponseBody
	public Map updateUser(User user){
		int i = userService.updateUser(user);
		Map map = new HashMap();
		if(i>0){
			map.put("msp", "sucess");
		}else{
			map.put("msg", "fail");
		}
		return map;
	}
	@RequestMapping("/addUser")
	@ResponseBody
	public Map addUser(User user){
		int i = userService.insertUser(user);
		Map map = new HashMap();
		if(i>0){
			map.put("msp", "sucess");
		}else{
			map.put("msg", "fail");
		}
		return map;
	}
}
