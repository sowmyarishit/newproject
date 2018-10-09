package Interview;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\mindq\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	   	driver.get("http://www.way2sms.com/content/index.html?");
	   	driver.findElement(By.name("mobileNo")).sendKeys("9177379996");
	   	driver.findElement(By.name("password")).sendKeys("rama9996");
	   	driver.findElement(By.xpath("(//*[contains(text(),'Login ')])[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	driver.manage().window().maximize();
	   	Actions a1=new Actions(driver);
	   	a1.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	   	driver.findElement(By.xpath("//*[@class='rhbutton-container']/a")).click();
	    ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
	    System.out.println(a.size());
	   	Thread.sleep(5000);

	  	driver.switchTo().window(a.get(1));
	   	driver.findElement(By.name("feedText")).sendKeys("9177379996");

	   	Thread.sleep(5000);
	   //	driver.close();
	  /* 	driver.switchTo().window(a.get(0));
	   	driver.findElement(By.name("toMobile")).sendKeys("9177379996");
	   	Thread.sleep(8000);
*/
//driver.close();
	}

}
