package CoreControlInterfaces;

import org.openqa.selenium.WebElement;

public interface FrameControls {
void SwitchFrameById(int id);
void SwitchFrameByName(String name);
void SwitchFrameByWebElement(WebElement element);
void SwitchFrameByElementPresence(WebElement element);
}
