package uk.ac.belfast.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfast.dwarfs.reposiitories.DwarfRepository;





@Controller
@RequestMapping("/")
public class DisneyController {
	
@Autowired
DwarfRepository dwarfRepository;



	public DisneyController(DwarfRepository dwarfRepository) {
	super();
	this.dwarfRepository = dwarfRepository;
}



	@GetMapping("/disney")
	public String disney(Model model) {
		model.addAttribute("pageTitle","Disney");
		model.addAttribute("dwarfs",dwarfRepository.findByOrderByName());
		
		return "disneypage";
	}

}