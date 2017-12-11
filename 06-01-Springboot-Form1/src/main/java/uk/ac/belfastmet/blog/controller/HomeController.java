package uk.ac.belfastmet.blog.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
      
       @GetMapping("/")
       public String home (Model model) {

       return "01-Form.html";            
}
     
       @GetMapping("/result")
       public String result (Model model) {

       return "Result-01.html"; 
       
       }  
       
}
