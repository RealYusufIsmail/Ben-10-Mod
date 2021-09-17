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

package com.yusuf.bentenmod.core.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("all")
public class FoodInit {
    // Omnitrix Apple
    public static final Food OMNITRIX_APPLE = new Food.Builder()
            .effect(new EffectInstance(Effects.REGENERATION, 1200, 0), 1)
            .effect(new EffectInstance(Effects.ABSORPTION, 3600, 1), 1)
            .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 2400, 0), 1)
            .effect(new EffectInstance(Effects.MOVEMENT_SPEED, 600, 0), 1)
            .effect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 1200, 0), 1)
            .effect(new EffectInstance(Effects.WATER_BREATHING, 600, 0), 1)
            .effect(new EffectInstance(Effects.DIG_SPEED, 2400, 0), 1)
            .nutrition(4).saturationMod(1.2f).alwaysEat().build();
    // Enchanted Omnitrix Apple
    public static final Food ENCHANTED_OMNITRIX_APPLE = new Food.Builder()
            .effect(new EffectInstance(Effects.REGENERATION, 6000, 0), 1)
            .effect(new EffectInstance(Effects.ABSORPTION, 4800, 3), 1)
            .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 4800, 0), 1)
            .effect(new EffectInstance(Effects.MOVEMENT_SPEED, 4800, 0), 1)
            .effect(new EffectInstance(Effects.WATER_BREATHING, 3600, 0), 1)
            .effect(new EffectInstance(Effects.DIG_SPEED, 6000, 0), 1)
            .effect(new EffectInstance(Effects.NIGHT_VISION, 2400, 0), 1)
            .effect(new EffectInstance(Effects.SLOW_FALLING, 6000, 0), 1)
            .nutrition(4).saturationMod(1.2f).alwaysEat().build();

    // Ruby Apple
    public static final Food RUBY_APPLE = new Food.Builder()
            .effect(new EffectInstance(Effects.REGENERATION, 7000, 0), 1)
            .effect(new EffectInstance(Effects.ABSORPTION, 6000, 6), 1)
            .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 4800, 0), 1)
            .effect(new EffectInstance(Effects.MOVEMENT_SPEED, 4800, 0), 1)
            .effect(new EffectInstance(Effects.WATER_BREATHING, 3600, 0), 1)
            .effect(new EffectInstance(Effects.DIG_SPEED, 6000, 0), 1)
            .nutrition(4).saturationMod(1.2f).alwaysEat().build();

    //Fire APPLE
    public static final Food FIRE_APPLE = new Food.Builder()
            .effect(new EffectInstance(Effects.ABSORPTION, 4800, 2), 1)
            .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0), 1)
            .nutrition(4).saturationMod(1.2f).alwaysEat().build();

}