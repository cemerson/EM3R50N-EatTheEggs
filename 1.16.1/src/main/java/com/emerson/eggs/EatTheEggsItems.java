package com.emerson.eggs;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class EatTheEggsItems {
    
    public static void init() {
        
        EatTheEggsItem eggs_item_scrambled = new EatTheEggsItem(6,8,true,"item.eggs.eggs_food_scrambled"); 
        EatTheEggsItem eggs_item_scrambled_cheese = new EatTheEggsItem(8,8,true,"item.eggs.eggs_food_scrambled_cheese"); 
        EatTheEggsItem eggs_item_fried = new EatTheEggsItem(4,16,false,"item.eggs.eggs_food_fried"); 
        EatTheEggsItem eggs_item_and_bacon = new EatTheEggsItem(10,8,true,"item.eggs.eggs_food_and_bacon"); 
        EatTheEggsItem eggs_item_and_beef = new EatTheEggsItem(10,8,true,"item.eggs.eggs_food_and_beef"); 
        EatTheEggsItem eggs_item_toast = new EatTheEggsItem(1,64,false,"item.eggs.eggs_food_toast"); 
        EatTheEggsItem eggs_item_bread = new EatTheEggsItem(1,64,false,"item.eggs.eggs_food_bread"); 
        EatTheEggsItem eggs_item_cheese = new EatTheEggsItem(1,64,false,"item.eggs.eggs_food_cheese"); 
        EatTheEggsItem eggs_item_sandwich = new EatTheEggsItem(8,16,false,"item.eggs.eggs_food_sandwich"); 
        EatTheEggsItem eggs_item_sandwich_fried = new EatTheEggsItem(8,16,false,"item.eggs.eggs_food_sandwich_fried"); 
        EatTheEggsItem eggs_item_mushroom_omelette = new EatTheEggsItem(10,8,false,"item.eggs.eggs_food_mushroom_omelette"); 

        Registry.register(Registry.ITEM, new Identifier("eggs","eggs_scrambled"), eggs_item_scrambled);
        Registry.register(Registry.ITEM, new Identifier("eggs","eggs_scrambled_cheese"), eggs_item_scrambled_cheese); 
        Registry.register(Registry.ITEM, new Identifier("eggs","eggs_fried"), eggs_item_fried); 
        Registry.register(Registry.ITEM, new Identifier("eggs","eggs_and_bacon"), eggs_item_and_bacon); 
        Registry.register(Registry.ITEM, new Identifier("eggs","eggs_and_beef"), eggs_item_and_beef); 
        Registry.register(Registry.ITEM, new Identifier("eggs","food_toast"), eggs_item_toast); 
        Registry.register(Registry.ITEM, new Identifier("eggs","food_bread"), eggs_item_bread); 
        Registry.register(Registry.ITEM, new Identifier("eggs","food_cheese"), eggs_item_cheese); 
        Registry.register(Registry.ITEM, new Identifier("eggs","eggs_sandwich"), eggs_item_sandwich); 
        Registry.register(Registry.ITEM, new Identifier("eggs","eggs_sandwich_fried"), eggs_item_sandwich_fried); 
        Registry.register(Registry.ITEM, new Identifier("eggs","eggs_mushroom_omelette"), eggs_item_mushroom_omelette); 
                
    }
        
}