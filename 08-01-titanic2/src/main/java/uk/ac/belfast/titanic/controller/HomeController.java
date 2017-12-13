package uk.ac.belfast.titanic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfast.titanic.domain.Passenger;
import uk.ac.belfast.titanic.respository.PassengerRepository;



@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	PassengerRepository passengerRepository;
	public HomeController(PassengerRepository passengerRepository) 
	{
		super();
		this.passengerRepository= passengerRepository;
	}




	@GetMapping("/")
	public String home (Model model) {

		return "Home";            
	}

	@GetMapping("/passenger")
	public String passenger (Model model) {
		model.addAttribute("passengerlist", passengerRepository.findAll());
		return "passenger";            
	}


	@GetMapping("/passenger/view/{passengerId}")

	public String viewPassenger(@PathVariable("passengerId")Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Passenger");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "ViewPassenger";

	}



	@GetMapping("/passenger/delete/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId")Integer passengerId,
			RedirectAttributes redirectAttrs){

		passengerRepository.delete(passengerId);
		redirectAttrs.addFlashAttribute("message", "Passenger has gone");

		return "redirect:/passenger";

	}

	@GetMapping("/passenger/add")
	public String createPassenger(Model model) {
		model.addAttribute("pageTitle", "Add Passenger");
		model.addAttribute("passenger", new Passenger());
		return "EditPassenger";

	}

	@GetMapping("/passenger/edit/{passengerId}")

	public String editPassenger(@PathVariable ("passengerId")Integer passengerId, Model model) {

		model.addAttribute("pageTitle", "Edit Passenger");
		model.addAttribute("passenger", passengerRepository.findOne(passengerId));
		return "EditPassenger";

	}
	@PostMapping("/passenger/save")
	public String savePassenger(@Valid Passenger passenger, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {

			return "EditPassenger";
		}else {
			Passenger savedPassenger = passengerRepository.save(passenger);
			return "redirect:/passenger/view/" + savedPassenger.getPassengerId();




		}



	}
}
