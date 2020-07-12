package skills;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Thieving {
	
	public static void yakThievingTotal(Robot robot, String yakTaskQuantity) throws IOException, 
	AWTException, InterruptedException{

		String taskName = "Yak Task = Thieving";
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
	
	public static void man(Robot robot) throws IOException, 
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
        
        String tele = "tele 0,49,48,50,35";
		stringSelection = new StringSelection(tele);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String npc = "npcadd falador_man2";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,50,36";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket1";
		stringSelection = new StringSelection(pickpocket);
		
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
             
	}
	
	public static void woman(Robot robot) throws IOException, 
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
        
        String npc = "npcadd falador_woman";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,50,37";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket2";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void farmer(Robot robot) throws IOException, 
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
        
        String npc = "npcadd farmer1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,50,38";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket3";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void femaleHAM(Robot robot) throws IOException, 
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
        
        String npc = "npcadd favour_female_ham_civilian";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,50,39";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket4";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void maleHAM(Robot robot) throws IOException, 
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
        
        String npc = "npcadd favour_male_ham_civilian";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,50,40";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket5";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void hamGuard(Robot robot) throws IOException, 
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
        
        String npc = "npcadd dttd_HAM_guard_1_postquest";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,50,41";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket6";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void warrior(Robot robot) throws IOException, 
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
        
        String npc = "npcadd warrior_woman";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,50,42";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket7";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}

	public static void rogue(Robot robot) throws IOException, 
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
        
        String npc = "npcadd rogue";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,50,43";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket8";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void caveGoblin(Robot robot) throws IOException, 
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
        
        String npc = "npcadd dorgesh_female_7";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,51,36";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket9";
		stringSelection = new StringSelection(pickpocket);
		
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
             
	}
	
	public static void masterFarmer(Robot robot) throws IOException, 
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
        
        String npc = "npcadd martin_the_master_farmer";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,51,37";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket10";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void guard(Robot robot) throws IOException, 
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
        
        String npc = "npcadd ardougne_guard";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,51,38";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket11";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void fremennikCitizen(Robot robot) throws IOException, 
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
        
        String npc = "npcadd viking_Man";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,51,39";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket12";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void pollnivnianBandit(Robot robot) throws IOException, 
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
        
        String npc = "npcadd feud_Arabian_Guard2_multi";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,51,40";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket13";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void desertBandit(Robot robot) throws IOException, 
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
        
        String npc = "npcadd fourdiamonds_Sword_bandit_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,51,41";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket14";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void ardougneKnight(Robot robot) throws IOException, 
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
        
        String npc = "npcadd knight_of_ardougne";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,51,42";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket15";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void pollnivnianBandit2(Robot robot) throws IOException, 
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
        
        String npc = "npcadd feud_Arabian_Guard_multi";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,51,43";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket16";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void yanilleWatchman(Robot robot) throws IOException, 
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
        
        String npc = "npcadd yanille_watchman";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,52,36";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket17";
		stringSelection = new StringSelection(pickpocket);
		
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
             
	}
	
	public static void thug(Robot robot) throws IOException, 
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
        
        String npc = "npcadd feud_egyptian_doorman_2";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,52,37";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket18";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void paladin(Robot robot) throws IOException, 
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
        
        String npc = "npcadd paladin";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,52,38";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket19";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void gnome(Robot robot) throws IOException, 
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
        
        String npc = "npcadd gnomechildgreen";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,52,39";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket20";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void hero(Robot robot) throws IOException, 
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
        
        String npc = "npcadd Hero";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,52,40";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket21";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void elves(Robot robot) throws IOException, 
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
        
        String npc = "npcadd mourning_town_elf_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,52,41";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket22";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void dwarfTrader(Robot robot) throws IOException, 
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
        
        String npc = "npcadd dwarf_city_purple_trader2";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,52,42";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket23";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void iowerthWorker(Robot robot) throws IOException, 
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
        
        String npc = "npcadd elfcity_pickpocket_iorwerth_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,52,43";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket24";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void ithellWorker(Robot robot) throws IOException, 
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
        
        String tele = "tele 0,49,48,53,35";
		stringSelection = new StringSelection(tele);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String npc = "npcadd elfcity_pickpocket_ithell_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,53,36";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket25";
		stringSelection = new StringSelection(pickpocket);
		
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
             
	}
	
	public static void cadarnWorker(Robot robot) throws IOException, 
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
        
        String npc = "npcadd elfcity_pickpocket_cadarn_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,53,37";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket26";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void amloddWorker(Robot robot) throws IOException, 
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
        
        String npc = "npcadd elfcity_pickpocket_amlodd_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,53,38";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket17";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void trahaernWorker(Robot robot) throws IOException, 
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
        
        String npc = "npcadd elfcity_pickpocket_trahaearn_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,53,39";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket28";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void hefinWorker(Robot robot) throws IOException, 
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
        
        String npc = "npcadd elfcity_pickpocket_hefin_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,53,40";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket29";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void crwysWorker(Robot robot) throws IOException, 
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
        
        String npc = "npcadd elfcity_pickpocket_crwys_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,53,41";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket30";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}
	
	public static void meilyrWorker(Robot robot) throws IOException, 
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
        
        String npc = "npcadd elfcity_pickpocket_meilyr_1";
		stringSelection = new StringSelection(npc);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String tele2 = "tele 0,49,48,53,42";
		stringSelection = new StringSelection(tele2);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String pickpocket = "~yakpickpocket31";
		stringSelection = new StringSelection(pickpocket);
		
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
                
	}


}
