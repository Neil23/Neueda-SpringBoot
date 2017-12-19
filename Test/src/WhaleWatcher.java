
import java.util.ArrayList;

public class WhaleWatcher {

     public static void main(String[] args) {
           // TODO Auto-generated method stub

           ArrayList<Whale> whales = new ArrayList<Whale>();
           
           Whale whaleno1 = new Whale ();
           whaleno1.setName("Right");
           whaleno1.setMainOcean("Atlantic");
           whaleno1.setWeight(2001);
           whaleno1.setMaxSpeed(21);
           whaleno1.setLength(16);
           
           whales.add(whaleno1);
           
           Whale whaleno2= new Whale ();
           whaleno2.setName("Blue");
           whaleno2.setMainOcean("Pacific");
           whaleno2.setWeight(2001);
           whaleno2.setMaxSpeed(23);
           whaleno2.setLength(16);
           
           whales.add(whaleno2);
           
           Whale whaleno3 = new Whale ();
           whaleno3.setName("Sperm");
           whaleno3.setMainOcean("Atlantic");
           whaleno3.setWeight(1900);
           whaleno3.setMaxSpeed(20);
           whaleno3.setLength(40);
           
           whales.add(whaleno3);
           
           Whale whaleno4 = new Whale ();
           whaleno4.setName("Humpback");
           whaleno4.setMainOcean("Antarctic");
           whaleno4.setWeight(919);
           whaleno4.setMaxSpeed(13);
           whaleno4.setLength(13);
           
           whales.add(whaleno4);

           System.out.println(whaleno1);
           System.out.println(whaleno2);
           System.out.println(whaleno3);
           System.out.println(whaleno4);
           
           
           int[] intArray = new int[] { 16, 16, 40, 13 }; 
           int sum = 0; 
           for (int i = 0; i < intArray.length; i++){ 
             sum = sum + intArray[i];     }
           double average = sum / intArray.length; 
           
             System.out.println(" The average length of the whale is : " + average);

           
            //atlantic whales
     		System.out.println("---Atlantic Whales---");
     		for(Whale whale: whales)
     		{
     			if (whale.getMainOcean().equals("Atlantic"))
     			{
     				System.out.println(whale.getName());
     			}
     		}
     		System.out.println();
     		

     		//fastest whale
    		System.out.println("---Fastest Whale---");
    		Whale fastestWhale = whales.get(0);
    		for(Whale whale: whales)
    		{
    			if(whale.getMaxSpeed() > fastestWhale.getMaxSpeed())
    			{
    				fastestWhale = whale;
    			}
    		}
    		System.out.println(fastestWhale.getName());
    		System.out.println();
    		
    		

           
        	 }
     
     

}

