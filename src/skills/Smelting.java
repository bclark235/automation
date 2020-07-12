package skills;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Smelting {
	
	public static void yakSmeltingTotal(Robot robot, String yakTaskQuantity) throws IOException, 
	AWTException, InterruptedException{

		String taskName = "Yak Task = Smelting";
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
	
	public static void lumbridgeFurnace(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
		String teleport = "tele 0,50,50,27,55";
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

	public static void bronzeBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give copper_ore";
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
		
		String mat2 = "give tin_ore";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
		robot.mouseMove(815, 320);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		        
	}
	
	public static void ironBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give iron_ore 2";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
        robot.mouseMove(870, 320);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
			        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}
	
	public static void steelBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give iron_ore";
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
		
		String mat2 = "give coal";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
        robot.mouseMove(920, 320);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
			        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}
	
	public static void mithrilBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give mithril_ore";
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
		
		String mat2 = "give coal";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
        robot.mouseMove(970, 320);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
			        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}
	
	public static void adamantBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give adamantite_ore";
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
		
		String mat2 = "give luminite";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
		robot.mouseMove(815, 360);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
			        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}
	
	public static void runiteBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give runite_ore";
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
		
		String mat2 = "give luminite";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
        robot.mouseMove(870, 360);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
			        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}
	
	public static void orikalkumBar(Robot robot) throws IOException, 
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
        
		String mat1 = "give orichalcite_ore";
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
		
		String mat2 = "give drakolith";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
        robot.mouseMove(920, 360);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
			        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}
	
	public static void necroniumBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give necrite_ore";
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
		
		String mat2 = "give phasmatite";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
        robot.mouseMove(970, 360);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
			        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}
	
	public static void baneBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give mah5_bane_ore 2";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
		robot.mouseMove(815, 400);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
			        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
	}
	
	public static void elderRuneBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give runite_bar";
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
		
		String mat2 = "give light_animica";
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
		
		String mat3 = "give dark_animica";
		stringSelection = new StringSelection(mat3);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
        robot.mouseMove(870, 400);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
		Thread.sleep(1000);
		robot.mouseMove(1150, 590);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}
	
	public static void concentratedAlloyBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give bronze_bar";
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
		
		String mat2 = "give iron_bar";
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
		
		String mat3 = "give steel_bar";
		stringSelection = new StringSelection(mat3);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String mat4 = "give mithril_bar";
		stringSelection = new StringSelection(mat4);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String mat5 = "give adamantite_bar";
		stringSelection = new StringSelection(mat5);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String mat6 = "give runite_bar";
		stringSelection = new StringSelection(mat6);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String mat7 = "give orikalkum_bar";
		stringSelection = new StringSelection(mat7);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String mat8 = "give necronium_bar";
		stringSelection = new StringSelection(mat8);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String mat9 = "give bane_bar";
		stringSelection = new StringSelection(mat9);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String mat10 = "give elder_rune_bar";
		stringSelection = new StringSelection(mat10);
						
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
					
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
		robot.keyPress(KeyEvent.VK_V); 
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
			        
		robot.mouseMove(625, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(825, 400);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void enrichedAlloyBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give masterwork_bar_1 5";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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

		robot.mouseMove(625, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(875, 400);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void immaculateAlloyBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give masterwork_bar_2 10";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
			        
		robot.mouseMove(625, 590);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(925, 400);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void bluriteBar(Robot robot) throws IOException, 
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
        
        String questUnlock = "setvar squire 7";
        stringSelection = new StringSelection(questUnlock);
		
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
			        
		String mat1 = "give blurite_ore";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
        
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(825, 475);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void silverBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give silver_ore";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
		
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(875, 475);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void goldBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give gold_ore";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
			        
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(925, 475);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void dragonbaneBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give mah5_dragon_bane_ore";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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

		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(975, 475);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void basiliskbaneBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give mah5_basilisk_bane_ore";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
			        
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(825, 525);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void wallasalkibaneBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give mah5_wallasalki_bane_ore";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
			        
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(875, 525);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void abyssalbaneBar(Robot robot) throws IOException, 
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
			        
		String mat1 = "give mah5_abyssal_demon_bane_ore";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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

		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(925, 525);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void obsidianBar(Robot robot) throws IOException, 
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
        
        String questUnlock = "setvar tzhaar3_main 225";
        stringSelection = new StringSelection(questUnlock);
		
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

       	robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
			        
		String mat1 = "give obsidian_shard 12";
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
		        
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
	
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(975, 525);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
	public static void corruptedOre(Robot robot) throws IOException, 
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
			        
		String mat1 = "give elf_corrupted_ore";
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
		
		String summon = "~yaksmelting";
		stringSelection = new StringSelection(summon);
						
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
			        
		robot.mouseMove(1010, 595);
		Thread.sleep(1000);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
        
        robot.mouseMove(825, 575);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
		
        robot.mouseMove(1150, 590);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
        
	}
	
}
