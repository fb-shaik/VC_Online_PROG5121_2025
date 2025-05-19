
package recap_app_coffee_app;


public class DrinkOrder {
    //fields:  descibe the drink order
    private String drink;
    private int quantity; 
    private double pricePerUnit; 
    
    //constants for the drink prices
    public static final double COFFEE_PRICE = 30.00;
    public static final double TEA_PRICE = 25.00;
    public static final double LATTE_PRICE = 40.00; 
            
    
    public DrinkOrder(String drink, int quantity)
    {
       this.drink = drink.toLowerCase();
       this.quantity = quantity;
       this.pricePerUnit = assignPrice(this.drink); //call the price of the drink choice to the order object
       
    }
    
    //assign the price using the constants 
    private double assignPrice(String drink)
    {
        switch (drink)
        {
            case "coffee":
                return COFFEE_PRICE;
            case "tea":
                return TEA_PRICE;
            case "latte":
                return LATTE_PRICE;
            default:
                return 0.0;
        }
    }

    
    public double calculateTotal()
    {
        return pricePerUnit * quantity; 
    }
    
    
    public static boolean isValidDrink(String drink)
    {
        return drink != null && (drink.equalsIgnoreCase("coffee") || drink.equalsIgnoreCase("tea") || drink.equalsIgnoreCase("latte"));
    } 
    
    
    public static boolean isValidQuantity(int qty)
    {
        return qty > 0;
    }
    
    
    
    public String getDrink() {
        return drink;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
    
    
    
   
}
