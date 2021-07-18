
package com.yusuf.bentenmod.core.machine.alientable;

import com.yusuf.bentenmod.core.init.BlockInit;
import com.yusuf.bentenmod.core.init.RecipeTypeInit;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.CraftingResultSlot;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ICraftingRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.network.play.server.SSetSlotPacket;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Optional;


public class AlienTableContainer extends WorkbenchContainer {
    private final IWorldPosCallable access;
    private PlayerEntity player;
    private final CraftingInventory craftSlots = new CraftingInventory(this, 3, 3);
    private final CraftResultInventory resultSlots = new CraftResultInventory();

    /*
       public AlienTableContainer(int id, PlayerInventory playerInventory, IWorldPosCallable access) {
        super(id, playerInventory, access);
        this.access = access;
    }
     */

    public AlienTableContainer(int id, World level, BlockPos pos, PlayerInventory playerInventory, PlayerEntity playerEntity, IWorldPosCallable p_i50090_3_) {
        super(id, playerInventory);
        this.access = p_i50090_3_;
        this.player = playerInventory.player;
        this.addSlot(new CraftingResultSlot(playerInventory.player, this.craftSlots, this.resultSlots, 0, 124, 35));

    }

    @Override
    protected static void slotChangedCraftingGrid(int id, World pos, PlayerEntity playerInventory, CraftingInventory p_217066_3_, CraftResultInventory p_217066_4_) {
        if (!pos.isClientSide) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity)playerInventory;
            ItemStack itemstack = ItemStack.EMPTY;
            Optional<ICraftingRecipe> optional = pos.getServer().getRecipeManager().getRecipeFor(RecipeTypeInit.ALIEN_TABLE, p_217066_3_, pos);
            if (optional.isPresent()) {
                ICraftingRecipe icraftingrecipe = optional.get();
                if (p_217066_4_.setRecipeUsed(pos, serverplayerentity, icraftingrecipe)) {
                    itemstack = icraftingrecipe.assemble(p_217066_3_);
                }
            }

            p_217066_4_.setItem(0, itemstack);
            serverplayerentity.connection.send(new SSetSlotPacket(id, 0, itemstack));
        }
    }
    @Override
    public void slotsChanged(IInventory p_75130_1_) {
        this.access.execute((p_217069_1_, p_217069_2_) -> {
            slotChangedCraftingGrid(this.containerId, p_217069_1_, this.player, this.craftSlots, this.resultSlots);
        });
    }


}


