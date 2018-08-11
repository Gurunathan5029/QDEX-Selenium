package WebDriverCoreSupportClasses;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverClass {
	   private static WebDriver driver;
	   private String browserName;
	   private final static int timeout = 30; 

	   public WebDriverClass(String browserName,String driverPath) { 
	      this.browserName = browserName; 
	      WebDriverClass.driver = createDriver(browserName,driverPath); 
	   }  
	   

	   private WebDriver createDriver(String browserName,String driverPath) { 
	      if (browserName.toUpperCase().equals("FIREFOX"))
	    		  {
	         return firefoxDriver(driverPath); 
	    		  }
	      if (browserName.toUpperCase().equals("CHROME")) 
	    		  {
	         return chromeDriver(driverPath);  
	    		  }

	      throw new RuntimeException ("invalid browser name"); 
	   } 

	   private WebDriver chromeDriver(String driverPath) { 
	      if (!new File(driverPath).exists()) 
	      {
	        throw new RuntimeException("chromedriver.exe does not exist!"); 
	      }
	      try { 
	        System.setProperty("webdriver.chrome.driver", 
	        		driverPath); 
	        return new ChromeDriver(); 
	      } 
	      catch (Exception ex) { 
	        throw new RuntimeException
	              ("couldnt create chrome driver"); 
	      } 
	   } 
	   

	   private WebDriver firefoxDriver(String driverPath) { 
		   if (!new File(driverPath).exists()) 
		      {
		        throw new RuntimeException("geckodriver.exe does not exist!"); 
		      }
		   
	      try { 
	    	  System.setProperty("webdriver.gecko.driver", 
		        		driverPath); 
	         return new FirefoxDriver(); 
	      } 
	      catch (Exception ex) {         
	         throw new RuntimeException
	              ("could not create the firefox driver"); 
	     } 
	   } 
 
	   public String toString() { 
	      return this.browserName; 
	   } 

	   public static WebDriver driver() { 
	      return driver; 
	   }  

	   public void close() { 
	      driver().close();   
	   }  

	   public WebElement findElement(By locator) { 
	      return driver().findElement(locator); 
	   }  

	   public List<WebElement> findElements(By arg0) { 
	      return driver().findElements(arg0); 
	   }  

	   public void get(String arg0) { 
	      driver().get(arg0); 
	   }  

	   public String getCurrentUrl() { 
	      return driver().getCurrentUrl(); 
	   }  

	   public String getPageSource() { 
	      return driver().getPageSource(); 
	   }  

	   public String getTitle() { 
	      return driver().getTitle(); 
	   }  

	   public String getWindowHandle() { 
	      return driver().getWindowHandle(); 
	   }  

	   public Set<String> getWindowHandles() { 
	     return driver().getWindowHandles(); 
	   }  

	   public Options manage() { 
	      return driver().manage(); 
	   }  

	   public Navigation navigate() { 
	      return driver().navigate(); 
	   }  

	   public void quit() { 
	     driver().quit(); 
	   }  

	   public TargetLocator switchTo() { 
	      return driver().switchTo(); 
	   }  

	  /* public  X getScreenshotAs(OutputType target)  
	   throws WebDriverException { 
	      return ((TakesScreenshot) driver())
	                    .getScreenshotAs(target);
	   } 

	}

*/

	public static WebElement findVisibleElement(By locator) {
	   WebElement element = new WebDriverWait(driver(), timeout).until(ExpectedConditions.visibilityOfElementLocated (locator));
	   return element;
	}

	public static WebElement findClickableElement(By locator) {
	   WebElement element = new WebDriverWait(driver(), timeout)
	               .until(ExpectedConditions.elementToBeClickable (locator));
	   return element;
	}

	public static WebElement findHiddenElement(By locator) {
	   WebElement element = new WebDriverWait(driver(), timeout)
	              .until(ExpectedConditions.presenceOfElementLocated (locator));
	   return element;
	}


}
