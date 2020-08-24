package generics;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public void selectbyvisibletext(WebElement element, String text)
	{
		Select sel= new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectbyvalue(WebElement element, String value)
	{
		Select sel= new Select(element);
		sel.selectByValue(value);
	}
	public void selectbyindex(WebElement element, int index)
	{
		Select sel= new Select(element);
		sel.selectByIndex(index);
	}
	
	public void movetoelement(WebDriver driver, WebElement element)
	{
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void robotvirtualkeyboard(WebDriver driver) throws AWTException
	{
		Robot r= new Robot();
		{
			r.keyPress(1);
			r.keyPress(2);
		}
	}
	
}
	
