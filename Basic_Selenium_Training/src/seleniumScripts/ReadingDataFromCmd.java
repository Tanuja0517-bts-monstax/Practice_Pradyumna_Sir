package seleniumScripts;

import org.testng.annotations.Test;

public class ReadingDataFromCmd {
	@Test
	public void readData_Test() {
		String name=System.getProperty("name");
		String surname=System.getProperty("sname");
		
		System.out.println("Name:"+name+" Surname:"+surname);
	}
}
