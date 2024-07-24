package collectionT;

public class Planet {
	private String pname;
	private int noMoon;
	private boolean rings;
	private String gases[]=new String[3];
	
	public Planet(String pname,int noMoon,boolean rings,String gases[]) {
		this.pname=pname;
		this.noMoon=noMoon;
		this.rings=rings;
		this.gases=gases;
	}
	
	public String toString() {
		return "Pname:"+pname+" noMoon:"+noMoon+" Rings:"+rings;
	}
	
	public boolean srings() {
		return rings;
	}
	
	public int numMoon() {
		return noMoon;
	}
	
	public String[] atmGases() {
		String gas[]=new String[gases.length];
		for(int i=0;i<gas.length;i++) {
			gas[i]=gases[i];
		}
		return gas;
	}
}
