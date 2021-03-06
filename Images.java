package week2.day2;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {

	private static ChromeDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[contains(@onclick,'window.location=')]")).click();
		driver.navigate().back();
		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		if(brokenImage.getAttribute("src") !="0")
		{
			  System.out.println("The image is broken");  
		} 
		else
		{ 
			System.out.println("The image is not broken"); 
		}
	}

}
