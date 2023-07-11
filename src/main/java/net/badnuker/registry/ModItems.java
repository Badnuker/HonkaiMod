package net.badnuker.registry;

import net.badnuker.HonkaiMod;
import net.badnuker.item.Crystal5;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void registerModItems() {
        HonkaiMod.LOGGER.debug("Registering items");
    }

    public static final Item Crystal = registerItem("crystal", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Crystal5 = registerItem("crystal5", new Crystal5(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Crystal25 = registerItem("crystal25", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Crystal50 = registerItem("crystal50", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Crystal100 = registerItem("crystal100", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Crystal300 = registerItem("crystal300", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Crystal500 = registerItem("crystal500", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Coin = registerItem("coin", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Coin1000 = registerItem("coin1000", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Coin2000 = registerItem("coin2000", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Coin5000 = registerItem("coin5000", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Coin10000 = registerItem("coin10000", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Coin20000 = registerItem("coin20000", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Coin50000 = registerItem("coin50000", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item Coin1000000 = registerItem("coin1000000", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item STARSTONE = registerItem("starstone", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    @SafeVarargs
    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup>... itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(HonkaiMod.MOD_ID, name), item);
        for (RegistryKey<ItemGroup> itemGroup : itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }

}
