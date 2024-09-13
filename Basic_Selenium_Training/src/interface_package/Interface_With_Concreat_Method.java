package interface_package;

public interface Interface_With_Concreat_Method {
	public abstract void method1();
	
	default void method2() {
		System.out.println("Default non-static concryt method of Interface_With_Concreat_Method");
	}
	
	public static void method3() {
		System.out.println("Public static concryt method of Interface_With_Concreat_Method");
	}
}
