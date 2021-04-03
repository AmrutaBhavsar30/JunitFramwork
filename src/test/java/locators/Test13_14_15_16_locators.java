package locators;

import org.openqa.selenium.By;

public class Test13_14_15_16_locators {
	public static By Facebook =By.xpath("//ul//li[@class='facebook']");
	public static By Facebook_page =By.xpath("//div//span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 embtmqzv fe6kdd0r mau55g9w c8b282yb hrzyx87i m6dqt4wy h7mekvxk hnhda86s oo9gr5id hzawbc8m']");
	public static By Twitter=By.xpath("//ul//li[@class='twitter']");
	public static By Twitter_page =By.xpath("//div[@dir='auto' and @class='css-901oao r-18jsvk2 r-1qd0xha r-adyw6z r-1vr29t4 r-135wba7 r-bcqeeo r-1udh08x r-qvutc0']//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']//span");
	public static By youtube =By.xpath("//ul//li[@class='youtube']");
	public static By Youtue_page =By.xpath("//yt-formatted-string[@id='text' and text()='Selenium Framework']");
	public static By Newsletter =By.xpath("//input[@id='newsletter-input']");
	public static By Newsletter_page =By.xpath("//yt-formatted-string[@id='text' and text()='Selenium Framework']");
	public static By Newsletter_msg =By.xpath("//p[@class='alert alert-success']");
	public static By Newsletter_msg_button =By.xpath("//button[@name='submitNewsletter']");
}
