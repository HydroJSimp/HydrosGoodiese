package com.HydroSimp.HydroGoodies.items;

import com.HydroSimp.HydroGoodies.Main;
import com.HydroSimp.HydroGoodies.init.ModItems;
import com.HydroSimp.HydroGoodies.util.IHazModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHazModel {

	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.RegisterItemRenderer(this, 0, "inventory");
		
	}

}
