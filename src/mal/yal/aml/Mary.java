
package mal.yal.aml;


//package sel.java.pro;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import okio.Options;

public class Mary{
	private static final String Options = null;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\doniv08\\eclipse-workspace\\july\\driver" );
		WebDriver driver=  new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement xbutton = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		xbutton.click();
		Actions ac= new Actions(driver);
	  List<WebElement> electo = driver.findElements(By.xpath("//li[@class='Wbt_B2 _1YVU3_']"));
	for(WebElement x:electo) {
			ac.moveToElement(x).build().perform();
			Thread.sleep(30000);
			driver.close();
	}
	}
}