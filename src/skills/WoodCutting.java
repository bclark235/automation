package skills;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import utilities.ChestBalancingRegex;



public class WoodCutting {
	
	public static void yakWoodcuttingTotal(Robot robot, String yakTaskQuantity) throws IOException, 
	AWTException, InterruptedException{

		String taskName = "Yak Task = Woodcutting";
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
	
	public static void normalLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xlogs";
		boolean itemresult = false;
		
		String teleport = "tele 0,45,55,27,22";
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

        Thread.sleep(1000);

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
		
        String cutTree = "~yaklogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void oakLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xoak_logs";
		boolean itemresult = false;
		
		String teleport = "tele 0,47,51,4,32";
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
        
        String taskProgress = yakTaskSelection;
		stringSelection = new StringSelection(taskProgress);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

        Thread.sleep(1000);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String cutTree = "~yakoaklogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void willowLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xwillow_logs";
		boolean itemresult = false;
		
		String teleport = "tele 0,48,50,18,27";
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
        
        String cutTree = "~yakwillowlogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void teakLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xteak_logs";
		boolean itemresult = false;
		
		String teleport = "tele 0,44,48,10,8";
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
        
        String cutTree = "~yakteaklogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void mapleLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xmaple_logs";
		boolean itemresult = false;
		
		String teleport = "tele 0,41,55,59,0";
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
        
        String cutTree = "~yakmaplelogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void acadiaLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xmenaphos_acadia_log";
		boolean itemresult = false;
		
		String teleport = "tele 0,49,42,44,47";
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

        String cutTree = "~yakacadialogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void mahoganyLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xmahogany_logs";
		boolean itemresult = false;
		
		String teleport = "tele 0,44,48,5,13";
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

        String cutTree = "~yakmahoganylogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void pineLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xarctic_pine_log";
		boolean itemresult = false;
		
		String teleport = "tele 0,36,60,61,29";
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

        String cutTree = "~yakpinelogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void eucalyptusLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xeucalyptus_logs";
		boolean itemresult = false;
		
		String teleport = "tele 0,38,44,29,38";
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

        String cutTree = "~yakeucalyptuslogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void yewLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xyew_logs";
		boolean itemresult = false;
		
		String teleport = "tele 0,45,50,61,31";
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

        String cutTree = "~yakyewlogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void magicLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xmagic_logs";
		boolean itemresult = false;
		
		String teleport = "tele 0,52,51,27,48";
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

        String cutTree = "~yakmagiclogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void elderLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xelder_logs";
		boolean itemresult = false;
		
		String teleport = "tele 0,45,50,54,29";
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

        String cutTree = "~yakelderlogs";
		stringSelection = new StringSelection(cutTree);
		
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
	
	public static void bambooLogs(Robot robot, String yakTaskSelection) throws IOException, 
	AWTException, InterruptedException{
		
		int i = 0;
		String itemMatch = "1xelr1_bamboo_low";
		boolean itemresult = false;
		
		String teleport = "tele 0,28,181,51,9";
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

        String cutTree = "~yakbamboologs";
		stringSelection = new StringSelection(cutTree);
		
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
