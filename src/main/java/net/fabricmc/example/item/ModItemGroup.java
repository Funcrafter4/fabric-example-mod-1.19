package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TUTORIAL_GROUP = FabricItemGroupBuilder.create(new Identifier(ExampleMod.MOD_ID, "tutorial_group")).icon(() -> new ItemStack(ModItems.RAW_MYTHRIL_ORE)).build();

}
