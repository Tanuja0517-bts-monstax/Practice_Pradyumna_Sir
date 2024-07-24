package setCollection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetCollection {
	public static void main(String[] args) {
		LinkedHashSet<Float> lhs=new LinkedHashSet<>();
		lhs.add(15.6f);
		lhs.add(125.36f);
		lhs.add(3.14f);
		lhs.add(145.36f);
		
		System.out.println("Entire LinkedHashSet:"+lhs);
		System.out.println("Contains:"+lhs.contains(3.145f));
		System.out.println("isEmpty:"+lhs.isEmpty());
		
		List list=new ArrayList<>(lhs);
		
		System.out.println("Converted to ArrayList:"+list);
		System.out.println("Element at position:"+list.get(1));
	}
}
