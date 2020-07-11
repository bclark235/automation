package testhelpers;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

public class YakTrack {
	
	public static void yakTrackFullRun(Robot robot) throws IOException, 
	AWTException, InterruptedException{
		
		
	}
	
	public static void yakTrackTaskRun(Robot robot, String skillName, String yakTaskSelection, String yakTaskQuantity) throws IOException, 
	AWTException, InterruptedException{
		
		switch(skillName) {
			case "Agility":
				YakTrackSkillRun.yakAgilityRun(robot, yakTaskSelection,yakTaskQuantity);		
			break;
			case "Archaeology":
				YakTrackSkillRun.yakArchaeologyRun(robot, yakTaskSelection, yakTaskQuantity);			
			break;
			case "Construction":
  				YakTrackSkillRun.yakConstructionRun(robot, yakTaskSelection, yakTaskQuantity);			
  			break;
			case "Crafting":
  				YakTrackSkillRun.yakCraftingRun(robot, yakTaskSelection, yakTaskQuantity);
  			break;
			case "Cooking":
  				YakTrackSkillRun.yakCookingRun(robot, yakTaskSelection, yakTaskQuantity);		
  			break;
			case "Divination":
  				YakTrackSkillRun.yakDivinationRun(robot, yakTaskSelection, yakTaskQuantity);		
  			break;
			case "Dungeoneering":
  				YakTrackSkillRun.yakDungeoneeringRun(robot, yakTaskSelection, yakTaskQuantity);			
  			break;
			case "Farming":
  				YakTrackSkillRun.yakFarmingRun(robot, yakTaskSelection, yakTaskQuantity);			
  			break;
			case "Firemaking":
  				YakTrackSkillRun.yakFiremakingRun(robot, yakTaskSelection, yakTaskQuantity);		
  			break;
			case "Fishing":
  				YakTrackSkillRun.yakFishingRun(robot, yakTaskSelection, yakTaskQuantity);		
  			break;
			case "Fletching":
  				YakTrackSkillRun.yakFletchingRun(robot, yakTaskSelection, yakTaskQuantity);		
  			break;
			case "Herblore":
  				YakTrackSkillRun.yakHerbloreRun(robot, yakTaskSelection, yakTaskQuantity);			
  			break;
			case "Mining":
  				YakTrackSkillRun.yakMiningRun(robot, yakTaskSelection, yakTaskQuantity);		
  			break;
			case "Prayer":
  				YakTrackSkillRun.yakPrayerRun(robot, yakTaskSelection, yakTaskQuantity);		
  			break;
			case "Runecrafting":
  				YakTrackSkillRun.yakRunecraftingRun(robot, yakTaskSelection, yakTaskQuantity);			
  			break;
			case "Smelting":
  				YakTrackSkillRun.yakSmeltingRun(robot, yakTaskSelection, yakTaskQuantity);			
  			break;
			case "Smithing":
  				YakTrackSkillRun.yakSmithingRun(robot, yakTaskSelection, yakTaskQuantity);		
  			break;
			case "Summoning":
  				YakTrackSkillRun.yakSummoningRun(robot, yakTaskSelection, yakTaskQuantity);		
  			break;
			case "Thieving":
  				YakTrackSkillRun.yakThievingRun(robot, yakTaskSelection, yakTaskQuantity);			
  			break;
  			case "Woodcutting":
  				YakTrackSkillRun.yakWoodCuttingRun(robot, yakTaskSelection, yakTaskQuantity);			
  			break;
  			
		}
	}

}
