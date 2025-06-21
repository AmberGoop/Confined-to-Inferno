package net.mintiestkitkat.cinferno.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.mintiestkitkat.cinferno.ConfinedToInferno;
import net.mintiestkitkat.cinferno.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ConfinedToInferno.MODID);

    public static final Supplier<CreativeModeTab> CONFINED_TO_INFERNO_TAB = CREATIVE_MODE_TAB.register("confined_to_inferno_tab", ()-> CreativeModeTab.builder()
            .icon(()->new ItemStack(ModItems.VESICLE.get()))
            .title(Component.translatable("creativetab.cinferno.items"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.VESICLE);
                output.accept(ModItems.TWINE);
                output.accept(ModBlocks.TWINE_BUNDLE);
                output.accept(ModItems.GRILLED_NETHER_MUSHROOM);
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
