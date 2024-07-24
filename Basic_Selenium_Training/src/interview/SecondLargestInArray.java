package interview;

import java.util.Scanner;

public class SecondLargestInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int arr[]=new int[sc.nextInt()];
		int fLargest=arr[0],sLargest=arr[0];
		System.out.print("Enter elements in array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<arr.length;i++) {
			if(fLargest<arr[i])
				fLargest=arr[i];
		}
		
		for(int i=1;i<arr.length;i++) {
			if(sLargest<arr[i] && fLargest>arr[i])
				sLargest=arr[i];
		}
		
		System.out.println("Second largest:"+sLargest);
	}
}
