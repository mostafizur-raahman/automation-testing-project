package priyoShop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AddToCart {
	public static void main(String[] args) throws InterruptedException {
		
		// Setup WebDriverManager for Firefox
        WebDriverManager.firefoxdriver().setup();
        // Initialize WebDriver using FirefoxDriver
        WebDriver driver = new FirefoxDriver();
        driver.get("https://priyoshop.com/");
        Thread.sleep(2000);
        //go to login page
		driver.findElement(By.xpath("//label[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		Thread.sleep(2000);
		//fillup the form
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("Test2Test2Test2@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
        Thread.sleep(2000);
        //click login
        driver.findElement(By.xpath("//body/div[5]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/input[1]")).click();
		
        //click product
        driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[3]/button[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#product_attribute_59391_809521")).click();
        //driver.findElement(By.cssSelector("#addtocart_143331_EnteredQuantity")).sendKeys("20");
        Thread.sleep(2000);
        //click add to cart
        driver.findElement(By.cssSelector("#add-add-to-cart-button-143331")).click();
	}
}
