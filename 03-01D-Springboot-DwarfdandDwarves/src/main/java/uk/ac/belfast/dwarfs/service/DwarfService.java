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



	public ArrayList<Dwarf> getTolkienDwarves(){
        ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
        Dwarf thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
        dwarfs.add(thorin);
        Dwarf balin = new Dwarf("Balin", "Tolkien", "Balin.png");
        dwarfs.add(balin);
        Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
        dwarfs.add(dwalin);
        Dwarf fili = new Dwarf("Fíli", "Tolkien", "Fili.png");
        dwarfs.add(fili);
        Dwarf kili = new Dwarf("Kíli", "Tolkien", "Kili.png");
        dwarfs.add(kili);
        Dwarf dori = new Dwarf("Dori", "Tolkien", "Dori.png");
        dwarfs.add(dori);
        Dwarf nori = new Dwarf("Nori", "Tolkien", "Nori.png");
        dwarfs.add(nori);
        Dwarf ori = new Dwarf("Ori", "Tolkien", "Ori.png");
        dwarfs.add(ori);
        Dwarf oin = new Dwarf("Óin", "Tolkien", "Oin.png");
        dwarfs.add(oin);
        Dwarf gloin = new Dwarf("Glóin", "Tolkien", "Gloin.png");
        dwarfs.add(gloin);
        Dwarf bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
        dwarfs.add(bifur);
        Dwarf bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
        dwarfs.add(bofur);
        Dwarf bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
        dwarfs.add(bombur);



	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
