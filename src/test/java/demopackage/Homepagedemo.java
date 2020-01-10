package demopackage;

import java.io.IOException;

import org.testng.annotations.Test;

public class Homepagedemo extends baseClassdemo {
	
	
	@Test
	public void basepagenavigationdemo() throws IOException {
		
		driver=initialiseDriverdemo();
		
		
		driver.get("https://www.google.com");
		
		
	}
	

}
