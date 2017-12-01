package uk.ac.belfast.titanic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class PassengerController {
      
       @GetMapping("/Passenger")
       public String Passenger (Model model) {

       return "Passenger";            
}
       
}