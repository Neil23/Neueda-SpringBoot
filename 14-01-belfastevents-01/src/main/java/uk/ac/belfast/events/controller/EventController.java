package uk.ac.belfast.events.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfast.events.domain.AllEvents;
import uk.ac.belfast.events.domain.Event;


@Controller
@RequestMapping("/")


public class EventController {




	public EventController() {
		super();

	}

	@GetMapping("/")

	public String home(Model model) {


		model.addAttribute("pageTitle", "Weather");




		return "Home";

	}


	@GetMapping("/events")

	public String events (Model model) {


		model.addAttribute("pageTitle", "Weather");

		String belfastEventsUrl = "http://neueda-flask.bndouglas.c9users.io/belfast-events/api/";

		RestTemplate restTemplate = new RestTemplate();
		AllEvents belfastEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);

		model.addAttribute("events", belfastEvents.getAllEvents());

		return "Events";

	}

	@GetMapping("/events/{eventId}")

	public String event (Model model, @PathVariable("eventId") String eventId) {


		model.addAttribute("pageTitle", "Event");
		
		
		String belfastEventsUrl = "http://neueda-flask.bndouglas.c9users.io/belfast-events/api/";
		
		RestTemplate restTemplate = new RestTemplate();
		AllEvents belfastEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);
		Event requestedEvent = new Event();
		
		for(Event event: belfastEvents.getAllEvents())
		{
			if (event.getIdentifier().equals(eventId))
			{
				requestedEvent = event;
			}

		}
		model.addAttribute("event", requestedEvent);
		return "event";

	}


}



