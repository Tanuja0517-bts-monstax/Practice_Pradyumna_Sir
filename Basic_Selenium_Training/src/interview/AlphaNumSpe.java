package interview;

import java.util.Scanner;

public class AlphaNumSpe {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string:");
		String str=sc.next();
		int intCount=0;
		int specialCount=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
				intCount++;
			else if(!(str.charAt(i)>=65 && str.charAt(i)<91) && !(str.charAt(i)>=97 && str.charAt(i)<=122)) {
				System.out.print(str.charAt(i));
				specialCount++;
			}
		}
		System.out.println(" Count of special character is "+specialCount);
		System.out.println("Count of interger in "+str+" is "+intCount);
	}
}
