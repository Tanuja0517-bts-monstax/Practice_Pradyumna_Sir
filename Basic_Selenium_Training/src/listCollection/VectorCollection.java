package listCollection;

import java.util.List;
import java.util.Vector;

public class VectorCollection {
	public static void main(String[] args) {
		List v=new Vector<>();
		v.add("Hello");
		v.add("are");
		v.add("you");
		v.add("doing");
		v.add("broo?");
		
		System.out.println("Entire vector collection:"+v);
		System.out.println("Contains:"+v.contains("are"));
		System.out.println("Get:"+v.get(0));
		System.out.println("IsEmpty:"+v.isEmpty());
	}
}