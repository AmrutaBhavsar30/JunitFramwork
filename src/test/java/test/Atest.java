package test;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Action;
import utils.Util;
import variables.Test1_2_variables;

public class Atest {
	WebDriver driver;
	WebDriverWait wait;
	Properties prop;
	Util utils;
	Action elementActions;
	JavascriptExecutor js;
	
	@Before
	public void setUp()
	{
		utils = new Util();
		prop = utils.init_prop();
		driver = utils.init_driver(prop);
		elementActions = new Action(driver);
		wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("WebDriverWaitTimeout")));
		js = (JavascriptExecutor) driver;
		
	}
	@Test
	public void testURL()
	{
		Assert.assertEquals("URL redirection is fail",Test1_2_variables.ExpectedURL, driver.getCurrentUrl());
		//Assert.assertArrayEquals("url are not matching", driver.getCurrentUrl(), ExpectedURL);
		System.out.println("URL redirection is success");
			
	}
	
	@Test
	public void landingpageTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals("title is not matching", Test1_2_variables.Title, driver.getTitle());
		System.out.println("titles are matching");
		System.out.println("current page title is : "+title);
		
	}
	
}
