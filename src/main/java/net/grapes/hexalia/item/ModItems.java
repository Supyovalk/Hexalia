package net.grapes.hexalia.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.grapes.hexalia.HexaliaMod;
import net.grapes.hexalia.block.ModBlocks;
import net.grapes.hexalia.entity.ModBoats;
import net.grapes.hexalia.entity.ModEntities;
import net.grapes.hexalia.item.custom.*;
import net.grapes.hexalia.item.custom.brews.*;
import net.grapes.hexalia.util.ModToolMaterials;
import net.grapes.hexalia.util.ModUtils;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    // Resources
    public static final Item SALT = registerItem("salt",
            new BlockItem(ModBlocks.SALT, new FabricItemSettings()));
    public static final Item RESIN = registerItem("resin",
            new Item(new FabricItemSettings()));
    public static final Item ANCIENT_SEED = registerItem("ancient_seed",
            new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SILK_FIBER = registerItem("silk_fiber",
            new Item(new FabricItemSettings()));
    public static final Item SILKWORM = registerItem("silkworm",
            new Item(new FabricItemSettings()));

    // Crops, Plants & Seeds
    public static final Item SIREN_KELP = registerItem("siren_kelp",
            new BlockItem(ModBlocks.SIREN_KELP, new FabricItemSettings().food(ModFoodComponents.SIREN_KELP)));
    public static final Item MANDRAKE = registerItem("mandrake",
            new MandrakeItem(new FabricItemSettings()));
    public static final Item MANDRAKE_SEEDS = registerItem("mandrake_seeds",
            new AliasedBlockItem(ModBlocks.MANDRAKE_CROP, new FabricItemSettings()));
    public static final Item CHILLBERRIES = registerItem("chillberries",
            new BlockItem(ModBlocks.CHILLBERRY_BUSH, new FabricItemSettings().food(ModFoodComponents.CHILLBERRIES)));
    public static final Item SUNFIRE_TOMATO = registerItem("sunfire_tomato",
            new Item(new FabricItemSettings().food(ModFoodComponents.SUNFIRE_TOMATO)));
    public static final Item SUNFIRE_TOMATO_SEEDS = registerItem("sunfire_tomato_seeds",
            new AliasedBlockItem(ModBlocks.SUNFIRE_TOMATO_CROP, new FabricItemSettings()));
    public static final Item RABBAGE_SEEDS = registerItem("rabbage_seeds",
            new AliasedBlockItem(ModBlocks.RABBAGE_CROP, new FabricItemSettings()));
    public static final Item LOTUS_FLOWER = registerItem("lotus_flower",
            new PlaceableOnWaterItem(ModBlocks.LOTUS_FLOWER, new FabricItemSettings()));

    // Refined Resources
    public static final Item SIREN_KELP_PASTE = registerItem("siren_kelp_paste",
            new Item(new FabricItemSettings()));
    public static final Item SPIRIT_BLOOM_POWDER = registerItem("spirit_bloom_powder",
            new Item(new FabricItemSettings()));
    public static final Item DREAMSHROOM_PASTE = registerItem("dreamshroom_paste",
            new Item(new FabricItemSettings()));
    public static final Item GHOST_FERN_POWDER = registerItem("ghost_fern_powder",
            new Item(new FabricItemSettings()));
    public static final Item PURIFYING_SALTS = registerItem("purifying_salts",
            new PurifyingSaltsItem(new FabricItemSettings().maxCount(16)));
    public static final Item SPICY_SANDWICH = registerItem("spicy_sandwich",
            new Item(new FabricItemSettings().food(ModFoodComponents.SPICY_SANDWICH)));
    public static final Item CHILLBERRY_PIE = registerItem("chillberry_pie",
            new Item(new FabricItemSettings().food(ModFoodComponents.CHILLBERRY_PIE)));
    public static final Item MANDRAKE_STEW = registerItem("mandrake_stew",
            new StewItem(new FabricItemSettings().food(ModFoodComponents.MANDRAKE_STEW).maxCount(1)));

    // Brews
    public static final Item RUSTIC_BOTTLE = registerItem("rustic_bottle",
            new Item(new FabricItemSettings()));
    public static final Item BREW_OF_SPIKESKIN = registerItem("brew_of_spikeskin",
            new SpikeskinBrewItem(new FabricItemSettings().recipeRemainder(ModItems.RUSTIC_BOTTLE).maxCount(16)));
    public static final Item BREW_OF_BLOODLUST = registerItem("brew_of_bloodlust",
            new BloodlustBrewItem(new FabricItemSettings().recipeRemainder(ModItems.RUSTIC_BOTTLE).maxCount(16)));
    public static final Item BREW_OF_SLIMEWALKER = registerItem("brew_of_slimewalker",
            new SlimewalkerBrewItem(new FabricItemSettings().recipeRemainder(ModItems.RUSTIC_BOTTLE).maxCount(16)));
    public static final Item BREW_OF_HOMESTEAD = registerItem("brew_of_homestead",
            new HomesteadBrewItem(new FabricItemSettings().recipeRemainder(ModItems.RUSTIC_BOTTLE).maxCount(16)));
    public static final Item BREW_OF_SIPHON = registerItem("brew_of_siphon",
            new SiphonBrewItem(new FabricItemSettings().recipeRemainder(ModItems.RUSTIC_BOTTLE).maxCount(16)));

    // Tools & Others
    public static final Item MORTAR_AND_PESTLE = registerItem("mortar_and_pestle",
            new MortarAndPestleItem(new FabricItemSettings()));
    public static final Item SMALL_CAULDRON = registerItem("small_cauldron",
            new BlockItem(ModBlocks.SMALL_CAULDRON, new FabricItemSettings()));
    public static final Item SALT_LAMP = registerItem("salt_lamp",
            new BlockItem(ModBlocks.SALT_LAMP, new FabricItemSettings()));
    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            new StoneDaggerItem(new FabricItemSettings().maxDamage(16)));
    public static final Item RITUAL_TABLE = registerItem("ritual_table",
            new BlockItem(ModBlocks.RITUAL_TABLE, new FabricItemSettings()));
    public static final Item HEX_FOCUS = registerItem("hex_focus",
            new Item(new FabricItemSettings()));
    public static final Item WISDOM_GEM = registerItem("wisdom_gem",
            new Item(new FabricItemSettings().maxCount(1).maxDamage(60).rarity(Rarity.UNCOMMON)));

    // Armors
    /* Work In Progress
    public static final Item BOGGED_HAT = registerItem("bogged_hat",
            new BoggedArmorItem(ModArmorMaterials.BOGGED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item BOGGED_ROBE = registerItem("bogged_robe",
            new BoggedArmorItem(ModArmorMaterials.BOGGED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item BOGGED_PANTS = registerItem("bogged_pants",
            new BoggedArmorItem(ModArmorMaterials.BOGGED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item BOGGED_BOOTS = registerItem("bogged_boots",
            new BoggedArmorItem(ModArmorMaterials.BOGGED, ArmorItem.Type.BOOTS, new FabricItemSettings())); */
    public static final Item GHOSTVEIL = registerItem("ghostveil",
            new GhostVeilItem(ModArmorMaterials.GHOST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    // Spawn Eggs
    public static final Item SILK_MOTH_SPAWN_EGG = registerItem("silk_moth_spawn_egg",
            new SpawnEggItem(ModEntities.SILK_MOTH, 0xAE8f7A, 0x846552, new FabricItemSettings()));

    // Weapons & Armor
    public static final Item KELPWEAVE_BLADE = registerItem("kelpweave_blade",
            new KelpweaveBladeItem(ModToolMaterials.ANCIENT_SEED, 3, -2f, new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item RABBAGE = registerItem("rabbage",
            new RabbageItem(new FabricItemSettings().maxCount(16)));

    // Wooden Set Items
    public static final Item COTTONWOOD_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.COTTONWOOD_BOAT_ID,
            ModBoats.COTTONWOOD_BOAT_KEY, false);
    public static final Item COTTONWOOD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.COTTONWOOD_CHEST_BOAT_ID,
            ModBoats.COTTONWOOD_BOAT_KEY, true);
    public static final Item COTTONWOOD_SIGN = registerItem("cottonwood_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.COTTONWOOD_SIGN, ModBlocks.COTTONWOOD_WALL_SIGN));
    public static final Item COTTONWOOD_HANGING_SIGN = registerItem("cottonwood_hanging_sign",
            new HangingSignItem(ModBlocks.COTTONWOOD_HANGING_SIGN, ModBlocks.COTTONWOOD_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));

    public static final Item WILLOW_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.WILLOW_BOAT_ID,
            ModBoats.WILLOW_BOAT_KEY, false);
    public static final Item WILLOW_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.WILLOW_CHEST_BOAT_ID,
            ModBoats.WILLOW_BOAT_KEY, true);
    public static final Item WILLOW_SIGN = registerItem("willow_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.WILLOW_SIGN, ModBlocks.WILLOW_WALL_SIGN));
    public static final Item WILLOW_HANGING_SIGN = registerItem("willow_hanging_sign",
            new HangingSignItem(ModBlocks.WILLOW_HANGING_SIGN, ModBlocks.WILLOW_HANGING_WALL_SIGN, new FabricItemSettings().maxCount(16)));

    // Addon/Compat Items
    public static final Item HEXBOOK = registerItem("hexbook",
            new HexbookItem(new FabricItemSettings().maxCount(1)));
    public static Item WITCH_SALAD;
    static {
        if (ModUtils.isModLoaded("farmersdelight")) {
            WITCH_SALAD = registerItem("witch_salad",
                    new Item(new FabricItemSettings().food(ModFoodComponents.WITCH_SALAD)));
        }
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HexaliaMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HexaliaMod.LOGGER.info("Registering Items for " + HexaliaMod.MOD_ID);
    }
}