package mods.timedoutput;

import mods.timedoutput.blocks.CarrierLamp;
import mods.timedoutput.blocks.DelayedLamp_5Min;
import mods.timedoutput.blocks.ZeroDelayLamp;
import mods.timedoutput.proxy.to_SProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneLight;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "TimedOutput", name = "TimedOutput", version = "0.1.5 Alpha", useMetadata = false)
@NetworkMod(channels = "TimedOutput", packetHandler = to_packetHandler.class,clientSideRequired = true, serverSideRequired = false)
public class TimedOutput 
{
	@Instance("TimedOutput")
	public static TimedOutput instance;

	public static final String MOD = "TimedOutput";
	public static final String MODtextures = "timedoutput";

	@SidedProxy(clientSide = "mods.timedoutput.proxy.to_CProxy", serverSide = "mods.timedoutput.proxy.to_SProxy")
	public static to_SProxy proxy;

	
	//Buttons
	public static Block Button5Ticks;
	public static Block Button10Ticks;
	public static Block Button15Ticks;
	public static Block Button20Ticks;
	public static Block Button40Ticks;
	public static Block Button60Ticks;
	public static Block Button80Ticks;
	public static Block Button100Ticks;
	public static Block ZeroDelayLampOff;
	public static Block ZeroDelayLampOn;
	public static Block DelayedLamp_5MinOff;
	public static Block DelayedLamp_5MinOn;
	public static Block CarrierLampOff;
	public static Block CarrierLampOn;
	
	
	@PreInit()
	
	public void preInit(FMLPreInitializationEvent event) {
		

		FMLLog.info("[TimedOutput] Loading Config");
		
		to_config.init();

		to_config.initialize(event.getSuggestedConfigurationFile());

		to_config.save(); 

		FMLLog.info("[TimedOutput] Config Loaded");
	}

	@Init
	public void load(FMLInitializationEvent event){
		proxy.registerRenderers();
		to_naming.init();
		to_recipes.initRecipes();
	}

	public static CreativeTabs TimedOutputTab = new TimedOutputTab(CreativeTabs.getNextID(), "Timed Output");

	{

		FMLLog.info("[TimedOutput] Adding Blocks");
		
		Button5Ticks = new mods.timedoutput.blocks.Button5Ticks(to_config.Button5TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button5Ticks");
		Button10Ticks = new mods.timedoutput.blocks.Button10Ticks(to_config.Button10TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button10Ticks");
		Button15Ticks = new mods.timedoutput.blocks.Button15Ticks(to_config.Button15TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button15Ticks");
		Button20Ticks = new mods.timedoutput.blocks.Button20Ticks(to_config.Button20TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button20Ticks");
		Button40Ticks = new mods.timedoutput.blocks.Button40Ticks(to_config.Button40TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button40Ticks");
		Button60Ticks = new mods.timedoutput.blocks.Button60Ticks(to_config.Button60TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button60Ticks");
		Button80Ticks = new mods.timedoutput.blocks.Button80Ticks(to_config.Button80TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button80Ticks");
		Button100Ticks = new mods.timedoutput.blocks.Button100Ticks(to_config.Button100TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button100Ticks");
	    ZeroDelayLampOff = new ZeroDelayLamp(to_config.ZeroDelayLampOffID, false).setHardness(0.3F).setResistance(1.0f).setCreativeTab(TimedOutput.TimedOutputTab).setUnlocalizedName("ZeroDelayLampOff");
	    ZeroDelayLampOn = new ZeroDelayLamp(to_config.ZeroDelayLampOnID, true).setHardness(0.3F).setResistance(1.0f).setCreativeTab(TimedOutput.TimedOutputTab).setUnlocalizedName("ZeroDelayLampOn");
	    DelayedLamp_5MinOff = new DelayedLamp_5Min(to_config.DelayedLamp_5MinOffID, false).setHardness(0.3F).setResistance(1.0f).setCreativeTab(TimedOutput.TimedOutputTab).setUnlocalizedName("DelayedLamp_5MinOff");
	    DelayedLamp_5MinOn = new DelayedLamp_5Min(to_config.DelayedLamp_5MinOnID, true).setHardness(0.3F).setResistance(1.0f).setCreativeTab(TimedOutput.TimedOutputTab).setUnlocalizedName("DelayedLamp_5MinOn");
	    CarrierLampOff = new CarrierLamp(to_config.CarrierLampOffID, false, true).setHardness(0.3F).setResistance(1.0f).setCreativeTab(TimedOutput.TimedOutputTab).setUnlocalizedName("CarrierLampOff");
	    CarrierLampOn = new CarrierLamp(to_config.CarrierLampOnID, true, true).setHardness(0.3F).setResistance(1.0f).setCreativeTab(TimedOutput.TimedOutputTab).setUnlocalizedName("CarrierLampOn");
	
		Item.itemsList[to_config.Button5TicksID] = new mods.timedoutput.blocks.Button5TicksItem(to_config.Button5TicksID-256).setUnlocalizedName("Button5Ticks");
		Item.itemsList[to_config.Button10TicksID] = new mods.timedoutput.blocks.Button10TicksItem(to_config.Button10TicksID-256).setUnlocalizedName("Button10Ticks");
		Item.itemsList[to_config.Button15TicksID] = new mods.timedoutput.blocks.Button15TicksItem(to_config.Button15TicksID-256).setUnlocalizedName("Button15Ticks");
		Item.itemsList[to_config.Button20TicksID] = new mods.timedoutput.blocks.Button20TicksItem(to_config.Button20TicksID-256).setUnlocalizedName("Button20Ticks");
		Item.itemsList[to_config.Button40TicksID] = new mods.timedoutput.blocks.Button40TicksItem(to_config.Button40TicksID-256).setUnlocalizedName("Button40Ticks");
		Item.itemsList[to_config.Button60TicksID] = new mods.timedoutput.blocks.Button60TicksItem(to_config.Button60TicksID-256).setUnlocalizedName("Button60Ticks");
		Item.itemsList[to_config.Button80TicksID] = new mods.timedoutput.blocks.Button80TicksItem(to_config.Button80TicksID-256).setUnlocalizedName("Button80Ticks");
		Item.itemsList[to_config.Button100TicksID] = new mods.timedoutput.blocks.Button100TicksItem(to_config.Button100TicksID-256).setUnlocalizedName("Button100Ticks");
		Item.itemsList[to_config.ZeroDelayLampOffID] = new mods.timedoutput.blocks.ZeroDelayLampItem(to_config.ZeroDelayLampOffID-256).setUnlocalizedName("ZeroDelayLampOff");
		Item.itemsList[to_config.ZeroDelayLampOnID] = new mods.timedoutput.blocks.ZeroDelayLampItem(to_config.ZeroDelayLampOnID-256).setUnlocalizedName("ZeroDelayLampOn");
		Item.itemsList[to_config.DelayedLamp_5MinOffID] = new mods.timedoutput.blocks.DelayedLamp_5MinItem(to_config.DelayedLamp_5MinOffID-256).setUnlocalizedName("DelayedLamp_5MinOff");
		Item.itemsList[to_config.DelayedLamp_5MinOnID] = new mods.timedoutput.blocks.DelayedLamp_5MinItem(to_config.DelayedLamp_5MinOnID-256).setUnlocalizedName("DelayedLamp_5MinOn");
		Item.itemsList[to_config.CarrierLampOffID] = new mods.timedoutput.blocks.CarrierLampItem(to_config.CarrierLampOffID-256).setUnlocalizedName("CarrierLampOff");
		Item.itemsList[to_config.CarrierLampOnID] = new mods.timedoutput.blocks.CarrierLampItem(to_config.CarrierLampOnID-256).setUnlocalizedName("CarrierLampOn");
	
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
	
	}
	
}