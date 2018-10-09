package Interview;

import org.openqa.selenium.chrome.ChromeDriver;

public class Without_getmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\mindq\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		String title=	driver.getTitle();
		System.out.println("Title of the page is -> " +title);
	}

}
