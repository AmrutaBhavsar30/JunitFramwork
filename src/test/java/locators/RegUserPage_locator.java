package locators;

import org.openqa.selenium.By;

public class RegUserPage_locator {
	public static By RegPageCreateAnAccount=By.xpath("//div[@id='noSlide']//h1[contains(text(),'Create an account')]");
	public static By FemaleGenderRadioButton = By.id("id_gender2");
	public static By userFirstNameTextbox = By.id("customer_firstname");
	public static By userLastNameTextbox = By.id("customer_lastname");
	public static By userPasswordTextbox = By.id("passwd");
	public static By userDOBDayDropDown = By.id("days");
	public static By userDOBMonthDropDown = By.id("months");
	public static By userDOBYearDropDown = By.id("years");
	public static By signUpForNewsLetterCheckBox = By.id("newsletter");
	public static By specialOfferEmailRecCheckBox = By.id("optin");
	public static By AddressFirstNameTextBox = By.id("firstname");
	public static By AddressLastNameTextBox = By.id("lastname");
	public static By AddressComanyNameTextBox = By.id("company");
	public static By AddressLine1TextBox = By.id("address1");
	public static By AddressLine2TextBox = By.id("address2");
	public static By AddressCityTextBox = By.id("city");
	public static By AddressStateDropDown = By.id("id_state");
	public static By AddressZipCodeTextBox = By.id("postcode");
	public static By AddressCountryDropDown = By.id("id_country");
	public static By AddressAdditionalInfoTextBox = By.id("other");
	public static By AddressHomePhoneTextBox = By.id("phone");
	public static By AddressMobilePhoneTextBox = By.id("phone_mobile");
	public static By AdddressAliasAddressTextBox = By.id("alias");
	public static By registerFormButton = By.id("submitAccount");

}
