package multipagespring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
@RequestMapping("/")
public String entryWeb()
{
	return "index";
}
@RequestMapping("/hello")
//cach 1:public String multiRedirect(HttpServletRequest request,Model model)
//cach 2: dung @RequestParam 
public String multiRedirect(@RequestParam("name") String username,@RequestParam("pass") String password,Model model)
{
    if(password.equals("admin") && username.equals("admin"))
    {
    	String msg="Welcome to Mr."+username;
    	//add a message to Model 
    	model.addAttribute("message",msg);
    	return "viewpage";
    	
    }
    else 
    {
    	
    	 String msg="Sorry "+username+". You entered an incorrect password";  
         model.addAttribute("message", msg);  
         return "errorpage";
    }
	
}
@RequestMapping("/helloagain")
public String multiRedirectAgain()
{
  return "final";
}
}
	

