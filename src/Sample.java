import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Chrome. Its is an driver not built by seleniumHq
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Software and java jars downloaded\\chromedriver.exe");
		//ChromeDriver CD = new ChromeDriver();
		
		//CD.get("www.google.com");
		
		//IE
		
		System.setProperty("webdriver.ie.driver", "E:\\Software and java jars downloaded\\IEDriverServer.exe");
		InternetExplorerDriver IE = new InternetExplorerDriver();
		
		

	}

}
