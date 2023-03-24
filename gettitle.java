package basic;

import org.openqa.selenium.chrome.ChromeDriver;
   
public class gettitle {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe") ;
		ChromeDriver driver = new ChromeDriver () ;
		
		driver.get("https://www.flipkart.com/") ;
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
}
}
