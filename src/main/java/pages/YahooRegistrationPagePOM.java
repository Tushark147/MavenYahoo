package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.ExcelLibrary;

public class YahooRegistrationPagePOM extends ExcelLibrary{

		
	@FindBy(xpath="//input[@autocomplete='given-name']")
	public WebElement firstnameTextField;
	
	@FindBy(xpath="//input[@autocomplete=\"family-name\"]")
	public WebElement lastnameTextField;
	
	@FindBy(xpath="//input[@name=\"yid\"]")
	public WebElement emailTextField;
	
	@FindBy(xpath="//input[@aria-label=\"Password\"]")
	public WebElement passwordTextField;
	
	@FindBy(xpath="//input[@type=\"tel\"]")
	public WebElement mobileTextField;
	
	@FindBy(id="usernamereg-month")
	public WebElement birthMonthTextField;
	
	@FindBy(xpath="//input[@aria-label=\"Birthday\"]")
	public WebElement birthDateTextField;
	
	@FindBy(xpath="//input[@name=\"yyyy\"]")
	public WebElement birthYearTextField;
	
	@FindBy(xpath="//input[@name=\"freeformGender\"]")
	public WebElement genderTextField;
	
	@FindBy(id="reg-submit-button")
	public WebElement continueButton;
	
	
	//initialization
		public YahooRegistrationPagePOM(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	public void submitForm() throws IOException, AWTException
	{
		
		firstnameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
		lastnameTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 2, 1));
		emailTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 3, 1));
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		passwordTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 4, 1));
		mobileTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 5, 1));
		//birthMonthTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 6, 1));
		birthDateTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 7, 1));
		birthYearTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 8, 1));
		genderTextField.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 9, 1));
		continueButton.click();
		
	}
}
