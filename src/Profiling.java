import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Profiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ProfilesIni, FirefoxProfile
		
		ProfilesIni Prof = new ProfilesIni();
		FirefoxProfile p = Prof.getProfile("selenium_user");
		
		FirefoxDriver FD = new FirefoxDriver(p);
		
	
		FD.close();//Closes only one window
		FD.quit(); //closes all windows associated with Firefox driver

	}

}
