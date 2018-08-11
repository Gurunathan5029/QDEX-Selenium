package CoreControlClasses;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebElement;

import CoreControlInterfaces.WindowControls;
import WebDriverCoreSupportClasses.WebDriverClass;

public class WindowMain implements WindowControls {
	WebDriverClass myDriver;


	Boolean switched = false;

	public String ReturnCurrentWindow() {
		return myDriver.getWindowHandle().toString();
	}

	public void SwitchWindowByWinHandle(String handle) {
		Set<String> window = new HashSet<String>();
		window = myDriver.driver().getWindowHandles();
		for (String winHandle : window) {
			if (winHandle.equals(handle)) {
				myDriver.driver().switchTo().window(winHandle);
				switched = true;
				break;
			}
		}
		if (!switched) {
			System.out.println("Window Handle " + handle + " Is Not Found");
		}

	}

	public void SwitchWindowByIndex(int index) {
		int i = 0;
		Set<String> window = new HashSet<String>();
		window = myDriver.getWindowHandles();
		for (String winHandle : window) {
			i = i + 1;
			if (i == index) {
				myDriver.driver().switchTo().window(winHandle);
			}
		}
		if (!switched) {
			System.out.println("Window Handle Index" + index + " Is Not Found");
		}

	}

	public void SwitchWindowByPresenceOFWebElement(WebElement element) {
		Set<String> window = new HashSet<String>();
		window = myDriver.getWindowHandles();
		for (String winHandle : window) {
			myDriver.driver().switchTo().window(winHandle);
			if (element.isDisplayed()) {
				switched = true;
				break;
			}

		}
		if (!switched) {
			System.out.println("Window Element " + element + " Is Not Found In Any Of The Window");
		}

	}

	public void SwitchWindowByWinName(String name) {
		myDriver.driver().switchTo().window(name);
	}

}
