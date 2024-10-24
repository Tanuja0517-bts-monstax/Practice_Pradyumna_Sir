package TestNgFeature;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Working_With_Parameteraization {
	int result;
	@Parameters({"num1","num2"})
	@Test
	public void add(int a,int b) {
		result=a+b;
		System.out.println("Addition:"+result);
	}
	
	@Parameters({"num1","num2"})
	@Test
	public void sub(int a,int b) {
		result= a>b?a-b:b-a;
		System.out.println("Substraction:"+result);
	}
	
	@Parameters({"num1","num2"})
	@Test
	public void mul(int a,int b) {
		result=a*b;
		System.out.println("Multiplication:"+result);
	}
	
	@Parameters({"num1","num2"})
	@Test
	public void div(int a,int b) {
		result=a>b?a/b:b/a;
		System.out.println("Division:"+result);
	}
}
