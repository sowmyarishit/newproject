package Interview;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker2_copy_prev_next {
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
	//	 date="10";
		 date1="10-March 2018";
		 String Splitter[]=date1.split("-");
		  String checkinMonth=Splitter[1];
		  System.out.println(checkinMonth);
		  String checkinday=Splitter[0];
		  System.out.println(checkinday);
		  SelectDate(checkinMonth,checkinday);
	//	 SelectDate();
	}

	public static void SelectDate(String checkinMonth, String checkinday)throws InterruptedException {
	
			Date objDate = new Date();
			SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	        String sysdat=   inputFormat.format(objDate);
	        
	        
	        System.out.println(sysdat);
	    
	             if (sysdat.compareTo(date1) > 0) {
	        	   System.out.println("Date 1 occurs after Date 2");
	        	  } // compareTo method returns the value greater than 0 if this Date is after the Date argument.
	        	  else if (sysdat.compareTo(date1) < 0) {
	        	   System.out.println("Date 1 occurs before Date 2");
	        	  } // compareTo method returns the value less than 0 if this Date is before the Date argument;
	        	  else if (sysdat.compareTo(date1) == 0) {
	        	   System.out.println("Both are same dates");
	        	  } // compareTo method returns the value 0 if the argument Date is equal to the second Date;
	        	  else {
	        	   System.out.println("You seem to be a time traveller !!");
	        	  }

  
		String currmonth=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		   System.out.println(currmonth);
		   
		   if(checkinMonth.equalsIgnoreCase(currmonth)) {
			   System.out.println("month selected");
		   }
		   else {
			   for(int i=1;i<12;i++) {
				   driver.findElement(By.xpath("//*[@title='Prev']")).click();
				   Thread.sleep(1000);
				   currmonth=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
				   if(checkinMonth.equalsIgnoreCase(currmonth)) {
					   System.out.println("month selected");
					   break;
				   }

			   }
		   }
		   Thread.sleep(1000);
		 List<WebElement> datepicker=driver.findElements(By.xpath("//table/tbody/tr/td"));
		   for(WebElement day:datepicker) {
			   String caldate=day.getText();
			   if(caldate.equalsIgnoreCase(checkinday)) {
				   day.click();
				   System.out.println("day selected");
				   break;
			   }
		   }
	   driver.close();
		
	}

}
