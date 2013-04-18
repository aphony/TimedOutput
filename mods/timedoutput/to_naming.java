package mods.timedoutput;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class to_naming {


	
	public static void init()
    { 
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button5Ticks), "1/4 Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button10Ticks), "1/2 Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button15Ticks), "3/4 Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button20Ticks), "One Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button40Ticks), "Two Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button60Ticks), "Three Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button80Ticks), "Four Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button100Ticks), "Five Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button200Ticks), "Ten Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button300Ticks), "Fifteen Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button400Ticks), "Twenty Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button500Ticks), "Twenty-Five Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button600Ticks), "Thirty Second Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button1200Ticks), "One Minute Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button6000Ticks), "Five Minute Signal Button");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.Button36000Ticks), "Thirty Minute Signal Button");

    }
		
}