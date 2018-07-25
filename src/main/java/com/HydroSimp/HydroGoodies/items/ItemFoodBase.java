package com.HydroSimp.HydroGoodies.items;

import com.HydroSimp.HydroGoodies.Main;
import com.HydroSimp.HydroGoodies.init.ModItems;
import com.HydroSimp.HydroGoodies.util.IHazModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemFoodBase extends ItemFood implements IHazModel {

	public ItemFoodBase(String name, int amount, boolean isWolfFood) {
		super(amount, isWolfFood);
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

