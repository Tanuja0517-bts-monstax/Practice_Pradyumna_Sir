package practice;

//Generates a random double value greater than or equal to 0.0 and less than 1.0

public class Math_Random {
	public static void main(String[] args) {
		int start= 1;
		int end=20;
		
		int val=0;
		for(int i=start;i<end;i++) {
			val=(int)(Math.random()*((end-start)*i));
			System.out.println(val);
		}
	}
}
