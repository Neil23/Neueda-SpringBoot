 import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<String> Dwarfs = new ArrayList<String>();
        ArrayList<String> dwarves = new ArrayList<String>();
        
        Dwarfs.add("Happy");
        Dwarfs.add("Sleepy");
        Dwarfs.add("Dopey");
        Dwarfs.add("Bashful");
        Dwarfs.add("Sneezy");
        Dwarfs.add("Doc");
        Dwarfs.add("Grumpy");
        
        dwarves.add("Thorin");
        dwarves.add("Balin");
        dwarves.add("Dwalin");
        dwarves.add("Fíli");
        dwarves.add("Kíli");
        dwarves.add("Dori");
        dwarves.add("Nori");
        dwarves.add("Ori");
        dwarves.add("Óin");
        dwarves.add("Glóin");
        dwarves.add("Bifur");
        dwarves.add("Bofur");
        dwarves.add("Bombur");

     
        System.out.println ("The disney ones are");
     for(int i= 0;i < Dwarfs.size();i++){
    	 
 		System.out.println(Dwarfs.get(i));

	}
     System.out.println ("The Tolkin boyos are");
     for(int i= 0;i < dwarves.size();i++){
    	 
 		System.out.println(dwarves.get(i));

}
     
	}
	
	
}
	
	
	
	
	