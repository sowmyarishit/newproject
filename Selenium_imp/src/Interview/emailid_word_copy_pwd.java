package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class emailid_word_copy_pwd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\mindq\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("http://www.seleniumbymahesh.com/HMS");
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.name("password"));
		e.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		//Actions action= new Actions(driver);
		
		//action.contextClick(e).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);

/*String ti=	driver.getTitle();
System.out.println(ti);
	WebElement e=driver.findElement(By.name("username"));
	e.sendKeys("admin");
	String ss=e.getText();
		System.out.println(ss);
*/
		 // driver.findElement(By.name("password")).sendKeys("admin");
		  driver.findElement(By.name("submit")).click();

	/*	driver.findElement(By.name("username")).sendKeys("admin");

		driver.findElement(By.name("password")).sendKeys("admin");
	//String ss=	uname.getText();
*/	Thread.sleep(2000);
         driver.close();
		/*String ss=driver.findElement(By.name("password")).getText();
		System.out.println(ss);

	//	System.out.println(ss);
		driver.findElement(By.name("password")).sendKeys(ss);
		
*/

	}

}
