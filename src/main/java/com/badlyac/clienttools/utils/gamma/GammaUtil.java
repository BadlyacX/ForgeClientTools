package com.badlyac.clienttools.utils.gamma;

import com.badlyac.clienttools.utils.gameaccess.GameAccess;
import net.minecraft.client.settings.GameSettings;

public class GammaUtil {

    private static final GameSettings gameSettings = GameAccess.getGS();
    private static final float defaultGamma = 0.5f;

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
