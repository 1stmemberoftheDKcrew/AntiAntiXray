package me.constantindev.antiantixray.Etc;

import me.constantindev.antiantixray.Commands.Manager;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import org.lwjgl.glfw.GLFW;

public class Config {
    public static int rad = 5;
    public static long delay = 1;    
                // NEVER EVER SET DELAY TO ZERO
    public static Manager manager = new Manager();
    public static boolean scanAll = false;
    public static boolean auto = false;
    public static int mtreshold = 2;
    public static Block[] checkblocks = {
            Blocks.DIAMOND_ORE, Blocks.LAPIS_ORE, Blocks.ANCIENT_DEBRIS, Blocks.CRAFTING_TABLE, Blocks.NETHER_QUARTZ_ORE, Blocks.EMERALD_ORE, Blocks.COAL_ORE,};
    public static int kcScan = GLFW.GLFW_KEY_Y;
   // i want to use my V key piss off
    public static int kcRemove = GLFW.GLFW_KEY_F25;

}


