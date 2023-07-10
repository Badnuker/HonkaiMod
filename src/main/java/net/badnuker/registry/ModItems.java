package net.badnuker.registry;

import net.badnuker.HonkaiMod;
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

    public static final Item CRYSTAL = registerItem("crystal", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item CRYSTAL5 = registerItem("crystal5", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item CRYSTAL25 = registerItem("crystal25", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item CRYSTAL50 = registerItem("crystal50", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item CRYSTAL100 = registerItem("crystal100", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item CRYSTAL300 = registerItem("crystal300", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item CRYSTAL500 = registerItem("crystal500", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
    public static final Item COIN = registerItem("coin", new Item(new FabricItemSettings()), ModItemGroup.HonkaiItemGroup);
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
