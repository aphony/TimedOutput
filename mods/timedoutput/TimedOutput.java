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
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

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
	public static Block Button200Ticks;
	public static Block Button300Ticks;
	public static Block Button400Ticks;
	public static Block Button500Ticks;
	public static Block Button600Ticks;
	public static Block Button1200Ticks;
	public static Block Button6000Ticks;
	public static Block Button36000Ticks;
	
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
		Button200Ticks = new mods.timedoutput.blocks.Button200Ticks(to_config.Button200TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button200Ticks");
		Button300Ticks = new mods.timedoutput.blocks.Button300Ticks(to_config.Button300TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button300Ticks");
		Button400Ticks = new mods.timedoutput.blocks.Button400Ticks(to_config.Button400TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button400Ticks");
		Button500Ticks = new mods.timedoutput.blocks.Button500Ticks(to_config.Button500TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button500Ticks");
		Button600Ticks = new mods.timedoutput.blocks.Button600Ticks(to_config.Button600TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button600Ticks");
		Button1200Ticks = new mods.timedoutput.blocks.Button1200Ticks(to_config.Button1200TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button1200Ticks");
		Button6000Ticks = new mods.timedoutput.blocks.Button6000Ticks(to_config.Button6000TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button6000Ticks");
		Button36000Ticks = new mods.timedoutput.blocks.Button36000Ticks(to_config.Button36000TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button36000Ticks");

		Item.itemsList[to_config.Button5TicksID] = new mods.timedoutput.blocks.Button5TicksItem(to_config.Button5TicksID-256).setUnlocalizedName("Button5Ticks");
		Item.itemsList[to_config.Button10TicksID] = new mods.timedoutput.blocks.Button10TicksItem(to_config.Button10TicksID-256).setUnlocalizedName("Button10Ticks");
		Item.itemsList[to_config.Button15TicksID] = new mods.timedoutput.blocks.Button15TicksItem(to_config.Button15TicksID-256).setUnlocalizedName("Button15Ticks");
		Item.itemsList[to_config.Button20TicksID] = new mods.timedoutput.blocks.Button20TicksItem(to_config.Button20TicksID-256).setUnlocalizedName("Button20Ticks");
		Item.itemsList[to_config.Button40TicksID] = new mods.timedoutput.blocks.Button40TicksItem(to_config.Button40TicksID-256).setUnlocalizedName("Button40Ticks");
		Item.itemsList[to_config.Button60TicksID] = new mods.timedoutput.blocks.Button60TicksItem(to_config.Button60TicksID-256).setUnlocalizedName("Button60Ticks");
		Item.itemsList[to_config.Button80TicksID] = new mods.timedoutput.blocks.Button80TicksItem(to_config.Button80TicksID-256).setUnlocalizedName("Button80Ticks");
		Item.itemsList[to_config.Button100TicksID] = new mods.timedoutput.blocks.Button100TicksItem(to_config.Button100TicksID-256).setUnlocalizedName("Button100Ticks");
		Item.itemsList[to_config.Button200TicksID] = new mods.timedoutput.blocks.Button200TicksItem(to_config.Button200TicksID-256).setUnlocalizedName("Button200Ticks");
		Item.itemsList[to_config.Button300TicksID] = new mods.timedoutput.blocks.Button300TicksItem(to_config.Button300TicksID-256).setUnlocalizedName("Button300Ticks");
		Item.itemsList[to_config.Button400TicksID] = new mods.timedoutput.blocks.Button400TicksItem(to_config.Button400TicksID-256).setUnlocalizedName("Button400Ticks");
		Item.itemsList[to_config.Button500TicksID] = new mods.timedoutput.blocks.Button500TicksItem(to_config.Button500TicksID-256).setUnlocalizedName("Button500Ticks");
		Item.itemsList[to_config.Button600TicksID] = new mods.timedoutput.blocks.Button600TicksItem(to_config.Button600TicksID-256).setUnlocalizedName("Button600Ticks");
		Item.itemsList[to_config.Button1200TicksID] = new mods.timedoutput.blocks.Button1200TicksItem(to_config.Button1200TicksID-256).setUnlocalizedName("Button1200Ticks");
		Item.itemsList[to_config.Button6000TicksID] = new mods.timedoutput.blocks.Button6000TicksItem(to_config.Button6000TicksID-256).setUnlocalizedName("Button6000Ticks");
		Item.itemsList[to_config.Button36000TicksID] = new mods.timedoutput.blocks.Button36000TicksItem(to_config.Button36000TicksID-256).setUnlocalizedName("Button36000Ticks");
		
	
	}


    
    

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
	
	}
}