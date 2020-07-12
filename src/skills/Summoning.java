package skills;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Summoning {
	
	public static void yakSummoningTotal(Robot robot, String yakTaskQuantity) throws IOException, 
	AWTException, InterruptedException{

		String taskName = "Yak Task = Summoning";
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
	
	public static void summoningObeliskAccess(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
		String teleport = "tele 0,36,150,19,28";
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
	
	public static void spiritWolf(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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
        
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
            
        String shard = "give lore_spirit_shard 7";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give wolf_bones";
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
              
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void dreadfowl(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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
             
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String shard = "give lore_spirit_shard 8";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give raw_chicken";
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

        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void spiritSpider(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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
        
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String shard = "give lore_spirit_shard 8";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give village_spider_carcass";
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void thornySnail(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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
        
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String shard = "give lore_spirit_shard 9";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give snail_corpse1";
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

        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void graniteCrab(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String shard = "give lore_spirit_shard 7";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
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

        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void spiritMosquito(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String shard = "give lore_spirit_shard 1";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
  
        String mat1 = "give mosquito_proboscis";
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
    
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void desertWyrm(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
 
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String shard = "give lore_spirit_shard 45";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give bucket_sand";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritScorpion(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
 
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String shard = "give lore_spirit_shard 57";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give bronze_claws";
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
   
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void spiritTzKih(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
   
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String shard = "give lore_spirit_shard 64";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String mat1 = "give lore_abby_titan_token";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void albinoRat(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String shard = "give lore_spirit_shard 75";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String mat1 = "give raw_rat_meat";
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

        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritKalphite(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String shard = "give lore_spirit_shard 51";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String mat1 = "give cactus_potato";
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

        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void compostMound(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
 
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String shard = "give lore_spirit_shard 47";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
 
        String mat1 = "give bucket_compost";
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
   
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void giantChinchompa(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 84";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String mat1 = "give chinchompa_captured";
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
    
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void vampyrBat(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
 
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
 
        String shard = "give lore_spirit_shard 81";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
  
        String mat1 = "give vampire_dust";
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
 
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void honeyBadger(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
    
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 84";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give lore_honeycomb";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void beaver(Robot robot) throws IOException, 
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
    
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 72";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give willow_logs";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void voidRavager(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
  
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 74";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give lore_pest_ravager_token";
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
  
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void voidShifter(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
       
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 74";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give lore_pest_shifter_token";
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void voidSpinner(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
    
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 75";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give lore_pest_spinner_token";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void voidTorcher(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 74";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give lore_pest_torcher_token";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void bronzeMinotaur(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 102";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void bullAnt(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 11";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give marigold";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void macaw(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
       
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String shard = "give lore_spirit_shard 78";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give guam_leaf";
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
    
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void evilTurnip(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 104";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String mat1 = "give lore_evil_turnip_face";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritCockatrice(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 88";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String mat1 = "give lore_cockatrice_egg_1";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void spiritGuthatrice(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 88";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String mat1 = "give lore_cockatrice_egg_2";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void spiritSaratrice(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 88";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String mat1 = "give lore_cockatrice_egg_3";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritZamatrice(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 88";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String mat1 = "give lore_cockatrice_egg_4";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void spiritPengatrice(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 88";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String mat1 = "give lore_cockatrice_egg_5";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void spiritCoraxatrice(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
   
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 88";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give lore_cockatrice_egg_6";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void spiritVulatrice(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 88";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give lore_cockatrice_egg_7";
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
    
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void ironMinotaur(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
  
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 125";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String mat1 = "give iron_bar";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void pyrelord(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 111";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give tinderbox";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void magpie(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 88";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give gold_ring";
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
    
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void bloatedLeech(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 117";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give raw_beef";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritTerrobird(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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
        
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 12";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give spit_raw_bird_meat";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void abyssalParasite(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String shard = "give lore_spirit_shard 106";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give lore_monster_charm";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritJelly(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 151";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give jug_water";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void ibis(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
    
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 109";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give harpoon";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void steelMinotaur(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String shard = "give lore_spirit_shard 141";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String mat1 = "give steel_bar";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritGraahk(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 154";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give hunting_fur_leopard_perfect";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritKyatt(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 153";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give hunting_fur_tiger_perfect";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritLarupia(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
   
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 155";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give hunting_fur_jaguar_perfect";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void karam(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
       
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 144";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give fishbowl_water";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void smokeDevil(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 141";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give ground_desert_goat_horn";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void abyssalLurker(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 119";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give lore_monster_charm";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void spiritCobra(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
       
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 116";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give village_snake_hide";
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void strangerPlant(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 128";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give poh_sapling_plant_1";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void barkerToad(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 11";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give swamp_toad";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void mithrilMinotaur(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 152";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give mithril_bar";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void warTortoise(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 1";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give battle_tortoise_shell";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void bunyip(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
        
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 110";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give raw_shark";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void fruitBat(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 130";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give banana";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void ravenousLocust(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 79";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give pot_flour";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void arcticBear(Robot robot) throws IOException, 
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
        
        String charm = "give lore_creature_charm";
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
       
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 14";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give huntingbeast_polar_fur";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void phoenix(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
       
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 165";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give lore_phoenix_pinion";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void obsidianGolem(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 195";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give lore_abby_titan_token";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void graniteLobster(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
    
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 166";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give enakh_granite_tiny";
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void prayingMantis(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
 
        String shard = "give lore_spirit_shard 168";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give flowers_waterfall_quest";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void forgeRegent(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 141";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String mat1 = "give butterfly_jar_ruby";
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void adamantMinotaur(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 144";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give adamantite_bar";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void talonBeast(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 174";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give lore_nailbeast_charm";
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
  
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void giantEnt(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
        
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 124";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give willow_branch";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void fireTitan(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
       
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 198";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give fire_talisman";
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
   
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void mossTitan(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
   
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
 
        String shard = "give lore_spirit_shard 198";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give earth_talisman";
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void iceTitan(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 198";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String mat1 = "give air_talisman";
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
       
        String mat2 = "give water_talisman";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void hydra(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String shard = "give lore_spirit_shard 128";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give water_orb";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void demonBrawler(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
       
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 136";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String mat1 = "give dfm2_claw";
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
   
        String summon = "~yaksummoning";
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
        
        robot.mouseMove(890,520);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void demonDeacon(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
       
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 136";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give dfm2_claw";
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

        String summon = "~yaksummoning";
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
        
        robot.mouseMove(795,565);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void demonExecutioner(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
   
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String shard = "give lore_spirit_shard 136";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give dfm2_claw";
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
       
        String summon = "~yaksummoning";
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
        
        robot.mouseMove(747,565);
		Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void spiritDagannoth(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String shard = "give lore_spirit_shard 1";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give dagganoth_hide";
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void lavaTitan(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 219";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
 
        String mat1 = "give lore_abby_titan_token";
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
  
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void rebornPhoenix(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 219";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
  
        String mat1 = "give lore_phoenix_pinion 2";
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

        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void swampTitan(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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

        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String shard = "give lore_spirit_shard 150";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String mat1 = "give green_salamander";
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

        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void runeMinotaur(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
   
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String shard = "give lore_spirit_shard 100";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
        
	}
	
	public static void unicornStallion(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
 
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);

        String shard = "give lore_spirit_shard 140";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give unicorn_horm";
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
   
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void lightCreature(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
  
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
 
        String shard = "give lore_spirit_shard 204";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give elfcity_amlodd_light_core";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void geyserTitan(Robot robot) throws IOException, 
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
        
        String charm = "give lore_outsider_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
  
        String shard = "give lore_spirit_shard 222";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
  
        String mat1 = "give water_talisman";
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
   
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void wolpertinger(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
      
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String shard = "give lore_spirit_shard 203";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
      
        String mat1 = "give wolf_bones";
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
      
        String mat2 = "give raw_rabbit";
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
		
	}
	
	public static void abyssalTitan(Robot robot) throws IOException, 
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
        
        String charm = "give lore_insect_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 113";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String mat1 = "give lore_monster_charm";
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
       
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void ironTitan(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
 
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 198";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give iron_ingot";
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
    
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void pakYak(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
    
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
   
        String shard = "give lore_spirit_shard 211";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    
        String mat1 = "give yak_hide";
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
     
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);
	}
	
	public static void packMammoth(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
     
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
       
        String shard = "give lore_spirit_shard 222";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
 
        String mat1 = "give him_mammoth_tusk";
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
      
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
	public static void steelTitan(Robot robot) throws IOException, 
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
        
        String charm = "give lore_leech_charm";
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
  
        String pouch = "give lore_pouch";
		stringSelection = new StringSelection(pouch);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
     
        String shard = "give lore_spirit_shard 178";
		stringSelection = new StringSelection(shard);
		
		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_CONTROL); 
        robot.keyPress(KeyEvent.VK_V); 
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        String mat1 = "give steel_ingot";
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
        
        String summon = "~yaksummoning";
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
        robot.keyPress(KeyEvent.VK_SPACE);

	}
	
}
