package Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker {
	public static String date;
	public static String date1;

public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\mindq\\chromedriver.exe");		
		 driver=new ChromeDriver();	
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebDriverWait w=new WebDriverWait(driver,20);
	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='datepicker']")));
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		 date="10";
		 date1="december 2018";
	/*	 String Splitter[]=date1.split("/");
		  String checkinMonth=Splitter[0];
		  String checkinday=Splitter[1];*/
		  SelectDate();

	}

	public static void SelectDate()throws InterruptedException {
		// TODO Auto-generated method stub
	//	   driver.findElement(By.xpath("//*[@title='Next']")).click();
		   String currmonth=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		   System.out.println(currmonth);
		   if(date1.equalsIgnoreCase(currmonth)) {
			   System.out.println("month selected");
		   }
		   else {
			   for(int i=1;i<12;i++) {
				   driver.findElement(By.xpath("//*[@title='Next']")).click();
				//   Thread.sleep(1000);
				   currmonth=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
				   if(date1.equalsIgnoreCase(currmonth)) {
					   System.out.println("month selected");
					   break;
				   }

			   }
		   }
		 //  Thread.sleep(1000);
		 List<WebElement> datepicker=driver.findElements(By.xpath("//table/tbody/tr/td"));
		   for(WebElement day:datepicker) {
			   String caldate=day.getText();
			   if(caldate.equalsIgnoreCase(date)) {
				   day.click();
				   System.out.println("day selected");
				   break;
			   }
		   }
		   driver.close();
		
	}

}
