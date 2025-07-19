package com.badlyac.clienttools.utils.gamma;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

public class GammaUtil {

    private static final GameSettings gameSettings = Minecraft.getMinecraft().gameSettings;
    private static final float defaultGamma = gameSettings.gammaSetting;

    public static void setGamma(float value) {
        gameSettings.gammaSetting = value;
    }

    public static float getGammaValue() {
        return gameSettings.gammaSetting;
    }

    public static void setGammaToDefault() {
        gameSettings.gammaSetting = defaultGamma;
    }
}
