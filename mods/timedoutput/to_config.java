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
		public static int ZeroDelayLampOffID = 1360;
		public static int ZeroDelayLampOnID = 1361;
		public static int DelayedLamp_10SecOffID = 1362;
		public static int DelayedLamp_10SecOnID = 1363;
		
	

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
		    ZeroDelayLampOffID = config.get("Lamps", "Zero Delay Lamp Off", 1360).getInt();
		    ZeroDelayLampOnID = config.get("Lamps", "Zero Delay Lamp On", 1361).getInt();
		    DelayedLamp_10SecOffID = config.get("Lamps", "10 Second Off Delay Lamp", 1362).getInt();
		    DelayedLamp_10SecOnID = config.get("Lamps", "10 Second On Delay Lamp", 1363).getInt();

		    
		    config.save();
	    } 
		  
		  public static void save()
		  {
		    config.save();
		  }

		  
	}