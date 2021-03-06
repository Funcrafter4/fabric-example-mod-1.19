package net.fabricmc.example.block;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.block.custom.MythrilBlock;
import net.fabricmc.example.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new MythrilBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.TUTORIAL_GROUP);

    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK,new Identifier(ExampleMod.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM,new Identifier(ExampleMod.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        ExampleMod.LOGGER.info("Registering ModBlocks for " + ExampleMod.MOD_ID );
    }
}

