package utilities;

public class InventoryResults {
	

	    public String item;
	    public int quantity;

	    public InventoryResults(String item, int quantity) {
	        this.item = item;
	        this.quantity = quantity;
	    }
	    
	    //Getters
	    public String getItem() {
	    	   return item;
	    	}
	    
	    public int getQuantity() {
	    	   return quantity;
	    	}
	    
	    //Setters
	    public void setItem() {
	    	}
	    
	    public void setQuantity(int quan) {
	    		this.quantity  = quan;
	    	}
	}


