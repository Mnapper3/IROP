/* Course/Sec: SDEV200/00C - Java Programming
   Instructor: Kris Roberts 
   Session   : 12
   Assignment: Group Programming Assignment - Italian Restaurant Ordering Program
   Student   : Mike Dumm
   Date      : 7/17/2016
  
  Purpose   : "Wings" is an method for the Italian Restaurant Ordering
              Program.  This method will extend a price given Style, Sauce and quantity.
              There is a default method that will return a single wing that has style of Traditional
              and a sauce of Naked priced at 0.60.
              
              
  Modification log: 
  07/17/16 - Class initial coding.
  07/21/16 - Change enum for Sauce.  Made them all capital letters.
             Moved price calculation to GetPrice from Wings(type, sauce, qty)
             changed to String to retrieve price via GetPrice method
*/              
public class Wings extends Appetizer {
private Integer wingsQty = 1;
private double wingsPrice = 0.60;
private String wingsDescription = "Wings";
private String wingsStyle = "TRADITIONAL";	
private String wingsSause = "NAKED";



public static enum Type {TRADITIONAL, BONELESS};
private enum Sauce {NAKED, MILD, HOT, GARLIC, BBQ};


	public Wings(String type, String sauce, int qty ) {
		
		this.wingsStyle = type.toUpperCase();
		this.wingsSause = sauce.toUpperCase();
		this.wingsQty = qty;
		
	}
	

	public Wings() {
		// TODO Auto-generated constructor stub
	}
	 
	 public void extendPrice (Type wingsStyle) {
			switch (wingsStyle) {
			case TRADITIONAL: wingsPrice = .060;	
			case BONELESS: wingsPrice = 0.70;
			}
			return;
	 }

	/** toString describing menu item */
	  @Override
	  public String toString() {
	    return "Order: " + wingsDescription + " - Style is " + wingsStyle 
	    		+ "; Sause is " + wingsSause + "; Quantity Ordered: " + 
	    		wingsQty + "; Order Price is : " + getPrice();
	  } 

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return wingsStyle;
	}

	@Override
	public Integer getQty() {
		return wingsQty;
	}

	@Override
	public String getDescription() {
		return wingsDescription;
	}

	@Override
	public double getPrice() {
		Type allTypes[] = Type.values();
  		for (int i = 1; i < allTypes.length; i ++) {
  		  if (Type.TRADITIONAL.name() == wingsStyle) 	wingsPrice = .060;
  		  if (Type.BONELESS.name() == wingsStyle) 	wingsPrice = .070;
  		}
  		wingsPrice = Math.rint(wingsQty * wingsPrice * 100) / 100.0 ; 
		return wingsPrice;
	}

	public String getSause() {
		return wingsSause;
	}
}
