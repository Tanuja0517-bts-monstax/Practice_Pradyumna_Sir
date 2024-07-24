package mapCollection;

import java.util.Map.Entry;
import java.util.Hashtable;

public class HashTableCollection {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht=new Hashtable();
		ht.put(1, "Supriya");
		ht.put(2, "Tanuja");
		ht.put(3, "Aadithya");
		ht.put(4, "Rutuja");
		ht.put(5, "Richa");
		ht.put(6, "Saloni");
		ht.put(7, "Sayali");
		ht.put(8, "Sujata");
		
		System.out.println("Entire HashTableCollection:"+ht);
		System.out.println("GetorDefault:"+ht.getOrDefault(9, "Hello"));
		Hashtable ht1=(Hashtable) ht.clone();
		System.out.println("Cloned HashtableCollection:"+ht1);
		
		for(Entry<Integer, String> e: ht.entrySet()) {
			System.out.println("Key:"+e.getKey()+" Value:"+e.getValue());
		}
	}
}