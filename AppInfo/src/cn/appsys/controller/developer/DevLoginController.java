package cn.appsys.controller.developer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.DevUserService;
import cn.appsys.tools.Constants;

@Controller
@RequestMapping(value="/dev")
public class DevLoginController {
	private Logger logger = Logger.getLogger(DevLoginController.class);
	
	@Resource
	private DevUserService devUserService;   
	
	@RequestMapping(value="/login")
	public String login(){
		logger.debug("LoginController welcome AppInfoSystem develpor==================");
		return "devlogin";
	}
	
	@RequestMapping(value="/dologin",method=RequestMethod.POST)
	public String doLogin(@RequestParam String devCode,@RequestParam String devPassword,HttpServletRequest request,HttpSession session){
		logger.debug("doLogin====================================");
		//调用service方法，进行用户匹配
		DevUser user = null;
		try {
			user = devUserService.login(devCode,devPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(null != user){//登录成功
			//放入session
			session.setAttribute(Constants.DEV_USER_SESSION, user);
			//页面跳转（main.jsp）
			return "redirect:/dev/flatform/main";
		}else{
			//页面跳转（login.jsp）带出提示信息--转发
			request.setAttribute("error", "用户名或密码不正确");
			return "devlogin";
		}
	}
	
	@RequestMapping(value="/flatform/main")
	public String main(HttpSession session){
		if(session.getAttribute(Constants.DEV_USER_SESSION) == null){
			return "redirect:/dev/login";
		}
		return "developer/main";
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		//清除session
		session.removeAttribute(Constants.DEV_USER_SESSION);
		return "devlogin";
	}
	
	/**
	 * 个人信息维护
	 * @param devUser
	 * @param model
	 * @return
	 *//*
	@RequestMapping(value="/pim",method=RequestMethod.GET)
	public String addDevUser(@RequestParam Integer id,HttpServletRequest request,HttpSession session)
	{
		DevUser devUser=null;
		try {
			devUser=devUserService.getDevUserInfoById(id);
			if(null != devUser){//登录成功
				//放入session
				session.setAttribute(Constants.DEV_USER_SESSION, devUser);
				//页面跳转（main.jsp）
				return "redirect:developer/piminfo";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "/pim";
		
	}
	
	@RequestMapping(value="/developer/piminfo")
	public String maingg(HttpSession session){
		if(session.getAttribute(Constants.DEV_USER_SESSION) == null){
			return "redirect:/dev/login";
		}
		return "/pim";
	}*/
}

