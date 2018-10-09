package Interview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrolling_till_percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
   Object o=js.executeScript("return document.body.scrollHeight");
 int i=Integer.parseInt(o.toString());
 System.out.println("Total height of the page:"+i+" pixels");
 int percentage=30;
 i=(i*percentage)/100;
 js.executeScript("javascript:window.scrollTo(0,"+i+")");
  System.out.println("Scrolling to "+percentage+"%");

	}

}
