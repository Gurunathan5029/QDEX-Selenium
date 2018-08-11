package CoreControlClasses;

import org.openqa.selenium.WebElement;

import CoreControlInterfaces.CheckBoxControls;

public class CheckBoxMain implements CheckBoxControls{

	public void Check(WebElement element) {
	element.click();
	}

}
