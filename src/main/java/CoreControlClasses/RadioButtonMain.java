package CoreControlClasses;

import org.openqa.selenium.WebElement;
import CoreControlInterfaces.RadioButtonControls;
import SupportClasses.ActionClass;

public class RadioButtonMain implements RadioButtonControls {
ActionClass action = new ActionClass();
	public void RadioButtonClick(WebElement element) {
		element.click();
	}

	public void RadioButtonClickByAction(WebElement element) {
		action.click(element);
	}

}
