package collectionT;

import java.util.ArrayList;
import java.util.Scanner;

public class SolarSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Planet> al=new ArrayList();
		boolean flag=true;
		while(flag) {
			System.out.print("Enter y or Y to add planet to solar system:");
			char ch=sc.next().charAt(0);
			if(ch=='y' || ch=='Y') {
				System.out.print("Enter planet name:");
				String name=sc.next();
				System.out.print("Enter number of moons:");
				int nmoon=sc.nextInt();
				System.out.print("Enter true if plant has ring else enter false:");
				boolean ring=sc.nextBoolean();
				System.out.print("Enter number of gases in that planet:");
				String gas[]=new String[sc.nextInt()];
				if(gas.length>0) {
					System.out.print("Enter gases of the planet:");
					for(int i=0;i<gas.length;i++) {
						gas[i]=sc.next();
					}
				}
				al.add(new Planet(name,nmoon,ring,gas));	
			}
			else
				flag=false;
		}
		
		System.out.println("All the Planets of Solar System:"+al);
		System.out.println("Count of moons in all the planets with rings is:"+countOfMoonForRingedPlanets(al));
		maxFoundGas(al);
	}
	
	public static int countOfMoonForRingedPlanets(ArrayList al) {
		int ct=0;
		for(int i=0;i<al.size();i++) {
			Planet p=(Planet)(al.get(i));
			if(p.srings()) 
				ct+=p.numMoon();
		}
		return ct;
		
	}
	
	public static String maxFoundGas(ArrayList al) {
		int ct=0;
		int j=0;
		int len=0;
		for(int i=0;i<al.size();i++) {
			Planet p=(Planet)(al.get(i));
			len+=p.atmGases().length;
		}
		
		String temp[]=new String[len];
		for(int i=0;i<al.size();i++) {
			Planet p=(Planet)(al.get(i));
			String t[]=p.atmGases();
			for(int k=0;k<t.length;k++) {
				if(j<len)
					temp[j++]=t[k];
			}
		}
		
		for(int i=0;i<len;i++)
			System.out.print(temp[i]+" ");
		for(int i=0;i<len;i++) {
			for(int i1=i+1;i1<len;i1++) {
				if(!temp[i1].equals(temp[i])) {
					ct++;
					break;
				}
			}
		}
		System.out.println(ct);
		return "";
	}
}
