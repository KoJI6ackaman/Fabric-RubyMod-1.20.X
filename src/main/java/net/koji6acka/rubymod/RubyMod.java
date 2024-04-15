package net.koji6acka.rubymod;

import net.fabricmc.api.ModInitializer;

import net.koji6acka.rubymod.block.ModBlocks;
import net.koji6acka.rubymod.item.ModItemGroups;
import net.koji6acka.rubymod.item.ModItems;
import net.koji6acka.rubymod.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubyMod implements ModInitializer {
	public static final String MOD_ID = "rubymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlock();
		ModLootTableModifiers.modifyLootTables();

	}
}