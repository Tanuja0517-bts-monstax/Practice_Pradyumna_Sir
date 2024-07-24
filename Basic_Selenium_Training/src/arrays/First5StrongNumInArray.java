package arrays;

public class First5StrongNumInArray {
	public static boolean isStrong(int num) {
		int temp=num;
		int prod=0;
		while(num>0) {
			int rem=num%10;
			int val=1;
			for(int j=1;j<=rem;j++) {
				val*=j;
			}
			num/=10;
			prod+=val;
		}
		if(prod==temp)
				return true;
			else
				return false;
	}
	public static void main(String[] args) {
		int num=1;
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++) {
			if(isStrong(num)) {
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
