package utilities;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class RegexTester {

	public static void main(String[] args) throws IOException {
		//Tool to clean up debug console output 
		//Second regex to remove the x quantity identifier and writes to an excel fire
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
	

	

}
