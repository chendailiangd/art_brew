package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("index.do")//跳转至首页
	public String toIndex(){
		return "index";
	}
	
	
	
	
	
	
	
	
//	    @Autowired
//	    private UserService userService;
//	    @RequestMapping("/hello.do")//地址栏访问hello.jsp，跳转到hello.do
//	    public String find(int uid,ModelMap model)
//	    {
////	        int age=userService.findAge(uid);
//	        System.out.println(age);//如果实验成功，在控制台会打印年龄23
//	        
////	        User user =userService.findByUid(uid);
////	        System.out.println(user.getUsername()+" "+user.getUid());
//	        
////	        model.addAttribute("user",user);
//	        model.addAttribute(user);
//	        return "index";
//	    }
	
	
	
	
}
