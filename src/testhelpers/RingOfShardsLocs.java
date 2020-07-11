package testhelpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

public class RingOfShardsLocs {
	
	public static void shardPos1(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Prize shard position 1
		Thread.sleep(600);
		robot.mouseMove(695, 425);
		Thread.sleep(600);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
	
	public static void shardPos2(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Prize shard position 2
		Thread.sleep(600);
		robot.mouseMove(870, 425);
		Thread.sleep(600);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
	
	public static void shardPos3(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Prize shard position 3
		Thread.sleep(600);
		robot.mouseMove(930, 555);
		Thread.sleep(600);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
	
	public static void shardPos4(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Prize shard position 4
		Thread.sleep(600);
		robot.mouseMove(805, 630);
		Thread.sleep(600);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
	
	public static void shardPos5(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Prize shard position 5
		Thread.sleep(600);
		robot.mouseMove(695, 580);
		Thread.sleep(600);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
	
	public static void shardClaimPos(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Claim Button
		Thread.sleep(500);
		robot.mouseMove(1180, 620);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(500);
	}
	
	public static void crystalPos1(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Crystal Position 1
		Thread.sleep(500);
		robot.mouseMove(790, 450);
		Thread.sleep(500);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
	
	public static void crystalPos2(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Crystal position 2
		Thread.sleep(500);
		robot.mouseMove(970, 450);
		Thread.sleep(500);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
	
	public static void crystalPos3(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Crystal Position 3
		Thread.sleep(500);
		robot.mouseMove(1120, 450);
		Thread.sleep(500);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
	
	public static void crystalPos4(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Crystal Position 4
		Thread.sleep(500);
		robot.mouseMove(880, 572);
		Thread.sleep(500);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
	
	public static void crystalPos5(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		//Crystal Position 5
		Thread.sleep(500);
		robot.mouseMove(1030, 572);
		Thread.sleep(500);
	    robot.mousePress(InputEvent.BUTTON1_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_MASK);
	    Thread.sleep(500);
	}
}
