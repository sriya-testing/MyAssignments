package week2.classroom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//connect with BrowserDriver(exe file)
		
		WebDriverManager.chromedriver().setup();//check for the version and download
		/*
		 *String property=System.getProperty("webdriver.driver.chrome");
         *System.out.println(property);
         *
         */
		//step 2: To launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//step 3 :Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to wait for the driver to locate the element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step 4 : Enter the username
		
		//if value of the operator is not proper then it will throw exception as NoSuchElement
		 
		driver.findElement(By.id("username")).sendKeys("DemosalesManager");//cntl+to+L demosales manager is a credentials
		 
		//Step 5: Enter password
		 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//username.sendKeys("DemosalesManager");
		 //step 6: click on login button
		 driver.findElement(By.className("decorativeSubmit")).click();
		 //step 7 : click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		//step 8 : click on leads
		
		driver.findElement(By.linkText("Leads")).click();
		
		//step 9 : click on Create lead
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//step 10: Enter company name 
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		//STEP 11: Enter First name 
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sriya");
		//Step 12: Enter Second name 
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Barik");
		//Step 13: Enter first name (local)
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mama");
		//step 14: Enter Department
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		//step15: Description
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Part of information tech");
		//step16 : Enter email
		
		driver.findElement(By.className("inputBox")).sendKeys("sriyatesting1@gmail.com");
		//step 17 Click on create button
		
		driver.findElement(By.name("submitButton")).click();
		
		//step 18: Get the page title 
		
		System.out.println(driver.getTitle());
		//step 19: Click on duplicate lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		//step 20: Clear the company name field and send the new entry
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NTT");
		//step 21: Clear the first name field and send the new entry

		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anushka");
        // Click on the create lead
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		//step 9 : Confirm the title of my webpage
		String title=driver.getTitle();
		System.out.println(title);
		
		//Thread.sleep(2000);
		
		 //to close the browser
		 //driver.close();
	}

}
