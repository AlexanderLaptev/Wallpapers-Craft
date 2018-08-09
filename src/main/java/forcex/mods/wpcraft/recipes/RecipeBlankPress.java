package forcex.mods.wpcraft.recipes;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.oredict.OreDictionary;
import forcex.mods.wpcraft.init.ModItems;

import javax.annotation.Nullable;

//FIXALL: replace any 'ItemStack = null' with ItemStack.EMPTY

public class RecipeBlankPress implements IRecipe
{

	@Override
	public boolean matches(InventoryCrafting inv, World worldIn)
	{
		int axeCount = 0;
		int plankCount = 0;
		for (int i = 0; i < inv.getSizeInventory(); ++i)
		{
			if (inv.getStackInSlot(i) == ItemStack.EMPTY)
			{
				continue;
			}
			if (inv.getStackInSlot(i).getItem() instanceof ItemAxe)
			{
				axeCount++;
			}

			if (Block.getBlockFromItem(inv.getStackInSlot(i).getItem()) instanceof BlockPlanks)
			{
				plankCount++;
			}
		}
		List<ItemStack> list = OreDictionary.getOres("plankWood");
		return axeCount == 1 && plankCount == 1;
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv)
	{
		ItemStack axeStack = ItemStack.EMPTY;
		ItemStack plankStack = ItemStack.EMPTY;
		int axeCount = 0;
		int plankCount = 0;

		// First we get the axe and ensure there is only one axe in the grid
		for (int i = 0; i < inv.getSizeInventory(); ++i)
		{
			if (inv.getStackInSlot(i) != ItemStack.EMPTY && inv.getStackInSlot(i).getItem() instanceof ItemAxe)
			{
				axeCount++;
				if (axeCount > 1)
				{
					return ItemStack.EMPTY;
				}
				axeStack = inv.getStackInSlot(i);
			}
		}

		// Now we ensure there is only 1 stack of planks in the grid
		for (int i = 0; i < inv.getSizeInventory(); ++i)
		{
			if (inv.getStackInSlot(i) != ItemStack.EMPTY && Block.getBlockFromItem(inv.getStackInSlot(i).getItem()) instanceof BlockPlanks)
			{
				plankCount++;
				if (plankCount > 1)
				{
					return ItemStack.EMPTY;
				}
				plankStack = inv.getStackInSlot(i);
			}
		}

		// ensure we have at least 1 axe and 1 plank
		if (axeStack == ItemStack.EMPTY || plankStack == ItemStack.EMPTY)
		{
			return ItemStack.EMPTY;
		}

		return new ItemStack(ModItems.PressBlank, 4);
	}

	@Override
	public boolean canFit(int width, int height)
	{
		return (width == 2) && (height == 2);
	}

	public int getRecipeSize()
	{
		return 2;
	}

	@Override
	public ItemStack getRecipeOutput()
	{
		return new ItemStack(ModItems.PressBlank, 4);
	}

	@Override
	public NonNullList<ItemStack> getRemainingItems(InventoryCrafting inv)
	{
		ItemStack[] remainingItems = new ItemStack[inv.getSizeInventory()];
		ItemStack axeStack = ItemStack.EMPTY;
		ItemStack newStack = ItemStack.EMPTY;
		ItemStack plankStack = ItemStack.EMPTY;
		for (int i = 0; i < inv.getSizeInventory(); ++i)
		{
			if (inv.getStackInSlot(i) != ItemStack.EMPTY && inv.getStackInSlot(i).getItem() instanceof ItemAxe)
			{
				axeStack = inv.getStackInSlot(i);
				int currentDamage = axeStack.getItemDamage();
				int maxDamage = axeStack.getMaxDamage();
				if (currentDamage + 1 < maxDamage)
				{
					newStack = axeStack.copy();
					newStack.setItemDamage(currentDamage + 1);
					remainingItems[i] = newStack;
				} else
				{
					axeStack = ItemStack.EMPTY;
				}
			}
			if (inv.getStackInSlot(i) != ItemStack.EMPTY && OreDictionary.getOres("plankWood").contains(inv.getStackInSlot(i).getItem()))
			{
				plankStack = inv.getStackInSlot(i);
				if (plankStack.getCount() > 1)
				{
					plankStack.shrink(1);
					remainingItems[i] = plankStack;
				} else
				{
					plankStack = ItemStack.EMPTY;
				}
			}
		}
		if (newStack == ItemStack.EMPTY && plankStack == ItemStack.EMPTY)
		{
			remainingItems = null;
		}
		return remainingItems != null ? NonNullList.from(ItemStack.EMPTY, remainingItems) : ForgeHooks.defaultRecipeGetRemainingItems(inv);
	}

	@Override
	public NonNullList<Ingredient> getIngredients()
	{
		return null;
	}

	@Override
	public boolean isDynamic()
	{
		return false;
	}

	@Override
	public String getGroup()
	{
		return null;
	}

	@Override
	public IRecipe setRegistryName(ResourceLocation name)
	{
		return null;
	}

	@Nullable
	@Override
	public ResourceLocation getRegistryName()
	{
		return null;
	}

	@Override
	public Class<IRecipe> getRegistryType()
	{
		return null;
	}
}
