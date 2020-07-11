package utilities;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import testhelpers.ArraySetupSystems;

//Class that handles the Regex methods to extract inventory data from the output file
public class ChestBalancingRegex {
		
		public static void chestInitRegex(String filename) throws IOException {
			//Tool to clean up debug console output 
			String path = "C:\\chest.txt";
			Boolean append_to_file = false;
			
			//Regex pattern to remove the Inv slot number
			String chestPattern = "(?<!1).(\\d.\\w+)";
			
			//Sets up file read and right
			FileInputStream fstream = new FileInputStream(filename);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			FileWriter write = new FileWriter( path , append_to_file);
			PrintWriter print_line = new PrintWriter( write );
			
			//String to read line from file into
			String strLine;
			
			//Pattern for Regex equation
			Pattern chestBalancePattern = Pattern.compile(chestPattern);		
		
			//Read File Line By Line, regex out mouse movements and write output to a new file
			while ((strLine = br.readLine()) != null)   {
				//Runs regex matcher 
				Matcher matcher = chestBalancePattern.matcher(strLine); 	 
				
				if(matcher.find()) {
					//writes only the data I want to file
					print_line.printf( "%s" + "%n", matcher.group(1));
					}
				else {
					//Ignores unwanted data
					}
				}
			br.close();
			print_line.close();
		}
		
		public static void dutyOfCareRegex(String filename) throws IOException {
			//Tool to clean up debug console output 
			String path = "C:\\dutyCare.txt";
			Boolean append_to_file = false;
			
			//Regex pattern to remove the Inv slot number
			String chestPattern = "(?<!1).(\\d.\\w+)";
			
			//Sets up file read and right
			FileInputStream fstream = new FileInputStream(filename);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			FileWriter write = new FileWriter( path , append_to_file);
			PrintWriter print_line = new PrintWriter( write );
			
			//String to read line from file into
			String strLine;
			
			//Pattern for Regex equation
			Pattern chestBalancePattern = Pattern.compile(chestPattern);		
		
			//Read File Line By Line, regex out mouse movements and write output to a new file
			while ((strLine = br.readLine()) != null)   {
				//Runs regex matcher 
				Matcher matcher = chestBalancePattern.matcher(strLine); 	 
				
				if(matcher.find()) {
					//writes only the data I want to file
					print_line.printf( "%s" + "%n", matcher.group(1));
					}
				else {
					//Ignores unwanted data
					}
				}
			br.close();
			print_line.close();
		}

		public static void chestFinalRegex(String filename, int numRuns) throws IOException {
			//Second regex to remove the x quantity identifier and writes to an excel file
						
			//Regex pattern to split the quantity from the item number
			String chestFinPattern = "(\\d{1,8}(?=x)).(\\w+)";
			
			//Sets up file read and right
			FileInputStream fstream = new FileInputStream(filename);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			//String to read line from file into
			String strLine;
			String result;
			int quan;
			int oddment;

			List <InventoryResults> inventRest = ArraySetupSystems.setupArray();
			
			List <ChestInventory> chestInvent =  new ArrayList<>();
			
			
			
			int i = 0;
			//Pattern for Regex equation
			Pattern chestFinalPattern = Pattern.compile(chestFinPattern);
			
			//Read File Line By Line, regex out mouse movements and write output to a new file
			while ((strLine = br.readLine()) != null)   {
				//Runs regex matcher
				Matcher matcher = chestFinalPattern.matcher(strLine);
				//Includes a switch/case system to get a sum of all of the xp items 
				if(matcher.find()) {
					//writes only the data I want to output
					result = matcher.group(2);
					
					switch(result) {
						case "wof_small_falling_star_agility":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_agility") {
									quan = InventoryResults.getQuantity();
									quan ++;
									InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_attack":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_attack") 
								{
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_constitution":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_constitution") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_construction":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_construction") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_cooking":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_cooking") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_crafting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_crafting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_defence":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_defence") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_divination":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_divination") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_dungeoneering":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_dungeoneering") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_farming":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_farming") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_firemaking":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_firemaking") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_fishing":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_fishing") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_fletching":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_fletching") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_herblore":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_herblore") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_hunter":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_hunter") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_invention":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_invention") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_magic":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_magic") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_mining":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_mining") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_prayer":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_prayer") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_prismatic":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_prismatic") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_ranged":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_ranged") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_runecrafting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_runecrafting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_slayer":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_slayer") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_smithing":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_smithing") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_strength":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_strength") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_summoning":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_summoning") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_thieving":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_thieving") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_small_falling_star_woodcutting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_small_falling_star_woodcutting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_agility":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_agility") {
									quan = InventoryResults.getQuantity();
									quan ++;
									InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_attack":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_attack") 
								{
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_constitution":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_constitution") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_construction":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_construction") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_cooking":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_cooking") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_crafting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_crafting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_defence":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_defence") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_divination":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_divination") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_dungeoneering":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_dungeoneering") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_farming":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_farming") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_firemaking":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_firemaking") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_fishing":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_fishing") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_fletching":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_fletching") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_herblore":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_herblore") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_hunter":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_hunter") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_invention":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_invention") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_magic":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_magic") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_mining":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_mining") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_prayer":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_prayer") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_prismatic":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_prismatic") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_ranged":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_ranged") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_runecrafting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_runecrafting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_slayer":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_slayer") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_smithing":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_smithing") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_strength":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_strength") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_summoning":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_summoning") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_thieving":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_thieving") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_medium_falling_star_woodcutting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_medium_falling_star_woodcutting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_agility":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_agility") {
										quan = InventoryResults.getQuantity();
										quan ++;
										InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_attack":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_attack") 
								{
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_constitution":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_constitution") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_construction":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_construction") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_cooking":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_cooking") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_crafting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_crafting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_defence":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_defence") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_falling_star_divination":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_divination") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_falling_star_dungeoneering":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_dungeoneering") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_falling_star_farming":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_farming") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_firemaking":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_firemaking") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_fishing":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_fishing") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_fletching":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_fletching") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_herblore":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_herblore") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_hunter":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_hunter") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_invention":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_invention") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_magic":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_magic") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_mining":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_mining") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_prayer":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_prayer") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_prismatic":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_prismatic") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_ranged":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_ranged") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_runecrafting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_runecrafting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_slayer":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_slayer") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_smithing":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_smithing") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_strength":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_strength") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_summoning":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_summoning") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_thieving":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_thieving") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_falling_star_woodcutting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_falling_star_woodcutting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_agility":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_agility") {
									quan = InventoryResults.getQuantity();
									quan ++;
									InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_attack":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_attack") 
								{
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_constitution":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_constitution") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_construction":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_construction") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_cooking":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_cooking") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_crafting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_crafting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_defence":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_defence") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_bright_falling_star_divination":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_divination") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_bright_falling_star_dungeoneering":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_dungeoneering") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_bright_falling_star_farming":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_farming") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_firemaking":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_firemaking") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_fishing":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_fishing") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_fletching":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_fletching") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_herblore":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_herblore") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_hunter":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_hunter") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_invention":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_invention") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_magic":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_magic") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_mining":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_mining") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_prayer":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_prayer") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_prismatic":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_prismatic") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_ranged":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_ranged") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_runecrafting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_runecrafting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_slayer":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_slayer") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_smithing":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_smithing") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_strength":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_strength") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_summoning":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_summoning") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_thieving":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_thieving") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_bright_falling_star_woodcutting":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_bright_falling_star_woodcutting") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_agility_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_agility_small") {
									quan = InventoryResults.getQuantity();
									quan ++;
									InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_attack_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_attack_small") 
								{
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_constitution_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_constitution_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_construction_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_construction_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_cooking_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_cooking_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_crafting_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_crafting_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_defence_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_defence_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_lamp_divination_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_divination_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_lamp_dungeoneering_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_dungeoneering_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_lamp_farming_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_farming_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_firemaking_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_firemaking_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_fishing_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_fishing_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_fletching_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_fletching_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_herblore_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_herblore_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_hunter_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_hunter_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_invention_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_invention_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_magic_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_magic_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_mining_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_mining_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_prayer_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_prayer_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_prismatic_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_prismatic_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_ranged_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_ranged_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_runecraft_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_runecraft_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_slayer_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_slayer_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_smithing_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_smithing_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_strength_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_strength_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_summoning_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_summoning_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_thieving_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_thieving_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_woodcutting_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_woodcutting_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_agility_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_agility_medium") {
									quan = InventoryResults.getQuantity();
									quan ++;
									InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_attack_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_attack_medium") 
								{
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_constitution_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_constitution_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_construction_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_construction_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_cooking_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_cooking_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_crafting_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_crafting_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_defence_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_defence_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_lamp_divination_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_divination_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_lamp_dungeoneering_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_dungeoneering_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
						
							}
							break;
						case "wof_lamp_farming_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_farming_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_firemaking_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_firemaking_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_fishing_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_fishing_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_fletching_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_fletching_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_herblore_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_herblore_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_hunter_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_hunter_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_invention_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_invention_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_magic_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_magic_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_mining_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_mining_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_prayer_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_prayer_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_prismatic_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_prismatic_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_ranged_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_ranged_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_runecraft_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_runecraft_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_slayer_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_slayer_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_smithing_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_smithing_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_strength_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_strength_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_summoning_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_summoning_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_thieving_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_thieving_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_woodcutting_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_woodcutting_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_agility_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_agility_large") {
									quan = InventoryResults.getQuantity();
									quan ++;
									InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_attack_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_attack_large") 
								{
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_constitution_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_constitution_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_construction_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_construction_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_cooking_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_cooking_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_crafting_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_crafting_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_defence_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_defence_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_divination_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_divination_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_dungeoneering_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_dungeoneering_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_farming_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_farming_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_firemaking_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_firemaking_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_fishing_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_fishing_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_fletching_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_fletching_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_herblore_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_herblore_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_hunter_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_hunter_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_invention_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_invention_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_magic_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_magic_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_mining_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_mining_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_prayer_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_prayer_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_prismatic_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_prismatic_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_ranged_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_ranged_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_runecraft_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_runecraft_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_slayer_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_slayer_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_smithing_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_smithing_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_strength_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_strength_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_summoning_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_summoning_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_thieving_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_thieving_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_woodcutting_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_woodcutting_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_agility_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_agility_huge") {
									quan = InventoryResults.getQuantity();
									quan ++;
									InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_attack_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_attack_huge") 
								{
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_constitution_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_constitution_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_construction_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_construction_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_cooking_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_cooking_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_crafting_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_crafting_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_defence_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_defence_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_divination_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_divination_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_dungeoneering_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_dungeoneering_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_farming_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_farming_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_firemaking_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_firemaking_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_fishing_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_fishing_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_fletching_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_fletching_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_herblore_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_herblore_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_hunter_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_hunter_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_invention_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_invention_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_magic_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_magic_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_mining_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_mining_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_prayer_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_prayer_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_prismatic_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_prismatic_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_ranged_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_ranged_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_runecraft_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_runecraft_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_slayer_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_slayer_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_smithing_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_smithing_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_strength_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_strength_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_summoning_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_summoning_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_thieving_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_thieving_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "wof_lamp_woodcutting_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof_lamp_woodcutting_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh32_epic_lamp_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh32_epic_lamp_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh32_epic_lamp_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh32_epic_lamp_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh32_epic_lamp_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh32_epic_lamp_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh32_epic_lamp_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh32_epic_lamp_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh92_lava_lantern_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh92_lava_lantern_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh92_lava_lantern_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh92_lava_lantern_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh92_lava_lantern_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh92_lava_lantern_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh92_lava_lantern_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh92_lava_lantern_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh114_double_lamp_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh114_double_lamp_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh114_double_lamp_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh114_double_lamp_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh114_double_lamp_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh114_double_lamp_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh114_double_lamp_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh114_double_lamp_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh108_celebration_lamp_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh108_celebration_lamp_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh108_celebration_lamp_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh108_celebration_lamp_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh108_celebration_lamp_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh108_celebration_lamp_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh108_celebration_lamp_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh108_celebration_lamp_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh154_bubbling_lamp_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh154_bubbling_lamp_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh154_bubbling_lamp_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh154_bubbling_lamp_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh154_bubbling_lamp_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh154_bubbling_lamp_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh154_bubbling_lamp_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh154_bubbling_lamp_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh163_lamp_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh163_lamp_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh163_lamp_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh163_lamp_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh163_lamp_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh163_lamp_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh163_lamp_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh163_lamp_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh155_angelic_lamp_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh155_angelic_lamp_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh155_angelic_lamp_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh155_angelic_lamp_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh155_angelic_lamp_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh155_angelic_lamp_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh155_angelic_lamp_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh155_angelic_lamp_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh121_super_star_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh121_super_star_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh121_super_star_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh121_super_star_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh121_super_star_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh121_super_star_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh121_super_star_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh121_super_star_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh35_small_meteor_bonus_xp":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh35_small_meteor_bonus_xp") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh35_medium_meteor_bonus_xp":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh35_medium_meteor_bonus_xp") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh35_large_meteor_bonus_xp":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh35_large_meteor_bonus_xp") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh35_huge_meteor_bonus_xp":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh121_super_star_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh35_small_meteor_direct_xp":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh35_small_meteor_direct_xp") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh35_medium_meteor_direct_xp":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh35_medium_meteor_direct_xp") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh35_large_meteor_direct_xp":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh35_large_meteor_direct_xp") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh35_huge_meteor_direct_xp":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh35_huge_meteor_direct_xp") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh159_celestial_lantern_lower_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh159_celestial_lantern_lower_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh159_celestial_lantern_lower_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh159_celestial_lantern_lower_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh159_celestial_lantern_lower_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh159_celestial_lantern_lower_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh159_celestial_lantern_lower_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh159_celestial_lantern_lower_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh159_celestial_lantern_higher_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh159_celestial_lantern_higher_small") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh159_celestial_lantern_higher_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh159_celestial_lantern_higher_medium") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh159_celestial_lantern_higher_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh159_celestial_lantern_higher_large") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
								}
							}
							break;
						case "trh159_celestial_lantern_higher_huge":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh159_celestial_lantern_higher_huge") {
						            quan = InventoryResults.getQuantity();
						            quan ++;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh120_relic":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh120_relic") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh125_currency":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh125_currency") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "coins":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "coins") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh15_protean_bar":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh15_protean_bar") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh43_protean_hide":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh43_protean_hide") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh34_protean_trap":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh34_protean_trap") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh52_protean_logs":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh52_protean_logs") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "wof58_protean_plank":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "wof58_protean_plank") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh111_protean_cog":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh111_protean_cog") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh91_protean_memory":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh91_protean_memory") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh23_dummy_crate_small":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh23_dummy_crate_small") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh23_dummy_crate_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh23_dummy_crate_medium") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh23_dummy_crate_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh23_dummy_crate_large") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh_skill_dummy_crate_medium":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh_skill_dummy_crate_medium") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh_skill_dummy_crate_large":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh_skill_dummy_crate_large") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh77_thieving_dummy":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh77_thieving_dummy") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh96_hunting_dummy":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh96_hunting_dummy") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh77_slayer_dummy":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh77_slayer_dummy") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh96_agility_dummy":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh96_agility_dummy") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh23_melee_dummy":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh23_melee_dummy") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh23_ranged_dummy":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh23_ranged_dummy") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						case "trh23_magic_dummy":
							for(InventoryResults InventoryResults : inventRest ) {
								if (InventoryResults.getItem() == "trh23_magic_dummy") {
						            quan = InventoryResults.getQuantity();
						            oddment = Integer.parseInt(matcher.group(1));
						            quan = quan + oddment;
						            InventoryResults.setQuantity(quan);
					            }
							}
							break;
						default:
							chestInvent.add(new ChestInventory(matcher.group(2),matcher.group(1)));
						}
					}
				else {
					//Ignores unwanted data
					}
			}	
				
			// new HSSFWorkbook() for generating `.xls` file
			Workbook workbook = new HSSFWorkbook();
	        // Create a Sheet
	        Sheet sheet = workbook.createSheet("Item Drops");
	        String[] columns = {"ITEM NAME", "QUANTITY"};

	        // Create a Row
	        Row headerRow = sheet.createRow(0);
	        
	        // Create header cells
	        for(i= 0; i < columns.length; i++) {
	            Cell cell = headerRow.createCell(i);
	            cell.setCellValue(columns[i]);
	        }
	        
	        int rowNum = 1;
	        
	        for(ChestInventory chestInventory : chestInvent ) {
	              if(chestInventory.item.contentEquals("treasure_potato")) {
	            	  
	              }
	              else {
	            	  Row row = sheet.createRow(rowNum++);
	            	  row.createCell(0).setCellValue(chestInventory.getItem());
		              row.createCell(1).setCellValue(chestInventory.getQuantity());
	              }
	        }

	        // Resize all columns to fit the content size
	        for( i = 0; i < columns.length; i++) {
	        	sheet.autoSizeColumn(i);
	        }
	        
	        Sheet resultSheet = workbook.createSheet("Results");
	        String[] resultColumns = {"ITEM NAME", "QUANTITY"};

	        // Create a Row
	        headerRow = resultSheet.createRow(0);
	        
	        // Create header cells
	        for(i= 0; i < resultColumns.length; i++) {
	            Cell cell = headerRow.createCell(i);
	            cell.setCellValue(resultColumns[i]);
	        }
	        
	        rowNum = 1;
	        
	        for(InventoryResults InventoryResults : inventRest ) {
	            
	          	Row row = resultSheet.createRow(rowNum++);
	          	row.createCell(0).setCellValue(InventoryResults.getItem());
		        row.createCell(1).setCellValue(InventoryResults.getQuantity());
	            
	     	}
	        
	        rowNum = 1;
	        
	        // Resize all columns to fit the content size
	        for( i = 0; i < resultColumns.length; i++) {
	        	sheet.autoSizeColumn(i);
	        }
	        // Write the output to a file
	        FileOutputStream fileOut = new FileOutputStream("C:\\chestRun"+java.time.LocalDate.now()+"_"+numRuns+"_runs.xls");
	        workbook.write(fileOut);
	        fileOut.close();

	        // Closing the workbook
	        workbook.close();
			br.close();	
		}
		
		public static void dutyRegex() throws IOException {
			//Second regex to remove the x quantity identifier and writes to an excel fire
			String filename = "C:\\output.txt";		
			
			//Regex pattern to split the quantity from the item number
			String dutyPrize1Pattern = "(trh_prize_obj_cat_alt_0) (.+?) (.+?) (.+?) (.+?) (.+?)";
			String dutyPrize2Pattern = "(trh_prize_obj_cat_alt_1) (.+?) (.+?) (.+?) (.+?) (.+?)";
			String dutyPrize3Pattern = "(trh_prize_obj_cat_alt_2) (.+?) (.+?) (.+?) (.+?) (.+?)";
			
			//Sets up file read and right
			FileInputStream fstream = new FileInputStream(filename);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			//String to read line from file into
			String strLine;
						
			List <ChestInventory> chestInvent =  new ArrayList<>();
			
			int i = 0;
			//Pattern for Regex equation
			Pattern Prize1Pattern = Pattern.compile(dutyPrize1Pattern);
			Pattern Prize2Pattern = Pattern.compile(dutyPrize2Pattern);
			Pattern Prize3Pattern = Pattern.compile(dutyPrize3Pattern);
			
			//Read File Line By Line, regex out mouse movements and write output to a new file
			while ((strLine = br.readLine()) != null)   {
				//Runs regex matcher
				Matcher matcher = Prize1Pattern.matcher(strLine);
				
				if(matcher.find()) {
					//writes only the data I want to output
					chestInvent.add(new ChestInventory(matcher.group(1),matcher.group(5)));
					}
				else {
					matcher = Prize2Pattern.matcher(strLine);
					if(matcher.find()) {
						//writes only the data I want to output
						chestInvent.add(new ChestInventory(matcher.group(1),matcher.group(5)));
						}
					else {
						
						matcher = Prize3Pattern.matcher(strLine);
						if(matcher.find()) {
							//writes only the data I want to output
							chestInvent.add(new ChestInventory(matcher.group(1),matcher.group(5)));
							chestInvent.add(new ChestInventory(" "," "));
							}
						else {
						}
					}
				}
			}	
			
			// new HSSFWorkbook() for generating `.xls` file
			Workbook workbook = new HSSFWorkbook();
	        // Create a Sheet
	        Sheet sheet = workbook.createSheet("Item Drops");
	        String[] columns = {"Prize Option", "Item ID"};

	        // Create a Row
	        Row headerRow = sheet.createRow(0);
	        
	        // Create header cells
	        for(i= 0; i < columns.length; i++) {
	            Cell cell = headerRow.createCell(i);
	            cell.setCellValue(columns[i]);
	        }
	        
	        int rowNum = 1;
	        
	        for(ChestInventory chestInventory : chestInvent ) {
	              if(chestInventory.item.contentEquals("treasure_potato")) {
	            	  
	              }
	              else {
	            	  Row row = sheet.createRow(rowNum++);
	            	  row.createCell(0).setCellValue(chestInventory.getItem());
		              row.createCell(1).setCellValue(chestInventory.getQuantity());
	              }
	        }

	        // Resize all columns to fit the content size
	        for( i = 0; i < columns.length; i++) {
	        	sheet.autoSizeColumn(i);
	        }
	        
	        // Write the output to a file
	        FileOutputStream fileOut = new FileOutputStream("C:\\DutyofCare"+java.time.LocalDate.now()+".xls");
	        workbook.write(fileOut);
	        fileOut.close();

	        // Closing the workbook
	        workbook.close();
			br.close();	
		}

		public static void yakRegex() throws IOException {
			//regex to remove unwanted data from yak output
			String path = "C:\\yakRun.txt";
			Boolean append_to_file = false;
			
			//Regex pattern to remove the Inv slot number
			String yakTask = "([Yak]\\w+).([Task]\\w+).([=]).(.*\\w+)";
			String yakProg ="(?=(is\\s.*)).(?!(for))";
			
			//Sets up file read and right
			FileInputStream fstream = new FileInputStream("C:\\output.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			FileWriter write = new FileWriter( path , append_to_file);
			PrintWriter print_line = new PrintWriter( write );
			
			//String to read line from file into
			String strLine;
			
			//Pattern for Regex equation
			Pattern yakTaskName = Pattern.compile(yakTask);	
			Pattern yakProgress = Pattern.compile(yakProg);
		
			//Read File Line By Line, regex out mouse movements and write output to a new file
			while ((strLine = br.readLine()) != null)   {
				//Runs regex matcher 
				Matcher matcher = yakTaskName.matcher(strLine); 	 
				
				if(matcher.find()) {
					//writes only the data I want to file
					print_line.printf( "%s", matcher.group(1));
					print_line.printf( "%s", matcher.group(2));
					print_line.printf( "%s", matcher.group(3));
					print_line.printf( "%s" + "%n", matcher.group(4));
					}
				else {
					Matcher matcher2 = yakProgress.matcher(strLine); 	 
					
					if(matcher2.find()) {
						//writes only the data I want to file
						print_line.printf( "%s" + "%n", matcher2.group(1));
						
						}
					else {
					}
					
					//Ignores unwanted data
					}
				}
			br.close();
			print_line.close();	
		}
		
		public static boolean itemCheckRegex(String filename, String itemName) throws IOException {
			
			String chestPattern = "(?<!1).(\\d.\\w+)";
			String strLine;
			Boolean result = false;
			
			//Sets up file read
			FileInputStream fstream = new FileInputStream(filename);
			DataInputStream in = new DataInputStream(fstream);
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			Pattern chestBalancePattern = Pattern.compile(chestPattern);
			
			while ((strLine = br.readLine()) != null)   {
      	      
				Matcher matcher = chestBalancePattern.matcher(strLine); 	 
					
				if(matcher.find()) {
					
					if(matcher.group(1).equalsIgnoreCase(itemName)) {
						result = true;	
					}
					
				}
				else {
						//Ignores unwanted data
						result = false;
				}
			}
	        
			br.close();
			return result;
		}
}





