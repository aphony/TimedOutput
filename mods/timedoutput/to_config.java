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
		public static int PressurePlate5TicksID = 1358;
		public static int PressurePlate10TicksID = 1359;
		public static int PressurePlate15TicksID = 1360;
		public static int PressurePlate20TicksID = 1361;
		public static int PressurePlate40TicksID = 1362;
		public static int PressurePlate60TicksID = 1363;
		public static int PressurePlate80TicksID = 1364;
		public static int PressurePlate100TicksID = 1365;
		
	

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
		    PressurePlate5TicksID = config.get("Timed PressurePlates", "1/4 Second PressurePlate", 1358).getInt();
		    PressurePlate10TicksID = config.get("Timed PressurePlates", "1/2 Second PressurePlate", 1359).getInt();
		    PressurePlate15TicksID = config.get("Timed PressurePlates", "3/4 Second Second PressurePlate", 1360).getInt();
		    PressurePlate20TicksID = config.get("Timed PressurePlates", "One Second PressurePlate", 1361).getInt();
		    PressurePlate40TicksID = config.get("Timed PressurePlates", "Two Second PressurePlate", 1362).getInt();
		    PressurePlate60TicksID = config.get("Timed PressurePlates", "Three Second PressurePlate", 1363).getInt();
		    PressurePlate80TicksID = config.get("Timed PressurePlates", "Four Second PressurePlate", 1364).getInt();
		    PressurePlate100TicksID = config.get("Timed PressurePlates", "Five Second PressurePlate", 1365).getInt();

		    
		    config.save();
	    } 
		  
		  public static void save()
		  {
		    config.save();
		  }

		  
	}