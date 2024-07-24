package collectionT;

public class ZooClass {
	String type;
	String name;
	public ZooClass(String type,String name) {
		this.type=type;
		this.name=name;
	}
	
	public String toString() {
		return "type:"+type+" name:"+name;
	}
}
