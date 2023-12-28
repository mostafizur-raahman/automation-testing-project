package priyoShop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class SignUpPage {
	public static void main(String[] args) throws InterruptedException {
		
		// Setup WebDriverManager for Firefox
        WebDriverManager.firefoxdriver().setup();
        // Initialize WebDriver using FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://priyoshop.com");
        Thread.sleep(2000);
        
        //go to signup page
		driver.findElement(By.xpath("//label[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(2000);
		//fillup the form
		driver.findElement(By.xpath("//input[@id='email-register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("khalid1201");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("khalid111@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='StreetAddress']")).sendKeys("Dhaka, Bangladesh");
        Select selectcontry = new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
        selectcontry.selectByVisibleText("Bangladesh");
        Thread.sleep(2000);
        Select selectDistrict = new Select(driver.findElement(By.xpath("//select[@id='StateProvinceId']")));
        selectDistrict.selectByVisibleText("Dhaka");
        Thread.sleep(2000);
        Select selectPoliceStation = new Select(driver.findElement(By.xpath("//select[@id='City']")));
        selectPoliceStation.selectByVisibleText("Badda");
		
        driver.findElement(By.xpath("//input[@id='accept-privacy-policy']")).click();
        Thread.sleep(2000);
        //click register
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
	}
}
