package com.HydroSimp.HydroGoodies.blocks;

import com.HydroSimp.HydroGoodies.Main;
import com.HydroSimp.HydroGoodies.init.ModBlocks;
import com.HydroSimp.HydroGoodies.init.ModItems;
import com.HydroSimp.HydroGoodies.util.IHazModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHazModel

{
	public BlockBase(String name, Material material )
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.CREATIVE_TAB);
		
		ModBlocks.BLOCKS.add(this);
		//if (this !=ModBlocks.DOOR1)
		//ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
