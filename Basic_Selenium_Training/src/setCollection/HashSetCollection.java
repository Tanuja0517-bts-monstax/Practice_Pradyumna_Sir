package setCollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
	public static void main(String[] args) {
		Set hs=new HashSet<String>();
		hs.add("Good Morning");
		hs.add("I am");
		hs.add("Tanuja n Sonawale");
		hs.add("From");
		hs.add("Solapur Maharashtra");
		
		Set hs1=new HashSet<String>();
		System.out.println("Entire HashSet:"+hs);
		
		//Reversing each element of string type collection
		for(Object obj:hs) {
			String word=(String) obj;
			String temp="";
			for(int i=word.length()-1;i>=0;i--) {
				temp+=word.charAt(i);
			}
			hs1.add(temp);
		}
		
		System.out.println("Reversed HashSet:"+hs1);
	}
}
