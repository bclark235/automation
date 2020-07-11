package utilities;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.*;

//Class to take the PlayerWatch date downloaded from a webpage and cleans it up for use
public class PlayerWatchRegex {
	
	public static void fileFixer(String filename) throws IOException {
		
		//Tool to clean up playerwatch output to remove mouse movements with aims to use it to power a java robot
		String path = "C:\\software\\newPlayer.txt";
		Boolean append_to_file = false;
		String mouseMOPattern = "(MOUSE_MOVEMENT).(.*)\\w+";
		String mouseNAPattern = "(NATIVE_MOUSE_MOVEMENT).(.*)\\w+";
		String keyPRPattern = "(KEY_PRESS).(?:Key press on keyboard	DOWN).(.*)\\w+";
		String coordChPattern = "(COORD_CHANGE).(?:Player changed their coordinate).(.*)\\w+";
		String camChPattern = "(CAMERA_CHANGE).(?:Camera status changed).(.*)\\w+";
		String mouseCLPattern = "(MOUSE_CLICK).(?:Mouse button clicked).(.*)\\w+";
		String serverTRPattern = "(SERVER_TRIGGER).(?:Player triggered some server behaviour).(.*)\\w+";
		String routeTRPattern = "(ROUTE).(?:Player requested route to position).(.*)\\w+";

		FileInputStream fstream = new FileInputStream(filename);
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		FileWriter write = new FileWriter( path , append_to_file);
		PrintWriter print_line = new PrintWriter( write );
	
		String strLine;
	
		//Read File Line By Line, regex out mouse movements and write output to a new file
		while ((strLine = br.readLine()) != null)   {
			Pattern mousePattern = Pattern.compile(mouseMOPattern);
			Pattern nativeMousePattern = Pattern.compile(mouseNAPattern);
			Pattern keyPressPattern = Pattern.compile(keyPRPattern); 
			Pattern coordPattern = Pattern.compile(coordChPattern);
			Pattern camPattern = Pattern.compile(camChPattern);
			Pattern mouseClickPattern = Pattern.compile(mouseCLPattern);
			Pattern serverPattern = Pattern.compile(serverTRPattern);
			Pattern routePattern = Pattern.compile(routeTRPattern);
			
			Matcher matcher = mousePattern.matcher(strLine);  
			if(matcher.find()) {
				}
			else {
				matcher = nativeMousePattern.matcher(strLine); 
				if(matcher.find()) {	
				}
				else {
					matcher = keyPressPattern.matcher(strLine); 
					if(matcher.find()) {
						print_line.printf( "%s", matcher.group(1) + " ");
						print_line.printf( "%s" + "%n", matcher.group(2));			
					}
					else {
						matcher = coordPattern.matcher(strLine); 
						if(matcher.find()) {
							print_line.printf( "%s", matcher.group(1) + " ");
							print_line.printf( "%s" + "%n", matcher.group(2));
						}
						else {
								matcher = camPattern.matcher(strLine); 
								if(matcher.find()) {
									print_line.printf( "%s", matcher.group(1) + " ");
									print_line.printf( "%s" + "%n", matcher.group(2));
								}
								else {
									matcher = mouseClickPattern.matcher(strLine); 
									if(matcher.find()) {
										print_line.printf( "%s", matcher.group(1) + " ");
										print_line.printf( "%s" + "%n", matcher.group(2));
									}
									else {
										matcher = serverPattern.matcher(strLine); 
										if(matcher.find()) {
											print_line.printf( "%s", matcher.group(1) + " ");
											print_line.printf( "%s" + "%n", matcher.group(2));
											}					
										else {
											matcher = routePattern.matcher(strLine); 
											if(matcher.find()) {
												print_line.printf( "%s", matcher.group(1) + " ");
												print_line.printf( "%s" + "%n", matcher.group(2));
											}									
											else {
											}
										}
									}
								}
							}
						}
					}
				}
			}
		br.close();
		print_line.close();
	}
	
}

