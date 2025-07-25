package com.badlyac.clienttools;

import com.badlyac.clienttools.keybindings.Keybindings;
import com.badlyac.clienttools.nightvision.NightVision;
import com.badlyac.clienttools.togglesprint.ToggleSprint;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
    public static final String MODID = "clienttools";
    public static final String VERSION = "1.8.9";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Keybindings.register();

        new ToggleSprint();
        new NightVision();

       // MinecraftForge.EVENT_BUS.register(new NightVision());
       // MinecraftForge.EVENT_BUS.register(new ToggleSprint());
    }
}