package mods.timedoutput.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DelayedLamp_10SecItem extends ItemBlock {

	public DelayedLamp_10SecItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "DelayedLamp_10SecOff";
        case 1:return "DelayedLamp_10SecOn";
        default:return "DelayedLamp_10SecOff";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}

  
}
