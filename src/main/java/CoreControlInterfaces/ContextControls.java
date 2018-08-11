package CoreControlInterfaces;

import org.openqa.selenium.WebElement;

public interface ContextControls {
	void ContextClick(WebElement element);
	
	void ContextClickAndSelect(WebElement element,WebElement clickElement);
}
