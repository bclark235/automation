package utilities;

//Class to create the chest inventory array that is used in the regex methods
public class ChestInventory {
    public String item;
    public String quantity;

    public ChestInventory(String item, String quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    
    //Getters
    public String getItem() {
    	   return item;
    	}
    
    public String getQuantity() {
    	   return quantity;
    	}
    
}


