package com.badlyac.clienttools.nightvision;

import com.badlyac.clienttools.utils.gamma.GammaUtil;
import com.badlyac.clienttools.utils.msg.MsgUtil;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import com.badlyac.clienttools.keybindings.Keybindings;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class NightVision {
    private static boolean enabled = true;

    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (!enabled) return;
        GammaUtil.setGamma(10);
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (Keybindings.toggle_night_vision.isPressed()) {
            enabled = !enabled;
            if (enabled) {
                GammaUtil.setGamma(10);
                MsgUtil.sendMsg2Player("NightVision has enabled", EnumChatFormatting.GREEN);
            } else {
                GammaUtil.setGammaToDefault();
                MsgUtil.sendMsg2Player("NightVision has disabled", EnumChatFormatting.RED);
            }
        }
    }
}


