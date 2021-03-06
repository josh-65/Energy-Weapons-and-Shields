package com.ews.items.tools;

import com.ews.Main;
import com.ews.init.ModItems;
import com.ews.util.IHasModel;


import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
    	
public ToolSword(String name, ToolMaterial material){
    super(material);
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(Main.EWS_TAB);
	
	ModItems.ITEMS.add(this);
}
	
	
	
    @Override
	public void registerModels(){
		
	Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
