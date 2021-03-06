package com.cemerson.eggs.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AllTheEggsItem extends ItemFood {

	public String displayName;
	public Boolean foodUsesBowl = false;
	public AllTheEggsItem(int healAmount, float potionEffectProbability, boolean alwaysEdible, String name, Boolean usesBowl){
		super(healAmount, potionEffectProbability, alwaysEdible);
		displayName = name;
		foodUsesBowl = usesBowl;
		
		
		
		
        // no break!
        // this.setBlockUnbreakable();
        
        // no explode either! 
        // this.setResistance(2000.0f);               
	}	
	
//	@Override
//    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving){
//		if(stack.em)
//		return super.onItemUseFinish(stack, worldIn,entityLiving);
//	}
//	
	

	@Override
	public void addInformation(ItemStack stack, World entityWorld, List<String> tooltip, ITooltipFlag advanced) {
	// public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, ITooltipFlag advanced) {
		// TODO Auto-generated method stub		
		// CE 20180904 // tooltip.add("\u00A7o\u00A78Mod: All The Eggs!");
		// stack.
		// stack.stack.setStackDisplayName(displayName);
		// super.addInformation(stack, playerIn, tooltip, advanced);
		tooltip.clear();
		tooltip.add(displayName);
		super.addInformation(stack,entityWorld,tooltip,advanced);

	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		// TODO Auto-generated method stub
		super.onFoodEaten(stack, worldIn, player);		
		givePlayerEmptyBowl(player,stack);				
	}
	
	private void givePlayerEmptyBowl(EntityPlayer player,ItemStack stack){		
		// ItemStack emptyBowl = new ItemStack(Items.bowl);
		if(foodUsesBowl){
			player.inventory.addItemStackToInventory(new ItemStack(Items.BOWL));
		}
		
//		String itemsLeftMsg = "There are "+itemsLeft+" items left in your hand!";
//		player.addChatComponentMessage(new TextComponentString(itemsLeftMsg));								
//		if(player.inventory.mainInventory.length <= 0){			
//			player.inventory.addItemStackToInventory(new ItemStack(Items.bowl));
//		}
		// stack.setItem(Items.bowl);
		// stack.setItem(emptyBowl);
		// return emptyBowl;
	}
	
    

}
