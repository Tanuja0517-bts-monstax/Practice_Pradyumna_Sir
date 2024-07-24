package pattern;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class Pattern3 {
	public static void main(String[] args) {
		int num=1;
		int size=3;
		int ct=1;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;i++) {
				if(ct<(size*size)) {
					int temp=num*(ct++);
					System.out.print(temp+" ");
				}
			}
			System.out.println();
		}
	}
}
