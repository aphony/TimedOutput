package mods.timedoutput;

import mods.timedoutput.proxy.to_SProxy;
import net.minecraft.block.Block;
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
	public static Block PressurePlate5Ticks;
	public static Block PressurePlate10Ticks;
	public static Block PressurePlate15Ticks;
	public static Block PressurePlate20Ticks;
	public static Block PressurePlate40Ticks;
	public static Block PressurePlate60Ticks;
	public static Block PressurePlate80Ticks;
	public static Block PressurePlate100Ticks;
	
	
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
		PressurePlate5Ticks = new mods.timedoutput.blocks.PressurePlate5Ticks(to_config.PressurePlate5TicksID, null, null, null).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("PressurePlate5Ticks");
		PressurePlate10Ticks = new mods.timedoutput.blocks.PressurePlate10Ticks(to_config.PressurePlate10TicksID, null, null, null).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("PressurePlate10Ticks");
		PressurePlate15Ticks = new mods.timedoutput.blocks.PressurePlate15Ticks(to_config.PressurePlate15TicksID, null, null, null).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("PressurePlate15Ticks");
		PressurePlate20Ticks = new mods.timedoutput.blocks.PressurePlate20Ticks(to_config.PressurePlate20TicksID, null, null, null).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("PressurePlate20Ticks");
		PressurePlate40Ticks = new mods.timedoutput.blocks.PressurePlate40Ticks(to_config.PressurePlate40TicksID, null, null, null).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("PressurePlate40Ticks");
		PressurePlate60Ticks = new mods.timedoutput.blocks.PressurePlate60Ticks(to_config.PressurePlate60TicksID, null, null, null).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("PressurePlate60Ticks");
		PressurePlate80Ticks = new mods.timedoutput.blocks.PressurePlate80Ticks(to_config.PressurePlate80TicksID, null, null, null).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("PressurePlate80Ticks");
		PressurePlate100Ticks = new mods.timedoutput.blocks.PressurePlate100Ticks(to_config.PressurePlate100TicksID, null, null, null).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("PressurePlate100Ticks");

		Item.itemsList[to_config.Button5TicksID] = new mods.timedoutput.blocks.Button5TicksItem(to_config.Button5TicksID-256).setUnlocalizedName("Button5Ticks");
		Item.itemsList[to_config.Button10TicksID] = new mods.timedoutput.blocks.Button10TicksItem(to_config.Button10TicksID-256).setUnlocalizedName("Button10Ticks");
		Item.itemsList[to_config.Button15TicksID] = new mods.timedoutput.blocks.Button15TicksItem(to_config.Button15TicksID-256).setUnlocalizedName("Button15Ticks");
		Item.itemsList[to_config.Button20TicksID] = new mods.timedoutput.blocks.Button20TicksItem(to_config.Button20TicksID-256).setUnlocalizedName("Button20Ticks");
		Item.itemsList[to_config.Button40TicksID] = new mods.timedoutput.blocks.Button40TicksItem(to_config.Button40TicksID-256).setUnlocalizedName("Button40Ticks");
		Item.itemsList[to_config.Button60TicksID] = new mods.timedoutput.blocks.Button60TicksItem(to_config.Button60TicksID-256).setUnlocalizedName("Button60Ticks");
		Item.itemsList[to_config.Button80TicksID] = new mods.timedoutput.blocks.Button80TicksItem(to_config.Button80TicksID-256).setUnlocalizedName("Button80Ticks");
		Item.itemsList[to_config.Button100TicksID] = new mods.timedoutput.blocks.Button100TicksItem(to_config.Button100TicksID-256).setUnlocalizedName("Button100Ticks");
		Item.itemsList[to_config.PressurePlate5TicksID] = new mods.timedoutput.blocks.PressurePlate5TicksItem(to_config.PressurePlate5TicksID-256).setUnlocalizedName("PressurePlate5Ticks");
		Item.itemsList[to_config.PressurePlate10TicksID] = new mods.timedoutput.blocks.PressurePlate10TicksItem(to_config.PressurePlate10TicksID-256).setUnlocalizedName("PressurePlate10Ticks");
		Item.itemsList[to_config.PressurePlate15TicksID] = new mods.timedoutput.blocks.PressurePlate15TicksItem(to_config.PressurePlate15TicksID-256).setUnlocalizedName("PressurePlate15Ticks");
		Item.itemsList[to_config.PressurePlate20TicksID] = new mods.timedoutput.blocks.PressurePlate20TicksItem(to_config.PressurePlate20TicksID-256).setUnlocalizedName("PressurePlate20Ticks");
		Item.itemsList[to_config.PressurePlate40TicksID] = new mods.timedoutput.blocks.PressurePlate40TicksItem(to_config.PressurePlate40TicksID-256).setUnlocalizedName("PressurePlate40Ticks");
		Item.itemsList[to_config.PressurePlate60TicksID] = new mods.timedoutput.blocks.PressurePlate60TicksItem(to_config.PressurePlate60TicksID-256).setUnlocalizedName("PressurePlate60Ticks");
		Item.itemsList[to_config.PressurePlate80TicksID] = new mods.timedoutput.blocks.PressurePlate80TicksItem(to_config.PressurePlate80TicksID-256).setUnlocalizedName("PressurePlate80Ticks");
		Item.itemsList[to_config.PressurePlate100TicksID] = new mods.timedoutput.blocks.PressurePlate100TicksItem(to_config.PressurePlate100TicksID-256).setUnlocalizedName("PressurePlate100Ticks");
	
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
	
	}
	
}