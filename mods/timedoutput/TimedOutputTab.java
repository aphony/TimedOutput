package mods.timedoutput;

import net.minecraft.creativetab.CreativeTabs;

public class TimedOutputTab extends CreativeTabs {
	public TimedOutputTab(int position,String tabID){
		super(position,tabID);
	}

	public String getTranslatedTabLabel()
	{
	return "Timed Output"; //the name that shows up in-game
	}

}