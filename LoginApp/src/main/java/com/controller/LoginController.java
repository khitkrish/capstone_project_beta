package com.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bean.*;
import com.service.*;
import com.validate.CustomValidator;

@Controller
@SessionAttributes("registers")
public class LoginController {
int count=0;
	@ModelAttribute("login")
	public LoginBean loginBean() {
		return new LoginBean();
	}
	
	@ModelAttribute("apply")
	public applyBean applyBean() {
		return new applyBean();
	}
	
	@Autowired
	private applyService aply;

	@Autowired
	private LoginService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginpage(ModelMap model,@ModelAttribute("login") LoginBean login) {
		model.addAttribute("requirementlist"	,req.retrievereqallpost());

		
		return "login";

	}

	@ModelAttribute("register")
	public registerBean registerBean() {  
		return new registerBean();
	}

	@Autowired
	private registerService reg;

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(@ModelAttribute("register") registerBean register) {
		return "registration";
	}
  
	@Autowired
	private CustomValidator custValidator;
	  
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String checkregister(ModelMap model,@ModelAttribute("register") registerBean register, BindingResult result) {
		 
		custValidator.validate(register, result);
		if(result.hasErrors())
		{ 		

		            return "registration";
		}
		reg.addregister(register);
		model.addAttribute( "id",reg.setid(register));
		model.addAttribute("submitted", "Your registration has been submited sucessfully" );
		return "success";
		
	}

	@RequestMapping(value = "/submitlogin", method = RequestMethod.POST)
	public String checkLoginDetails( ModelMap model ,@ModelAttribute("login") LoginBean login, BindingResult result,HttpServletRequest request,HttpServletResponse response) {
  int users=0;
 
 users = reg.val(login.getUserName(),login.getPasswords());
 
 if(users==1)
 {
	 model.addAttribute("register", (reg.retrieveregister(8080)));
	 model.put("registers", (reg.retrieveregister(8080)));
 }else {
	 model.addAttribute("register", (reg.retrieveregister(users)));
	 model.put("registers", (reg.retrieveregister(users)));
 }
 System.out.println((reg.retrieveregister(users)));




if(users==1)
 {
	
	return "adminfront";
 }else if(users>=1000) 
 {
	 
	 
	return "hrfront";
 }
	 
model.addAttribute("errors", "User Id or Password is incorrect");

	 return "login";
 
 
 
		/*if (service.validate(login)) {
			return "success";
		} else {
			return "invalid";
		}*/

	}
	
	//requirement get method 
	@ModelAttribute("login")
	public requirementBean requirementBean() {
		return new requirementBean();
	}
	
	@Autowired
	private requirementService req;
    
	@RequestMapping(value="/requirementpost",method=RequestMethod.POST)
	public String hrrequirementpost(ModelMap model,@ModelAttribute("requirement") requirementBean requirement, BindingResult result )
	{  
		req.addrequirement(requirement);
		aply.adddummy(requirement.getId());
		
		model.addAttribute("sucessfully", "Your Donoted item has been Posted Sucessfully, you need to wait until admin accepts your item ");
		
		return "requirement";
	}
	
	

	@RequestMapping(value="/requirement",method=RequestMethod.GET)
	public String Hrrequirement( ModelMap model,@ModelAttribute("requirement") requirementBean requirement , BindingResult result)
	{ //System.out.println(reid);
		//requirement=req.retrievereq(reid);
		return "requirement";
	}

	@RequestMapping(value="/listrequirement",method=RequestMethod.GET)
	public String lisrrequirement(@RequestParam int id ,ModelMap model,@ModelAttribute("requirement") requirementBean requirement , BindingResult result)
	{
		 model.addAttribute("requirementlist", req.retrieverequirement(id));
         System.out.println(req.retrieverequirement(id));
		return "listrequirement";
	}

	
	
//-------------------------------------------------------------------
	@RequestMapping(value="/hrfront",method=RequestMethod.GET)
	public String hrfront(@RequestParam int id ,ModelMap model,ModelMap model1 )
	{
		 //System.out.println(reg.retrieveregister(id));
		 model.addAttribute("register", (reg.retrieveregister(id)));
		 model1.addAttribute("requirementlist", req.retrieverequirement(id));
		 
			model.addAttribute("requirementlistfull"	,req.retrievereqallpost());
		 
		 
		return "hrfront";
	}
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String views(@RequestParam int reid,ModelMap model,ModelMap model1 )
	{
		 //System.out.println(reg.retrieveregister(id));
		model.addAttribute("apply", (aply.retrieveapply(reid)));
		// model1.addAttribute("requirementlist", req.retrieverequirement(id));
		 
		
		
		return "view";
	}
	@RequestMapping(value="/viewpost",method=RequestMethod.GET)
	public String viewspost(@RequestParam int id,ModelMap model,ModelMap model1 )
	{
		 //System.out.println(reg.retrieveregister(id));
		// model1.addAttribute("requirementlist", req.retrieverequirement(id));
        		 
		aply.deleteapply(id);
		
		return "removed";
	}
	
	
	
//--------------------------------------------------------------------	
	@RequestMapping(value="/adminfront",method=RequestMethod.GET)
	public String adminfront(@RequestParam int id ,ModelMap model,ModelMap model1 )
	{
		 System.out.println(reg.retrieveregister(id));
		 model.addAttribute("register", (reg.retrieveregister(id)));
		model1.addAttribute("requirementlist", req.retrieverequirement(id));
		 
		return "adminfront";
	}
	
	
	@RequestMapping(value="/jobpostings",method=RequestMethod.GET)
	public String jobpostings( ModelMap model)
	{
		model.addAttribute("requirementlist"	,req.retrievereqall());
		model.addAttribute("requirementlist1"	,req.retrievereqallpost());

	//model.addAttribute("requirementlist"	,req.retrievereqallpost());
	
	
	
	return "jobpostings";
	}
	
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public String allusers( ModelMap model)
	{
		model.addAttribute("requirementlist"	,reg.allusers());

	//model.addAttribute("requirementlist"	,req.retrievereqallpost());
		System.out.println("harish");

	System.out.println(reg.allusers());
	
	return "users";
	}
	
	

	@RequestMapping(value="/jobs",method=RequestMethod.GET)
	public String jobpostingspost(@RequestParam int reid, ModelMap model)
	{
		req.setpost(reid);
		
		model.addAttribute("requirementlist"	,req.retrievereqall());
		model.addAttribute("requirementlist1"	,req.retrievereqallpost());

	//model.addAttribute("requirementlist"	,req.retrievereqallpost());
	  
	
	
	return "jobpostings";
	}  
	
	@RequestMapping(value="/jobsdelete",method=RequestMethod.GET)
	public String jobpostingsdelete(@RequestParam int reid, ModelMap model)
	{
		req.deletepost(reid);
		
		model.addAttribute("requirementlist"	,req.retrievereqall());
		model.addAttribute("requirementlist1"	,req.retrievereqallpost());

	//model.addAttribute("requirementlist"	,req.retrievereqallpost());
	  
	
	
	return "jobpostings";
	}  
	
	
	@RequestMapping(value="/rdelete",method=RequestMethod.GET)
	public String rdelete(@RequestParam int reid, ModelMap model)
	{
		req.deletepost(reid);
		int id = req.getidformreid(reid);
		
		model.addAttribute("requirementlist", req.retrieverequirement(id));
        System.out.println(req.retrieverequirement(id));

	//model.addAttribute("requirementlist"	,req.retrievereqallpost());
	  
	
	
	return "listrequirement";
	}  
	
	
//-------------------------------------------------------------------------
	
	
	@RequestMapping(value="/candidatefront",method=RequestMethod.GET)
	public String candidatefront(@RequestParam int id ,ModelMap model,ModelMap model1 )
	{
		 //System.out.println(reg.retrieveregister(id));
		 model.addAttribute("register", (reg.retrieveregister(id)));
		 model1.addAttribute("requirementlist", req.retrieverequirement(id));
		 
		return "candidatefront";
	} 
	  
	@RequestMapping(value="/job",method=RequestMethod.GET)
	public String jobs(ModelMap model)
	{
		model.addAttribute("requirementlist"	,req.retrievereqallpost());
		
	//model.addAttribute("requirementlist"	,req.retrievereqallpost());
	
	
	return "jobs";
	}
	
	@RequestMapping(value="/apply",method=RequestMethod.GET)
	public String apply(@ModelAttribute("apply") applyBean apply,@RequestParam int reid  )
	{
		return "apply";
	}
	
	@RequestMapping(value="/applypost",method=RequestMethod.POST)
	public String applypost(ModelMap model,@ModelAttribute("apply") applyBean apply )
	{ int post=0;
	   post=aply.addapply(apply);
	   if(post==0)
	   {
		model.addAttribute("error", "You cannot Register for this Item, click here to go back");
		   return "apply";
	   }
		model.addAttribute("sucess", "You have reserved for this Item, we have let the doner know about it");
	   
		return "jobs";
	}
   
	
	
	@RequestMapping(value="/about",method=RequestMethod.GET)
	public String aboutpage()
	{ 
		return "about";
	}


	
	}
