package me.emeric1601.mcscp;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MCSCP.MODID, name = MCSCP.NAME, version = MCSCP.VERSION)
public class MCSCP {
	public static final String MODID = "mcscp";
	public static final String NAME = "MCSCP";
	public static final String VERSION = "1.0";

	private static Logger log;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		log = event.getModLog();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
}
