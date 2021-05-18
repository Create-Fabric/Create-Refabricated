package com.simibubi.create.content.contraptions.fluids.actors;

import com.simibubi.create.lib.lba.fluid.FluidStack;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FillingBySpout {

//	static RecipeWrapper wrapper = new RecipeWrapper(new ItemStackHandler(1));
	public static boolean canItemBeFilled(World world, ItemStack stack) {
//		wrapper.setInventorySlotContents(0, stack);
//		if (AllRecipeTypes.FILLING.find(wrapper, world)
//			.isPresent())
//			return true;
		return GenericItemFilling.canItemBeFilled(world, stack);
	}

	public static int getRequiredAmountForItem(World world, ItemStack stack, FluidStack availableFluid) {
//		wrapper.setInventorySlotContents(0, stack);
//		for (IRecipe/*<RecipeWrapper>*/ recipe : world.getRecipeManager()
//			.getRecipes(AllRecipeTypes.FILLING.getType(), wrapper, world)) {
//			FillingRecipe fillingRecipe = (FillingRecipe) recipe;
//			FluidIngredient requiredFluid = fillingRecipe.getRequiredFluid();
//			if (requiredFluid.test(availableFluid))
//				return requiredFluid.getRequiredAmount();
//		}
		return GenericItemFilling.getRequiredAmountForItem(world, stack, availableFluid);
	}

	public static ItemStack fillItem(World world, int requiredAmount, ItemStack stack, FluidStack availableFluid) {
		FluidStack toFill = (FluidStack) availableFluid.copy();
		toFill.setAmount(requiredAmount);

//		wrapper.setInventorySlotContents(0, stack);
//		for (IRecipe/*<RecipeWrapper>*/ recipe : world.getRecipeManager()
//			.getRecipes(AllRecipeTypes.FILLING.getType(), wrapper, world)) {
//			FillingRecipe fillingRecipe = (FillingRecipe) recipe;
//			FluidIngredient requiredFluid = fillingRecipe.getRequiredFluid();
//			if (requiredFluid.test(toFill)) {
//				List<ItemStack> results = fillingRecipe.rollResults();
//				availableFluid.shrink(requiredAmount);
//				stack.shrink(1);
//				return results.isEmpty() ? ItemStack.EMPTY : results.get(0);
//			}
//		}

		return GenericItemFilling.fillItem(world, requiredAmount, stack, availableFluid);
	}

}
