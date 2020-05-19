package com.ews.creativetabs;

import com.ews.init.ModItems;
import com.ews.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EwsTab extends CreativeTabs {

        public EwsTab() {
		    super(Reference.MOD_ID);
	}

    
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.RUBY);
    }


}