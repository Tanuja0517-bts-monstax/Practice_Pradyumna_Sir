package collectionT;

import java.util.ArrayList;
import java.util.HashSet;

public class Zoo {
	public static void main(String[] args) {
		ArrayList<ZooClass> zoo=new ArrayList();
		zoo.add(new ZooClass("Harbi","Cow"));
		zoo.add(new ZooClass("Carni","Lion"));
		zoo.add(new ZooClass("Harbi","Goat"));
		zoo.add(new ZooClass("Carni","Tiger"));
		
		ArrayList<ZooClass> omni=new ArrayList();
		omni.add(new ZooClass("Omni","Pig"));
		
		ArrayList<ZooClass> aZoo=new ArrayList();
		System.out.println("Entire zoo:"+zoo);
		for(ZooClass atype: zoo) {
			String animalType=atype.type;
			
			
		}
		//hs.removeAll(hs);
		System.out.println("Omni animals:"+omni);
	}
}
