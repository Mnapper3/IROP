/*Matt Napper
 * SDev 200 00c
 * session 8 program assignment 1 rework
 * 7/18/16
 */
public class Pizza extends MenuItem {
	
	public Pizza(){
	}

	// Declare enums
    public enum Size{
       PERSONAL,
       MEDIUM,
       LARGE,
       FAMILY
    }

    public enum Crust{
       CHEESY,
       HAND_TOSSED,
       THIN_AND_CRISPY,
       DEEP_PAN
    }


     // declare variables
     private String pizzaSize;
     private String crustType;
	 private double price;
	 

    public Pizza(String pizzaSize, String crustType) {
       this.pizzaSize = pizzaSize;
       this.crustType = crustType;
       
    }

    
     public String getPizzaSize() {
       return pizzaSize;
    }
     
 
     public String getCrustType() {
       return crustType;
    }
   	
   
 
	@Override
	public String getDescription() {
		// abstract from MenuItem
		return "A warm and delious athentic " + getPizzaSize() + " Pizza with " + getPizzaSize() + " crust for $";
	}
	
	@Override
	public String toString() {
		// abstract from MenuItem
		return getDescription() + getPrice();
	}


	@Override
	public double getPrice() {
		
		switch(this.pizzaSize){
   	 case "PERSONAL":
   		 price = 5.99;
   		 break;
   	 case "MEDIUM":
   		 price = 6.99;
   		 break;	 
   	 case "LARGE":
   		 price = 12.99;
   		 break;	
   	 case "FAMILY":
   		 price = 14.99;
   		 break;	 
   		 
		default:
			break;
   	 }
		return price;
	}

}
