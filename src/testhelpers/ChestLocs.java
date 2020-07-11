package testhelpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

//Include the mouse actions to select the chest location and the claim prize button
public class ChestLocs {
	
	public static void claimPrize(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the claim prize button in the standard interface and presses the button
		Thread.sleep(800);
		robot.mouseMove(1095,390);
		//robot.mouseMove(1070, 450);
        Thread.sleep(3000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);  
	}
	
	public static void claimPrizeOld(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the claim prize button in the standard interface and presses the button
		Thread.sleep(800);
		robot.mouseMove(1100, 470);
		//robot.mouseMove(1070, 450);
        Thread.sleep(3000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);  
	}
	
		
	public static void claimDutyPrize(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the claim prize button in the duty of care interface and presses the button
		Thread.sleep(500);
		robot.mouseMove(1110,355);
        Thread.sleep(4000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK); 
	}
	
	public static void stdCh1(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 1 in the standard TH interface and opens it
		Thread.sleep(500);
        robot.mouseMove(910,420);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void stdCh2(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 2 in the standard TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(1110,420);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void stdCh3(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 3 in the standard TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(830,510);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000); 
	}
	
	public static void stdCh4(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 4 in the standard TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(1010,540);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}
	
	public static void stdCh5(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 5 in the standard TH interface and presses it
		robot.mouseMove(1210,540);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void goneAdventLoc(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to claim prize button in the Gone Adventuring Chest interface and presses it
		robot.mouseMove(930, 595);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void rushCh1(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 1 in the Cerberus Rush TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(730, 560);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void rushCh2(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 2 in the Cerberus Rush TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(895, 580);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void rushCh3(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 3 in the Cerberus Rush TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(1080, 560);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void bubblingCh1(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 1 in the Bubbling Chests TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(730, 535);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void bubblingCh2(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 2 in the Bubbling Chests TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(950, 500);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void bubblingCh3(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 3 in the Bubbling Chests TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(1160, 545);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void lootDuelCh1(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 1 in the Loot Duels TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(830,490);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void lootDuelCh2(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 2 in the Loot Duels TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(1090,480);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void diamondDozen1(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the claim prize button below the prize pool and clicks on it
		Thread.sleep(500);
		robot.mouseMove(1150,650);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500); 
	}
	
	public static void slimeFeedKey(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to feed keys button and presses it it
		Thread.sleep(500);
		robot.mouseMove(1200, 660);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(500);
	}
	
	public static void slimeFeedHOI(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the feed hearts of ice button and clicks it
		Thread.sleep(500);
		robot.mouseMove(720, 660);
        Thread.sleep(50);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(100);
	}
	
	public static void slayTheSlime(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(950, 660);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void crystalCapsule1(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(655, 440);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void crystalCapsule2(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(747, 440);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void crystalCapsule3(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(830, 440);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void crystalCapsule4(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(930, 440);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void crystalCapsule5(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(655, 560);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void crystalCapsule6(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(747, 560);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void crystalCapsule7(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(830, 560);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void crystalCapsule8(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(930, 560);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void crystalReset(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to the slay button and clicks it
		Thread.sleep(500);
		robot.mouseMove(1150, 595);;
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
        Thread.sleep(500);
        robot.mouseMove(1020, 550);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(200); 
	}
	
	public static void doubleDragonCh1(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 1 in the standard TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(800, 490);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}
	
	public static void catwalkLoc(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Moves Mouse to chest 1 in the standard TH interface and opens it
		Thread.sleep(500);
		robot.mouseMove(1150, 500);
        Thread.sleep(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        Thread.sleep(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(1000);
	}

}
