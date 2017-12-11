package uk.ac.belfast.forms.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {

		return "FormPage";            
	}


	@PostMapping("/result")
	public String results(@RequestParam ("firstname")String firstName
			,@RequestParam ("lastname")String lastName
			,@RequestParam ("gender")String gender,
			Model model) {
		
		model.addAttribute("FirstName", firstName);
		model.addAttribute("LastName", lastName);	
		model.addAttribute("gender", "gender");	
			
		return "Result";     

	}

	@GetMapping("/result")
	public String results(Model model) {
		
	
	model.addAttribute("FirstName", "Chuck");
	model.addAttribute("LastName", "Norris");	
	model.addAttribute("gender", "All of them");	
		
	
	return "Result";
}

}