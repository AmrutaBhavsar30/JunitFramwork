package variables;

import java.util.ArrayList;

public class Test1_2_variables {

	public static final String ExpectedURL = "http://automationpractice.com/";
	public static final String Title="My Store";
	public static final String logowidth="350";
	public static final String logoheight="99";
	
	//public String title=driver.getTitle();
	public static ArrayList<String> Expectedproductcategories()
	{
	ArrayList<String> actualproduct=new ArrayList<>();
	actualproduct.add("WOMEN");
	actualproduct.add("DRESSES");
	actualproduct.add("SHIRTS");
      return actualproduct;
	}
	
	
}
