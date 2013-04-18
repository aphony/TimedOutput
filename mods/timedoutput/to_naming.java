package mods.timedoutput;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class to_naming {


	
	public static void init()
    { 
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button5Ticks), "5 Tick Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button10Ticks), "10 Tick Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button15Ticks), "15 Tick Signal Button");

    }
		
}