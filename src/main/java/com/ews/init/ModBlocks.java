package com.ews.init;

import com.ews.blocks.RubyBlock;
import com.ews.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;


public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);

    public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.IRON);

    public static final Block TOPAZ_BLOCK = new RubyBlock("topaz_block", Material.IRON);

    public static final Block TOPAZ_ORE = new RubyOre("topaz_ore", Material.IRON);


}
