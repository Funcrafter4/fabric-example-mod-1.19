package net.fabricmc.example.screen;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandler {
    public static ScreenHandlerType<MythrilBlockScreenHandler> MYTHRIL_BLOCK_SCREEN_HANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(ExampleMod.MOD_ID,"mythril_block"),
                    MythrilBlockScreenHandler::new);
}
