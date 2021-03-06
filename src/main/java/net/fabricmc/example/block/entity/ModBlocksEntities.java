package net.fabricmc.example.block.entity;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocksEntities {
    public static BlockEntityType<MythrilBlockEntity> MYTHRIL_BLOCK;

    public static void registerAllBlockEntities(){
        MYTHRIL_BLOCK = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(ExampleMod.MOD_ID,"mythril_block"),
                FabricBlockEntityTypeBuilder.create(MythrilBlockEntity::new,
                        ModBlocks.MYTHRIL_BLOCK).build(null));
    }
}
