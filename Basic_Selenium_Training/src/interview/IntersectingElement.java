package interview;

import java.util.Scanner;

public class IntersectingElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of 1st arra:");
		int arr1[]=new int[sc.nextInt()];
		System.out.print("Enter size of 2st arra:");
		int arr2[]=new int[sc.nextInt()];
		
		System.out.print("Enter element in array 1:");
		for(int i=0;i<arr1.length;i++) 
			arr1[i]=sc.nextInt();
		
		System.out.print("Enter element in array 1:");
		for(int i=0;i<arr2.length;i++)
			arr2[i]=sc.nextInt();
		
		if(arr1.length<arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[j]) {
						System.out.println(arr1[i]);
						break;
					}
				}
			}
		}
		
		else {
			for(int i=0;i<arr2.length;i++) {
				for(int j=0;j<arr1.length;j++) {
					if(arr2[i]==arr1[j]) {
						System.out.println(arr2[i]);
						break;
					}
				}
			}
		}
	}
}
