import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail_CSSselector {
	
	@Test
	public void HomePage()
	{
		
	FirefoxDriver FD = new FirefoxDriver();
	FD.get("https://nabconnect2.nab.com.au/auth/nabclogin/login.do?TAM_OP=login");
	
	//FD.findElement(By.cssSelector("#password")).sendKeys("passw123");
	FD.findElement(By.cssSelector("input[id=userId]")).sendKeys("6206499540");
		
	}

}
