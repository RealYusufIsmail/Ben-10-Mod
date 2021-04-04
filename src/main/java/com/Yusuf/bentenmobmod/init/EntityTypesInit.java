
package com.Yusuf.bentenmobmod.init;

import com.Yusuf.bentenmobmod.Main;
import com.Yusuf.bentenmobmod.common.entities.VilgaxEntity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class EntityTypesInit {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			Main.MOD_ID);

	

	private static final EntityType<VilgaxEntity> vilgax = createStandardEntityType("vilgax", VilgaxEntity::new,
			EntityClassification.CREATURE, 0.7f, 1.56f);

	// registering the entities
	public static final RegistryObject<EntityType<VilgaxEntity>> VILGAX_ENTITY = ENTITY_TYPES.register("vilgax",
			() -> vilgax);

	private static <T extends Entity> EntityType<T> createStandardEntityType(String entity_name,
			EntityType.IFactory<T> factory, EntityClassification classification, float width, float height) {
		return EntityType.Builder.of(factory, classification).sized(width, height)
				.build(Main.MOD_ID + ":" + entity_name);
	}

	// register spawn eggs

}