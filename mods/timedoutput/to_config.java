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
		
	

		public static void initialize(File file)
	    {
	        config = new Configuration(file); 
	        
		    Button5TicksID = config.get("Timed Buttons", "5 Tick Button", 1350).getInt();
		    Button10TicksID = config.get("Timed Buttons", "10 Tick Button", 1351).getInt();
		    Button15TicksID = config.get("Timed Buttons", "15 Tick Button", 1352).getInt();

		    
		    config.save();
	    } 
		  
		  public static void save()
		  {
		    config.save();
		  }

		  
	}