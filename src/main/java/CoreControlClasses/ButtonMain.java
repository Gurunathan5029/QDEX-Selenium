package CoreControlClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import CoreControlInterfaces.ButtonControls;
import SupportClasses.ActionClass;

public class ButtonMain implements ButtonControls{
	WebDriver runDriver;
	public ButtonMain(WebDriver driver)
	{
		runDriver= driver;
	}
     ActionClass action = new ActionClass(runDriver);
  
	public void ButtonClick(WebElement element) {
		element.click();
	}

	public void ButtonClickByAction(WebElement element) {
		action.click(element);
	}


	public void ButtonDoubleClickByAction(WebElement element) {
		action.Doubleclick(element);
	}

}
