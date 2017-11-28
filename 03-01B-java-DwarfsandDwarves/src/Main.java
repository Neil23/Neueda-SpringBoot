import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		ArrayList<Dwarf> dwarf = new ArrayList<Dwarf>();
	
	
	Dwarf sleepy= new Dwarf ();
	
	sleepy.setName("Sleepy");
	sleepy.setAuthor("Disney");
	sleepy.setName("Sleepy.png");
	
Dwarf happy= new Dwarf ();
	
	happy.setName("Happy");
	happy.setAuthor("Disney");
	happy.setName("Happy.png");
	
Dwarf grumpy= new Dwarf ();
	
	grumpy.setName("Grumpy");
	grumpy.setAuthor("Disney");
	grumpy.setName("Grumpy.png");
	
	
	dwarf.add(sleepy);
	dwarf.add(happy);
	dwarf.add(grumpy);
	
	}

	
	
	
	
}
