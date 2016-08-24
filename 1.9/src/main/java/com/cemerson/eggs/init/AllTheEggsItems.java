package com.cemerson.eggs.init;

import com.cemerson.eggs.Reference;
import com.cemerson.eggs.items.AllTheEggsItem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllTheEggsItems {
	
	public static AllTheEggsItem item_food_eggs_scrambled;
	public static AllTheEggsItem item_food_eggs_scrambled_cheese;
	public static AllTheEggsItem item_food_eggs_fried;
	public static AllTheEggsItem item_food_eggs_and_bacon;		
	public static AllTheEggsItem item_food_eggs_and_beef;
	public static AllTheEggsItem item_food_toast;
	public static AllTheEggsItem item_food_bread;
	public static AllTheEggsItem item_food_cheese;
	public static AllTheEggsItem item_food_eggs_sandwich;
	public static AllTheEggsItem item_food_eggs_sandwich_fried;
	public static AllTheEggsItem item_food_eggs_mushroom_omelette;
	// items
	// public static Item item_food_eggs_raw;
	
	public static void init(){			
		item_food_eggs_scrambled = (AllTheEggsItem) new AllTheEggsItem(7,1.0F,false,"Scrambled Eggs",true).setUnlocalizedName("item_food_eggs_scrambled").setRegistryName("item_food_eggs_scrambled").setMaxStackSize(8);
		item_food_eggs_scrambled_cheese = (AllTheEggsItem) new AllTheEggsItem(12,1.0F,false,"Cheesy Scrambled Eggs",true).setUnlocalizedName("item_food_eggs_scrambled_cheese").setRegistryName("item_food_eggs_scrambled_cheese").setMaxStackSize(8);
		item_food_eggs_fried = (AllTheEggsItem) new AllTheEggsItem(2,1.0F,false,"Fried Egg",false).setUnlocalizedName("item_food_eggs_fried").setRegistryName("item_food_eggs_fried").setMaxStackSize(16);;
		item_food_eggs_and_bacon = (AllTheEggsItem) new AllTheEggsItem(10,1.0F,false,"Scrambled Eggs and Bacon",true).setUnlocalizedName("item_food_eggs_and_bacon").setRegistryName("item_food_eggs_and_bacon").setMaxStackSize(8);		
		item_food_bread = (AllTheEggsItem) new AllTheEggsItem(2,1.0F,false,"Bread",false).setUnlocalizedName("item_food_bread").setRegistryName("item_food_bread").setMaxStackSize(64);
		item_food_eggs_and_beef = (AllTheEggsItem) new AllTheEggsItem(20,1.0F,false,"Scrambled Eggs and Beef",true).setUnlocalizedName("item_food_eggs_and_beef").setRegistryName("item_food_eggs_and_beef").setMaxStackSize(8);
		item_food_toast = (AllTheEggsItem) new AllTheEggsItem(2,1.0F,false,"Toast",false).setUnlocalizedName("item_food_toast").setRegistryName("item_food_toast").setMaxStackSize(64);
		item_food_eggs_sandwich = (AllTheEggsItem) new AllTheEggsItem(20,1.0F,false,"Scrambled Egg Sandwich",false).setUnlocalizedName("item_food_eggs_sandwich").setRegistryName("item_food_eggs_sandwich").setMaxStackSize(8);
		item_food_eggs_sandwich_fried = (AllTheEggsItem) new AllTheEggsItem(20,1.0F,false,"Fried Egg Sandwich",false).setUnlocalizedName("item_food_eggs_sandwich_fried").setRegistryName("item_food_eggs_sandwich_fried").setMaxStackSize(8);
		item_food_cheese = (AllTheEggsItem) new AllTheEggsItem(2,1.0F,false,"Cheese",false).setUnlocalizedName("item_food_cheese").setRegistryName("item_food_cheese").setMaxStackSize(64);		
		item_food_eggs_mushroom_omelette = (AllTheEggsItem) new AllTheEggsItem(20,1.0F,false,"Mushroom & Cheese Omelette",false).setUnlocalizedName("item_food_eggs_mushroom_omelette").setRegistryName("item_food_eggs_mushroom_omelette").setMaxStackSize(8);		
		
		
		// item_food_eggs_raw = (AllTheEggsItem) new AllTheEggsItem(1,1.0F,false,"Raw Eggs").setUnlocalizedName("item_food_eggs_raw").setRegistryName("item_food_eggs_raw").setMaxStackSize(64);
		
				

		// item_food_eggs_raw.addInformation(stack, playerIn, tooltip, advanced);
		// tooltips?
		// item_food_toast.addInformation(stack, playerIn, "Hello World", advanced);
			
	}
	
	public static void register(){
					
		GameRegistry.register(item_food_eggs_scrambled);
		GameRegistry.register(item_food_eggs_scrambled_cheese);
		GameRegistry.register(item_food_eggs_fried);
		GameRegistry.register(item_food_eggs_and_bacon);
		// GameRegistry.register(item_food_eggs_raw);
		GameRegistry.register(item_food_bread);
		GameRegistry.register(item_food_eggs_and_beef);
		GameRegistry.register(item_food_toast);
		GameRegistry.register(item_food_eggs_sandwich);
		GameRegistry.register(item_food_cheese);
		GameRegistry.register(item_food_eggs_mushroom_omelette);
		GameRegistry.register(item_food_eggs_sandwich_fried);
		
//		GameRegistry.addRecipe(new ItemStack(item_food_eggs_and_beef), new Object[]{" B ",
//																				 	 " R ",
//																				 	 "   ",
//																				 	 'R',item_food_eggs_raw, 
//																				 	 'B',Items.beef});		
		GameRegistry.addShapelessRecipe(new ItemStack(item_food_eggs_and_beef), 
				new Object[]{
						Items.egg,Items.egg,Items.egg,						
						Items.beef,
						Items.bowl});		
				
//		GameRegistry.addRecipe(new ItemStack(item_food_eggs_and_bacon), new Object[]{" P ",
//				  																 	 " R ",
//				  																 	 "   ",
//				  																 	 'R',item_food_eggs_raw, 
//				  																 	 'P',Items.porkchop});
		GameRegistry.addShapelessRecipe(new ItemStack(item_food_eggs_and_bacon), 
				new Object[]{
						Items.egg,Items.egg,Items.egg,
						Items.porkchop,
						Items.bowl});
		
		
//		GameRegistry.addRecipe(new ItemStack(item_food_eggs_sandwich), new Object[]{" T ",
//																			 	 	" E ",
//																			 	 	" T ",
//																			 	 	'E',item_food_eggs_raw, 
//																			 	 	'T',item_food_toast});
		GameRegistry.addShapelessRecipe(new ItemStack(item_food_eggs_sandwich), 
				new Object[]{
						Items.egg,
						item_food_toast,
						item_food_toast});
		
		GameRegistry.addShapelessRecipe(new ItemStack(item_food_eggs_sandwich_fried),
				new Object[]{
						item_food_eggs_fried,
						item_food_toast,
						item_food_toast});									
		
//		GameRegistry.addRecipe(new ItemStack(item_food_eggs_sandwich), new Object[]{" T ",
//																			 	 	" F ",
//																			 	 	" T ",
//																			 	 	'F',item_food_eggs_fried, 
//																			 	 	'T',item_food_toast});		
		
		GameRegistry.addShapelessRecipe(new ItemStack(item_food_eggs_mushroom_omelette), 
										new Object[]{
												Items.egg,
												Items.egg,
												Items.egg,
												item_food_cheese,
												Blocks.brown_mushroom});
//		GameRegistry.addRecipe(new ItemStack(item_food_eggs_mushroom_omelette), new Object[]{" E ",
//																					 	 	" C ",
//																					 	 	" R ",
//																					 	 	'E',Blocks.brown_mushroom, 
//																					 	 	'C',item_food_cheese,
//																					 	 	'R',item_food_eggs_raw});

//		GameRegistry.addShapelessRecipe(new ItemStack(item_food_eggs_scrambled), 
//				new Object[]{
//						new ItemStack(Items.egg,3),
//						Items.bowl});

		GameRegistry.addShapelessRecipe(new ItemStack(item_food_eggs_scrambled), 
				new Object[] { Items.egg,Items.egg,Items.egg,
							   Items.bowl});
		
		GameRegistry.addShapelessRecipe(new ItemStack(item_food_eggs_scrambled_cheese), 
				new Object[] { Items.egg,Items.egg,Items.egg,
							   Items.bowl,
							   item_food_cheese});								 		
		
//		GameRegistry.addRecipe(new ItemStack(item_food_eggs_scrambled), new Object[]{"   ",
//																				 	 " R ",
//																				 	 "   ",
//																				 	 'R',item_food_eggs_raw});
//
//		GameRegistry.addRecipe(new ItemStack(item_food_eggs_scrambled_cheese), new Object[]{" C  ",
//																				 	 " R ",
//																				 	 "   ",
//																				 	 'R',item_food_eggs_raw,
		//cheese w/yellow		
		GameRegistry.addShapelessRecipe(new ItemStack(item_food_cheese), 
				new Object[]{
						new ItemStack(Items.dye, 1, 11),
						Items.milk_bucket});
		
		//cheese w/white dye
		GameRegistry.addShapelessRecipe(new ItemStack(item_food_cheese), 
				new Object[]{
						new ItemStack(Items.dye, 1, 0),
						Items.milk_bucket});		
		
//		GameRegistry.addRecipe(new ItemStack(item_food_cheese,16), new Object[]{"   ",
//																		 	 " M ",
//																		 	 "   ",
//																		 	 'M',Items.milk_bucket});		
		
		
		// bread			
		GameRegistry.addRecipe(new ItemStack(item_food_bread,8), new Object[]{"WW ",
																			"WW ",
																			"   ",
																			'W',Items.wheat});
		
//		// raw eggs!
//		GameRegistry.addRecipe(new ItemStack(item_food_eggs_raw), new Object[]{"EEE",
//					 														   " B ",
//					 														   "   ", 
//					 														   'E',Items.egg,
//					 														   'B',Items.bowl});
		
		GameRegistry.addSmelting(Items.egg, new ItemStack(item_food_eggs_fried), 3.0F);
		GameRegistry.addSmelting(item_food_bread, new ItemStack(item_food_toast), 2.0F);
	}
	
	public static void registerRenders(){
		
		registerRender(item_food_eggs_scrambled);
		registerRender(item_food_eggs_scrambled_cheese);
		registerRender(item_food_eggs_fried);
		registerRender(item_food_eggs_and_bacon);
		// registerRender(item_food_eggs_raw);		
		registerRender(item_food_bread);
		registerRender(item_food_eggs_and_beef);
		registerRender(item_food_toast);
		registerRender(item_food_cheese);
		registerRender(item_food_eggs_sandwich);
		registerRender(item_food_eggs_mushroom_omelette);
		registerRender(item_food_eggs_sandwich_fried);
	}
	
	public static void registerRender(Item item){
				
		Minecraft.getMinecraft()
			.getRenderItem()
			.getItemModelMesher()
			.register(item, 0, new ModelResourceLocation(
					Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),
					"inventory"));		
		
		// in game food commands
		// /effect @p 17 2 255 (all gone!)
		// /effect @p 23 2 1.4 (all filled?)		
		
		//sausage eggs
		// bacon eggs
		// fried eggs
		// scrambled eggs
		// omelette
		// easter egg with dye
		// 
	}
	

}
