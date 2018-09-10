package com.cemerson.eggs.init;

import org.jline.utils.Log;

import com.cemerson.eggs.Reference;
import com.cemerson.eggs.items.AllTheEggsItem;
import com.cemerson.eggs.util.CraftingHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;


// import net.minecraftforge.common.crafting.CraftingHelper;

// import jline.internal.Log;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
// 
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.minecraftforge.registries.IForgeRegistry;

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
	
	// cemesron 20180903 setUnlocalizedName() not mapped in forge src yet: func_77655_b
	// cemesron 20180903 setMaxStackSize() also not mapped yet
	
	public static void init(){		
		item_food_eggs_scrambled = (AllTheEggsItem) new AllTheEggsItem(7,1.0F,false,"Scrambled Eggs",true).func_77655_b("item_food_eggs_scrambled").setRegistryName("item_food_eggs_scrambled").func_77625_d(8);
		item_food_eggs_scrambled_cheese = (AllTheEggsItem) new AllTheEggsItem(12,1.0F,false,"Cheesy Scrambled Eggs",true).func_77655_b("item_food_eggs_scrambled_cheese").setRegistryName("item_food_eggs_scrambled_cheese").func_77625_d(8);
		item_food_eggs_fried = (AllTheEggsItem) new AllTheEggsItem(2,1.0F,false,"Fried Egg",false).func_77655_b("item_food_eggs_fried").setRegistryName("item_food_eggs_fried").func_77625_d(16);;
		item_food_eggs_and_bacon = (AllTheEggsItem) new AllTheEggsItem(10,1.0F,false,"Scrambled Eggs and Bacon",true).func_77655_b("item_food_eggs_and_bacon").setRegistryName("item_food_eggs_and_bacon").func_77625_d(8);		
		item_food_bread = (AllTheEggsItem) new AllTheEggsItem(2,1.0F,false,"Bread",false).func_77655_b("item_food_bread").setRegistryName("item_food_bread").func_77625_d(64);
		item_food_eggs_and_beef = (AllTheEggsItem) new AllTheEggsItem(20,1.0F,false,"Scrambled Eggs and Beef",true).func_77655_b("item_food_eggs_and_beef").setRegistryName("item_food_eggs_and_beef").func_77625_d(8);
		item_food_toast = (AllTheEggsItem) new AllTheEggsItem(2,1.0F,false,"Toast",false).func_77655_b("item_food_toast").setRegistryName("item_food_toast").func_77625_d(64);
		item_food_eggs_sandwich = (AllTheEggsItem) new AllTheEggsItem(20,1.0F,false,"Scrambled Egg Sandwich",false).func_77655_b("item_food_eggs_sandwich").setRegistryName("item_food_eggs_sandwich").func_77625_d(8);
		item_food_eggs_sandwich_fried = (AllTheEggsItem) new AllTheEggsItem(20,1.0F,false,"Fried Egg Sandwich",false).func_77655_b("item_food_eggs_sandwich_fried").setRegistryName("item_food_eggs_sandwich_fried").func_77625_d(8);
		item_food_cheese = (AllTheEggsItem) new AllTheEggsItem(2,1.0F,false,"Cheese",false).func_77655_b("item_food_cheese").setRegistryName("item_food_cheese").func_77625_d(64);		
		item_food_eggs_mushroom_omelette = (AllTheEggsItem) new AllTheEggsItem(20,1.0F,false,"Mushroom & Cheese Omelette",false).func_77655_b("item_food_eggs_mushroom_omelette").setRegistryName("item_food_eggs_mushroom_omelette").func_77625_d(8);		
		
		
		// item_food_eggs_raw = (AllTheEggsItem) new AllTheEggsItem(1,1.0F,false,"Raw Eggs").setUnlocalizedName("item_food_eggs_raw").setRegistryName("item_food_eggs_raw").setMaxStackSize(64);

			
	}
	
    
	public static void registerItems(RegistryEvent.Register<Item> event){

		Log.info("**** EAT THE EGGS: registerItems();..");
    	    
        final IForgeRegistry<Item> registry = event.getRegistry();
        
        final Item[] items = {item_food_eggs_scrambled, 
        		item_food_eggs_scrambled_cheese, 
        		item_food_eggs_fried, 
        		item_food_eggs_and_bacon,         		
        		item_food_bread, 
        		item_food_eggs_and_beef, 
        		item_food_toast, 
        		item_food_eggs_sandwich, 
        		item_food_cheese, 
        		item_food_eggs_mushroom_omelette, 
        		item_food_eggs_sandwich_fried};

        registry.registerAll(items);
		
		
	}
	
	public static void register(){
		
		Log.info("**** EAT THE EGGS: register();...");
		
//  	/* pre 1.12 method */		
//		GameRegistry.register(item_food_eggs_scrambled);
//		GameRegistry.register(item_food_eggs_scrambled_cheese);
//		GameRegistry.register(item_food_eggs_fried);
//		GameRegistry.register(item_food_eggs_and_bacon);
//		// GameRegistry.register(item_food_eggs_raw);
//		GameRegistry.register(item_food_bread);
//		GameRegistry.register(item_food_eggs_and_beef);
//		GameRegistry.register(item_food_toast);
//		GameRegistry.register(item_food_eggs_sandwich);
//		GameRegistry.register(item_food_cheese);
//		GameRegistry.register(item_food_eggs_mushroom_omelette);
//		GameRegistry.register(item_food_eggs_sandwich_fried);
		
	
//		CraftingHelper.addShapelessRecipe(new ItemStack(item_food_eggs_and_beef), 
//				new Object[]{
//						Items.EGG,Items.EGG,Items.EGG,						
//						Items.BEEF,
//						Items.BOWL});		
//				
//
//		CraftingHelper.addShapelessRecipe(new ItemStack(item_food_eggs_and_bacon), 
//				new Object[]{
//						Items.EGG,Items.EGG,Items.EGG,
//						Items.PORKCHOP,
//						Items.BOWL});
//		
//		
//		CraftingHelper.addShapelessRecipe(new ItemStack(item_food_eggs_sandwich), 
//				new Object[]{
//						Items.EGG,
//						item_food_toast,
//						item_food_toast});
//		
//		CraftingHelper.addShapelessRecipe(new ItemStack(item_food_eggs_sandwich_fried),
//				new Object[]{
//						item_food_eggs_fried,
//						item_food_toast,
//						item_food_toast});									
//				
//		CraftingHelper.addShapelessRecipe(new ItemStack(item_food_eggs_mushroom_omelette), 
//										new Object[]{
//												Items.EGG,
//												Items.EGG,
//												Items.EGG,
//												item_food_cheese,
//												Blocks.BROWN_MUSHROOM});
//
//		CraftingHelper.addShapelessRecipe(new ItemStack(item_food_eggs_scrambled), 
//				new Object[] { Items.EGG,Items.EGG,Items.EGG,
//							   Items.BOWL});
//		
//		CraftingHelper.addShapelessRecipe(new ItemStack(item_food_eggs_scrambled_cheese), 
//				new Object[] { Items.EGG,Items.EGG,Items.EGG,
//							   Items.BOWL,
//							   item_food_cheese});								 		
//		
//		//cheese w/yellow		
//		CraftingHelper.addShapelessRecipe(new ItemStack(item_food_cheese,16), 
//				new Object[]{
//						new ItemStack(Items.DYE, 1, 11),
//						Items.MILK_BUCKET});
//		
//		//cheese w/white dye
//		CraftingHelper.addShapelessRecipe(new ItemStack(item_food_cheese,16), 
//				new Object[]{
//						new ItemStack(Items.DYE, 1, 0),
//						Items.MILK_BUCKET});		
//				
//			
//		// bread			
//		CraftingHelper.addOldShaped(new ItemStack(item_food_bread,8),
//																		new Object[]{
//																			"WW ",
//																			"WW ",
//																			"   ",
//																			'W',Items.WHEAT});
//			
//				
//		GameRegistry.addSmelting(Items.EGG, new ItemStack(item_food_eggs_fried), 3.0F);
//		GameRegistry.addSmelting(item_food_bread, new ItemStack(item_food_toast), 2.0F);
		
//		
//
//        CraftingHelper.addShapelessRecipe("item_food_eggs_and_beef", new ItemStack(item_food_eggs_and_beef), 
//				new Object[]{
//						Items.EGG,Items.EGG,Items.EGG,						
//						Items.BEEF,
//						Items.BOWL});		
//				
//
//		CraftingHelper.addShapelessRecipe("item_food_eggs_and_bacon", new ItemStack(item_food_eggs_and_bacon), 
//				new Object[]{
//						Items.EGG,Items.EGG,Items.EGG,
//						Items.PORKCHOP,
//						Items.BOWL});
//		
//		
//		CraftingHelper.addShapelessRecipe("item_food_eggs_sandwich", new ItemStack(item_food_eggs_sandwich), 
//				new Object[]{
//						Items.EGG,
//						item_food_toast,
//						item_food_toast});
//		
//		CraftingHelper.addShapelessRecipe("item_food_eggs_sandwich_fried", new ItemStack(item_food_eggs_sandwich_fried),
//				new Object[]{
//						item_food_eggs_fried,
//						item_food_toast,
//						item_food_toast});									
//				
//		CraftingHelper.addShapelessRecipe("item_food_eggs_mushroom_omelette", new ItemStack(item_food_eggs_mushroom_omelette), 
//										new Object[]{
//												Items.EGG,
//												Items.EGG,
//												Items.EGG,
//												item_food_cheese,
//												Blocks.BROWN_MUSHROOM});
//
//		CraftingHelper.addShapelessRecipe("item_food_eggs_scrambled", new ItemStack(item_food_eggs_scrambled), 
//				new Object[] { Items.EGG,Items.EGG,Items.EGG,
//							   Items.BOWL});
//		
//		CraftingHelper.addShapelessRecipe("item_food_eggs_scrambled_cheese", new ItemStack(item_food_eggs_scrambled_cheese), 
//				new Object[] { Items.EGG,Items.EGG,Items.EGG,
//							   Items.BOWL,
//							   item_food_cheese});								 		
//		
//		//cheese w/yellow		
//		CraftingHelper.addShapelessRecipe("item_food_cheese", new ItemStack(item_food_cheese,16), 
//				new Object[]{
//						new ItemStack(Items.DYE, 1, 11),
//						Items.MILK_BUCKET});
//		
//		//cheese w/white dye
//		CraftingHelper.addShapelessRecipe("item_food_cheese", new ItemStack(item_food_cheese,16), 
//				new Object[]{
//						new ItemStack(Items.DYE, 1, 0),
//						Items.MILK_BUCKET});		
//				
//			
//		// bread			
////		CraftingHelper.addOldShaped("item_food_bread", new ItemStack(item_food_bread,8),
////																		new Object[]{
////																			"WW ",
////																			"WW ",
////																			"   ",
////																			'W',Items.WHEAT});
//		CraftingHelper.addShapelessRecipe("item_food_bread", new ItemStack(item_food_bread,8), 
//				new Object[]{
//						Items.WHEAT,Items.WHEAT,Items.WHEAT,Items.WHEAT});		
//						
//		GameRegistry.addSmelting(Items.EGG, new ItemStack(item_food_eggs_fried), 3.0F);
//		GameRegistry.addSmelting(item_food_bread, new ItemStack(item_food_toast), 2.0F);
//		
		
	}
	
		
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event){
		
        CraftingHelper.addShapeless(event, new ItemStack(item_food_eggs_and_beef), 
				new Object[]{
						Items.EGG,Items.EGG,Items.EGG,						
						Items.BEEF,
						Items.BOWL});		
				
        CraftingHelper.addShapeless(event, new ItemStack(item_food_eggs_and_bacon), 
				new Object[]{
						Items.EGG,Items.EGG,Items.EGG,
						Items.PORKCHOP,
						Items.BOWL});
		
		
		CraftingHelper.addShapeless(event, new ItemStack(item_food_eggs_sandwich), 
				new Object[]{
						Items.EGG,
						item_food_toast,
						item_food_toast});
		
		CraftingHelper.addShapeless(event, new ItemStack(item_food_eggs_sandwich_fried),
				new Object[]{
						item_food_eggs_fried,
						item_food_toast,
						item_food_toast});									
				
		CraftingHelper.addShapeless(event, new ItemStack(item_food_eggs_mushroom_omelette), 
										new Object[]{
												Items.EGG,
												Items.EGG,
												Items.EGG,
												item_food_cheese,
												Blocks.BROWN_MUSHROOM});

		CraftingHelper.addShapeless(event, new ItemStack(item_food_eggs_scrambled), 
				new Object[] { Items.EGG,Items.EGG,Items.EGG,
							   Items.BOWL});
		
		CraftingHelper.addShapeless(event, new ItemStack(item_food_eggs_scrambled_cheese), 
				new Object[] { Items.EGG,Items.EGG,Items.EGG,
							   Items.BOWL,
							   item_food_cheese});								 		
		

		// cemerson 20180903: Items.DYE not mapped in forge yet
		//cheese w/yellow		
		CraftingHelper.addShapeless(event, new ItemStack(item_food_cheese,16), 
				new Object[]{
						new ItemStack(Items.field_151100_aR, 1, 11),
						Items.MILK_BUCKET});
		
		//cheese w/white dye
		CraftingHelper.addShapeless(event, new ItemStack(item_food_cheese,16), 
				new Object[]{
						new ItemStack(Items.field_151100_aR, 1, 0),
						Items.MILK_BUCKET});		
				
			
		// bread			
//		CraftingHelper.addOldShaped("item_food_bread", new ItemStack(item_food_bread,8),
//																		new Object[]{
//																			"WW ",
//																			"WW ",
//																			"   ",
//																			'W',Items.WHEAT});
		CraftingHelper.addShapeless(event, new ItemStack(item_food_bread,8), 
				new Object[]{
						Items.WHEAT,Items.WHEAT,Items.WHEAT,Items.WHEAT});		
						
		GameRegistry.addSmelting(Items.EGG, new ItemStack(item_food_eggs_fried), 3.0F);
		GameRegistry.addSmelting(item_food_bread, new ItemStack(item_food_toast), 2.0F);
				
		
	}
	
	public static void registerRenders(){
		
		registerRender(item_food_eggs_scrambled);
		registerRender(item_food_eggs_scrambled_cheese);
		registerRender(item_food_eggs_fried);
		registerRender(item_food_eggs_and_bacon);
		registerRender(item_food_bread);
		registerRender(item_food_eggs_and_beef);
		registerRender(item_food_toast);
		registerRender(item_food_cheese);
		registerRender(item_food_eggs_sandwich);
		registerRender(item_food_eggs_mushroom_omelette);
		registerRender(item_food_eggs_sandwich_fried);
	}
	
	public static void registerRender(Item item){		
	
		// CEMERSON 20180903: regstier not working for ItemModelMesher in forge 1.12.2 yet? 
	    
		Minecraft.getInstance()
			.getRenderItem()
			.getItemModelMesher()
			.func_178086_a(item, 0, new ModelResourceLocation(
					Reference.MOD_ID + ":" + item.getTranslationKey().substring(5),
					"inventory"));
						
	}
	

}
