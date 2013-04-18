package mods.timedoutput.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mods.timedoutput.TimedButtonBase;
import net.minecraft.block.Block;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class Button30Ticks extends TimedButtonBase
{
    public Button30Ticks(int par1)
    {
        super(par1, true);
    }
    
    @Override
    public int tickRate(World par1World)
    {
        return this.sensible ? 30 : 0;
    }
    @SideOnly(Side.CLIENT)

    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
    {
        return Block.cloth.getBlockTextureFromSide(4);
    }
}
