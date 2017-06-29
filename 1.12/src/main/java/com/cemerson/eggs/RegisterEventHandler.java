package com.cemerson.eggs;

import com.cemerson.eggs.init.AllTheEggsItems;

import jline.internal.Log;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegisterEventHandler {

	@SubscribeEvent
	public void registerModels(ModelRegistryEvent event) {

		
	}
	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		
		Log.info("**** EAT THE EGGS: RegisterEventHandler().registerItems()...");
		AllTheEggsItems.registerItems(event);		
			
	}
	
	@SubscribeEvent
	public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		
		Log.info("**** EAT THE EGGS: RegisterEventHandler().registerRecipes()...");
		
		AllTheEggsItems.registerRecipes(event);
			
	}	

//	@SubscribeEvent
//	public void registerBlocks(RegistryEvent.Register<Block> event) {
//		
//	}
//		
//	private ItemBlock[] blockItems;
//		
//	private void registerAll(RegistryEvent.Register<Block> event,Block... blocks ) {
//		
//	}
//
//	private void registerItem(Item item) {
//		// ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
//	}
//
//	private void registerBlock(Block block) {
//		// ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(),"inventory"));
//	}
	
}
