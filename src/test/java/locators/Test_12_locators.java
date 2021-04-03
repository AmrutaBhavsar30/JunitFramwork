package locators;

import org.openqa.selenium.By;

public class Test_12_locators {
	public static By TshirtButtonElement = By.xpath("//div[@id='block_top_menu']/ul/li/a[contains(text(),'T-shirts')]");

	public static By MoveButtonElement = By.xpath("//div[@class='product-container']");
	
	public static By Image_change = By.id("color_2");
	
	public static By Image_change_check = By.id("bigpic");
	
	public static By RedTshirtImg = By.xpath("//div[@class='product-image-container']/a/img[@class='replace-2x img-responsive']");
	
}
