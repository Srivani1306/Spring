package com.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@Autowired
	private LoginModel loginModel;
	
	@Autowired
	private LoginValidator loginValidator;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(loginValidator);
	}

	
     @RequestMapping(value="/", method=RequestMethod.GET)
     public String loginForm(Model model) {
    	 System.out.println("Initial page");
    	 return "index";
     }
    
     @RequestMapping(value="/", method=RequestMethod.POST)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response ,
		@ModelAttribute("login") @Validated Login login,
		BindingResult bindingResult) throws Exception{
		
			if(bindingResult.hasErrors()) {
				return new ModelAndView("/index");
			}
		//String usr = request.getParameter("username");
		//String pwd = request.getParameter("password");
		
			
			//processing duty to model class
		boolean flag =  loginModel.isAuthenticated(login.getUsername(),login.getPassword());
		
		if(flag) {
			return new ModelAndView("/welcome");
		}
			
		return new ModelAndView("/failure");
	}
 
	
}
