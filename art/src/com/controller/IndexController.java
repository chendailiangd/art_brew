package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("index.do")//��ת����ҳ
	public String toIndex(){
		return "index";
	}
	
	
	
	
	
	
	
	
//	    @Autowired
//	    private UserService userService;
//	    @RequestMapping("/hello.do")//��ַ������hello.jsp����ת��hello.do
//	    public String find(int uid,ModelMap model)
//	    {
////	        int age=userService.findAge(uid);
//	        System.out.println(age);//���ʵ��ɹ����ڿ���̨���ӡ����23
//	        
////	        User user =userService.findByUid(uid);
////	        System.out.println(user.getUsername()+" "+user.getUid());
//	        
////	        model.addAttribute("user",user);
//	        model.addAttribute(user);
//	        return "index";
//	    }
	
	
	
	
}
