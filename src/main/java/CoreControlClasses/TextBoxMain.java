package CoreControlClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import CoreControlInterfaces.TextBoxControls;
import SupportClasses.ActionClass;

public class TextBoxMain implements TextBoxControls{
	ActionClass action;
	public TextBoxMain(WebDriver driver)
	{
		action = new ActionClass(driver);
	}
	
	
	public String EnterText(WebElement element,String text) {
		element.sendKeys(text);
		return element.getText();
	}

	public String EnterTextByAction(WebElement element,String text) {
		action.SendKeys(element, text);
		return element.getText();
	}

	public String GetText(WebElement element) {
		return element.getText();
	}

}
