package interview;

import java.util.Scanner;

public class CountNumOfLowercaseNUppercaseLeetersOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String word=sc.next();
		int low=0,up=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>=65 && word.charAt(i)<=90)
				up++;
			if(word.charAt(i)>=97 && word.charAt(i)<=122)
				low++;
		}
		
		System.out.println("Count of lowercase character in "+word+" is "+low);
		System.out.println("Count of uppercase character in "+word+" is "+up);
	}
}
