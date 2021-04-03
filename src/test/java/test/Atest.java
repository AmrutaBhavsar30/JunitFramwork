package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.Test_17_18_19_locators;
import variables.Test_17_18_19_variables;
import locators.Test13_14_15_16_locators;
import variables.Newsletter;
import locators.Test_12_locators;
import locators.Test_17_18_19_locators;
import locators.Test9_10_locators;
import locators.Test_11_locators;
import locators.Test_12_locators;
import locators.AfterRegPage;
import locators.RegUserPage_locator;
import locators.SignInpageLocators;
import locators.Test13_14_15_16_locators;
import locators.Test1_2_3_locators;
import locators.Test9_10_locators;
import utils.Action;
import utils.Util;
import variables.Newsletter;
import variables.RegUserPage_variables;
import variables.SignInPagevariables;
import variables.Test1_2_variables;
import variables.Test9_10_variables;
import variables.Test_11_variables;
import variables.Test_17_18_19_variables;

public class Atest {
	WebDriver driver;
	WebDriverWait wait;
	Properties prop;
	Util utils;
	Action elementActions;
	JavascriptExecutor js;

	@Before
	public void setUp() throws InterruptedException
	{
		utils = new Util();
		prop = utils.init_prop();
		driver = utils.init_driver(prop);
		elementActions = new Action(driver);
		wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("WebDriverWaitTimeout")));
		js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
	}
	// 1.url checking
	@Ignore
	@Test
	public void testURL()
	{
		Assert.assertEquals("URL redirection is fail",Test1_2_variables.ExpectedURL, driver.getCurrentUrl());
		//Assert.assertArrayEquals("url are not matching", driver.getCurrentUrl(), ExpectedURL);
		System.out.println("URL redirection is success");

	}

	// 2. landing page title test
	@Ignore
	@Test
	public void landingpageTest()
	{
		String title=driver.getTitle();
		Assert.assertEquals("title is not matching", Test1_2_variables.Title, driver.getTitle());
		System.out.println("titles are matching");
		System.out.println("current page title is : "+title);

	}

	@Ignore
	// 3.catogories are displed or not
	public void productCategoryTest() throws InterruptedException
	{Thread.sleep(2000);
	ArrayList<String> expectedCategoryList = Test1_2_variables.Expectedproductcategories();
	List<WebElement> ActualproductList=elementActions.getElementList(Test1_2_3_locators.productsearch);
	for(int i=0;i<expectedCategoryList.size();i++)
	{

		Assert.assertEquals("product list is wrong", Test1_2_variables.Expectedproductcategories().get(i),ActualproductList.get(i).getText());
		System.out.println("product are in sequence");

	}
	System.out.println("all categories displyed successfully");
	}

	// 4. to check logo display or not
	@Ignore
	@Test
	public void logoDisplayTest()
	{
		WebElement logoDisplay=driver.findElement(By.xpath("//img[@class='logo img-responsive']"));
		System.out.println(logoDisplay.isDisplayed());
		Assert.assertEquals("Logo is not displayed", true, elementActions.IsDisplayed(Test1_2_3_locators.logoDisplay));
		System.out.println("logo is displayed");
	}

	// 5. check logo height
	@Ignore
	@Test
	public void logoHeight() throws InterruptedException
	{
		Thread.sleep(2000);


		Assert.assertEquals("height is not matching", "99", elementActions.getAttributeValue(Test1_2_3_locators.LogoHeight, "height", driver));
		System.out.println("height is 99");
	}
	// 6. check Logo Width
	@Ignore
	@Test
	public void logoWidth() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertEquals("width is not matching", "350", elementActions.getAttributeValue(Test1_2_3_locators.LogoWidth, "width", driver));
		System.out.println("width is 350");
	}

	// 7. SignIn page title validation test
	@Ignore
	@Test
	public void sighInPageTitleTest()
	{
		elementActions.click(SignInpageLocators.SignIn);
		Assert.assertEquals("signin page title is not matching",SignInPagevariables.SignInTitle, elementActions.GetPageTitle());
		System.out.println("sign in page title validated successfully");
	}

	//8 register user
	@Ignore
	@Test
	public void registerUser() throws InterruptedException
	{Thread.sleep(1000);
	sighInPageTitleTest();
	Thread.sleep(1000);
	elementActions.sedkeys(SignInpageLocators.emailIDButton, SignInPagevariables.email);
	Thread.sleep(1000);
	elementActions.click(SignInpageLocators.createAnAccount);
	Assert.assertEquals("CREATE AN ACCOUNT---text is not found", RegUserPage_variables.CreatAnAccountText, elementActions.getTxt(RegUserPage_locator.RegPageCreateAnAccount));
	System.out.println("CREATE AN ACCOUNT --title is found");
	Thread.sleep(1000);
	elementActions.click(RegUserPage_locator.FemaleGenderRadioButton);
	elementActions.sedkeys(RegUserPage_locator.userFirstNameTextbox, RegUserPage_variables.FirstName);
	Thread.sleep(1000);
	elementActions.sedkeys(RegUserPage_locator.userLastNameTextbox, RegUserPage_variables.LastName);
	elementActions.sedkeys(RegUserPage_locator.userPasswordTextbox, RegUserPage_variables.Password);
	elementActions.selectbyvaluefromdropDown(RegUserPage_locator.userDOBDayDropDown, RegUserPage_variables.DOBDay);
	elementActions.selectbyvaluefromdropDown(RegUserPage_locator.userDOBMonthDropDown, RegUserPage_variables.DOBMonth);
	elementActions.selectbyvaluefromdropDown(RegUserPage_locator.userDOBYearDropDown,RegUserPage_variables.DOBYear);
	elementActions.click(RegUserPage_locator.signUpForNewsLetterCheckBox);
	elementActions.click(RegUserPage_locator.specialOfferEmailRecCheckBox);
	elementActions.sedkeys(RegUserPage_locator.AddressComanyNameTextBox, RegUserPage_variables.ComanyName);

	elementActions.sedkeys(RegUserPage_locator.AddressLine1TextBox, RegUserPage_variables.AddressLine1Name);

	elementActions.sedkeys(RegUserPage_locator.AddressLine2TextBox, RegUserPage_variables.AddressLine2Name);

	elementActions.sedkeys(RegUserPage_locator.AddressCityTextBox, RegUserPage_variables.AddressCity);
	elementActions.selectByVisibleText(RegUserPage_locator.AddressStateDropDown, RegUserPage_variables.AddressState);

	elementActions.sedkeys(RegUserPage_locator.AddressZipCodeTextBox, RegUserPage_variables.AddressZipCode);

	elementActions.sedkeys(RegUserPage_locator.AddressAdditionalInfoTextBox, RegUserPage_variables.AddressAdditionalInfo);

	elementActions.sedkeys(RegUserPage_locator.AddressMobilePhoneTextBox, RegUserPage_variables.AddressMobilePhone);

	elementActions.click(RegUserPage_locator.registerFormButton);
	elementActions.waitForElementVisible(AfterRegPage.registeredUserNameDisplay);
	Assert.assertEquals("Registered User First Name And Last Name is not displayed correctly after registration", RegUserPage_variables.FirstName + " " + RegUserPage_variables.LastName,
			elementActions.getTxt(AfterRegPage.registeredUserNameDisplay));

	System.out.println("User Registered Successfully as -> " + RegUserPage_variables.FirstName + " " + RegUserPage_variables.LastName);

	System.out.println(" Register User With New Email Id test is successfully done");
	}

	//9.search product-dress
	@Ignore
	@Test
	public void searchProduct()
	{
		elementActions.click(Test9_10_locators.serachProductBox);
		elementActions.sedkeys(Test9_10_locators.serachProductBox, Test9_10_variables.product);

		ArrayList<String> expectedCategoryList = Test9_10_variables.ExpectedDresscategories();
		List<WebElement> ActualDressproductList=elementActions.getElementList(Test9_10_locators.dressSearch7);
		System.out.println("Total no of dress after search are : " + ActualDressproductList.size());
		for(int i=0;i<expectedCategoryList.size();i++)
		{

			System.out.println((i+1) + ". " + ActualDressproductList.get(i).getText());

		}
		System.out.println("search result which contains 'Dress' word in it");
		for(int i=0;i<expectedCategoryList.size();i++)
			if ((ActualDressproductList.get(i).getText().contains("Dress")))
			{
				System.out.println(((i+1) + ". " +ActualDressproductList.get(i).getText()));
			}
	}
	//10.fetch all product price and get its total
	@Ignore
	@Test
	public void fetchProductPrice()
	{
		String TextToBeClicked = "Dress";
		//search DRESSESS displayed is in upercase
		Assert.assertEquals("the DRESSES is not in uppercase", Test9_10_variables.DRESSESinUppercase, elementActions.getTxt(Test9_10_locators.DRESSESproductsearch));
		System.out.println("DRESSES is in uppercase");
		elementActions.click(Test9_10_locators.DRESSESproductsearch);
		List <WebElement> Price = elementActions.getElementList(Test9_10_locators.pricebutton);
		float addition = 0;
		for(int i=0; i<Price.size(); i++)
		{
			System.out.println("individual product price is: " + Price.get(i).getText());
			addition = addition + Float.parseFloat(Price.get(i).getText().substring(1));
		}

		System.out.println("Total price of  " +TextToBeClicked+" is : +-> $" +addition);


		Assert.assertEquals("The total price are wrong",152.87);
		System.out.println("The total price are right");


	}


	//11.send a friend feature
	@Ignore
	@Test
	public void sendFrndFeature()
	{

		driver.get(Test1_2_variables.ExpectedURL);

		elementActions.click(Test_11_locators.SignInbutton);
		elementActions.sedkeys(Test_11_locators.emailAdress,SignInPagevariables.email);
		elementActions.sedkeys(Test_11_locators.password, RegUserPage_variables.Password);
		elementActions.waitforelementpresent(Test_11_locators.selectTshirt);
		elementActions.click(Test_11_locators.selectTshirt);
		elementActions.waitforelementpresent(Test_11_locators.Hover_ButtonElement);
		elementActions.click(Test_11_locators.Hover_ButtonElement);
		elementActions.waitforelementpresent(Test_11_locators.product);
		elementActions.click(Test_11_locators.product);
		elementActions.waitforelementpresent(Test_11_locators.moreBtn);
		elementActions.click(Test_11_locators.moreBtn);
		elementActions.waitforelementpresent(Test_11_locators.sendToFriend);
		elementActions.click(Test_11_locators.sendToFriend);
		elementActions.waitforelementpresent(Test_11_locators.input1);
		elementActions.sedkeys(Test_11_locators.input1,Test_11_variables.input1);
		elementActions.sedkeys(Test_11_locators.input2,Test_11_variables.input2);
		elementActions.click(Test_11_locators.sendBtn);
		elementActions.waitforelementpresent(Test_11_locators.msg);
		Assert.assertEquals("msg test not passed",Test_11_variables.msg,elementActions.getTxt(Test_11_locators.msg));
		System.out.println("Msg validaiton test Passed i.e:"+Test_11_variables.msg);
		elementActions.click(Test_11_locators.okBtn);

	}

	@Ignore
	@Test
	public void change_image_color()
	{
		elementActions.click(Test_12_locators.TshirtButtonElement);

		elementActions.click(Test_12_locators.MoveButtonElement);
		WebDriverWait webDriverWait = new WebDriverWait(driver,20);
		String redShirt = elementActions.getAttributeValue(Test_12_locators.RedTshirtImg, "src");
		System.out.println(redShirt);

		elementActions.click(Test_12_locators.Image_change);
		WebDriverWait webDriverWait1 = new WebDriverWait(driver,20);
		String blueShirt = elementActions.getAttributeValue(Test_12_locators.Image_change_check, "src");
		System.out.println(blueShirt);

		WebDriverWait webDriverWait2 = new WebDriverWait(driver,20);
		if (redShirt.equals(blueShirt)) 
		{
			System.out.println("Images are not changed");

		} 
		else
		{
			System.out.println("Images are Changed");
		}

	}
	public void windowHandle()
	{
		Set<String> Handle = driver.getWindowHandles();
		Iterator<String> it = Handle.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		WebDriverWait webDriverWait5 = new WebDriverWait(driver,20);
	}
	//test 13.validate facebook social media handle
	@Ignore
	@Test
	public void validate_Facebook()
	{

		elementActions.waitforelementpresent(Test13_14_15_16_locators.Facebook);
		WebDriverWait webDriverWait3 = new WebDriverWait(driver,20);
		elementActions.click(Test13_14_15_16_locators.Facebook);
		windowHandle();

		Assert.assertEquals("Fb Page name not validated as ","Selenium Framework",elementActions.getTxt(Test13_14_15_16_locators.Facebook_page));
		System.out.println("FB page name validated successfully as :Selenium Framework");

		driver.close();	

	}
	//test 14.validate Twitter social media handle
	@Ignore
		@Test
		public void Twitter()
		{

			elementActions.waitforelementpresent(Test13_14_15_16_locators.Twitter);
			WebDriverWait webDriverWait3 = new WebDriverWait(driver,20);
			elementActions.click(Test13_14_15_16_locators.Twitter);
			windowHandle();

			Assert.assertEquals("Twitter Page name not validated","Selenium Framework",elementActions.getTxt(Test13_14_15_16_locators.Twitter_page));
			System.out.println("Twitter page name validated successfully as:Selenium Framework");

			driver.close();	

		}
	//test 15.validate Twitter social media handle
		@Ignore
			@Test
			public void youTube()
			{

				elementActions.waitforelementpresent(Test13_14_15_16_locators.youtube);
				WebDriverWait webDriverWait3 = new WebDriverWait(driver,20);
				elementActions.click(Test13_14_15_16_locators.youtube);
				windowHandle();

				Assert.assertEquals("youtube Page name not validated","Selenium Framework",elementActions.getTxt(Test13_14_15_16_locators.Youtue_page));
				System.out.println("youtube page name validated  successfully as:Selenium Framework");

				driver.close();	

			}
		//test 16.validate Twitter social media handle
		@Ignore
			@Test
			public void newsLetter()
			{

			elementActions.waitforelementpresent(Test13_14_15_16_locators.Newsletter);
			elementActions.sedkeys(Test13_14_15_16_locators.Newsletter,Newsletter.randomEmailid);
			elementActions.waitforelementpresent(Test13_14_15_16_locators.Newsletter_msg_button);
			elementActions.click(Test13_14_15_16_locators.Newsletter_msg_button);
			elementActions.waitforelementpresent(Test13_14_15_16_locators.Newsletter_msg);
			Assert.assertEquals("Newsletter Massage not validated","Newsletter : You have successfully subscribed to this newsletter.",elementActions.getTxt(Test13_14_15_16_locators.Newsletter_msg));
			System.out.println("Newsletter Massage validated successfully");

			}
	
		//test 17.validate cart value is updating
		@Ignore
		@Test
		public void cartValueUpdating()
		{
			elementActions.MoveToElement(Test_17_18_19_locators.HoverButton);
			WebDriverWait webDriverWait5 = new WebDriverWait(driver,20);
			
			elementActions.click(Test_17_18_19_locators.ClickAddToCartButton);
			WebDriverWait webDriverWait6 = new WebDriverWait(driver,20);
			
			elementActions.click(Test_17_18_19_locators.ClickContinueShoppingButtonEle);
			WebDriverWait webDriverWait7 = new WebDriverWait(driver,20);
			
			elementActions.MoveToElement(Test_17_18_19_locators.HoverButtonElement2);
						
			elementActions.click(Test_17_18_19_locators.ClickAddToCartButtonOnBlouse);
			WebDriverWait webDriverWait8 = new WebDriverWait(driver,20);
			elementActions.click(Test_17_18_19_locators.ClickContinueShoppingButtonEle);
			WebDriverWait webDriverWait9 = new WebDriverWait(driver,20);
			
			elementActions.MoveToElement(Test_17_18_19_locators.HoverButtonOnchiffonDress);
						
			elementActions.click(Test_17_18_19_locators.clickAddToCartChiffonDressButton);
			WebDriverWait webDriverWait10 = new WebDriverWait(driver,20);
			
			elementActions.click(Test_17_18_19_locators.ClickContinueShoppingButtonEle);
			WebDriverWait webDriverWait11 = new WebDriverWait(driver,20);
			
			Assert.assertEquals("The Product Quantity does Not Match",Test_17_18_19_variables.CartTotalProductQuantity,elementActions.getTxt(Test_17_18_19_locators.ProductQuntityButton));
					System.out.println("The Total Product Quantity is :- 3");
			
		}
		//test 18.validate same product added in cart
		@Ignore
		@Test
		public void validatefor_SameProduct()
		{
			cartValueUpdating();
			elementActions.MoveToElement(Test_17_18_19_locators.HoveronAddedProButton);
			WebDriverWait webDriverWait12 = new WebDriverWait(driver,20);
			
			Assert.assertEquals("The product are not added",Test_17_18_19_variables.FadedShirtButton,elementActions.getAttributeValue(Test_17_18_19_locators.FadedShirtButton,"title"));
			System.out.println("The product of Faded Shirt are added");
			WebDriverWait webDriverWait13 = new WebDriverWait(driver,20);
			Assert.assertEquals("The product are not added",Test_17_18_19_variables.PrintedChiffonButtont,elementActions.getAttributeValue(Test_17_18_19_locators.PrintedChiffonButton,"title"));
			System.out.println("The product Chiffon Dress are added");
			
			Assert.assertEquals("The product are not added",Test_17_18_19_variables.BlouseButton,elementActions.getAttributeValue(Test_17_18_19_locators.BlousevalidateButton,"title"));
			System.out.println("The product Blouses are added");
			
		}
		
		// test 19.validate total is correct in cart
		
		//@Ignore
		@Test
		public void validate_total()
		{
			cartValueUpdating();
			WebDriverWait webDriverWait12 = new WebDriverWait(driver,20);
			float total = 0;
			elementActions.MoveToElement(Test_17_18_19_locators.HoveronAddedProButton);
			WebDriverWait webDriverWait14 = new WebDriverWait(driver,20);
			List <WebElement> TotalOfProduct = elementActions.getElementList(Test_17_18_19_locators.PrintAllProductOfPrice);
			
			for(int i = 0; i<TotalOfProduct.size();i++)
			{
				System.out.println((i+1)+TotalOfProduct.get(i).getText());
				
				total = total + Float.parseFloat(TotalOfProduct.get(i).getText().substring(1));
			}
			WebDriverWait webDriverWait15 = new WebDriverWait(driver,20);
			total =  total +  Float.parseFloat(elementActions.getTxt(Test_17_18_19_locators.ShippingPriceButton).substring(1));
			System.out.println(total);
			WebDriverWait webDriverWait16 = new WebDriverWait(driver,20);
			Assert.assertEquals("The Total Of Product is not match",Test_17_18_19_variables.TotalPriceofButton,elementActions.getTxt(Test_17_18_19_locators.TotalPriceOfProductButton));
			System.out.println("The Price is Matching Including of shipping Charges");
			
		}
		
	@Test
	public void teardown()
	{
		driver.quit();
	}


}
