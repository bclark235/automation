package utilities;

public class sgsArray {
	
		public String name;
		public String baseCost;
		public String membersDiscount;
		public String promoDiscount;
		public String finalCost;

	    public sgsArray(String name, String baseCost, String memDiscount, String promoDiscount, String finalCost) {
	        this.name = name;
	        this.baseCost = baseCost;
	        this.membersDiscount = memDiscount;
	        this.promoDiscount = promoDiscount;
	        this.finalCost = finalCost;
	        
	    }
	    
	    //Getters
	    public String getName() {
	    	   return name;
	    	}
	    
	    public String getBase() {
	    	   return baseCost;
	    	}
	    
	    public String getMemDisc() {
	    	   return membersDiscount;
	    	}
	    
	    public String getPromoDisc() {
	    	   return promoDiscount;
	    	}
	    
	    public String getFinal() {
	    	   return finalCost;
	    	}
	    
	    //Setters
	    public void setName(String Name) {
    		this.name  = Name;
    	}
	  
	   
}


