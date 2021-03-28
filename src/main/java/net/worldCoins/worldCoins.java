package net.worldCoins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class worldCoins implements ModInitializer {
  public static final Item GOLD_COIN = new CoinsItem(new FabricItemSettings().group(ItemGroup.MISC));
  public static final Item IRON_COIN = new CoinsItem(new FabricItemSettings().group(ItemGroup.MISC));

  @Override
  public void onInitialize() {
    Registry.register(Registry.ITEM, new Identifier("world-coins", "gold_coin"), GOLD_COIN);
    Registry.register(Registry.ITEM, new Identifier("world-coins", "iron_coin"), IRON_COIN);
  }
}
