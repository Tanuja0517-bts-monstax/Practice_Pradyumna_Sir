package mapCollection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapCollection {
	public static void main(String[] args) {
		LinkedHashMap<Character,Long> lhm=new LinkedHashMap<>();
		lhm.put('a', 8308111348l);
		lhm.put('b', 7030791546l);
		lhm.put('c', 7548691234l);
		lhm.put('d', 8632145798l);
		
		System.out.println("Entire LinkedHashMapCollection:"+lhm);
		lhm.replace('a', 8308111348l, 8308111347l);
		System.out.println("LinkedHashMapCollection after replacing element value:"+lhm);
		System.out.println("Size:"+lhm.size());
		Set keys=lhm.keySet();
		System.out.println("Keys:"+keys);
		
		for(Entry<Character, Long> e: lhm.entrySet()) {
			System.out.println("Key:"+e.getKey()+" Value:"+e.getValue());
		}
	}
}
