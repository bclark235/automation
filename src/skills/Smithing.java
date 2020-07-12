package skills;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Smithing {
	
	public static void yakSmithingTotal(Robot robot, String yakTaskQuantity) throws IOException, 
	AWTException, InterruptedException{

		String taskName = "Yak Task = Smithing";
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
	
	public static void burthorpForge(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
		String teleport = "tele 0,45,54,7,50";
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
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);

	}
	
	public static void yakForge(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
		String forge = "~yakforge";
		StringSelection stringSelection = new StringSelection(forge);
		
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
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);

	}
	
	public static void yakAnvil(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
		String anvil = "~yakanvil";
		StringSelection stringSelection = new StringSelection(anvil);
		
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
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);

	}
	
	public static void bronzeSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{	
		
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
			        
		String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void bronzeSmithMedHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{	
		
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
			        
        String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        				        
		
		
	}
	
	public static void bronzeSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{	
		
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
			        
        String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void bronzeSmithPlateskirt(Robot robot) throws IOException, 
	AWTException, InterruptedException{	
		
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
			        
        String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void bronzeSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
					
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
		
	public static void bronzeSmithChainbody(Robot robot) throws IOException, 
	AWTException, InterruptedException{	
		
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
			        
        String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        				        
		
		
	}
		
	public static void bronzeSmithSquareShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{	
		
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
			        
        String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void bronzeSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{	
		
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
			        
        String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void bronzeSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{	
		
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
			        
        String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
				        
	public static void bronzeSmithGauntlets(Robot robot) throws IOException, 
	AWTException, InterruptedException{	

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
			        
        String mat1 = "give bronze_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
	}
	
	public static void ironSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
		String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void ironSmithMedHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        				        
		
		
	}
	
	public static void ironSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void ironSmithPlateskirt(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void ironSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void ironSmithChainbody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        				        
		
	}
	
	public static void ironSmithSquareShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void ironSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String  anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void ironSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String  anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void ironSmithGauntlets(Robot robot) throws IOException, 
	AWTException, InterruptedException{

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
			        
        String mat1 = "give iron_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
	}
	
	public static void steelSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
		String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void steelSmithMedHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        				        
		
		
		
	}
	
	public static void steelSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void steelSmithPlateskirt(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void steelSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void steelSmithChainbody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        				        
		
		
	}
	
	public static void steelSmithSquareShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String  anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void steelSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String  anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
		
	}
	
	public static void steelSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String  anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	
		
	}
	
	public static void steelSmithGauntlest(Robot robot) throws IOException, 
	AWTException, InterruptedException{

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
			        
        String mat1 = "give steel_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
	}
	
	public static void mithrilSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
		String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void mithrilSmithMedHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void mithrilSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void mithrilSmithPlateskirt(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void mithrilSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void mithrilSmithChainbody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void mithrilSmithSquareShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		
	}
	
	public static void mithrilSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	
	}
	
	public static void mithrilSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void mithrilSmithGauntlets(Robot robot) throws IOException, 
	AWTException, InterruptedException{

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
			        
        String mat1 = "give mithril_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 310);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
	}
	
	public static void adamantSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
		String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void adamantSmithMedHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void adamantSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String  anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void adamantSmithPlateskirt(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void adamantSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void adamantSmithChainbody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void adamantSmithSquareShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void adamantSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void adamantSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	public static void adamantSmithGauntlets(Robot robot) throws IOException, 
	AWTException, InterruptedException{

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
			        
        String mat1 = "give adamantite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
	}
	
	public static void runiteSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
		String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void runiteSmithMedHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void runiteSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	

		
	}
	
	public static void runiteSmithPlateskirt(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
	}
	
	public static void runiteSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(90000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
		Thread.sleep(90000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
	}
	
	public static void runiteSmithChainbody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(90000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(90000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
	}
	
	public static void runiteSmithSquareShield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void runiteSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void runiteSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void runiteSmithGauntlets(Robot robot) throws IOException, 
	AWTException, InterruptedException{

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
			        
        String mat1 = "give runite_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 415);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
	}
	
	public static void orikalkumSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
		String mat1 = "give orikalkum_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void orikalkumSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give orikalkum_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
	}
	
	public static void orikalkumSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give orikalkum_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
			
		
	}
	
	public static void orikalkumSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give orikalkum_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void orikalkumSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give orikalkum_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void orikalkumSmithGauntlets(Robot robot) throws IOException, 
	AWTException, InterruptedException{

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
			        
        String mat1 = "give orikalkum_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(700, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        				        
        
	}
	
	public static void necroniumSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
		String mat1 = "give necronium_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}

	public static void necroniumSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give necronium_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
	}
	
	public static void necroniumSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give necronium_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
	}
	
	public static void necroniumSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give necronium_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void necroniumSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give necronium_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void necroniumSmithGauntlets(Robot robot) throws IOException, 
	AWTException, InterruptedException{

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
			        
        String mat1 = "give necronium_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(750, 360);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
	}
	
	public static void baneSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
		String mat1 = "give bane_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void baneSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give bane_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
	}
	
	public static void baneSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give bane_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	

		Thread.sleep(80000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
	}
	
	public static void baneSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give bane_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void baneSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give bane_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void baneSmithGauntlets(Robot robot) throws IOException, 
	AWTException, InterruptedException{

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
			        
        String mat1 = "give bane_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(600, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void elderRuneSmithFullHelm(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
		String mat1 = "give elder_rune_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void elderRuneSmithPlatelegs(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give elder_rune_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
	}
	
	public static void elderRuneSmithPlatebody(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give elder_rune_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(920, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		Thread.sleep(100000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
		Thread.sleep(80000);
		
		forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
		anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);	
		
		
	}
	
	public static void elderRuneSmithKiteshield(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give elder_rune_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(970, 315);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void elderRuneSmithArmouredBoots(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
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
			        
        String mat1 = "give elder_rune_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(820, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}
	
	public static void elderRuneSmithGauntlets(Robot robot) throws IOException, 
	AWTException, InterruptedException{

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
			        
        String mat1 = "give elder_rune_bar 5";
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
		        
		String forge = "~yakforge";
		stringSelection = new StringSelection(forge);
						
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
		
		robot.mouseMove(650, 410);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(870, 365);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        robot.mouseMove(1150, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
        String anvil = "~yakanvil";
		stringSelection = new StringSelection(anvil);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		
	}

}
