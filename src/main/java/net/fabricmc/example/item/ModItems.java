package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item RAW_MYTHRIL_ORE = registerItem("raw_mythril_ore", new Item(new FabricItemSettings().group(ModItemGroup.TUTORIAL_GROUP)));

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings().group(ModItemGroup.TUTORIAL_GROUP)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }
    public static void registerModItems(){
        ExampleMod.LOGGER.info("Registering items");
    }
}
