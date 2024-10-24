package TestNgFeature;

import org.testng.annotations.Factory;

public class Working_With_FactoryAnnotation {
	@Factory
	public Object[] objectCreation() {
		return new Object[] {
			new Class_For_FactoryAnnotation(),
			new Class_For_FactoryAnnotation1()
		};
		}
	}
