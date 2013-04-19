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
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.ZeroDelayLampOff), "Zero Delay Lamp");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.ZeroDelayLampOn), "Zero Delay Lamp");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.DelayedLamp_5MinOff), "5 Minute Off Delay Lamp");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.DelayedLamp_5MinOn), "5 Minute Off Delay Lamp");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.CarrierLampOff), "Carrier Lamp");
        LanguageRegistry.instance().addName(new ItemStack(TimedOutput.CarrierLampOn), "Carrier Lamp");

    }
		
}