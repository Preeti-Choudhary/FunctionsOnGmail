import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilities_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Proxy example
		
		Proxy proxy = new Proxy();
		proxy.setProxyAutoconfigUrl("");
		

		DesiredCapabilities DC = new DesiredCapabilities();
		DC.setJavascriptEnabled(true);
		DC.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		DC.setCapability(CapabilityType.PROXY, proxy);
		//DC.setCapability(, value);
		
		FirefoxDriver FD = new FirefoxDriver(DC);
		
		FD.close();
		
	}

}
