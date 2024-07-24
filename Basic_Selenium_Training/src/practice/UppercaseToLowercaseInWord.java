package practice;

import java.util.Scanner;

public class UppercaseToLowercaseInWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string:");
		String str=sc.nextLine();
		String str1="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
				str1+=(char)(str.charAt(i)-32);
			else if(str.charAt(i)>=65 && str.charAt(i)<=90)
				str1+=(char)(str.charAt(i)+32);
			if(str.charAt(i)==32)
				str1+=(char)str.charAt(i);
		}
		
		System.out.println(str1);
	}
}
