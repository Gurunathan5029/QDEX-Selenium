package SupportClasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClass {
	Robot robot; 
	public RobotClass() 
	{
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public void PressEnter()
	{
		robot.keyPress(KeyEvent.VK_ENTER);
	}
}
