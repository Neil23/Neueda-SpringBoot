package uk.ac.belfast.dwarfs;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfast.dwarfs.domain.Dwarf;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

@PostConstruct

public void createDwarfs() {

	
	 ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
     ArrayList<Dwarf> dwarves = new ArrayList<Dwarf>();
     
     Dwarf happy = new Dwarf("Happy","Disney","happy.png");
     dwarfs.add(happy);
     Dwarf sleepy = new Dwarf("Sleepy","Disney","sleepy.png");
     dwarfs.add(sleepy);
     Dwarf dopey = new Dwarf("Dopey","Disney","dopey.png");
     dwarfs.add(dopey);
     Dwarf bashful = new Dwarf("Bashful","Disney","bashful.png");
     dwarfs.add(bashful);
     Dwarf sneezy = new Dwarf("Sneezy","Disney","sneezy.png");
     dwarfs.add(sneezy);
     Dwarf doc = new Dwarf("Doc","Disney","doc.png");
     dwarfs.add(doc);
     Dwarf grumpy = new Dwarf("Grumpy","Disney","grumpy.png");
     dwarfs.add(grumpy);
     
     Dwarf thorin = new Dwarf("Thorin","Tolkien","thorin.png");
     dwarves.add(thorin);
     Dwarf balin = new Dwarf("Balin","Tolkien","balin.png");
     dwarves.add(balin);
     Dwarf dwalin = new Dwarf("Dwalin","Tolkien","dwalin.png");
     dwarves.add(dwalin);
     Dwarf fili = new Dwarf("Fili","Tolkien","fili.png");
     dwarves.add(fili);
     Dwarf kili = new Dwarf("Kili","Tolkien","kili.png");
     dwarves.add(kili);
     Dwarf dori = new Dwarf("Dori","Tolkien","dori.png");
     dwarves.add(dori);
     Dwarf nori = new Dwarf("Nori","Tolkien","nori.png");
     dwarves.add(nori);
     Dwarf ori = new Dwarf("Ori","Tolkien","ori.png");
     dwarves.add(ori);
     Dwarf oin = new Dwarf("Oin","Tolkien","oin.png");
     dwarves.add(oin);
     Dwarf gloin = new Dwarf("Gloin","Tolkien","gloin.png");
     dwarves.add(gloin);
     Dwarf bifur = new Dwarf("Bifur","Tolkien","bifur.png");
     dwarves.add(bifur);
     Dwarf bofur = new Dwarf("Bofur","Tolkien","bofur.png");
     dwarves.add(bofur);
     Dwarf bombur = new Dwarf("Bombur","Tolkien","bombur.png");
     dwarves.add(bombur);
     
     System.out.println("Disney Dwarfs:");
     for (Dwarf dwarf: dwarfs)
     {
                     System.out.println(dwarf.getName() + " : " + dwarf.getAuthor() + " : " + dwarf.getImage());
     }
     
     System.out.println();
     System.out.println("Lord of the Rings Dwarves:");
     for (Dwarf dwarf: dwarves)
     {
                     System.out.println(dwarf.getName() + " : " + dwarf.getAuthor() + " : " + dwarf.getImage());
     }
}




	
	
	
}

