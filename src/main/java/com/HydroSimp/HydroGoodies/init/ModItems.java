package com.HydroSimp.HydroGoodies.init;

import java.util.ArrayList;
import java.util.List;

import com.HydroSimp.HydroGoodies.items.ItemBase;
import com.HydroSimp.HydroGoodies.items.ItemFoodBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemDoor;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static Item TWINKIE = new ItemFoodBase("twinkie", 2, false);
	public static Item DOOR1 = new com.HydroSimp.HydroGoodies.items.ItemDoor("door1", ModBlocks.DOOR1);
}
