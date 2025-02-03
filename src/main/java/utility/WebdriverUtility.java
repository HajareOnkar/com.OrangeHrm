package utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	//dropdown
    public void selectDropdownValue(WebElement ele,String value) {
    	Select s=new Select(ele);
    	s.selectByValue(value);
    }
    
    public void checkDropdownIsMultiple(WebElement ele) {
    	Select s=new Select(ele);
    	s.isMultiple();
    }
    
    public void deselectDropdownVlue(WebElement ele,String value) {
    	Select s=new Select(ele);
    	s.deselectByValue(value);
    }
    
    //Actions
    public void hover(WebDriver driver,WebElement ele) {
    	Actions a=new Actions(driver);
    	a.moveToElement(ele).perform();
    }
    public void rightClickOnElement(WebDriver driver,WebElement ele) {
    	Actions a=new Actions(driver);
    	a.contextClick(ele).perform();
    }
    public void doubleClickOnElement(WebDriver driver,WebElement ele) {
    	Actions a=new Actions(driver);
    	a.doubleClick(ele).perform();
    }
    public void dragAndDropElement(WebDriver driver,WebElement src,WebElement trg) {
    	Actions a=new Actions(driver);
    	a.dragAndDrop(src,trg);
    }
    
    //frame
    
    public void navigateToFrame(WebDriver driver,int index) {
    	driver.switchTo().frame(index);
    }
    
    public void navigateBackFromFrame(WebDriver driver,int index) {
    	driver.switchTo().defaultContent();
    }
    
    //scroll
    
    public void scrollPage(WebDriver driver,int x,int y) {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.ScrollBy("+x+","+y+")");
    	
    }
    
    //popups
    public void dismissAlertPopup(WebDriver driver) {
    	Alert al=driver.switchTo().alert();
    	al.dismiss();
    }
    public void acceptAlertPopup(WebDriver driver) {
    	Alert al=driver.switchTo().alert();
    	al.accept();
    }
    
    public void handleNotificationPopup() {
    	ChromeOptions option=new ChromeOptions();
    	option.addArguments("--dismiss-notifications");
    }
}
