package common;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class commonSetup {
	
	 public static WebDriver driver = null;
	  
	    @BeforeMethod
	    public void initialize() throws IOException {
	        
	    
	        
	        String urlWeb="https://demo.guru99.com/test/newtours/index.php";
	        String driverPath="..\\SeleniumFramework\\Drivers\\chromedriver.exe";
	        
	        System.out.println(urlWeb); 
	        System.out.println(driverPath);
	       
	        System.setProperty("webdriver.chrome.driver",driverPath);
		
			driver= new ChromeDriver();	
	    
	        // To maximize browser
	        driver.manage().window().maximize();
	    
	        // To open  site
	        driver.get(urlWeb);
	    }
	  
	    @AfterMethod
	    // Test cleanup
	    public void TeardownTest() {
	        commonSetup.driver.quit();
	    }
}