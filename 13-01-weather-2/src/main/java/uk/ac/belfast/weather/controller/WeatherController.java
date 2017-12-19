


package uk.ac.belfast.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfast.weather.domain.TodaysWeather;
import uk.ac.belfast.weather.domain.Weather;

@Controller
@RequestMapping("/")


public class WeatherController {

	@Value ("${api.baseWeatherUrl}")
	private String baseWeatherUrl;


	public WeatherController() {
		super();

	}

	@GetMapping("")

	public String home(Model model) {


		model.addAttribute("pageTitle", "Weather");

		return "homepage";

	}


	@GetMapping("/belfast")

	public String belfast (Model model) {


		model.addAttribute("pageTitle", "Weather");


		String belfastWeatherURL= this.baseWeatherUrl + "belfast";
		RestTemplate restTemplate= new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();

		model.addAttribute("weather", weather);

		return "belfast";


	}
	@GetMapping("/london")

	public String london (Model model) {


		model.addAttribute("pageTitle", "Weather");


		String londonWeatherURL=this.baseWeatherUrl + "london";
		RestTemplate restTemplate= new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(londonWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();

		model.addAttribute("weather", weather);

		return "london";



	}


	@GetMapping("/dublin")

	public String dublin (Model model) {


		model.addAttribute("pageTitle", "Weather");


		String dublinWeatherURL=this.baseWeatherUrl + "dublin";
		RestTemplate restTemplate= new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(dublinWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();

		model.addAttribute("weather", weather);

		return "dublin";


	}
}