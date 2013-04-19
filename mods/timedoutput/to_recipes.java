package mods.timedoutput;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class to_recipes {

	public static void initRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button5Ticks), new ItemStack(Block.woodenButton));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button10Ticks), new ItemStack(TimedOutput.Button5Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button15Ticks), new ItemStack(TimedOutput.Button10Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button20Ticks), new ItemStack(TimedOutput.Button15Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button40Ticks), new ItemStack(TimedOutput.Button20Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button60Ticks), new ItemStack(TimedOutput.Button40Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button80Ticks), new ItemStack(TimedOutput.Button60Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button100Ticks), new ItemStack(TimedOutput.Button80Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(Block.woodenButton), new ItemStack(TimedOutput.Button100Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.ZeroDelayLampOff), new ItemStack(Block.redstoneLampActive));
		
	}

}
