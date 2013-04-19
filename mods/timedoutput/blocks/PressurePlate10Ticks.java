package mods.timedoutput.blocks;

import java.util.Iterator;
import java.util.List;

import mods.timedoutput.TimedPressurePlateBase;
import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class PressurePlate10Ticks extends TimedPressurePlateBase
{
    /** The mob type that can trigger this pressure plate. */
    private EnumMobType triggerMobType;

    public PressurePlate10Ticks(int par1, String par2Str, Material par3Material, EnumMobType par4EnumMobType)
    {
        super(par1, par2Str, par3Material);
        this.triggerMobType = par4EnumMobType;
    }

    @Override
    public int tickRate(World par1World)
    {
        return 10;
    }
    
    protected int func_94355_d(int par1)
    {
        return par1 > 0 ? 1 : 0;
    }

    protected int func_94350_c(int par1)
    {
        return par1 == 1 ? 10 : 0;
    }

    protected int func_94351_d(World par1World, int par2, int par3, int par4)
    {
        List list = null;


        if (this.triggerMobType == EnumMobType.players)
        {
            list = par1World.getEntitiesWithinAABB(EntityPlayer.class, this.func_94352_a(par2, par3, par4));
        }

        if (!list.isEmpty())
        {
            Iterator iterator = list.iterator();

            while (iterator.hasNext())
            {
                Entity entity = (Entity)iterator.next();

                if (!entity.doesEntityNotTriggerPressurePlate())
                {
                    return 10;
                }
            }
        }

        return 0;
    }
}
