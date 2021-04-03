package locators;

import org.openqa.selenium.By;

public class Test_17_18_19_locators {

	//test.17
		//Faded Short Sleeve T-shirt 
	    
		public static By HoverButton = By.xpath("//div[@class='product-container']");
		
		public static By ClickAddToCartButton = By.xpath("//div[@class='button-container']/a[@data-id-product='1']/span");
		
		public static By ClickContinueShoppingButtonEle = By.xpath("//div[@class='clearfix']//div//span[@title='Continue shopping']"); 
		
		// Blouse
		
		public static By HoverButtonElement2 = By.xpath("//div[@class='product-container']/div/div/a[@title='Blouse']");
		
		public static By ClickAddToCartButtonOnBlouse = By.xpath("//div[@class='button-container']/a[@data-id-product='2']/span");
		
		
		//Chiffon Printed Dress
		
		public static By HoverButtonOnchiffonDress = By.xpath("//div[@class='product-container']/div/div/a[@title='Printed Chiffon Dress']");
		
		public static By clickAddToCartChiffonDressButton = By.xpath("//div[@class='button-container']/a[@data-id-product='7']");
		

		
		public static By ProductQuntityButton = By.xpath("//div[@class='shopping_cart']//span[@class='ajax_cart_quantity unvisible']");
		
		//test.18
		
		public static By HoveronAddedProButton = By.xpath("//div[@class='shopping_cart']//span[@class='ajax_cart_quantity unvisible']");
		public static By BlousevalidateButton = By.xpath("//div[@class='product-name']/a[@title='Blouse']");
		public static By PrintedChiffonButton = By.xpath("//div[@class='product-name']/a[@title='Printed Chiffon Dress']");
		public static By FadedShirtButton = By.xpath("//div[@class='product-name']/a[@title='Faded Short Sleeve T-shirts']");
		
		
		//test.19
		
		public static By PrintAllProductOfPrice = By.xpath("//span[@class='price']");
		
		public static By TotalPriceOfProductButton = By.xpath("//span[@class='price cart_block_total ajax_block_cart_total']");
		
		public static By ShippingPriceButton = By.xpath("//div[@class='cart-prices']//div/span");
}
