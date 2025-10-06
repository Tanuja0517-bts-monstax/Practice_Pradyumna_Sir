/*Write a program to reverse a string without using reverse() method.*/
package chatGPTJavaInterviewPgmingQuestions;

import java.util.Scanner;

public class ReverseStringWithoutReverseMethod {
	public static String reverseString(String str) {
		String rev="";
		for(int i=str.length()-1;i>-1;i--) {
			rev+=str.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String str=sc.next();
		System.out.println("Reversed String is:"+reverseString(str));
	}
}
