package uk.ac.belfast.buildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfast.buildings.service.BuildingService;

@Controller
@RequestMapping("/footprint/")
public class LargestFootprint 
{
	@Autowired
	private BuildingService buildingService;

	@GetMapping("/")
	public String largestFootprint(Model model) 
	{
		model.addAttribute("pageTitle", "Largest Footprint!");
		this.buildingService = new BuildingService();
		model.addAttribute("LargestFootprintBuildings", this.buildingService.getLargestFootprint());
		
		return "LargestFootprint";
	}
}