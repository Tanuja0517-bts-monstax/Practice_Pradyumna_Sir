package pattern;

public class Pattern2 {
	public static void main(String[] args) {
		int num=1;
		char ch='a';
		int size=3;
		int k=0;
		int j=0;
		for(int i=0;i<size;i++) {
			for(int l=0;l<size;l++) {
				if(k<size)
				{
					if(j<size) {
						System.out.print(num++ +" ");
						k++;
					}
				}
				else if(k==3) {
					if(j>0)
						System.out.print(num++ +" ");
				}
			}
			System.out.println();
		}
	}
}
