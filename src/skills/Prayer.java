package skills;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Prayer {
	
	public static void yakPrayerTotal(Robot robot, String yakTaskQuantity) throws IOException, 
	AWTException, InterruptedException{

		String taskName = "Yak Task = Prayer";
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
	
	public static void lumbridgeCrater(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
		String teleport = "tele 0,49,50,46,28";
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
	
	public static void impiousAshes(Robot robot) throws IOException, 
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
        
        String charm = "give impious_ashes";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void randImpiousAshes(Robot robot) throws IOException, 
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
        
        String charm = "give rand_impious_ashes";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void bones(Robot robot) throws IOException, 
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
        
        String charm = "give bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void wolfBones(Robot robot) throws IOException, 
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
        
        String charm = "give wolf_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void monkeyBones(Robot robot) throws IOException, 
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
        
        String charm = "give mm_normal_monkey_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void batBones(Robot robot) throws IOException, 
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
        
        String charm = "give bat_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void accursedAshes(Robot robot) throws IOException, 
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
        
        String charm = "give accursed_ashes";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void randAccursedAshes(Robot robot) throws IOException, 
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
        
        String charm = "give rand_accursed_ashes";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void jorgeBones(Robot robot) throws IOException, 
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
        
        String charm = "give tbwt_jogre_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void bigBones(Robot robot) throws IOException, 
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
        
        String charm = "give big_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void zorgeBones(Robot robot) throws IOException, 
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
        
        String charm = "give zogre_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void babyDragonBones(Robot robot) throws IOException, 
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
        
        String charm = "give babydragon_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void wyvernBones(Robot robot) throws IOException, 
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
        
        String charm = "give wyvern_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void infernalAshes(Robot robot) throws IOException, 
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
        
        String charm = "give infernal_ashes";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void randInfernalAshes(Robot robot) throws IOException, 
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
        
        String charm = "give rand_infernal_ashes";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void dragonBones(Robot robot) throws IOException, 
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
        
        String charm = "give dragon_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void creatureBones(Robot robot) throws IOException, 
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
        
        String charm = "give hotm_creature_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void dagannothBones(Robot robot) throws IOException, 
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
        
        String charm = "give dagannoth_king_bones";
		stringSelection = new StringSelection(charm);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
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
        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
        
        Thread.sleep(1000);
        robot.mouseMove(1735, 680);	
      	Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
	}
	
	public static void adamantDragonBones(Robot robot) throws IOException, 
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
        
        String charm = "give adamant_dragon_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void frostDragonBones(Robot robot) throws IOException, 
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
        
        String charm = "give frost_dragon_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void runeDragonBones(Robot robot) throws IOException, 
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
        
        String charm = "give rune_dragon_bones";
		stringSelection = new StringSelection(charm);
		
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
        
	}
	
	public static void smoulderingAshes(Robot robot) throws IOException, 
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
        
        String charm = "give smoldering_ashes";
		stringSelection = new StringSelection(charm);
		
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
        
	}

}
