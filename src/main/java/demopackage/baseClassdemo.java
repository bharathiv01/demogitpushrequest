package demopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseClassdemo {
	
	
	public WebDriver driver;
	
	public WebDriver initialiseDriverdemo() throws IOException {
		
//		Properties prop=new Properties();
//		
//		FileInputStream fis=new FileInputStream("C:\\Users\\user\\testProject\\src\\main\\java\\demopackage\\data.demoproperties");
//		
//prop.load(fis);		
//		
//		String browsername1=prop.getProperty("brwoser");
		
		
		//if(browsername1.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			
			
			driver=new ChromeDriver();
			
			
		//}
		
//		else if(browsername1.equals("firefox")) {
//			
//			driver=new FirefoxDriver();
//			
//			
//		}
//		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		return driver;
		
	}		
		
		

}
