package net.mintiestkitkat.cinferno.item;

import net.minecraft.world.item.Item;
import net.mintiestkitkat.cinferno.ConfinedToInferno;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ConfinedToInferno.MODID);

    public static final DeferredItem<Item> VESICLE = ITEMS.register("vesicle", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TWINE = ITEMS.register("twine", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRILLED_NETHER_MUSHROOM = ITEMS.register("grilled_nether_mushroom",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.GRILLED_MUSHROOM)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
