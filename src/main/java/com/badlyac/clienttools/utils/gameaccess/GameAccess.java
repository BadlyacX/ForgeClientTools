package com.badlyac.clienttools.utils.gameaccess;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

public class GameAccess {
    public static Minecraft getMc() {
        return Minecraft.getMinecraft();
    }

    public static GameSettings getGS() {
        return getMc().gameSettings;
    }
}
