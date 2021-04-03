package variables;

import java.util.ArrayList;

public class Test9_10_variables {
	public static final String product = "Dress";
	public static final String expectedDressCountResult="5";
	public static final String DRESSESinUppercase="DRESSES";
	//public static final float SumOfAlldressamount=152.87;
	
	
	public static ArrayList<String> ExpectedDresscategories()
	{
	ArrayList<String> actualDress=new ArrayList<>();
	actualDress.add("Summer Dresses > Printed Summer ");
	actualDress.add("Evening Dresses > Printed ");
	actualDress.add("Summer Dresses > Printed Summer ");
	actualDress.add("Summer Dresses > Printed Chiffon  ");
	actualDress.add("Casual Dresses > Printed ");
	actualDress.add("T-shirts > Faded Short Sleeve T-shirts");
	actualDress.add("Blouses > Blouse");
      return actualDress;
	}
	
	
}
