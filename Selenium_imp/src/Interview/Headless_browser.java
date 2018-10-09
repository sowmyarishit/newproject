package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless_browser {

	public static void main(String[] args) {
		HtmlUnitDriver h=new HtmlUnitDriver();
		h.get("http://www.google.com");
	String title=	h.getTitle();
	System.out.println("Title of the page is -> " + h.getTitle());
	 
	// find the search edit box on the google page
	WebElement searchBox = h.findElement(By.name("q"));

	// type in Selenium
	searchBox.sendKeys("Selenium");

	// find the search button
	WebElement button = h.findElement(By.xpath("//*[@name='btnK']"));

	// Click the button
	button.click();

	System.out.println("Title of the page is -> " + h.getTitle());

	}

}
