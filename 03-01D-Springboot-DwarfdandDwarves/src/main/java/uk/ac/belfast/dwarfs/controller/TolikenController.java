package uk.ac.belfast.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfast.dwarfs.domain.Dwarf;

@Controller
@RequestMapping("/toliken")
public class TolikenController {

	@GetMapping("/")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle", "Disney !");
		//model.addAttribute("dwarfs", getDwarfs());
		return "tolkienpage";
	}



}
