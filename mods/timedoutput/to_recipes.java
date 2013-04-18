package mods.timedoutput;

import mods.storemore.StoreMore;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class to_recipes {

	public static void initRecipes() {
		
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button5Ticks), new ItemStack(Block.woodenButton));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button10Ticks), new ItemStack(TimedOutput.Button5Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button15Ticks), new ItemStack(TimedOutput.Button10Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button20Ticks), new ItemStack(TimedOutput.Button15Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button25Ticks), new ItemStack(TimedOutput.Button20Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button30Ticks), new ItemStack(TimedOutput.Button25Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button35Ticks), new ItemStack(TimedOutput.Button30Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button40Ticks), new ItemStack(TimedOutput.Button35Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button45Ticks), new ItemStack(TimedOutput.Button40Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button50Ticks), new ItemStack(TimedOutput.Button45Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button55Ticks), new ItemStack(TimedOutput.Button50Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button60Ticks), new ItemStack(TimedOutput.Button55Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button65Ticks), new ItemStack(TimedOutput.Button60Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button70Ticks), new ItemStack(TimedOutput.Button65Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button75Ticks), new ItemStack(TimedOutput.Button70Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(TimedOutput.Button80Ticks), new ItemStack(TimedOutput.Button75Ticks));
		GameRegistry.addShapelessRecipe(new ItemStack(Block.woodenButton), new ItemStack(TimedOutput.Button80Ticks));
		
	}

}
