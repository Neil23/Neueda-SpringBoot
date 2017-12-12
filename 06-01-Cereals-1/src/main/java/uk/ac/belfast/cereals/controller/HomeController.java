package uk.ac.belfast.cereals.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfast.cereals.domain.Cereal;
import uk.ac.belfast.cereals.repositories.CerealRepository;



@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	CerealRepository cerealRepository;
	public HomeController(CerealRepository cerealRepository) 
	{
		super();
		this.cerealRepository= cerealRepository;
	}




	@GetMapping("/")
	public String home (Model model) {

		return "Home";            
	}

	@GetMapping("/cereal")
	public String cereal (Model model) {
		model.addAttribute("cereallist", cerealRepository.findAll());
		return "cereal";            
	}


	@GetMapping("/cereal/view/{cerealId}")

	public String viewCereal(@PathVariable("cerealId")Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "View Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "ViewCereal";

	}
	@GetMapping("/cereal/edit/{cerealId)")
	
	public String editCereal(@PathVariable ("cerealId")Integer cerealId, Model model) {
		
		model.addAttribute("pageTitle", "Edit Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "EditCereal";
		
	}
	
	@GetMapping("/cereal/delete/{cerealId}")
	public String deleteCereal(@PathVariable("cerealId")Integer cerealId) {
		cerealRepository.delete(cerealId);
		
		return "redirect:/";
		
	}
	
	@GetMapping("/cereal/add")
	public String createCereal(Model model) {
		model.addAttribute("pageTitle", "Add Cereal");
		model.addAttribute("cereal", new Cereal());
		return "EditCereal";

	}

	@PostMapping("/cereal/save")
	public String saveCereal(@Valid Cereal cereal, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {

			return "EditCereal";
		}else {
			Cereal savedCereal = cerealRepository.save(cereal);
			return "redirect:/cereal/view/" + savedCereal.getCerealId();




		}
	}
}
