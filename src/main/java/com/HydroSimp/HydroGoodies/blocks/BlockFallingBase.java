package com.HydroSimp.HydroGoodies.blocks;

import com.HydroSimp.HydroGoodies.Main;
import com.HydroSimp.HydroGoodies.init.ModBlocks;
import com.HydroSimp.HydroGoodies.init.ModItems;
import com.HydroSimp.HydroGoodies.util.IHazModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockFallingBase extends BlockFalling implements IHazModel
{
    public BlockFallingBase(String name, Material material )
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.CREATIVE_TAB);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

    }
    @Override
    public void registerModels() 
    {
        Main.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}