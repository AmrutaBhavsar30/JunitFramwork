package utils;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Action {

	WebDriver driver;
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
}
