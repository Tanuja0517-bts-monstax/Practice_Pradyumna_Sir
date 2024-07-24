package setCollection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(14);
		ts.add(12);     
		ts.add(52);
		ts.add(15);
		ts.add(1547);
		//ts.add("Hello");
		
		System.out.println("Entire TreeSet:"+ts);
		System.out.println("Entire TreeSet in decending order:"+ts.descendingSet());
		System.out.println("Ceiling:"+ts.ceiling(17));
		System.out.println("Flooring:"+ts.floor(17));
		System.out.println("SubSet:"+ts.subSet(14, true, 52, false));
	}
}
