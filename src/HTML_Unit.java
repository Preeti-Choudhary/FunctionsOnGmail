import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.BrowserType;

import com.gargoylesoftware.htmlunit.BrowserVersion;


public class HTML_Unit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://code.google.com/p/selenium/wiki/HtmlUnitDriver
		
		HtmlUnitDriver HtmlUnit = new HtmlUnitDriver(BrowserVersion.FIREFOX_24);
		HtmlUnit.get("https://www.google.com.au");
		
		HtmlUnit.close();

	}

}
