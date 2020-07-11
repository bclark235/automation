package testhelpers;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

//Class that contains methods that control the chest opening tests
public class ChestBalancingRun {
	
	public static void chest1Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		
		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.stdCh1(robot);
		        Thread.sleep(4000);
		        Thread.sleep(400);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(500);
			DebugProcs.clearInv(robot);
			Thread.sleep(500);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(500);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chest2Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 2 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		
		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.stdCh2(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chest3Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 3 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		
		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.stdCh3(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chest4Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 4 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		
		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.stdCh4(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chest5Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 5 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		
		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.stdCh5(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chestRandomRun(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of random chest locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 6 
        int rand_int1 = rand.nextInt(6); 
		
		while(runs<totalRuns){
			while(i<numChestsRun) {
				//Due to the Inv size limits this needs to be split in 20 item intervals
				if(rand_int1 == 1) {				       
						ChestLocs.stdCh1(robot);
					    Thread.sleep(1000);
					    ChestLocs.claimPrize(robot);
					    i++;
					    rand_int1 = rand.nextInt(6);
					    Thread.sleep(300);  
				}
				else if(rand_int1 == 2) {					        
						ChestLocs.stdCh2(robot);
					    Thread.sleep(1000);
					    ChestLocs.claimPrize(robot);
					    i++;
					    rand_int1 = rand.nextInt(6);
					    Thread.sleep(300);					    
				}
				else if(rand_int1 == 3) {					        
						ChestLocs.stdCh3(robot);
					    Thread.sleep(1000);
					    ChestLocs.claimPrize(robot);
					    i++;
					    rand_int1 = rand.nextInt(6);
					    Thread.sleep(300);					   
				}
				else if(rand_int1 == 4) {
						ChestLocs.stdCh4(robot);
					    Thread.sleep(1000);
					    ChestLocs.claimPrize(robot);
					    i++;
					    rand_int1 = rand.nextInt(6);
					    Thread.sleep(300);					    
				}
				else if(rand_int1 == 5) {
						ChestLocs.stdCh5(robot);
					    Thread.sleep(1000);
					    ChestLocs.claimPrize(robot);
					    i++;
					    rand_int1 = rand.nextInt(6);
					    Thread.sleep(300);				   
				}
				else if(rand_int1 == 0) {   
					rand_int1 = rand.nextInt(6);	    
				}
			}
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;	
		}
	}
	
	public static void goneAdventRun(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of prize claims
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		
		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.goneAdventLoc(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void crystal1Run(Robot robot, int testrun, String shardPos, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		String shard = shardPos;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        RingOfShardsLocs.crystalPos1(robot);
		        Thread.sleep(1000);
		        switch (shard) {
		        case "Shard 1":
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 2":
		        	RingOfShardsLocs.shardPos2(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 3":
		        	RingOfShardsLocs.shardPos3(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 4":
		        	RingOfShardsLocs.shardPos4(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 5":
		        	RingOfShardsLocs.shardPos5(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        default:
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        }
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
		
	}
	
	public static void crystal2Run(Robot robot, int testrun, String shardPos, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		String shard = shardPos;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        RingOfShardsLocs.crystalPos2(robot);
		        Thread.sleep(1000);
		        switch (shard) {
		        case "Shard 1":
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 2":
		        	RingOfShardsLocs.shardPos2(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 3":
		        	RingOfShardsLocs.shardPos3(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 4":
		        	RingOfShardsLocs.shardPos4(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 5":
		        	RingOfShardsLocs.shardPos5(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        default:
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        }
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void crystal3Run(Robot robot, int testrun, String shardPos, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		String shard = shardPos;
		
		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        RingOfShardsLocs.crystalPos3(robot);
		        Thread.sleep(1000);
		        switch (shard) {
		        case "Shard 1":
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 2":
		        	RingOfShardsLocs.shardPos2(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 3":
		        	RingOfShardsLocs.shardPos3(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 4":
		        	RingOfShardsLocs.shardPos4(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(600);
		        	break;
		        case "Shard 5":
		        	RingOfShardsLocs.shardPos5(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        default:
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        }
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void crystal4Run(Robot robot, int testrun, String shardPos, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		String shard = shardPos;
		
		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        RingOfShardsLocs.crystalPos4(robot);
		        Thread.sleep(1000);
		        switch (shard) {
		        case "Shard 1":
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 2":
		        	RingOfShardsLocs.shardPos2(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 3":
		        	RingOfShardsLocs.shardPos3(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 4":
		        	RingOfShardsLocs.shardPos4(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 5":
		        	RingOfShardsLocs.shardPos5(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        default:
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        }
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void crystal5Run(Robot robot, int testrun, String shardPos, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		String shard = shardPos;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        RingOfShardsLocs.crystalPos5(robot);
		        Thread.sleep(1000);
		        switch (shard) {
		        case "Shard 1":
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 2":
		        	RingOfShardsLocs.shardPos2(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 3":
		        	RingOfShardsLocs.shardPos3(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 4":
		        	RingOfShardsLocs.shardPos4(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        case "Shard 5":
		        	RingOfShardsLocs.shardPos5(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        default:
		        	RingOfShardsLocs.shardPos1(robot);
		        	Thread.sleep(1000);
		        	RingOfShardsLocs.shardClaimPos(robot);
		        	Thread.sleep(400);
		        	break;
		        }
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chestCerberus1Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.rushCh1(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chestCerberus2Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 2 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.rushCh2(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chestCerberus3Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 3 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.rushCh3(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chestBubbling1Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.bubblingCh1(robot);
		        Thread.sleep(2000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chestBubbling2Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 2 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.bubblingCh2(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(100);
			DebugProcs.clearInv(robot);
			Thread.sleep(100);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chestBubbling3Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 3 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.bubblingCh3(robot);
		        Thread.sleep(1000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void diamDozen1Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 3 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<totalRuns) {  
				
		        ChestLocs.diamondDozen1(robot);
		        Thread.sleep(400);
		        Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	            BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
	            File file = new File("C:\\screenshots\\screen-capture"+i+".png");
	            boolean status = ImageIO.write(bufferedImage, "png", file);
	            Thread.sleep(400);
		        ChestLocs.claimPrizeOld(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + i;
			i=0;
		}
	}
	
	public static void duty1Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.stdCh1(robot);
		        Thread.sleep(1000);
		        DebugProcs.listDutyItems(robot);
		        Thread.sleep(1200);
		        ChestLocs.claimDutyPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chestLootDuels1Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.lootDuelCh1(robot);
		        Thread.sleep(2000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void chestLootDuels2Run(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 2 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {        
		        ChestLocs.lootDuelCh2(robot);
		        Thread.sleep(2000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void slimeLevel1(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {  
		        ChestLocs.slayTheSlime(robot);
		        Thread.sleep(4000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void slimeLevel4(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		int feed = 0;
		int freeze = 0;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {    
				while(freeze < 3) {
					ChestLocs.slimeFeedHOI(robot);
					Thread.sleep(500);
			        freeze++;
				}
				while(feed < 1) {
					ChestLocs.slimeFeedKey(robot);
					Thread.sleep(2000);
			        ChestLocs.claimPrize(robot);
			        feed++;
				}
		        ChestLocs.slayTheSlime(robot);
		        Thread.sleep(4000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        feed = 0;
		        freeze = 0;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void slimeLevel7(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		int feed = 0;
		int freeze = 0;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {    
				while(freeze < 4) {
					ChestLocs.slimeFeedHOI(robot);
					Thread.sleep(500);
			        freeze++;
				}
				while(feed < 2) {
					ChestLocs.slimeFeedKey(robot);
					Thread.sleep(2000);
			        ChestLocs.claimPrize(robot);
			        feed++;
				}
		        ChestLocs.slayTheSlime(robot);
		        Thread.sleep(4000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        feed = 0;
		        freeze = 0;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void slimeLevel10(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		int feed = 0;
		int freeze = 0;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {  
				while(freeze < 6) {
					ChestLocs.slimeFeedHOI(robot);
					Thread.sleep(500);
			        freeze++;
				}
				while(feed < 3) {
					ChestLocs.slimeFeedKey(robot);
					Thread.sleep(2000);
			        ChestLocs.claimPrize(robot);
			        feed++;
				}
		        ChestLocs.slayTheSlime(robot);
		        Thread.sleep(4000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        feed = 0;
		        freeze = 0;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void slimeLevel13(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		int feed = 0;
		int freeze = 0;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {   
				while(freeze < 8) {
					ChestLocs.slimeFeedHOI(robot);
					Thread.sleep(500);
			        freeze++;
				}
				while(feed < 4) {
					ChestLocs.slimeFeedKey(robot);
					Thread.sleep(2000);
			        ChestLocs.claimPrize(robot);
			        feed++;
				}
		        ChestLocs.slayTheSlime(robot);
		        Thread.sleep(4000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        feed = 0;
		        freeze = 0;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void slimeLevel16(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		int feed = 0;
		int freeze = 0;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {   
				while(freeze < 10) {
					ChestLocs.slimeFeedHOI(robot);
					Thread.sleep(200);
			        freeze++;
				}
				while(feed < 5) {
					ChestLocs.slimeFeedKey(robot);
					Thread.sleep(1500);
			        ChestLocs.claimPrize(robot);
			        feed++;
				}
		        ChestLocs.slayTheSlime(robot);
		        Thread.sleep(2000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        feed = 0;
		        freeze = 0;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void crystalCapsules(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the gems on the interface
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 16 item intervals
			while(i<numChestsRun) {   
				ChestLocs.crystalCapsule1(robot);
				Thread.sleep(600);
				ChestLocs.claimPrizeOld(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule2(robot);
				Thread.sleep(600);
				ChestLocs.claimPrizeOld(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule3(robot);
				Thread.sleep(600);
				ChestLocs.claimPrizeOld(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule4(robot);
				Thread.sleep(600);
				ChestLocs.claimPrizeOld(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule5(robot);
				Thread.sleep(600);
				ChestLocs.claimPrizeOld(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule6(robot);
				Thread.sleep(600);
				ChestLocs.claimPrizeOld(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule7(robot);
				Thread.sleep(600);
				ChestLocs.claimPrizeOld(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule8(robot);
				Thread.sleep(600);
				ChestLocs.claimPrizeOld(robot);
				Thread.sleep(600);
				i = i+8;
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void crystalCapsulesRefresh(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the gems on the interface
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 16 item intervals
			while(i<numChestsRun) {   		       
				ChestLocs.crystalCapsule1(robot);
				Thread.sleep(600);
				ChestLocs.claimPrize(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule2(robot);
				Thread.sleep(600);
				ChestLocs.claimPrize(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule3(robot);
				Thread.sleep(600);
				ChestLocs.claimPrize(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule4(robot);
				Thread.sleep(600);
				ChestLocs.claimPrize(robot);
				Thread.sleep(600);
				ChestLocs.crystalReset(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule5(robot);
				Thread.sleep(600);
				ChestLocs.claimPrize(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule6(robot);
				Thread.sleep(600);
				ChestLocs.claimPrize(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule7(robot);
				Thread.sleep(600);
				ChestLocs.claimPrize(robot);
				Thread.sleep(600);
				ChestLocs.crystalCapsule8(robot);
				Thread.sleep(600);
				ChestLocs.claimPrize(robot);
				Thread.sleep(600);
				ChestLocs.crystalReset(robot);
				i++; 
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void doubleDragonRun(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {  
		        ChestLocs.doubleDragonCh1(robot);
		        Thread.sleep(4000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
	public static void catwalkRun(Robot robot, int testrun, int numChestsRun)throws IOException, 
	AWTException, InterruptedException{
		//Opens the user defined number of chest 1 locations
		int i = 0;
		int runs = 0;
		int totalRuns = testrun;
		

		while(runs<totalRuns){
			//Due to the Inv size limits this needs to be split in 20 item intervals
			while(i<numChestsRun) {  
		        ChestLocs.catwalkLoc(robot);
		        Thread.sleep(4000);
		        ChestLocs.claimPrize(robot);
		        i++;
		        Thread.sleep(300);
		    }
			DebugProcs.listInventory(robot);
			Thread.sleep(50);
			DebugProcs.clearInv(robot);
			Thread.sleep(50);
			MouseMovements.treasureHunterMenu(robot);
			Thread.sleep(50);
			MouseMovements.chestInterface(robot);
			runs = runs + numChestsRun;
			i=0;
		}
	}
	
}


