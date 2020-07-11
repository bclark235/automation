package automationUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Label;

import java.awt.AWTException;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

import automationTests.*;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;


public class chestRunUI {
	
		private Text txtEmail;
		private Text txtEmail2;
		private Text txtTask;
		private Text txtrDate;
		private Text txtrDate2;
		public String yakTaskSelection = "";
		public String yakTaskQuantity = "";
		  
		  /**
		   * Runs the application
		   */
		  public void run() {
		    Display display = new Display();
		    Shell shlChestOpeningTool = new Shell(display);
		    shlChestOpeningTool.setLayout(new FillLayout());
		    shlChestOpeningTool.setText("Automation Tools");
		    createContents(shlChestOpeningTool);
		    shlChestOpeningTool.open();
		    while (!shlChestOpeningTool.isDisposed()) {
		      if (!display.readAndDispatch()) {
		        display.sleep();
		      }
		    }
		    display.dispose();
		  }

		  /**
		   * Creates the contents
		   * 
		   * @param shell the parent shell
		   */
		  private void createContents(Shell shell) {
		    // Create the containing tab folder
		    final TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		    tabFolder.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));

		    // Create each tab and set its text, tool tip text and control
		    TabItem one = new TabItem(tabFolder, SWT.NONE);
		    one.setText("Chest Opening Tool");
		    one.setToolTipText("Treasure Hunter Balance Runs");
		    one.setControl(getTabOneControl(tabFolder));

		    TabItem two = new TabItem(tabFolder, SWT.NONE);
		    two.setText("Yak Track Tool");
		    two.setToolTipText("Yak Track Skills");
		    two.setControl(getTabTwoControl(tabFolder));

		    // Select the first tab (index is zero-based)
		    tabFolder.setSelection(0);
		  }

		  /**
		   * Gets the control for tab one
		   * 
		   * @param tabFolder the parent tab folder
		   * @return Control
		   */
		  private Control getTabOneControl(TabFolder tabFolder) {

		    // Create a composite and add four buttons to it
		    Composite composite = new Composite(tabFolder, SWT.NONE);
		    composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		    composite.setLayout(new FillLayout(SWT.VERTICAL));
		    
		    Composite compChestRun = new Composite(composite, SWT.NONE);
		    compChestRun.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
		    
		    Label lblTitle = new Label(compChestRun, SWT.NONE);
		    lblTitle.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblTitle.setFont(SWTResourceManager.getFont("Courier New", 28, SWT.BOLD));
			lblTitle.setAlignment(SWT.CENTER);
			lblTitle.setBounds(49, 10, 620, 66);
			lblTitle.setText("CHEST OPENING TOOL");
			
			//Email capture
			Label lblEmail = new Label(compChestRun, SWT.NONE);
			lblEmail.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblEmail.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblEmail.setBounds(127, 96, 165, 26);
			lblEmail.setText("Email Address:");
			
			txtEmail = new Text(compChestRun, SWT.BORDER);
			txtEmail.setToolTipText("Please enter your emaill address");
			txtEmail.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			txtEmail.setBounds(346, 92, 267, 26);
			
			//Branch Capture
			Label lblBranch = new Label(compChestRun, SWT.NONE);
			lblBranch.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblBranch.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblBranch.setBounds(127, 128, 165, 26);
			lblBranch.setText("Perforce Branch:");
			
			//Perforce branch list - will need to look at updating or getting the data dynamically
			Combo cmbBranch = new Combo(compChestRun, SWT.NONE);
			cmbBranch.setToolTipText("Select the Content Branch you want to test");
			cmbBranch.setItems(new String[] {"--local", "shadow_yak","RS2Content-372", "RS2Content-373", "RS2Content-374", 
					"RSP-5194b", "RSP-5201", "apprater_2", "archaeology", "art_leads", "blood_dyes", "bugfixes", 
					"charlie", "charlie-1", "clue_titles", "crs", "daily_challenge_rebalance", "diversity", 
					"engine_achievements", "farming120", "farming120_postrelease", "helpers", "intern_notes", 
					"lobby_rework", "main", "mobile_bvt", "mobile_dev", "mobile_interface_rework", "mobile_loginscreen", 
					"mobile_newtli", "mobile_shop", "mtx_initiatives", "mtx_maintenance", "mtxadvent2019", "mtxcrafting", 
					"mtxdec19", "mtxdec19_advent", "mtxfeb20", "mtxfeb20_trh168", "mtxfeb20_valentines", "mtxjan19_trh167", 
					"mtxjan20", "mtxjan20_bonfire", "mtxjan20_trh161", "mtxjan20_trh166_2", "mtxjan20_trh166_3", "mtxjan20_trh166_4", 
					"mtxmar20", "mtxnov19", "mtxnov19_trh166", "mtxoct19", "mtxpass", "mtxwinterchill", "nature_boss", "ninja_bugfixes", 
					"ninja_diango", "ninja_project4", "path_purge", "prem19", "pvm_hub", "quest_dm", "quest_vorago", "server_performance", 
					"slayer_log", "test-perforce", "test_andyc_rsp", "test_content_trial", "test_doctor", "test_elliot", "test_halo", 
					"test_harker1", "test_labcoat", "test_lojko", "test_maxm", "test_pi", "test_ryanm", "test_saj_highlights", 
					"test_saj_warmfixable_opts", "test_scott_dennison", "test_shrew", "test_tim", "test_training", "trh_dev", 
					"tut_island_ab", "uitutorial", "xmas2019", "zodiyak"});
			cmbBranch.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			cmbBranch.setBounds(346, 124, 267, 26);
			
			//TH Interface Capture
			Label lblintType = new Label(compChestRun, SWT.NONE);
			lblintType.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblintType.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblintType.setBounds(127, 192, 165, 26);
			lblintType.setText("Interface Type:");
			
			Combo cmbIntType = new Combo(compChestRun, SWT.NONE);
			cmbIntType.setToolTipText("Select the Chest Interface design");
			cmbIntType.setItems(new String[] {"Standard", "Gone Adventuring", "Ring of Shards", "Cerberus Rush", "Bubbling Lamps", "Duty of Care", "Loot Duels", "Diamond Dozen",
					"Slay the Slime", "Crystal Capsules", "Crystal Capsules - Refresh Run", "Cinder Cores", "Double Dragon", "Catwalk"});
			cmbIntType.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			cmbIntType.setBounds(346, 192, 267, 26);
			
			//Length of Run capture
			Label lblNumChests = new Label(compChestRun, SWT.NONE);
			lblNumChests.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblNumChests.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblNumChests.setBounds(127, 228, 170, 26);
			lblNumChests.setText("Total Chests:");
			
			Combo cmbNum = new Combo(compChestRun, SWT.NONE);
			cmbNum.setToolTipText("Please choose how many chests you want the tool to open");
			cmbNum.setItems(new String[] {"20", "40", "60", "80", "100", "200", "300", "500", "1000", "1500", "2000", "3000", "5000"});
			cmbNum.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			cmbNum.setBounds(346, 224, 267, 23);
			
			//Number of chests per run
			Label lblRunSet = new Label(compChestRun, SWT.NONE);
			lblRunSet.setText("Chests per Run:");
			lblRunSet.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblRunSet.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblRunSet.setBounds(127, 264, 170, 26);
			
			Combo cmbChestRun = new Combo(compChestRun, SWT.NONE);
			cmbChestRun.setToolTipText("Please choose how many chests you want the tool to open");
			cmbChestRun.setItems(new String[] {"2", "5", "10", "16", "20", "100", "1000"});
			cmbChestRun.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			cmbChestRun.setBounds(346, 260, 267, 26);
			
			//Runedate capture
			Label lblRDate = new Label(compChestRun, SWT.NONE);
			lblRDate.setText("Runedate:");
			lblRDate.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblRDate.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblRDate.setBounds(127, 160, 165, 26);
			
			txtrDate = new Text(compChestRun, SWT.BORDER);
			txtrDate.setToolTipText("Please enter the Runedate");
			txtrDate.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			txtrDate.setBounds(346, 160, 267, 26);
			
			Label lblSeperator = new Label(compChestRun, SWT.SEPARATOR | SWT.HORIZONTAL);
			lblSeperator.setBounds(127, 310, 486, 2);
			
			Label lblOptSett = new Label(compChestRun, SWT.NONE);
			lblOptSett.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblOptSett.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblOptSett.setBounds(256, 319, 196, 30);
			lblOptSett.setText("Optional Settings");
			
			//Chest position capture
			Label lblChestPos = new Label(compChestRun, SWT.NONE);
			lblChestPos.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblChestPos.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblChestPos.setBounds(127, 359, 170, 26);
			lblChestPos.setText("Chest Position:");
			
			Combo cmbChestPos = new Combo(compChestRun, SWT.NONE);
			cmbChestPos.setToolTipText("Which chest do you want to open");
			cmbChestPos.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			cmbChestPos.setItems(new String[] {"Position 1", "Position 2", "Position 3", "Position 4", "Position 5", "Random"});
			cmbChestPos.setBounds(346, 355, 267, 26);
			
			//Shard position capture 
			Label lblRingOfShards = new Label(compChestRun, SWT.NONE);
			lblRingOfShards.setText("Ring of Shards Settings");
			lblRingOfShards.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblRingOfShards.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblRingOfShards.setBounds(235, 391, 246, 30);
			
			Label lblShardPos = new Label(compChestRun, SWT.NONE);
			lblShardPos.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblShardPos.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblShardPos.setBounds(127, 428, 165, 26);
			lblShardPos.setText("Shard Position:");
			
			Combo cmbShard = new Combo(compChestRun, SWT.NONE);
			cmbShard.setToolTipText("Ring of Shards only");
			cmbShard.setItems(new String[] {"Shard 1", "Shard 2", "Shard 3", "Shard 4", "Shard 5"});
			cmbShard.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			cmbShard.setBounds(346, 428, 267, 26);
			
			//Slay the Slime Capture
			Label lblSlayTheSlime = new Label(compChestRun, SWT.NONE);
			lblSlayTheSlime.setText("Slay the Slime Settings");
			lblSlayTheSlime.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblSlayTheSlime.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblSlayTheSlime.setBounds(235, 473, 246, 30);
			
			Label lblSlimeLevel = new Label(compChestRun, SWT.NONE);
			lblSlimeLevel.setText("Slime Level");
			lblSlimeLevel.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblSlimeLevel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblSlimeLevel.setBounds(127, 509, 165, 26);
			
			Combo cmbSlime = new Combo(compChestRun, SWT.NONE);
			cmbSlime.setToolTipText("Slay the Slime only");
			cmbSlime.setItems(new String[] {"Slime Level 1", "Slime Level 4", "Slime Level 7", "Slime Level 10", "Slime Level 13", "Slime Level 16"});
			cmbSlime.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			cmbSlime.setBounds(346, 509, 267, 26);
			
			//Big button to start the test
			Button btnNewButton = new Button(compChestRun, SWT.BORDER);
			btnNewButton.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseDown(MouseEvent e) {
				}
				
				@Override
				public void mouseUp(MouseEvent e) {
					//Initializes variables to capture data from the interface
					String branchInput = "BRANCH:";
			        int numRunsInput;
			        int numChestsRun;
			        
			        String branch = cmbBranch.getText();
					String numberRun = cmbNum.getText();
					String position = cmbChestPos.getText();
					String chestIntType = cmbIntType.getText();
					String shardPosition = cmbShard.getText();
					String emailAddress = txtEmail.getText();
					String sLevel = cmbSlime.getText();
					String chestRun = cmbChestRun.getText();
					String rDate = txtrDate.getText();
					
					//Converts Number of Runs from String to Int
					numRunsInput = Integer.parseInt(numberRun);
					numChestsRun = Integer.parseInt(chestRun);
					//Concatenates the two strings together to match the values on the Rental Manager
					branchInput = branchInput + branch;
					
					//Try/Catch block to start the test running
					try {
						startRun.startRunChest(branchInput, numRunsInput, position, chestIntType, shardPosition, emailAddress, sLevel, numChestsRun, rDate);
						Thread.sleep(500);
						System.exit(0);
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (AWTException e1) {
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					} catch (AddressException e1) {
						e1.printStackTrace();
					} catch (MessagingException e1) {
						e1.printStackTrace();
					}
				}
			});
			
			btnNewButton.setFont(SWTResourceManager.getFont("Courier New", 32, SWT.BOLD));
			btnNewButton.setBounds(147, 553, 449, 123);
			btnNewButton.setText("START RUN");

		    return composite;
		  }

		  /**
		   * Gets the control for tab two
		   * 
		   * @param tabFolder the parent tab folder
		   * @return Control
		   */
		  private Control getTabTwoControl(TabFolder tabFolder) {
			  Composite composite = new Composite(tabFolder, SWT.NONE);
			  composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
			  composite.setLayout(new FillLayout(SWT.VERTICAL));
			    
			  Composite compChestRun = new Composite(composite, SWT.NONE);
			  compChestRun.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			    
			  Label lblTitle = new Label(compChestRun, SWT.NONE);
			  lblTitle.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			  lblTitle.setFont(SWTResourceManager.getFont("Courier New", 28, SWT.BOLD));
			  lblTitle.setAlignment(SWT.CENTER);
			  lblTitle.setBounds(49, 10, 620, 66);
			  lblTitle.setText("Yak Track Tools");
			  
			  //Email capture
			  Label lblEmail = new Label(compChestRun, SWT.NONE);
			  lblEmail.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			  lblEmail.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			  lblEmail.setBounds(107, 86, 165, 26);
			  lblEmail.setText("Email Address:");
				
			  txtEmail2 = new Text(compChestRun, SWT.BORDER);
			  txtEmail2.setToolTipText("Please enter your emaill address");
			  txtEmail2.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			  txtEmail2.setBounds(326, 82, 267, 26);
				
			  //Branch Capture
			  Label lblBranch = new Label(compChestRun, SWT.NONE);
			  lblBranch.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			  lblBranch.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			  lblBranch.setBounds(107, 118, 165, 26);
			  lblBranch.setText("Perforce Branch:");
				
			  //Perforce branch list - will need to look at updating or getting the data dynamically
			  Combo cmbBranch = new Combo(compChestRun, SWT.NONE);
			  cmbBranch.setToolTipText("Select the Content Branch you want to test");
			  cmbBranch.setItems(new String[] {"--local", "shadow_yak", "RS2Content-372", "RS2Content-373", "RS2Content-374", 
						"RSP-5194b", "RSP-5201", "apprater_2", "archaeology", "art_leads", "blood_dyes", "bugfixes", 
						"charlie", "charlie-1", "clue_titles", "crs", "daily_challenge_rebalance", "diversity", 
						"engine_achievements", "farming120", "farming120_postrelease", "helpers", "intern_notes", 
						"lobby_rework", "main", "mobile_bvt", "mobile_dev", "mobile_interface_rework", "mobile_loginscreen", 
						"mobile_newtli", "mobile_shop", "mtx_initiatives", "mtx_maintenance", "mtxadvent2019", "mtxcrafting", 
						"mtxdec19", "mtxdec19_advent", "mtxfeb20", "mtxfeb20_trh168", "mtxfeb20_valentines", "mtxjan19_trh167", 
						"mtxjan20", "mtxjan20_bonfire", "mtxjan20_trh161", "mtxjan20_trh166_2", "mtxjan20_trh166_3", "mtxjan20_trh166_4", 
						"mtxmar20", "mtxnov19", "mtxnov19_trh166", "mtxoct19", "mtxpass", "mtxwinterchill", "nature_boss", "ninja_bugfixes", 
						"ninja_diango", "ninja_project4", "path_purge", "prem19", "pvm_hub", "quest_dm", "quest_vorago", "server_performance", 
						"slayer_log", "test-perforce", "test_andyc_rsp", "test_content_trial", "test_doctor", "test_elliot", "test_halo", 
						"test_harker1", "test_labcoat", "test_lojko", "test_maxm", "test_pi", "test_ryanm", "test_saj_highlights", 
						"test_saj_warmfixable_opts", "test_scott_dennison", "test_shrew", "test_tim", "test_training", "trh_dev", 
						"tut_island_ab", "uitutorial", "xmas2019", "zodiyak"});
			  cmbBranch.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			  cmbBranch.setBounds(326, 114, 267, 26);
			  
			  //Runedate capture
			  Label lblRDate = new Label(compChestRun, SWT.NONE);
			  lblRDate.setText("Runedate:");
			  lblRDate.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			  lblRDate.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			  lblRDate.setBounds(107, 150, 165, 26);
				
			  txtrDate2 = new Text(compChestRun, SWT.BORDER);
			  txtrDate2.setToolTipText("Please enter the Runedate");
			  txtrDate2.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			  txtrDate2.setBounds(326, 150, 267, 26);
			  
			  Label lblPlayerLevel = new Label(compChestRun, SWT.NONE);
			  lblPlayerLevel.setText("Player Level:");
			  lblPlayerLevel.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			  lblPlayerLevel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			  lblPlayerLevel.setBounds(107, 182, 165, 26);
				
			  Combo cmbPlayerLevel = new Combo(compChestRun, SWT.NONE);
			  cmbPlayerLevel.setToolTipText("Select the Content Branch you want to test");
			  cmbPlayerLevel.setItems(new String[] {"1", "5", "50", "99"});
			  cmbPlayerLevel.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			  cmbPlayerLevel.setBounds(326, 182, 267, 26);
			
			//Yak track Task number capture
			Label lblYakTask = new Label(compChestRun, SWT.NONE);
			lblYakTask.setText("Yak Track Task Number:");
			lblYakTask.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblYakTask.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblYakTask.setBounds(107, 214, 220, 26);
			
			txtTask = new Text(compChestRun, SWT.BORDER);
			txtTask.setToolTipText("Please enter the task number");
			txtTask.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			txtTask.setBounds(340, 214, 252, 26);
			
			//Yak Track skill capture
			Label lblSkillType = new Label(compChestRun, SWT.NONE);
			lblSkillType.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblSkillType.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblSkillType.setBounds(107, 246, 220, 26);
			lblSkillType.setText("Yak Track Skill Type:");
			
			Combo cmbSkillType = new Combo(compChestRun, SWT.NONE);
			cmbSkillType.setToolTipText("Select the Skill you want to check");
			cmbSkillType.setItems(new String[] {"Agility", "Archaeology", "Construction", "Crafting", "Cooking", "Divination", "Dungeoneering", "Farming", "Firemaking", "Fishing", "Fletching", 
					"Herblore", "Mining", "Prayer", "Runecrafting", "Smelting", "Smithing", "Summoning", "Thieving", "Woodcutting"});
			cmbSkillType.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.NORMAL));
			cmbSkillType.setBounds(326, 246, 267, 26);
			
			//Yak Track Task Section Capture
			Label lblTaskVers = new Label(compChestRun, SWT.NONE);
			lblTaskVers.setText("Yak Track Task Option:");
			lblTaskVers.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			lblTaskVers.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
			lblTaskVers.setBounds(107, 283, 220, 26);
			
			Button btnRadioTaskA = new Button(compChestRun, SWT.RADIO);
			btnRadioTaskA.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			btnRadioTaskA.setBounds(340, 278, 102, 26);
			btnRadioTaskA.setText("Task A");
			
			btnRadioTaskA.addSelectionListener(new SelectionAdapter() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					Button source = (Button) e.getSource();
					if(source.getSelection()) {
						yakTaskSelection = "getvar runepass_task_progress_0";
						yakTaskQuantity = "getvar runepass_task_quantity_0";
					}
				}
			});
			
			Button btnRadioTaskB = new Button(compChestRun, SWT.RADIO);
			btnRadioTaskB.setText("Task B");
			btnRadioTaskB.setFont(SWTResourceManager.getFont("Courier New", 12, SWT.BOLD));
			btnRadioTaskB.setBounds(442, 278, 102, 26);
			
			btnRadioTaskB.addSelectionListener(new SelectionAdapter() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					Button source = (Button) e.getSource();
					if(source.getSelection()) {
						yakTaskSelection = "getvar runepass_task_progress_1";
						yakTaskQuantity = "getvar runepass_task_quantity_1";
					}
				}
			});
				
			//Big button to start the skill test
			Button btnSkillButton = new Button(compChestRun, SWT.BORDER);
			btnSkillButton.addMouseListener(new MouseAdapter() {
				
				@Override
				public void mouseDown(MouseEvent e) {
				}
				
				@Override
				public void mouseUp(MouseEvent e) {
					//Initializes variables to capture data from the interface
					String branchInput = "BRANCH:";
					
			        int taskNum;
			       			        
			        String branch = cmbBranch.getText();
					String emailAddress = txtEmail2.getText();
					String rDate = txtrDate2.getText();
					String skillName = cmbSkillType.getText();
					String taskNumber = txtTask.getText();
					String pLevel = cmbPlayerLevel.getText();
					
					
					//Converts Number of Runs from String to Int
					taskNum = Integer.parseInt(taskNumber);
										
					//Concatenates the two strings together to match the values on the Rental Manager
					branchInput = branchInput + branch;
					
					
					//Try/Catch block to start the test running
					try {
						startRun.startRunYakSingle(branchInput, emailAddress, taskNum, skillName, rDate, yakTaskSelection, pLevel, yakTaskQuantity);
						Thread.sleep(500);
						System.exit(0);
					} catch (IOException e1) {
						e1.printStackTrace();
					} catch (AWTException e1) {
						e1.printStackTrace();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					} catch (AddressException e1) {
						e1.printStackTrace();
					} catch (MessagingException e1) {
						e1.printStackTrace();
					}
				}
			});
				
			btnSkillButton.setFont(SWTResourceManager.getFont("Courier New", 32, SWT.BOLD));
			btnSkillButton.setBounds(121, 345, 460, 90);
			btnSkillButton.setText("START SKILL CHECK");
			
			
			
			  
			return composite;
		  }


		  /**
		   * The entry point for the application
		   * 
		   * @param args the command line arguments
		   */
		  public static void main(String[] args) {
			  new chestRunUI().run();
		  }
		}

