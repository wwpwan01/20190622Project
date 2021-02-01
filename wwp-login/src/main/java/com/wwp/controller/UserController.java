package com.wwp.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wwp.domain.Users;
import com.wwp.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping("toLogin")
	public String toLogin(){
		return "login";
	}
	@RequestMapping("addUser")
	public String addUser(){
		return "addUser";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public String login(Users user,String volidImgText,HttpServletRequest request){
		String n = "1";//失败
		String sessionVolidImg = (String) request.getSession().getAttribute("imgText");
		System.out.println(volidImgText);
		if(volidImgText != null && sessionVolidImg != null && volidImgText.equals(sessionVolidImg)){
			Map<String, Object> map = userService.login(user);
			if(map != null && !map.isEmpty()){
				boolean flag = (boolean) map.get("flag");
				if(flag){
					request.getSession().setAttribute("loginInfo", map.get("obj"));
					n = "0";//成功
				}
			}
		}
		return n;
	}
}
