package uk.ac.belfast.dwarfs.controller;


	


    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    @Controller
    @RequestMapping("/")
    public class ControllerDemo {
          
           @GetMapping("/")
           public String disney (Model model) {

           return "Homepage";            
    }
           
    }