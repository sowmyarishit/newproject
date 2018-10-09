package Interview;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_full_andelementwise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		WebDriver	driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.yatra.com/");
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	FileUtils.copyFile(f,new File("E:/FullImage.png"));
		//photo of which element?	
		WebElement flights=driver.findElement(By.id("BE_flight_flsearch_btn"));
		int x=flights.getLocation().getX();
		int y=flights.getLocation().getY();
		int width=flights.getSize().width;
		int height=flights.getSize().height;
		ImageIO.write(ImageIO.read(f).getSubimage(x,y,width,height),"png",f);
		FileUtils.copyFile(f,new File("E:/flight.png"));


	}

}
