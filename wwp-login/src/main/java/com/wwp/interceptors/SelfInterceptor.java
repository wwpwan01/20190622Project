package com.wwp.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wwp.domain.Users;
import com.wwp.druid.LocalStatLogger;

public class SelfInterceptor implements HandlerInterceptor{

//	最后执行  afterCompletion：   preHandle执行后返回值为true时，springmvc装载视图完成后    执行      
//	当前方法一般用于资源回收
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("afterCompletion1");
		
	}

//	postHandle:preHandle执行后返回值为true时，springmvc装载视图完成前（跳转到视图层之前） 执行
//	一般用于对        向页面传递的数据进行处理
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("postHandle1");
		
	}

	//请求执行前执行
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("preHandle1");
		Users user = (Users) request.getSession().getAttribute("loginInfo");
		if(user!=null){
			return true;
		}else{
			request.getRequestDispatcher("toLogin.do").forward(request,response);
			return false;
		}
	}

}
