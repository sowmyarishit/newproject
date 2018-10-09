package Interview;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepicker2_copy {
	public static String date;
	public static String date1;

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\mindq\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebDriverWait w = new WebDriverWait(driver, 20);
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='datepicker']")));
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		date = "10";
		date1 = "March 2018";
		/*
		 * String Splitter[]=date1.split("-"); String checkinMonth=Splitter[1];
		 * System.out.println(checkinMonth); String checkinday=Splitter[0];
		 * System.out.println(checkinday); SelectDate(checkinMonth,checkinday);
		 */
		SelectDate();
	}

	public static void SelectDate() throws InterruptedException {
		String currmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		System.out.println(currmonth);
		Date objDate = new Date();
		SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String sysdat = inputFormat.format(objDate);
		System.out.println(sysdat);
		if (date1.compareTo(sysdat) > 0) {
			if (date1.equalsIgnoreCase(currmonth)) {
				System.out.println("month selected");
			} else {
				for (int i = 1; i < 12; i++) {
					driver.findElement(By.xpath("//*[@title='Next']")).click();
					currmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
					if (date1.equalsIgnoreCase(currmonth)) {
						System.out.println("month selected");
						break;
					}

				}
			}
			Thread.sleep(1000);
			List<WebElement> datepicker = driver.findElements(By.xpath("//table/tbody/tr/td"));
			for (WebElement day : datepicker) {
				String caldate = day.getText();
				if (caldate.equalsIgnoreCase(date)) {
					day.click();
					System.out.println("day selected");
					break;
				}
			}
			driver.close();
		}

		else if (date1.compareTo(sysdat) == 0) {
			if (date1.equalsIgnoreCase(currmonth)) {
				System.out.println("month selected");
			} else {
				for (int i = 1; i < 12; i++) {
					Thread.sleep(1000);
					currmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
					if (date1.equalsIgnoreCase(currmonth)) {
						System.out.println("month selected");
						break;
					}

				}
			}
			Thread.sleep(1000);
			List<WebElement> datepicker = driver.findElements(By.xpath("//table/tbody/tr/td"));
			for (WebElement day : datepicker) {
				String caldate = day.getText();
				if (caldate.equalsIgnoreCase(date)) {
					day.click();
					System.out.println("day selected");
					break;
				}
			}
			driver.close();
		} else {
			if (date1.equalsIgnoreCase(currmonth)) {
				System.out.println("month selected");
			} else {
				for (int i = 1; i < 12; i++) {
					driver.findElement(By.xpath("//*[@title='Prev']")).click();
					Thread.sleep(1000);
					currmonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
					if (date1.equalsIgnoreCase(currmonth)) {
						System.out.println("month selected");
						break;
					}

				}
			}
			Thread.sleep(1000);
			List<WebElement> datepicker = driver.findElements(By.xpath("//table/tbody/tr/td"));
			for (WebElement day : datepicker) {
				String caldate = day.getText();
				if (caldate.equalsIgnoreCase(date)) {
					day.click();
					System.out.println("day selected");
					break;
				}
			}
			driver.close();
		}
	}
}
