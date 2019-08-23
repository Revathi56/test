package org.llr.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {


public static void main(String[] args) throws AWTException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Users\\gsslo\\.eclipse\\Sel\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(" https://www.snapdeal.com/");
WebElement u=driver.findElement(By.id("inputValEnter"));
u.sendKeys("iphonex");
Robot r=new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
WebElement g=driver.findElement(By.xpath("//input[@class='sd-input']"));
g.sendKeys("517501");



driver.findElement(By.xpath("//button[@class='pincode-check']")).click();

driver.findElement(By.xpath("//p[@class='product-title'][1]")).click();

String per=driver.getWindowHandle();
System.out.println(per);
Set<String> allwindowId=driver.getWindowHandles();
System.out.println(allwindowId);
for(String X:allwindowId) {
	if(!per.equals(X));
	driver.switchTo().window(X);
}
}
 
	
	}


