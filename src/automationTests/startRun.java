package automationTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.io.PrintWriter;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.openqa.selenium.WebDriver;
import testhelpers.ChestBalancingRun;
import testhelpers.DebugProcs;
import testhelpers.MouseMovements;
import testhelpers.RentalManager;
import testhelpers.SaveGameSystem;
import testhelpers.SigninHelpers;
import testhelpers.YakTrack;
import utilities.ChestBalancingRegex;
import utilities.DriverFactory;
import utilities.MailSystem;

//Class that starts the relevant chest opening automation code
public class startRun {
	
	public static void startRunChest(String Branch, int numRuns, String position, String interType, String shardPosit, String emailS, String sLevel, int numChestsRun, String rDate)throws IOException, 
	AWTException, InterruptedException, AddressException, MessagingException, SecurityException {
		
		//Uses the position and chest interface input to decide which chest run to use
		String pos = position;
		String chestInterface = interType;
		String slimeLevel = sLevel;

		//Creates files for debug output - if they do not already exist,
		PrintWriter writer = new PrintWriter("C:\\output.txt", "UTF-8");
		writer.close();
		
		writer = new PrintWriter("C:\\chest.txt", "UTF-8");
		writer.close();
		
		WebDriver driver;
		Robot robot = new Robot(); 
		
		//Opens the browser 
		driver = DriverFactory.open("chrome");
		
		//Starts the automation methods
		SaveGameSystem.saveGameSetup(driver, robot);
		Thread.sleep(250);
		RentalManager.rentalManager(driver, robot);
	    Thread.sleep(50);
	   	RentalManager.contentBranch(Branch, driver, robot);
	   	Thread.sleep(3000);
		SigninHelpers.rsLogIn(robot);
		Thread.sleep(100000);
		DebugProcs.clearInv(robot);
		Thread.sleep(1000);
		DebugProcs.clearInv(robot);
		Thread.sleep(1000);
		MouseMovements.closeChat(robot);
		Thread.sleep(1000);
		DebugProcs.setLevel99(robot);
		Thread.sleep(1000);
		DebugProcs.clearInv(robot);
		Thread.sleep(1000);
	    DebugProcs.setruneDate(robot, rDate);
	    Thread.sleep(2000);
	    DebugProcs.setHeartsAndKeys(robot);
	    Thread.sleep(2000);
	    MouseMovements.setInventory(robot);
	    Thread.sleep(500);
	    MouseMovements.treasureHunterMenu(robot);
		Thread.sleep(500);
		MouseMovements.chestInterface(robot);
		Thread.sleep(500);
		MouseMovements.skipTrhTutorial(robot);
		Thread.sleep(500);
		
	    //Switch system to set the right test running based on the user defined options
	  	switch(chestInterface) {
	  		case "Standard":
	  			switch(pos) {
	  				case "Position 1":
	  					ChestBalancingRun.chest1Run(robot, numRuns, numChestsRun);
	  				break;
	  				case "Position 2":
	  					ChestBalancingRun.chest2Run(robot, numRuns,numChestsRun);
	  				break;
	  				case "Position 3":
	  					ChestBalancingRun.chest3Run(robot, numRuns, numChestsRun);
	  				break;
	  				case "Position 4":
	  					ChestBalancingRun.chest4Run(robot, numRuns, numChestsRun);
	  				break;
	  				case "Position 5":
	  					ChestBalancingRun.chest5Run(robot, numRuns, numChestsRun);
	  				break;
	  				default:
	  					ChestBalancingRun.chestRandomRun(robot, numRuns, numChestsRun);
	  				break;
	  			}
	  			break;
	  		case "Gone Adventuring":
	  			ChestBalancingRun.goneAdventRun(robot, numRuns, numChestsRun);
	  			break;
	  		case "Ring of Shards":
	  			switch(pos) {
	  				case "Position 1":
	  					ChestBalancingRun.crystal1Run(robot, numRuns, shardPosit, numChestsRun);	
	  					break;
	  				case "Position 2":
	  					ChestBalancingRun.crystal2Run(robot, numRuns, shardPosit, numChestsRun);
	  				break;
	  				case "Position 3":
	  					ChestBalancingRun.crystal3Run(robot, numRuns, shardPosit, numChestsRun);
	  				break;
	  				case "Position 4":
	  					ChestBalancingRun.crystal4Run(robot, numRuns, shardPosit, numChestsRun);
	  				break;
	  				case "Position 5":
	  					ChestBalancingRun.crystal5Run(robot, numRuns, shardPosit, numChestsRun);
	  				break;
	  				default:
	  					ChestBalancingRun.crystal1Run(robot, numRuns, shardPosit, numChestsRun);
	  				break;
	  			}
	  			break;
	  		case "Cerberus Rush":
	  			switch(pos) {
	  				case "Position 1":
	  					ChestBalancingRun.chestCerberus1Run(robot, numRuns, numChestsRun);
	  				break;
	  				case "Position 2":
	  					ChestBalancingRun.chestCerberus2Run(robot, numRuns, numChestsRun);
	  				break;
	  				case "Position 3":
	  					ChestBalancingRun.chestCerberus3Run(robot, numRuns,numChestsRun);
	  				break;
	  				default:
	  					ChestBalancingRun.chestCerberus1Run(robot, numRuns, numChestsRun);
	  				break;
	  			}
	  			break;
	  		case "Bubbling Lamps":
	  			switch(pos) {
	  				case "Position 1":
	  					ChestBalancingRun.chestBubbling1Run(robot, numRuns, numChestsRun);
	  				break;
	  				case "Position 2":
	  					ChestBalancingRun.chestBubbling2Run(robot, numRuns, numChestsRun);
	  				break;
	  				case "Position 3":
	  					ChestBalancingRun.chestBubbling3Run(robot, numRuns, numChestsRun);
	  				break;
	  				default:
	  					ChestBalancingRun.chestBubbling1Run(robot, numRuns, numChestsRun);
	  				break;
	  			}
	  			break;
	  		case "Loot Duels":
	  			switch(pos) {
	  				case "Position 1":
	  					numRuns = 1000;
	  					ChestBalancingRun.chestLootDuels1Run(robot, numRuns, numChestsRun);
	  					numRuns = 1000;
	  					ChestBalancingRun.chestLootDuels2Run(robot, numRuns, numChestsRun);
	  				break;
	  				case "Position 2":
	  					ChestBalancingRun.chestLootDuels2Run(robot, numRuns, numChestsRun);
	  				break;
	  				default:
	  					ChestBalancingRun.chestLootDuels1Run(robot, numRuns, numChestsRun);
	  				break;
	  			}
	  			break;
	  		case "Duty of Care":
	  			ChestBalancingRun.duty1Run(robot, numRuns, numChestsRun);
	  			break;
	  		case "Diamond Dozen":
	  			ChestBalancingRun.diamDozen1Run(robot, numRuns, numChestsRun);
	  			break;
	  		case "Slay the Slime":
	  			switch(slimeLevel) {
	  				case "Slime Level 1":
	  					ChestBalancingRun.slimeLevel1(robot, numRuns, numChestsRun);
	  				break;
	  				case "Slime Level 4":
	  					ChestBalancingRun.slimeLevel4(robot, numRuns, numChestsRun);
	  				break;
	  				case "Slime Level 7":
	  					ChestBalancingRun.slimeLevel7(robot, numRuns, numChestsRun);
	  				break;
	  				case "Slime Level 10":
	  					ChestBalancingRun.slimeLevel10(robot, numRuns, numChestsRun);
	  				break;
	  				case "Slime Level 13":
	  					ChestBalancingRun.slimeLevel13(robot, numRuns, numChestsRun);
	  				break;
	  				case "Slime Level 16":
	  					ChestBalancingRun.slimeLevel16(robot, numRuns, numChestsRun);
	  				break;
	  				default:
	  					ChestBalancingRun.slimeLevel1(robot, numRuns, numChestsRun);
	  				break;
	  			}
	  			break;
	  		case "Crystal Capsules":
	  			ChestBalancingRun.crystalCapsules(robot, numRuns, numChestsRun);
	  			break;
	  		case "Crystal Capsules - Refresh Run":
	  			ChestBalancingRun.crystalCapsulesRefresh(robot, numRuns, numChestsRun);
	  			break;
	  		case "Double Dragon":
	  			ChestBalancingRun.doubleDragonRun(robot, numRuns, numChestsRun);
	  			break;
	  		case "Catwalk":
	  			ChestBalancingRun.catwalkRun(robot, numRuns, numChestsRun);
	  			break;
	  		default:
	  			ChestBalancingRun.chestRandomRun(robot, numRuns, numChestsRun);
	  			break;
	  		}
	  	
	    Thread.sleep(2000);
	    MouseMovements.closeRune(robot);
	    Thread.sleep(2000);
	    ChestBalancingRegex.chestInitRegex("C:\\output.txt");
	    Thread.sleep(500);
	    ChestBalancingRegex.chestFinalRegex("C:\\chest.txt", numRuns);
	    Thread.sleep(500);
	    MailSystem.autoSendMail(emailS, interType, numRuns);
	    Thread.sleep(500);
	    RentalManager.testCleanup(robot);	
	}
	
	public static void startRunYakFull(String Branch, String emailS, String rDate, String pLevel)throws IOException, 
	AWTException, InterruptedException, AddressException, MessagingException, SecurityException {
		//Creates files for debug output - if they do not already exist,
				PrintWriter writer = new PrintWriter("C:\\output.txt", "UTF-8");
				writer.close();
				
				writer = new PrintWriter("C:\\chest.txt", "UTF-8");
				writer.close();
				
				WebDriver driver;
				Robot robot = new Robot(); 
				
				//Opens the browser 
				driver = DriverFactory.open("chrome");
				
				//Starts the automation methods
				//utilities.SaveGameLoader.saveGameSetup(driver, robot);
				Thread.sleep(250);
				RentalManager.rentalManager(driver, robot);
			    Thread.sleep(50);
				RentalManager.contentBranch(Branch, driver, robot);
				Thread.sleep(3000);
				SigninHelpers.rsLogIn(robot);
				Thread.sleep(3000);
			    DebugProcs.setruneDate(robot, rDate);
			    Thread.sleep(5000);
			    DebugProcs.setNPCAttack(robot);
			    Thread.sleep(5000);
			    DebugProcs.setAreaAccess(robot);
			    Thread.sleep(5000);
			    switch(pLevel) {
			  		case "1":
			  			DebugProcs.setLevel1(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.clearInv(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.toolBeltSetup1(robot);
			  			Thread.sleep(5000);
			  			break;
			  		case "50":
			  			DebugProcs.setLevel50(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.clearInv(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.toolBeltSetup50(robot);
			  			Thread.sleep(5000);
			  			break;
			  		case "99":
			  			DebugProcs.setLevel99(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.clearInv(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.toolBeltSetup99(robot);
			  			Thread.sleep(5000);
			  			break;
			  		default:
			  			DebugProcs.setLevel99(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.clearInv(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.toolBeltSetup99(robot);
			  			Thread.sleep(5000);
			  			break;
			    }
			    MouseMovements.treasureHunterMenu(robot);
			    Thread.sleep(1000);
			    MouseMovements.yakTrack(robot);
			    Thread.sleep(1000);
			   
		
	}
	
	public static void startRunYakSingle(String Branch, String emailS, int taskNum, String skillName, String rDate, String yakTaskSelection, String pLevel, String yakTaskQuantity)throws IOException, 
	AWTException, InterruptedException, AddressException, MessagingException, SecurityException {
		//Creates files for debug output - if they do not already exist,
				PrintWriter writer = new PrintWriter("C:\\output.txt", "UTF-8");
				writer.close();
				
				writer = new PrintWriter("C:\\chest.txt", "UTF-8");
				writer.close();
				
				WebDriver driver;
				Robot robot = new Robot(); 
				
				//Opens the browser 
				driver = DriverFactory.open("chrome");
			
				//Starts the automation methods
				switch(pLevel) {
					case "1":
						SaveGameSystem.saveGameSetup(driver, robot);
						break;
		  			case "5":
		  				SaveGameSystem.saveGameSetupF2P(driver, robot);
					break;
		  			case "50":
		  				SaveGameSystem.saveGameSetup(driver, robot);
					break;
		  			case "99":
		  				SaveGameSystem.saveGameSetup(driver, robot);
					break;
		  			default:
		  				SaveGameSystem.saveGameSetup(driver, robot);
					break;
			    }
				Thread.sleep(250);
				RentalManager.rentalManager(driver, robot);
			    Thread.sleep(50);
			    switch(pLevel) {
			  		case "5":
			  			RentalManager.contentBranchF2P(Branch, driver, robot);
			    	break;
			  		default:
			  			RentalManager.contentBranch(Branch, driver, robot);
			    	break;
			    }
			    Thread.sleep(5000);
			    switch(pLevel) {
		  			case "5":
		  				SigninHelpers.rsLogInF2P(robot);
		  			break;
		  			default:
		  				SigninHelpers.rsLogIn(robot);
		  			break;
			    }
				Thread.sleep(100000);
				DebugProcs.clearInv(robot);
				Thread.sleep(1000);
				DebugProcs.clearInv(robot);
				Thread.sleep(1000);
				MouseMovements.closeChat(robot);
				Thread.sleep(1000);
			    DebugProcs.setAreaAccess(robot);
			    Thread.sleep(5000);
			    MouseMovements.setInventory(robot);
			    Thread.sleep(5000);
			    switch(pLevel) {
			  		case "1":
			  			DebugProcs.setLevel1(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.clearInv(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.toolBeltSetup1(robot);
			  			Thread.sleep(5000);
			  			break;
			  		case "5":
			  			DebugProcs.setLevel5(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.clearInv(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.toolBeltSetup1(robot);
			  			Thread.sleep(5000);
			  			break;
			  		case "50":
			  			DebugProcs.setLevel50(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.clearInv(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.toolBeltSetup50(robot);
			  			Thread.sleep(5000);
			  			break;
			  		case "99":
			  			DebugProcs.setLevel99(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.clearInv(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.toolBeltSetup99(robot);
			  			Thread.sleep(5000);
			  			break;
			  		default:
			  			DebugProcs.setLevel99(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.clearInv(robot);
			  			Thread.sleep(1000);
			  			DebugProcs.toolBeltSetup99(robot);
			  			Thread.sleep(5000);
			  			break;
			    }
			    Thread.sleep(5000);
			    DebugProcs.setruneDate(robot, rDate);
			    Thread.sleep(5000);
			    DebugProcs.setTaskNum(robot, taskNum);
			    Thread.sleep(5000);
		  		YakTrack.yakTrackTaskRun(robot, skillName, yakTaskSelection, yakTaskQuantity);
			    Thread.sleep(5000);
			    ChestBalancingRegex.yakRegex();
			    Thread.sleep(2000);
			    MouseMovements.closeRune(robot);
			    Thread.sleep(500);
			    MailSystem.autoYakMail(emailS, skillName, taskNum, pLevel, yakTaskSelection);
			    Thread.sleep(500);
			    RentalManager.testCleanup(robot);
		
	}

}

      
	
