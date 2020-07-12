package skills;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import utilities.ChestBalancingRegex;

public class Crafting {
	
	public static void yakCraftingTotal(Robot robot, String yakTaskQuantity) throws IOException, 
	AWTException, InterruptedException{

		String taskName = "Yak Task = Crafting";
        StringSelection stringSelection = new StringSelection(taskName);
		
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String taskProgress = yakTaskQuantity;
        stringSelection = new StringSelection(taskProgress);
		
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
         
	}

	public static void leatherGloves(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_gloves";
		boolean itemresult = false;

        String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
               
        String mat1 = "give leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
        
                
	}
	
	public static void leatherCowl(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_cowl";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(850, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void leatherBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_boots";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);   
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void leatherChaps(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_chaps";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);  
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void leatherBody(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_armour";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);  
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void leatherVambraces(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_vambraces";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(900, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE); 
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void leatherShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_shield_regular";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(850, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
        
	}
	
	public static void hardLeatherCowl(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xhardleather_cowl";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give hard_leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 550);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void hardLeatherGloves(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_hardgloves";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give hard_leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
       
        Thread.sleep(1000);
        robot.mouseMove(900, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void hardLeatherBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xhard_leather_boots";
		boolean itemresult = false;
				
        String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give hard_leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 550);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
        
	}
	
	public static void hardLeatherBody(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xhardleather_body";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give hard_leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(850, 550);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
        
	}
	
	public static void hardLeatherChaps(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xhardleather_chaps";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give hard_leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(900, 550);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void hardLeatherShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_shield_hard";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give hard_leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
       
        Thread.sleep(1000);
        robot.mouseMove(750, 600);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void studdedLeatherCoif(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xcoif";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather_cowl";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give studs";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1785, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
        
        
                
	}
	
	public static void studdedLeatherBody(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xstudded_body";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather_armour";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give studs";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1785, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void studdedLeatherGloves(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_studded_gloves";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather_gloves";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give studs";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1785, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                               
	}
	
	public static void studdedLeatherBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xstudded_leather_boots";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather_boots";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give studs";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1785, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void studdedLeatherChaps(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xstudded_chaps";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather_chaps";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give studs";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1785, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void studdedLeatherShields(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xleather_shield_stud";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give leather_shield_regular";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give studs";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1785, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
                
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }

	}
	
	public static void snakeskinBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xsnakeskin_boots";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give village_snake_skin 6";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void snakeskinVambraces(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xsnakeskin_vambraces";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give village_snake_skin 8";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void snakeskinBandana(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xsnakeskin_bandana";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give village_snake_skin 5";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(850, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void snakeskinChaps(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xsnakeskin_chaps";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give village_snake_skin 12";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(900, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void snakeskinBody(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xsnakeskin_body";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give village_snake_skin 15";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void greenDragonhideVambraces(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xdragon_vambraces";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void greenDragonhideBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xdragon_boots";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void greenDragonhideChaps(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xdragonhide_chaps";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(850, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void greenDragonhideCoif(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xhvh_green_dhide_coif_100";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
                
        String mat1 = "give dragon_leather 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(900, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
        
	}
	
	public static void greenDragonhideBody(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xdragonhide_body";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather 3";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void greenDragonhideShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xdhide_shield_green";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather 4";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blueDragonhideVambraces(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xblue_dragon_vambraces";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_blue";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
  
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blueDragonhideBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xblue_dragon_boots";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_blue";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blueDragonhideChaps(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xblue_dragonhide_chaps";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_blue 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(850, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blueDragonhideCoif(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xhvh_blue_dhide_coif_100";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_blue 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(900, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blueDragonhideBody(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xblue_dragonhide_body";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_blue 3";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blueDragonhideShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xdhide_shield_blue";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_blue 4";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void redDragonhideVambraces(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xred_dragon_vambraces";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_red";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void redDragonhideBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xred_dragon_boots";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_red";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void redDragonhideChaps(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xred_dragonhide_chaps";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_red 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(850, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void redDragonhideCoif(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xhvh_red_dhide_coif_100";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_red 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(900, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
        
	}
	
	public static void redDragonhideBody(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xred_dragonhide_body";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_red 3";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void redDragonhideShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xdhide_shield_red";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_red 4";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blackDragonhideVambraces(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xblack_dragon_vambraces";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_black";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
        
	}
	
	public static void blackDragonhideBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xblack_dragon_boots";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_black";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blackDragonhideChaps(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xblack_dragonhide_chaps";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_black 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(850, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blackDragonhideCoif(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xhvh_black_dhide_coif_100";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_black 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(900, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blackDragonhideBody(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xblack_dragonhide_body";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_black 3";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void blackDragonhideShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xdhide_shield_black";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_black 4";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	
	public static void royalDragonhideVambraces(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xroyal_dragon_vambraces";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_royal";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(800, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void royalDragonhideBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xroyal_dragon_boots";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_royal";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void royalDragonhideChaps(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xroyal_dragonhide_chaps";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_royal 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(850, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}
	
	public static void royalDragonhideCoif(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xhvh_royal_dhide_coif_100";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_royal 2";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(900, 450);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);  
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
        
	}
	
	public static void royalDragonhideBody(Robot robot) throws IOException, 
	AWTException, InterruptedException{

		int i = 0;
		String itemMatch = "1xroyal_dragonhide_body";
		boolean itemresult = false;
		
		String clear = "~clearinv";
		StringSelection stringSelection = new StringSelection(clear);
		
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dragon_leather_royal 3";
		stringSelection = new StringSelection(mat1);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat2 = "give thread";
		stringSelection = new StringSelection(mat2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
		robot.mouseMove(1735, 680);	
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.mouseMove(750, 500);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
        while(i<20) {
        	
        	String listInv = "listinv inv";
    		stringSelection = new StringSelection(listInv);
    		
    		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    		clipboard.setContents(stringSelection, null);
    		
    		Thread.sleep(1000);
    		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
    	    Thread.sleep(800);
    		robot.keyPress(KeyEvent.VK_CONTROL); 
            robot.keyPress(KeyEvent.VK_V); 
            robot.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(800);
            robot.keyPress(KeyEvent.VK_BACK_QUOTE);
            
            itemresult = ChestBalancingRegex.itemCheckRegex("C:\\output.txt",itemMatch);
            
            if(itemresult == true) {
            	String clearInv = "~clearinv";
        		stringSelection = new StringSelection(clearInv);
				
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
				
				Thread.sleep(800);
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(800);
		       	robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_CONTROL);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(800);
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        i=20;
            }
            else {
            	Thread.sleep(1000);
            	i++;
            } 
        }
                
	}

	
}
