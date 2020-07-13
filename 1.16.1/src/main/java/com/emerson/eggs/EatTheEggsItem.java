package com.emerson.eggs;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Formatting;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.item.ItemStack;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class EatTheEggsItem extends Item {

    public String itemToolTipPath;
    public int itemHealAmount;
    public Boolean foodUsesBowl = false; // public ClientPlayerEntity player;
    final PlayerEntity player = MinecraftClient.getInstance().player;    
    
    public EatTheEggsItem(final int healAmount,                             
                            final int maxStackCount, 
                            final Boolean usesBowl, 
                            final String toolTipPath) {
        super(new Item.Settings().group(ItemGroup.FOOD)
                .food(
                    new FoodComponent.Builder()
                    .hunger(healAmount)
                    .build()
                    )
                .maxCount(maxStackCount));
        foodUsesBowl = usesBowl;
        itemHealAmount = healAmount;
        itemToolTipPath = toolTipPath;

    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(final ItemStack stack, final World world, final List<Text> tooltip,
            final TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        tooltip.clear();
        tooltip.add(new TranslatableText(itemToolTipPath).formatted(Formatting.YELLOW));        

        System.out.println("HelloWorld!");
        Double hungerPercent = (Double.valueOf(itemHealAmount)/20)*100; // System.out.println("[" + String.format("%.0f", hungerPercent) + "]");        
        tooltip.add(new LiteralText("Restores (" + String.format("%.0f", hungerPercent) + "%) Hunger").formatted(Formatting.GRAY));
    }

    
}

