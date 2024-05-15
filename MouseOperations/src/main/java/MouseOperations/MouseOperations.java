package MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperations {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in/");
       
      //  driver.findElement(By.className("nav-link-hed"));

        Actions action= new Actions(driver);
       // action.moveToElement(driver.findElement(By.className("sub-menu-title menu-title-row pt-2 pb-2"))).build().perform();
       
        //FOR DOUBLECLICK
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("double click");
        action.doubleClick(driver.findElement(By.id("twotabsearchtextbox"))).perform();
        
        //FOR RIGHT CLICK 
       // action.contextClick("FINDING ELEMENT BY LOCATORS").perform();
        
        // Imp Note = at the end of the line we need to provide perform();
}
}