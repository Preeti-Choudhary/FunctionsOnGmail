import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail {
	
	@Test
	public void TestHomePage()
	{
		FirefoxDriver FD = new FirefoxDriver();
		FD.get("https://nabconnect2.nab.com.au/auth/nabclogin/login.do?TAM_OP=login");
		
		//Using by id
		
		/* 
		WebElement Username = FD.findElement(By.id("userId"));
		Username.sendKeys("6206499345");
		
		WebElement password = FD.findElement(By.id("password"));
		password.sendKeys("passw123");
		
		WebElement submitButton = FD.findElement(By.id("loginButton"));
		submitButton.click();
		
		*/
		
		//Using Partial Xpath
		// xpath below can be //input[@id='userId']
		 
		FD.findElement(By.xpath("//*[@id='userId']")).sendKeys("62064999567");
	
		
		//Preparing own xpath
		FD.findElement(By.xpath("//input[@class='inputLarge' and @type='password']")).sendKeys("passw123");
		//FD.findElement(By.xpath("//input[@id='loginButton']")).click();
		
		//Clicking the link/button using the text on the link/button - Not working
		//FD.findElement(By.xpath("//a[text()='Help']")).click();
		
		//capturing error message
		
		String Str = FD.findElement(By.xpath("//*[@id='loginError']/h2")).getText();
		System.out.println(Str);
		

		//FD.close();
		//FD.quit();
		
	}

}
