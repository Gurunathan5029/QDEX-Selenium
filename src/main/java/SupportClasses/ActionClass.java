package SupportClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
 private Actions action ;
 
 WebDriver runDriver;
 public ActionClass(WebDriver driver) {
	 runDriver = driver;
	}
 public ActionClass()
 {
	 action = new Actions(runDriver);
 }
 public void click(WebElement element)
 {
	 action.click(element);
 } 
 
 public void Doubleclick(WebElement element)
 {
	 action.doubleClick(element);
 } 
 
 public void SendKeys(WebElement element,String text)
 {
	 action.sendKeys(element,text);
 } 
 
 public void MoveTo(WebElement element)
 {
	 action.moveToElement(element);
 }
 
 public void ContextClick(WebElement element)
 {
	 action.contextClick(element);
 }
 
 public void BuildAndPerform()
 {
	 action.build().perform();
 }
 
 
}
