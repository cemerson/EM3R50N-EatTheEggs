package com.cemerson.eggs;

import com.cemerson.eggs.init.AllTheEggsItems;
import com.cemerson.eggs.proxy.CommonProxy;

import jline.internal.Log;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AllTheEggs {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
//	@SubscribeEvent
//    public static void registerItems(RegistryEvent.Register<Item> event) {
//    	
//    	Log.trace("**** EAT THE EGGS: registerItems();...");    
//    	AllTheEggsItems.registerItems(event);
//    }
    	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){		
		
		// heal amt: x * 0.5 = heal amt (max 20)
		// saturation: 1.0F 0.2F (low) 0.5 half
		// eaten by wolf?
		
		MinecraftForge.EVENT_BUS.register(new RegisterEventHandler());
		
		AllTheEggsItems.init();
		AllTheEggsItems.register();
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		 proxy.registerRenders();
		 	 
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		 
	}	
}
