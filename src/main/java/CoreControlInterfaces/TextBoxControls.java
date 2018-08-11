package CoreControlInterfaces;

import org.openqa.selenium.WebElement;

public interface TextBoxControls {
	 String EnterText(WebElement element,String text);
	 String EnterTextByAction(WebElement element,String text);
	 String GetText(WebElement element);
}
