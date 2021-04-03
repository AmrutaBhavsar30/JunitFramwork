package utils;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Action {
	private static final String AttributeName = null;
	static WebDriver driver;
	WebDriverWait wait;
	Actions action;
	Properties prop;
	Util utils;
	public Action(WebDriver driver) {
		this.driver = driver;
		utils = new Util();
		prop = utils.init_prop();
		wait = new WebDriverWait(this.driver, Integer.parseInt(prop.getProperty("WebDriverWaitTimeout")));
		action = new Actions(this.driver);

	}
	public static WebElement getElement(By locator) {
		WebElement element = null;
		element = driver.findElement(locator);
		return element;
	}
	public static List<WebElement> getElementList(By locator) 
	{
		List<WebElement> element = null;
		element = driver.findElements(locator);
		return element;
	}

	public static boolean IsDisplayed(By locator) {
		boolean flag = false;
		flag = getElement(locator).isDisplayed();
		return flag;
	}
	public static String getAttributeValue(By locator,String AttributeName,WebDriver driver)
	{		
		WebElement attributeValue = driver.findElement(locator);
		return attributeValue.getAttribute(AttributeName);
	}

	public void click(By locator)
	{
		getElement(locator).click();

	}
	public String GetPageTitle() 
	{ 
		return driver.getTitle();
	}
	public void sedkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);	
	}

	public void selectbyvaluefromdropDown(By locator,String value)
	{
		Select selectEle=new Select(getElement(locator));
		selectEle.selectByValue(value);
	}
	
	
	public void selectByVisibleText(By locator, String Value)
	{
		Select selectTxt=new Select(getElement(locator));
		selectTxt.selectByVisibleText(Value);
		
	}
	
	public String getTxt(By locator)
	{
		String txt=null;
		txt=getElement(locator).getText();
		return txt;
		}
	
	public void waitforelementpresent(By locator)
	{
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public void waitForElementVisible(By locator) {
		WebElement ele = getElement(locator);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	public String getAttributeValue(By locator, String AttributeName)
	{
		WebElement attributeValue = driver.findElement(locator);
		return attributeValue.getAttribute(AttributeName);
	}
	public void MoveToElement(By locator)
	{
		action.moveToElement(getElement(locator)).build().perform();
	}
	
	

}
