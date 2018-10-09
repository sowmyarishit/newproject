package java_programs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\mindq\\chromedriver.exe");
    	//create object to access that opened driver
    	WebDriver driver=new ChromeDriver();
    	//launch site
    	driver.get("file://C://Users//DELL//Desktop//abc.html");
    	String x=	driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getAttribute("class");
    	System.out.println(x);
      
	}

}
