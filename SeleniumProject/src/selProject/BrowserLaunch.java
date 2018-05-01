package selProject;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch
{

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\SeleniumReqDoc\\chromedriver_win32\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in");
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in");
		
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.navigate().to("https://www.flipkart.com");
		
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		InternetExplorerDriver driver3=new InternetExplorerDriver();
			driver3.get("https://www.ebay.com");
		
		
	}

}
