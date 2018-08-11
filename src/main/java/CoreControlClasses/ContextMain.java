package CoreControlClasses;

import org.openqa.selenium.WebElement;

import CoreControlInterfaces.ContextControls;
import SupportClasses.ActionClass;

public class ContextMain implements ContextControls {
	ActionClass action = new ActionClass();

	public void ContextClick(WebElement element) {
		action.ContextClick(element);
		action.BuildAndPerform();
	}

	public void ContextClickAndSelect(WebElement element, WebElement clickElement) {
		action.ContextClick(element);
		action.click(clickElement);
		action.BuildAndPerform();
	}

}
