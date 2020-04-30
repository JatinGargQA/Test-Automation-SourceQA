package com.automation;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestCases {
	
	
	public final static Logger logger = Logger.getLogger(TestCases.class);
	public static WebDriver driver;
	
	@BeforeMethod
	
	public static void driverFactory() {
		
		System.setProperty("webdriver.chrome.driver","C:\\SorurceFuse_Package\\drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Hitting URL with Username and Password Inline to handle authentication
		
		driver.get("http://sfwebhtml:t63KUfxL5vUyFLG4eqZNUcuRQ@sfwebhtml.sourcefuse.com/automation-form-demo-for-interview/");
				
	}
	
	@Test(priority=1, enabled=true)
		public static void testcase1() throws InterruptedException {
			
			driver.findElement(By.xpath("//*[text()='Submit Form']")).click();
			Thread.sleep(2000);
			if(!driver.getCurrentUrl().contains("resume"))
			{
				
				List<WebElement> elements = driver.findElements(By.xpath("//*[@class='required']"));
				
				for(WebElement ele: elements)
				{
					WebElement predecessor = ele.findElement(By.xpath(".."));
					logger.info(predecessor.getText());
				}
			}
			
			

		}
	@Test(priority=2, enabled=true)

		public static void testcase2() {
			
			SoftAssert softAssert = new SoftAssert();
			
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='fnameInput']")).isDisplayed());
			logger.info("1");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='lnameInput']")).isDisplayed());
			logger.info("2");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='emailInput']")).isDisplayed());
			logger.info("3");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='curCompanyInput']")).isDisplayed());
			logger.info("4");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='mobInput']")).isDisplayed());
			logger.info("5");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='DOBInput']")).isDisplayed());
			logger.info("6");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='positionInput']")).isDisplayed());
			logger.info("7");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='portfolioInput']")).isDisplayed());
			logger.info("8");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='salaryInput']")).isDisplayed());
			logger.info("9");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='whenStartInput']")).isDisplayed());
			logger.info("10");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='addressInput']")).isDisplayed());
			logger.info("11");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='resumeInput']")).isDisplayed());
			logger.info("12");
			softAssert.assertTrue(driver.findElement(By.xpath("//*[@id='relocateInput']")).isDisplayed());
			logger.info("13");

			
			softAssert.assertAll();

		}
	@Test(priority=3, enabled=true)
		public static void testcase3() {
			
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='fnameInput']")).isDisplayed());
			//logger.info("1");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='lnameInput']")).isDisplayed());
			//logger.info("2");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='emailInput']")).isDisplayed());
			//logger.info("3");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='curCompanyInput']")).isDisplayed());
			//logger.info("4");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='mobInput']")).isDisplayed());
			//logger.info("5");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='DOBInput']")).isDisplayed());
			//logger.info("6");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='positionInput']")).isDisplayed());
			//logger.info("7");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='portfolioInput']")).isDisplayed());
			//logger.info("8");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='salaryInput']")).isDisplayed());
			//logger.info("9");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='whenStartInput']")).isDisplayed());
			//logger.info("10");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='addressInput']")).isDisplayed());
			//logger.info("11");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='resumeInput']")).isDisplayed());
			//logger.info("12");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='relocateInput']")).isDisplayed());
			//logger.info("13");

		}
	@Test(priority=4, enabled=true)

		public static void testcase4() throws InterruptedException {
			
			//logger.info("Testcase4");
			
			driver.findElement(By.xpath("//*[@id='fnameInput']//child::*[@class='form-control']")).sendKeys("Jatin");
			driver.findElement(By.xpath("//*[@id='lnameInput']//child::*[@class='form-control']")).sendKeys("Garg");
			driver.findElement(By.xpath("//*[@id='emailInput']//child::*[@class='form-control']")).sendKeys("jatingarg2210@gmail.com");
			driver.findElement(By.xpath("//*[@id='curCompanyInput']//child::*[@class='form-control']")).sendKeys("IVP");
			driver.findElement(By.xpath("//*[@id='mobInput']//child::*[@class='form-control']")).sendKeys("8683830813");
			driver.findElement(By.xpath("//*[@id='DOBInput']//child::*[@class='form-control']")).sendKeys("22/10/1993");
			driver.findElement(By.xpath("//*[@id='positionInput']//child::*[@class='form-control']")).sendKeys("QA Automation");
			driver.findElement(By.xpath("//*[@id='portfolioInput']//child::*[@class='form-control']")).sendKeys("http://jatin.com");
		    driver.findElement(By.xpath("//*[@id='salaryInput']//child::*[@class='form-control']")).sendKeys("xLPA");
			driver.findElement(By.xpath("//*[@id='whenStartInput']//child::*[@class='form-control']")).sendKeys("15th June");
			driver.findElement(By.xpath("//*[@id='addressInput']//child::*[@class='form-control']")).sendKeys("Panipat");
			driver.findElement(By.xpath("//*[@id='resumeInput']//child::*[@class='form-control']")).sendKeys("C:\\SorurceFuse_Package\\Files\\Resume.txt");
		    driver.findElement(By.xpath("//*[@id='yes']")).click();
		    //Thread.sleep(5000);
		    driver.findElement(By.xpath("//*[text()='Submit Form']")).click();
		    Thread.sleep(5000);
		    Assert.assertTrue(driver.getCurrentUrl().contains("resume"));


		}

	
@AfterMethod
	
	public static void driverQuit() {
	
	driver.quit();
	
}

		

 
  
}
