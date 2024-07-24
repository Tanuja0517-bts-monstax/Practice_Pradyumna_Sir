package arrays;

public class First5EvenInArray {
	public static void main(String[] args) {
		int num=1;
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
				if(num%2==0) {
					arr[i]=num;
				}
				else
					i--;
				num++;
			}
			
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
