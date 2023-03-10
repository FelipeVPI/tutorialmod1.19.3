package net.fellipe.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fellipe.tutorialmod.block.ModBlocks;
import net.fellipe.tutorialmod.item.ModItem;
import net.fellipe.tutorialmod.item.ModItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItem.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
