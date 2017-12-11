package uk.ac.belfast.titanic.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfast.titanic.respository.PassengerRepository;


@Controller
@RequestMapping("/")
public class PassengerController {
	
	
	public PassengerController(PassengerRepository passengerRepository) 
	{
		super();
		this.passengerRepository = passengerRepository;
	}

	@Autowired
	PassengerRepository passengerRepository;

	@GetMapping("/Passenger")
	public String Passenger (Model model) {
		model.addAttribute("passengers", passengerRepository.findAll());
		return "Passenger";            
	}
     
	@GetMapping("/Children")
	public String PassengerChildren (Model model) {
		model.addAttribute("children", passengerRepository.findByAgeLessThan(18));
		return "Children";            
	}
}