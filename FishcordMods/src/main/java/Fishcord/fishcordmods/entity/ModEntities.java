package Fishcord.fishcordmods.entity;

import Fishcord.fishcordmods.Fishcordmods;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityAttachments;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BobberEntity> BOBBER = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Fishcordmods.MOD_ID, "bobber"),
            FabricEntityTypeBuilder.<BobberEntity>create(SpawnGroup.MISC, BobberEntity::new)
                    .disableSaving()
                    .disableSummon()
                    .dimensions(new EntityDimensions(.75f, .75f, 0f, EntityAttachments.of(.75f, .75f), true))
                    .trackRangeChunks(4)
                    .trackedUpdateRate(5)
                    .fireImmune()
                    .build(RegistryKey.of(RegistryKeys.ENTITY_TYPE,Identifier.of(Fishcordmods.MOD_ID, "bobber_main")))
    );

    public void init() {
    }
}

