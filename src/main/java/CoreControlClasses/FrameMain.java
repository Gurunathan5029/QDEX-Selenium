package CoreControlClasses;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import CoreControlInterfaces.FrameControls;
import WebDriverCoreSupportClasses.WebDriverClass;

public class FrameMain implements FrameControls {
	WebDriverClass myDriver;

	Boolean switched = false;
	int size = myDriver.findElements(By.tagName("iframe")).size();

	public void SwitchFrameById(int id) {
		myDriver.driver().switchTo().frame(id);
	}

	public void SwitchFrameByName(String name) {
		myDriver.driver().switchTo().frame(name);

	}

	public void SwitchFrameByWebElement(WebElement element) {
		myDriver.driver().switchTo().frame(element);

	}

	public void SwitchFrameByElementPresence(WebElement element) {
		List<WebElement> frames = new ArrayList<WebElement>();
		frames = myDriver.findElements(By.tagName("iframe"));
		for (WebElement frame : frames) {
			myDriver.driver().switchTo().frame(frame);
			if (element.isDisplayed()) {
				switched = true;
				break;
			}

		}
		if (!switched) {
			System.out.println("Element " + element + " Is Not Found In Any Of The Frame");
		}

	}

}
