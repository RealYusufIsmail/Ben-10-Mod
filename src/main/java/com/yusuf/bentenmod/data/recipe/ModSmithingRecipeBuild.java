/*
 * BSD 3-Clause License
 *
 * Copyright (c) 2021, Yusuf Ismail
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 *
 *
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.yusuf.bentenmod.data.recipe;

import com.yusuf.bentenmod.BenTenMod;
import com.yusuf.bentenmod.core.init.ItemInit;
import com.yusuf.bentenmod.core.init.TagsInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.SmithingRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModSmithingRecipeBuild extends RecipeProvider implements IConditionBuilder {
    public ModSmithingRecipeBuild(DataGenerator generatorIn) {
        super(generatorIn);
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(BenTenMod.MOD_ID, path);
    }

    @Override
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        // THIS is where you call `smithing` or other recipe builders..
        // i.e.
        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_SWORD), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_SWORD.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer, modId("black_diamond_sword"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_AXE), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_AXE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer, modId("black_diamond_axe"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_PICKAXE), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_PICKAXE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer, modId("black_diamond_pickaxe"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_SHOVEL), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_SHOVEL.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer, modId("black_diamond_shovel"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_HOE), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_HOE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer, modId("black_diamond_hoe"));


        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_HELMET), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_HELMET.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer, modId("black_diamond_helmet"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_CHESTPLATE), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_CHESTPLATE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer, modId("black_diamond_chestplate"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_LEGGINGS), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_LEGGINGS.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer, modId("black_diamond_leggings"));

        SmithingRecipeBuilder.smithing(Ingredient.of(Items.DIAMOND_BOOTS), Ingredient.of(ItemInit.BLACK_DIAMOND.get()), ItemInit.BLACK_DIAMOND_BOOTS.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_BLACK_DIAMOND))
                .save(consumer, modId("black_diamond_boots"));


        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_SWORD.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_SWORD.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer, modId("infinitum_sword"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_AXE.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_AXE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer, modId("infinitum_axe"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_PICKAXE.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_PICKAXE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer, modId("infinitum_pickaxe"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_SHOVEL.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_SHOVEL.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer, modId("infinitum_shovel"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_HOE.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_HOE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer, modId("infinitum_hoe"));


        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_HELMET.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_HELMET.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer, modId("infinitum_helmet"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_CHESTPLATE.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_CHESTPLATE.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer, modId("infinitum_chestplate"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_LEGGINGS.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_LEGGINGS.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer, modId("infinitum_leggings"));

        SmithingRecipeBuilder.smithing(Ingredient.of(ItemInit.BLACK_DIAMOND_BOOTS.get()), Ingredient.of(ItemInit.INFINITUM.get()), ItemInit.INFINITUM_BOOTS.get())
                .unlocks("has_item", has(TagsInit.Items.INGOTS_INFINITUM))
                .save(consumer, modId("infinitum_boots"));

    }

}
