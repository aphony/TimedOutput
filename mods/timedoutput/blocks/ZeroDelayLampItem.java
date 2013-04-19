package mods.timedoutput.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ZeroDelayLampItem extends ItemBlock {

	public ZeroDelayLampItem(int par1) {
		super(par1);
		setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack i){
        switch(i.getItemDamage()){
        case 0:return "ZeroDelayLampOff";
        case 1:return "ZeroDelayLampOn";
        default:return "ZeroDelayLampOff";
        }
	}
	public int getMetadata(int meta){
		return meta;
	
	}

  
}
