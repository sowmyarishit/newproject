package Interview;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.chrome.ChromeDriver;

public class pdffile_read {
//https://www.tutorialspoint.com/pdfbox/pdfbox_inserting_image.htm
	//for pdf things
	public static void main(String[] args) throws IOException {

	      //Loading an existing document
	      File file = new File("C:\\Users\\Admin\\Desktop\\Traintkt.pdf");
	      PDDocument document = PDDocument.load(file);

	      //Instantiate PDFTextStripper class
	      PDFTextStripper pdfStripper = new PDFTextStripper();

	      //Retrieving text from PDF document
	      String text = pdfStripper.getText(document);
	      System.out.println(text);

	      //Closing the document
	      document.close();
	/*  	System.setProperty("webdriver.chrome.driver", "E://mindq//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	      driver.get("https://bitcoin.org/bitcoin.pdf");
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      URL url = new URL(driver.getCurrentUrl()); 
	      BufferedInputStream fileToParse=new BufferedInputStream(url.openStream());

	      //parse()  --  This will parse the stream and populate the COSDocument object. 
	      //COSDocument object --  This is the in-memory representation of the PDF document

	      PDFParser parser = new PDFParser(fileToParse);
	      parser.parse();

	      //getPDDocument() -- This will get the PD document that was parsed. When you are done with this document you must call    close() on it to release resources
	      //PDFTextStripper() -- This class will take a pdf document and strip out all of the text and ignore the formatting and           such.

	      String output=new PDFTextStripper().getText(parser.getPDDocument());
	      System.out.println(output);
	      parser.getPDDocument().close(); 
	      driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);*/
	}

}
