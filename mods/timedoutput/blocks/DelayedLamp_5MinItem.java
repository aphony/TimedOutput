package mods.timedoutput.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DelayedLamp_5MinItem extends ItemBlock {

	public DelayedLamp_5MinItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "DelayedLamp_5MinOff";
        case 1:return "DelayedLamp_5MinOn";
        default:return "DelayedLamp_5MinOff";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}

  
}
