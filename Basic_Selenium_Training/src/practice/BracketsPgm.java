package practice;

public class BracketsPgm {
	public static void main(String[] args) {
		String str="[({})]";
		char c[]=str.toCharArray();
		for(int k=0;k<3;k++) {
			for(int i=0;i<c.length;i++) {
				for(int j=i+1;j<c.length;j++) {
					if(c[i]==40 && c[j]==41)
						System.out.print(c[i]+""+c[j]+" ");
					if(c[i]==91 && c[j]==93)
						System.out.print(c[i]+""+c[j]+" ");
					if(c[i]==123 && c[j]==125)
						System.out.print(c[i]+""+c[j]);
					}
			}
			System.out.println();
		}
		//91,93 40,41 123,125
		//40,41 91,93 123,125
		//123,125 91,93 40,41
		  
	}
}