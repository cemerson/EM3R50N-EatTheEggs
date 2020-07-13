package com.emerson.eggs.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import com.emerson.eggs.EatTheEggs;
import com.emerson.eggs.EatTheEggsItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(LivingEntity.class)
public abstract class MixinLivingEntity {

	@Shadow
	protected ItemStack activeItemStack;

	@Inject(method = "consumeItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/LivingEntity;setStackInHand(Lnet/minecraft/util/Hand;Lnet/minecraft/item/ItemStack;)V", shift = At.Shift.BEFORE))
	protected void onItemUseFinish(CallbackInfo callbackInfo) {
		if ((Object) this instanceof PlayerEntity && activeItemStack.getItem().getName().toString().contains("item.eggs")){ 
			EatTheEggs.LOG("Hey! you just ate an item from the EatTheEggs menu! (MixinLivingEntity.onItemUseFinish())");
			EatTheEggsItem eatTheEggsFood = (EatTheEggsItem) activeItemStack.getItem();
			if(eatTheEggsFood.foodUsesBowl){
				EatTheEggs.LOG("Giving player an empty bowl!");
				PlayerEntity player = (PlayerEntity) (Object) this; 
				player.giveItemStack(new ItemStack(Items.BOWL));
			}else{
				EatTheEggs.LOG("No need to give player empty bowl...");
			}		
		}else{
			// EatTheEggs.LOG("IGNORE this event ... (MixinLivingEntity.onItemUseFinish())");
		}
	}
}