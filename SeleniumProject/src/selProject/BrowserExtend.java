package selProject;

import org.openqa.selenium.By;

public class BrowserExtend extends BasePage{

	public static void main(String[] args) throws Exception 
	{
		//browserLaunch("chrome","https://www.amazon.in");
		
		browserLaunch(getData("browser"),getData("hdfcurl"));
		
		driver.manage().window().maximize();  //maximize browser 28-04
		
		String title = driver.getTitle();// to get title 28-04
		System.out.println(title);
		
		String url = driver.getCurrentUrl();  // to get url
		System.out.println(url);
		
		driver.manage().deleteAllCookies();   //to delete all cookies
		
		driver.navigate().back();    // to back browser
		
		Thread.sleep(4000);
		
		driver.navigate().forward();  //to forward the browser
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();  //to refresh the page
		
		/*for(int i=0;i<=10;i++)
		{
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,100)"); //For scrolling page horizontal and verticle
			Thread.sleep(200);
		}
		*/
		driver.findElement(By.id("loginsubmit")).click();
		
		Thread.sleep(200);
		
		driver.close();  //To close current window which is open add to window
		
		//driver.quit();  //To close all the consiqutive windows which is open by url (multiple window)
	}

}
