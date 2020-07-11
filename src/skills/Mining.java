package skills;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import utilities.ChestBalancingRegex;



public class Mining {
	
	public static void yakMiningTotal(Robot robot, String yakTaskQuantity) throws IOException, 
	AWTException, InterruptedException{

		String taskName = "Yak Task = Mining";
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

	public static void copperOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xcopper_ore";
		boolean itemresult = false;
		
		String teleport = "tele 0,51,52,21,43";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
		
		String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

        String mineNode = "~yakcopperore";
		stringSelection = new StringSelection(mineNode);
		
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
        Thread.sleep(10000);
        
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void tinOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xtin_ore";
		boolean itemresult = false;
		
		String teleport = "tele 0,51,52,22,39";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yaktinore";
		stringSelection = new StringSelection(mineNode);
		
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
        Thread.sleep(10000);
        
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void ironOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xiron_ore";
		boolean itemresult = false;
		
		String teleport = "tele 0,49,49,9,11";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakironore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void coalOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xcoal";
		boolean itemresult = false;
		
		String teleport = "tele 0,49,49,11,9";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
         
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakcoalore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void mithrilOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xmithril_ore";
		boolean itemresult = false;
		
		String teleport = "tele 0,51,52,19,38";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakmithrilore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void adamantiteOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xadamantite_ore";
		boolean itemresult = false;
		
		String teleport = "tele 0,51,52,25,33";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakadamantiteore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void luminiteOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xluminite";
		boolean itemresult = false;
		
		String teleport = "tele 0,43,71,30,50";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakluminiteore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void runiteOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xrunite_ore";
		boolean itemresult = false;
		
		String teleport = "tele 0,48,55,32,48";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakruniteore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void orichalcite(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xorichalcite_ore";
		boolean itemresult = false;
		
		String teleport = "tele 0,47,56,9,8";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakorichalciteore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void drakolithOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xdrakolith";
		boolean itemresult = false;
		
		String teleport = "tele 0,18,70,21,36";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakdrakolithore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	public static void necriteOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		
		int i = 0;
		String itemMatch = "1xnecrite_ore";
		boolean itemresult = false;
		
		String teleport = "tele 0,47,59,15,26";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yaknecriteore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void phasmatiteOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xphasmatite";
		boolean itemresult = false;
		
		String teleport = "tele 0,47,60,50,46";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakphasmatiteore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void baniteOre(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xmah5_bane_ore";
		boolean itemresult = false;
		
		String teleport = "tele 0,47,61,53,42";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakbaniteore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void lightAnimica(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xlight_animica";
		boolean itemresult = false;
		
		String teleport = "tele 0,51,46,45,28";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yaklightanimicaore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
	
	public static void darkAnimica(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xdark_animica";
		boolean itemresult = false;
		
		String teleport = "tele 2,44,197,59,34";
		StringSelection stringSelection = new StringSelection(teleport);
		
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String clear = "~clearinv";
		stringSelection = new StringSelection(clear);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
						
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
        String mineNode = "~yakdarkanimicaore";
		stringSelection = new StringSelection(mineNode);
		
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
            	teleport = "tele lumbridge";
				stringSelection = new StringSelection(teleport);
				
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
