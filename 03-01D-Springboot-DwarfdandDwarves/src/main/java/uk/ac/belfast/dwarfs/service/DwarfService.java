package uk.ac.belfast.dwarfs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfast.dwarfs.domain.Dwarf;

@Service
public class DwarfService {


	

	public DwarfService() {
		super();
	}
	
	public ArrayList<Dwarf> getDisneyDwarfs() {
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

		Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");

		dwarfs.add(happy);
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarfs.add(sleepy);
		Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarfs.add(dopey);
		Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarfs.add(bashful);
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		dwarfs.add(sneezy);
		Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarfs.add(doc);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarfs.add(grumpy);

		return dwarfs;
	}







	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
