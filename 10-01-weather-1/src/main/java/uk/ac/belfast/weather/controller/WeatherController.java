package uk.ac.belfast.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfast.weather.domain.TodaysWeather;
import uk.ac.belfast.weather.service.WeatherService;

@Controller
@RequestMapping("/")


public class WeatherController {
	
	@Autowired
	
	WeatherService weatherservice;
	
	private TodaysWeather todaysWeather;
	
	@GetMapping("/")
	@ResponseBody
	public TodaysWeather home(Model model) {
		
		
		model.addAttribute("pageTitle", "Weather");
		RestTemplate restTemplate= new RestTemplate();
		this.weatherservice= new WeatherService(null);
		this.todaysWeather=weatherservice.getTodaysWeather();
		return this.todaysWeather;
		
		
	}

	public WeatherController(WeatherService weatherservice) {
		super();
		this.weatherservice = weatherservice;
	}

	
}
