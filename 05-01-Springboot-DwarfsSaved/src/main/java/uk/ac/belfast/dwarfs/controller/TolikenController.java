package uk.ac.belfast.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfast.dwarfs.reposiitories.DwarfRepository;



@Controller
@RequestMapping("/Tolk")
public class TolikenController {
	@Autowired
	DwarfRepository dwarfRepository;
	

	public TolikenController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	@GetMapping("/")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Tolkien !");
		model.addAttribute("dwarfs",dwarfRepository.findByAuthor("Tolkien"));
		return "tolkienpage";
	}



}
