/*How do you find duplicate characters in a string?*/
package chatGPTJavaInterviewPgmingQuestions;

import java.util.Scanner;

public class DuplicatesInString {
	public static void dupInString(String str) {
		String dup="";
		for(int i=0;i<str.length();i++) {
			if(!(dup.contains(str.charAt(i)+""))) {}
					//dup+=str.charAt(i);
		}
		System.out.println("Duplicate elements in "+str+" are "+dup);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string:");
		String str=sc.next();
		dupInString(str);
	}
}
