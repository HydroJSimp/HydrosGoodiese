package com.HydroSimp.HydroGoodies;

import com.HydroSimp.HydroGoodies.proxy.CommonProxy;
import com.HydroSimp.HydroGoodies.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION  )
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	public static CreativeTabs CREATIVE_TAB = new CreativeTabs("tabHydroGoodies") {

	    @Override
	    public ItemStack getTabIconItem() {
	    return new ItemStack(Blocks.CONCRETE);
	    }

	};
}
