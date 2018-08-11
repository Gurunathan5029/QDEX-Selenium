package CoreControlClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import CoreControlInterfaces.ComboboxControls;

public class ComboBoxMain implements ComboboxControls {
	Select slc;

	ComboBoxMain(WebElement element) {
		slc = new Select(element);
	}

	public void SelectItem(String identifier, String item) {

		if (identifier.equals("Value")) {
			slc.selectByValue(item);
		} else if (identifier.equals("VissibleText")) {
			slc.selectByVisibleText(item);
		}
	}

	public void SelectItem(String identifier, int index) {
		slc.selectByIndex(index);
	}

	public void DeSelectItem(String identifier, String item) {
		if (identifier.equals("Value")) {
			slc.deselectByValue(item);
		} else if (identifier.equals("VissibleText")) {
			slc.deselectByVisibleText(item);
		}

	}

	public void DeSelectItem(String identifier, int index) {
		slc.deselectByIndex(index);
	}

	public void DeSelectAllItem() {
		slc.deselectAll();
	}

}
