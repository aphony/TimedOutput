package mods.timedoutput;

import mods.timedoutput.proxy.to_SProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
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

@Mod(modid = "TimedOutput", name = "TimedOutput", version = "0.1.0 Alpha", useMetadata = false)
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
	public static Block Button25Ticks;
	public static Block Button30Ticks;
	public static Block Button35Ticks;
	public static Block Button40Ticks;
	public static Block Button45Ticks;
	public static Block Button50Ticks;
	public static Block Button55Ticks;
	public static Block Button60Ticks;
	public static Block Button65Ticks;
	public static Block Button70Ticks;
	public static Block Button75Ticks;
	public static Block Button80Ticks;
	
	@PreInit()
	public void preInit(FMLPreInitializationEvent event) {

		to_config.init();

		to_config.initialize(event.getSuggestedConfigurationFile());

		to_config.save(); 

	}

	@Init
	public void load(FMLInitializationEvent event){
		proxy.registerRenderers();
		to_naming.init();
		to_recipes.initRecipes();
	}

	public static CreativeTabs TimedOutputTab = new TimedOutputTab(CreativeTabs.getNextID(), "Timed Output");

	{

		Button5Ticks = new mods.timedoutput.blocks.Button5Ticks(to_config.Button5TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button5Ticks");
		Button10Ticks = new mods.timedoutput.blocks.Button10Ticks(to_config.Button10TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button10Ticks");
		Button15Ticks = new mods.timedoutput.blocks.Button15Ticks(to_config.Button15TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button15Ticks");
		Button20Ticks = new mods.timedoutput.blocks.Button20Ticks(to_config.Button20TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button20Ticks");
		Button25Ticks = new mods.timedoutput.blocks.Button25Ticks(to_config.Button25TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button25Ticks");
		Button30Ticks = new mods.timedoutput.blocks.Button30Ticks(to_config.Button30TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button30Ticks");
		Button35Ticks = new mods.timedoutput.blocks.Button35Ticks(to_config.Button35TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button35Ticks");
		Button40Ticks = new mods.timedoutput.blocks.Button40Ticks(to_config.Button40TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button40Ticks");
		Button45Ticks = new mods.timedoutput.blocks.Button45Ticks(to_config.Button45TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button45Ticks");
		Button50Ticks = new mods.timedoutput.blocks.Button50Ticks(to_config.Button50TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button50Ticks");
		Button55Ticks = new mods.timedoutput.blocks.Button55Ticks(to_config.Button55TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button55Ticks");
		Button60Ticks = new mods.timedoutput.blocks.Button60Ticks(to_config.Button60TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button60Ticks");
		Button65Ticks = new mods.timedoutput.blocks.Button65Ticks(to_config.Button65TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button65Ticks");
		Button70Ticks = new mods.timedoutput.blocks.Button70Ticks(to_config.Button70TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button70Ticks");
		Button75Ticks = new mods.timedoutput.blocks.Button75Ticks(to_config.Button75TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button75Ticks");
		Button80Ticks = new mods.timedoutput.blocks.Button80Ticks(to_config.Button80TicksID).setHardness(1.0f).setResistance(50.0f).setCreativeTab(TimedOutputTab).setUnlocalizedName("Button80Ticks");

		Item.itemsList[to_config.Button5TicksID] = new mods.timedoutput.blocks.Button5TicksItem(to_config.Button5TicksID-256).setUnlocalizedName("Button5Ticks");
		Item.itemsList[to_config.Button10TicksID] = new mods.timedoutput.blocks.Button10TicksItem(to_config.Button10TicksID-256).setUnlocalizedName("Button10Ticks");
		Item.itemsList[to_config.Button15TicksID] = new mods.timedoutput.blocks.Button15TicksItem(to_config.Button15TicksID-256).setUnlocalizedName("Button15Ticks");
		Item.itemsList[to_config.Button20TicksID] = new mods.timedoutput.blocks.Button20TicksItem(to_config.Button20TicksID-256).setUnlocalizedName("Button20Ticks");
		Item.itemsList[to_config.Button25TicksID] = new mods.timedoutput.blocks.Button25TicksItem(to_config.Button25TicksID-256).setUnlocalizedName("Button25Ticks");
		Item.itemsList[to_config.Button30TicksID] = new mods.timedoutput.blocks.Button30TicksItem(to_config.Button30TicksID-256).setUnlocalizedName("Button30Ticks");
		Item.itemsList[to_config.Button35TicksID] = new mods.timedoutput.blocks.Button35TicksItem(to_config.Button35TicksID-256).setUnlocalizedName("Button35Ticks");
		Item.itemsList[to_config.Button40TicksID] = new mods.timedoutput.blocks.Button40TicksItem(to_config.Button40TicksID-256).setUnlocalizedName("Button40Ticks");
		Item.itemsList[to_config.Button45TicksID] = new mods.timedoutput.blocks.Button45TicksItem(to_config.Button45TicksID-256).setUnlocalizedName("Button45Ticks");
		Item.itemsList[to_config.Button50TicksID] = new mods.timedoutput.blocks.Button50TicksItem(to_config.Button50TicksID-256).setUnlocalizedName("Button50Ticks");
		Item.itemsList[to_config.Button55TicksID] = new mods.timedoutput.blocks.Button55TicksItem(to_config.Button55TicksID-256).setUnlocalizedName("Button55Ticks");
		Item.itemsList[to_config.Button60TicksID] = new mods.timedoutput.blocks.Button60TicksItem(to_config.Button60TicksID-256).setUnlocalizedName("Button60Ticks");
		Item.itemsList[to_config.Button65TicksID] = new mods.timedoutput.blocks.Button65TicksItem(to_config.Button65TicksID-256).setUnlocalizedName("Button65Ticks");
		Item.itemsList[to_config.Button70TicksID] = new mods.timedoutput.blocks.Button70TicksItem(to_config.Button70TicksID-256).setUnlocalizedName("Button70Ticks");
		Item.itemsList[to_config.Button75TicksID] = new mods.timedoutput.blocks.Button75TicksItem(to_config.Button75TicksID-256).setUnlocalizedName("Button75Ticks");
		Item.itemsList[to_config.Button80TicksID] = new mods.timedoutput.blocks.Button80TicksItem(to_config.Button80TicksID-256).setUnlocalizedName("Button80Ticks");
		
	
	}


    
    

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
	
	}
}