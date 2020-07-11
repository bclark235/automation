package utilities;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import testhelpers.MouseMovements;

public class ImageCaptureTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		int i = 0;
		 try {
	            Robot robot = new Robot();
	            
	            while(i<500) {
	            	Thread.sleep(500);
	            	/*robot.mouseMove(1050, 640);
	        		Thread.sleep(1000);
	        		robot.mousePress(InputEvent.BUTTON1_MASK);
	                robot.mouseRelease(InputEvent.BUTTON1_MASK);
	                Thread.sleep(1000);
	                robot.mouseMove(1020, 565);
	        		Thread.sleep(1000);
	        		robot.mousePress(InputEvent.BUTTON1_MASK);
	                robot.mouseRelease(InputEvent.BUTTON1_MASK);*/
	            	MouseMovements.treasureHunterMenu(robot);
	            	Thread.sleep(2000);
	            	MouseMovements.chestInterface(robot);
	            	Thread.sleep(2000);
	            	Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		            BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
		            File file = new File("C:\\screenshots\\screen-capture"+i+".png");
		            boolean status = ImageIO.write(bufferedImage, "png", file);
		            Thread.sleep(500);
		            MouseMovements.closeInterface(robot);
		            Thread.sleep(2000);
		            i++;
	            }
	 
	            
	 
	        } catch (AWTException | IOException ex) {
	            System.err.println(ex);
	        }

	}

}
