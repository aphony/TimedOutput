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
		public static int Button25TicksID = 1354;
		public static int Button30TicksID = 1355;
		public static int Button35TicksID = 1356;
		public static int Button40TicksID = 1357;
		public static int Button45TicksID = 1358;
		public static int Button50TicksID = 1359;
		public static int Button55TicksID = 1360;
		public static int Button60TicksID = 1361;
		public static int Button65TicksID = 1362;
		public static int Button70TicksID = 1363;
		public static int Button75TicksID = 1364;
		public static int Button80TicksID = 1365;
		
	

		public static void initialize(File file)
	    {
	        config = new Configuration(file); 
	        
		    Button5TicksID = config.get("Timed Buttons", "5 Tick Button", 1350).getInt();
		    Button10TicksID = config.get("Timed Buttons", "10 Tick Button", 1351).getInt();
		    Button10TicksID = config.get("Timed Buttons", "15 Tick Button", 1352).getInt();
		    Button20TicksID = config.get("Timed Buttons", "20 Tick Button", 1353).getInt();
		    Button25TicksID = config.get("Timed Buttons", "25 Tick Button", 1354).getInt();
		    Button30TicksID = config.get("Timed Buttons", "30 Tick Button", 1355).getInt();
		    Button35TicksID = config.get("Timed Buttons", "35 Tick Button", 1356).getInt();
		    Button40TicksID = config.get("Timed Buttons", "40 Tick Button", 1357).getInt();
		    Button45TicksID = config.get("Timed Buttons", "45 Tick Button", 1358).getInt();
		    Button50TicksID = config.get("Timed Buttons", "50 Tick Button", 1359).getInt();
		    Button55TicksID = config.get("Timed Buttons", "55 Tick Button", 1360).getInt();
		    Button60TicksID = config.get("Timed Buttons", "60 Tick Button", 1361).getInt();
		    Button65TicksID = config.get("Timed Buttons", "65 Tick Button", 1362).getInt();
		    Button70TicksID = config.get("Timed Buttons", "70 Tick Button", 1363).getInt();
		    Button75TicksID = config.get("Timed Buttons", "75 Tick Button", 1364).getInt();
		    Button80TicksID = config.get("Timed Buttons", "80 Tick Button", 1365).getInt();

		    
		    config.save();
	    } 
		  
		  public static void save()
		  {
		    config.save();
		  }

		  
	}