package tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import generics.AutoConstant;
import generics.BaseTest;
import pages.YahooRegistrationPagePOM;

public class TestYahooRegistration extends BaseTest implements AutoConstant{

	@Test
	public void yahooRegister() throws IOException, AWTException
	{
		YahooRegistrationPagePOM yrp= new YahooRegistrationPagePOM(driver);
		yrp.submitForm();
	}
}
