package com.yusuf.bentenmobmod.core.itemgroup;

import com.yusuf.bentenmobmod.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MainItemGroup extends ItemGroup {

	public static final MainItemGroup MAIN = new MainItemGroup(ItemGroup.GROUPS.length, "main");

	public MainItemGroup(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(ItemInit.OMNITRIX.get());
	}


}
