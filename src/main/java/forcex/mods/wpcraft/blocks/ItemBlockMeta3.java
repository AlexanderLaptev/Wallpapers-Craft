package forcex.mods.wpcraft.blocks;

import forcex.mods.wpcraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemBlockMeta3 extends ItemBlock {

    public ItemBlockMeta3(Block block) {
        super(block);
        if (!(block instanceof IMetaBlockName)) {
            throw new IllegalArgumentException(String.format("The given Block %s is not an instance of ISpecialBlockName!", block.getUnlocalizedName()));
        }
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
        this.setRegistryName(block.getRegistryName());
        this.setCreativeTab(Reference.MODTAB);
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
    {
        for(int i = 0; i < 16; i++)
        {
            ItemStack stack = new ItemStack(this, 1, i);

            if(stack != null && stack != ItemStack.EMPTY)
                items.add(stack);
        }
    }

    public int getMetadata(int damage)
    {
        return damage;
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return super.getUnlocalizedName(stack) + "_" + ((IMetaBlockName)this.block).getSpecialName(stack);
    }
}