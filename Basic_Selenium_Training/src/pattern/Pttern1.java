package pattern;

public class Pttern1 {
	public static void main(String[] args) {
		int num=1;
		char ch='a';
		int size=4;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if((i+j)%2!=0) {
					if(ch<='b') 
						System.out.print(ch++ +" ");
				}
				else {
					if(num<=2) {
						System.out.print(num++ +" ");
					}
				}
			}
			ch='a';
			num=1;
			System.out.println();
		}
	}
}
