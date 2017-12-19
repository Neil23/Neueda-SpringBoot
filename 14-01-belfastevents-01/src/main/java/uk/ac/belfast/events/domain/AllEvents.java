package uk.ac.belfast.events.domain;

import java.util.ArrayList;

public class AllEvents {
	
	


        ArrayList<Event> allEvents = new ArrayList<Event>();

        //constructors
		public AllEvents() {

			
		}

		public AllEvents(ArrayList<Event> allEvents) {

			this.allEvents = allEvents;
		}

		
		//getters and setters
		public ArrayList<Event> getAllEvents() {
			return allEvents;
		}

		public void setAllEvents(ArrayList<Event> allEvents) {
			this.allEvents = allEvents;
		}
        
        
        



	
}

