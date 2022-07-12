package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.example.block.ModBlocks;
import net.fabricmc.example.block.entity.ModBlocksEntities;
import net.fabricmc.example.item.ModItems;
import net.fabricmc.example.screen.ModScreenHandler;
import net.fabricmc.example.screen.MythrilBlockScreen;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "examplemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlocksEntities.registerAllBlockEntities();
		ScreenRegistry.register(ModScreenHandler.MYTHRIL_BLOCK_SCREEN_HANDLER, MythrilBlockScreen::new);
	}
}
