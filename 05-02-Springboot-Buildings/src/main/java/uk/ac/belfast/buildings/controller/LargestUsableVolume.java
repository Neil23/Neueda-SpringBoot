package uk.ac.belfast.buildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfast.buildings.service.BuildingService;

@Controller
@RequestMapping("/volume/")
public class LargestUsableVolume
{
       @Autowired
       private BuildingService buildingService;
       
       @GetMapping("/")
       public String largestUsableVolume (Model model)
       {
	       model.addAttribute("pageTitle", "Largest Usable Volume!");
	       this.buildingService = new BuildingService();
	       model.addAttribute("LargestUsableVolumeBuildings", this.buildingService.getLargestUsableVolume());
	       
	       return "LargestUsableVolume"; 
       } 
}