package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless_browser_javascript {

	public static void main(String[] args) {
		HtmlUnitDriver h=new HtmlUnitDriver();
		h.setJavascriptEnabled(true);
		h.get("http://google.com");
		String domainName = (String) h
				.executeScript("return document.domain");
		System.out.println("Domain name is " + domainName);
	}

}
