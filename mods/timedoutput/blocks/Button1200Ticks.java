package mods.timedoutput.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.timedoutput.TimedButtonBase7;
import net.minecraft.block.Block;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class Button1200Ticks extends TimedButtonBase7
{
    public Button1200Ticks(int par1)
    {
        super(par1, true);
    }
    

    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        return Block.blockGold.getBlockTextureFromSide(1);
    }
}
