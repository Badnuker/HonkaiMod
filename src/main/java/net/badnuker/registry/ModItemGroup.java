package net.badnuker.registry;

import net.badnuker.HonkaiMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> HonkaiItemGroup = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(HonkaiMod.MOD_ID, "honkai-impact-3"));

    public static void registerModGroup() {
        HonkaiMod.LOGGER.info("Registering item group");
        Registry.register(Registries.ITEM_GROUP, HonkaiItemGroup, FabricItemGroup.builder()
                .displayName(Text.translatable("itemgroup.honkai-impact-3"))
                .icon(() -> new ItemStack(ModItems.Crystal))
                .build());
    }
}
