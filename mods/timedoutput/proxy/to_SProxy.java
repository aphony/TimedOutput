package mods.timedoutput.proxy;

import java.io.File;

import mods.timedoutput.TimedOutput;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class to_SProxy 
implements IGuiHandler{
	
	@SidedProxy(clientSide = "mods.timedoutput.proxy.to_CProxy", serverSide = "mods.timedoutput.proxy.to_SProxy")
	public static to_SProxy proxy;

	public void registerRenderers(){


	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		return null;
	}



	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {

		return null;
	} 
	  
	  public String getCurrentLanguage() {
			return null;
		}

	  public File getTimeButtonBase() {
			return new File("./");
		}

		public static String getIconLocation(String TextureName)
		{
		return TimedOutput.MOD + ":" + TextureName;
		}

}