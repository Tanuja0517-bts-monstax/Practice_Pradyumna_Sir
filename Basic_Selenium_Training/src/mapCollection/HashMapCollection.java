package mapCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCollection {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Supriya");
		hm.put(2, "Tanuja");
		hm.put(3, "Aadithya");
		hm.put(5, "Rutuja");
		hm.put(4, "Richa");
		
		System.out.println("Entire HashMapCollection:"+hm);
		Set<Integer> keys=hm.keySet();
		System.out.println("Keys:"+keys);
		Collection value=hm.values();
		System.out.println("Values:"+value);
		hm.put(0, "STARR");
		System.out.println("Entire HashMapCollection after adding one element:"+hm);
		System.out.println("Contains Key:"+hm.containsKey(6));
		System.out.println("Get:"+hm.get(3));
		System.out.println("Contains Value:"+hm.containsValue("Tanuja"));
		hm.replace(0,"STARR","starr");
		System.out.println("Entire HashMapCollection after updating value:"+hm);
		
		//Iterator in HashMap
		for(Entry<Integer, String> e:hm.entrySet()) {
			System.out.println("Key:"+e.getKey()+" Value:"+e.getValue());
		}
		System.out.println("***********************************************");
		for(Integer k:keys) {
			System.out.println("Key:"+k+" value:"+hm.get(k));
		}
	}
}
