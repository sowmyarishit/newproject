package Interview;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Color_recognization {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumbymahesh.com/HMS");
		driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("admin");
		  driver.findElement(By.name("submit")).click();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//  Thread.sleep(5000);
		  /*String colorString = driver.findElement(By.xpath("//*[text()='About Application: ']")).getAttribute("style");
       
		  System.out.println(colorString);
         String[] arrColor = colorString .split("#");
         assertTrue(arrColor[1].equals("#00837E"));*/
		WebElement ele=  driver.findElement(By.xpath("//*[text()='About Application: ']"));
		String color= ele.getCssValue("color"); 
		 System.out.println(color);
		 String hex = Color.fromString(color).asHex();
		 System.out.println(hex);
		driver.findElement(By.linkText("Logout")).click();

         driver.close();
	}

}