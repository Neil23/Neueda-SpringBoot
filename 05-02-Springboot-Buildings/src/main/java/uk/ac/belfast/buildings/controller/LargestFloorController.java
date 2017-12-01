package uk.ac.belfast.buildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfast.buildings.service.BuildingService;

@Controller
@RequestMapping("/area/")

public class LargestFloorController 
{
	@Autowired
	private BuildingService buildingService;

	@GetMapping("/")
	public String LargestFloorArea(Model model) 
	{
		model.addAttribute("pageTitle", "Largest Floor Area!");
		this.buildingService = new BuildingService();
		model.addAttribute("LargestFloorArea", this.buildingService.getLargestFloorArea());
		
		return "LargestFloorArea";
	}
}