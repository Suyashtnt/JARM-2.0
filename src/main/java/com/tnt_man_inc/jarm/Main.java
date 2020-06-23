package com.tnt_man_inc.jarm;

import com.tnt_man_inc.jarm.Mobs.Renderers.RubyGuardianRenderer;
import com.tnt_man_inc.jarm.Mobs.RubyGuardian;
import com.tnt_man_inc.jarm.WorldGenAndDimensions.BiomeRegister;
import com.tnt_man_inc.jarm.WorldGenAndDimensions.RubyBiome;
import com.tnt_man_inc.jarm.items_and_blocks.Blocks;
import com.tnt_man_inc.jarm.items_and_blocks.Items;
import com.tnt_man_inc.jarm.items_and_blocks.armor.ruby_armor.RubyArmor;
import com.tnt_man_inc.jarm.items_and_blocks.tools.ruby_tools.RubyTools;
import com.tnt_man_inc.jarm.items_and_blocks.tools.strong_diamond_tools.StrongDiamondTools;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biomes.v1.FabricBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Main implements ModInitializer {
  public static final Item RUBY_ICON = new Item(new Item.Settings().group(null));
  public static final ItemGroup JARM_GROUP = FabricItemGroupBuilder.build(new Identifier("jarm", "general"),
      () -> new ItemStack(RUBY_ICON));


  public void handleBiomes(final Biome biome) {
    if (biome.getCategory() != Biome.Category.NETHER && biome.getCategory() != Biome.Category.THEEND) {
      biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE
              .configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Blocks.RUBY_ORE.getDefaultState(), 8 // Ore
                      // vein
                      // size
              )).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(1, // Number of veins per
                      // chunk
                      0,
                      1,
                      18
              ))));

      if (biome instanceof RubyBiome) {
        biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE
                .configure(new OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Blocks.SPECIAL_RUBY_ORE.getDefaultState(), 8 // Ore
                        // vein
                        // size
                )).createDecoratedFeature(Decorator.COUNT_RANGE.configure(new RangeDecoratorConfig(1, // Number of veins per
                        // chunk
                        0,
                        1,
                        18
                ))));
      }
    }
  }

  public static final EntityType<RubyGuardian> RUBY_GUARDIAN = Registry.register(
          Registry.ENTITY_TYPE,
          new Identifier("jarm", "ruby_guardian"),
          FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RubyGuardian::new).dimensions(EntityType.ZOMBIE.getDimensions()).build()
  );


  @Override
  public void onInitialize() {
    //register custom biomes and set them to be able to spawn in
    OverworldBiomes.addContinentalBiome(BiomeRegister.RUBY_BIOME, OverworldClimate.TEMPERATE, 2D);
    FabricBiomes.addSpawnBiome(BiomeRegister.RUBY_BIOME);

    // Loop over existing biomes
    Registry.BIOME.forEach(this::handleBiomes);

    // Listen for other biomes being registered
    RegistryEntryAddedCallback.event(Registry.BIOME).register((i, identifier, biome) -> handleBiomes(biome));
    //inits items and blocks
    Registry.register(Registry.ITEM, new Identifier("jarm", "menu"), RUBY_ICON);
    Items.init();
    Blocks.init();
    //init tools
    RubyTools.init();
    StrongDiamondTools.init();
    //init armor
    RubyArmor.init();

    //registers Ruby Guardian and spawn egg
    FabricDefaultAttributeRegistry.register(RUBY_GUARDIAN, RubyGuardian.createMobAttributes());
    FabricDefaultAttributeRegistry.register(RUBY_GUARDIAN, HostileEntity.createHostileAttributes());
    Registry.register(Registry.ITEM, new Identifier("jarm", "ruby_guardian_spawn_egg"), new SpawnEggItem(RUBY_GUARDIAN, 0xC41F1F, 0xC41F72, new Item.Settings().group(ItemGroup.MISC)));


    //registers it's renderer
    EntityRendererRegistry.INSTANCE.register(Main.RUBY_GUARDIAN, (dispatcher, context) -> new RubyGuardianRenderer(dispatcher));
  }

}