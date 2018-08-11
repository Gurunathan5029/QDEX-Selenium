package CoreControlInterfaces;

import org.openqa.selenium.WebElement;

public interface WindowControls {
	void SwitchWindowByWinHandle(String handle);
	
	void SwitchWindowByWinName(String name);
	
	void SwitchWindowByIndex(int index);
	
	void SwitchWindowByPresenceOFWebElement(WebElement element);
	
	String ReturnCurrentWindow();
}
