package practice;

import java.util.Scanner;

public class StringToArray {
	public static char[] toCharacterArray(String str) {
		char[] ch= new char[str.length()];
		for(int i=0;i<ch.length;i++) {
			ch[i]=str.charAt(i);
		}
		return ch;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string:");
		String str=sc.next();
		
		System.out.println("Char array:");
		char ch[]=toCharacterArray(str);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+" ");
		}
	}
}
