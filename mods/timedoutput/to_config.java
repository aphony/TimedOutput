package mods.timedoutput;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class to_config 

{

public static void init() {
} 

	public static Configuration config; 
	
		
		public static int Button5TicksID = 1350;
		public static int Button10TicksID = 1351;
		public static int Button15TicksID = 1352;
		public static int Button20TicksID = 1353;
		public static int Button40TicksID = 1354;
		public static int Button60TicksID = 1355;
		public static int Button80TicksID = 1356;
		public static int Button100TicksID = 1357;
		public static int Button200TicksID = 1358;
		public static int Button300TicksID = 1359;
		public static int Button400TicksID = 1360;
		public static int Button500TicksID = 1361;
		public static int Button600TicksID = 1362;
		public static int Button1200TicksID = 1363;
		public static int Button6000TicksID = 1364;
		public static int Button36000TicksID = 1365;
		
	

		public static void initialize(File file)
	    {
	        config = new Configuration(file); 
	        
		    Button5TicksID = config.get("Timed Buttons", "1/4 Second Button", 1350).getInt();
		    Button10TicksID = config.get("Timed Buttons", "1/2 Second Button", 1351).getInt();
		    Button15TicksID = config.get("Timed Buttons", "3/4 Second Second Button", 1352).getInt();
		    Button20TicksID = config.get("Timed Buttons", "One Second Button", 1353).getInt();
		    Button40TicksID = config.get("Timed Buttons", "Two Second Button", 1354).getInt();
		    Button60TicksID = config.get("Timed Buttons", "Three Second Button", 1355).getInt();
		    Button80TicksID = config.get("Timed Buttons", "Four Second Button", 1356).getInt();
		    Button100TicksID = config.get("Timed Buttons", "Five Second Button", 1357).getInt();
		    Button200TicksID = config.get("Timed Buttons", "Ten Second Button", 1358).getInt();
		    Button300TicksID = config.get("Timed Buttons", "Fifteen Second Button", 1359).getInt();
		    Button400TicksID = config.get("Timed Buttons", "Twinty Second Button", 1360).getInt();
		    Button500TicksID = config.get("Timed Buttons", "Twenty-Five Second Button", 1361).getInt();
		    Button600TicksID = config.get("Timed Buttons", "Thirty Second Button", 1362).getInt();
		    Button1200TicksID = config.get("Timed Buttons", "One Minute Button", 1363).getInt();
		    Button6000TicksID = config.get("Timed Buttons", "Five Minute Button", 1364).getInt();
		    Button36000TicksID = config.get("Timed Buttons", "Thirty Minute Button", 1365).getInt();

		    
		    config.save();
	    } 
		  
		  public static void save()
		  {
		    config.save();
		  }

		  
	}