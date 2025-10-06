/*Write Java code to check if a string is palindrome.*/
package chatGPTJavaInterviewPgmingQuestions;

import java.util.Scanner;

public class PalindromeString {
	public static void isPalindrome(String str) {
		StringBuffer rev = new StringBuffer(str);
		rev=rev.reverse();
		System.out.println("R:"+rev+" O:"+str);
		if(rev.toString().equals(str))
			System.out.println(str+" is palindrome");
		else
			System.out.println(str+" is not palindrome ");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:");
		String str=sc.next();
		isPalindrome(str);
	}
}
