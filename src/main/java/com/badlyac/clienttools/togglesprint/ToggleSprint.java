package com.badlyac.clienttools.togglesprint;

import com.badlyac.clienttools.keybindings.Keybindings;
import com.badlyac.clienttools.utils.gameaccess.GameAccess;
import com.badlyac.clienttools.utils.msg.MsgUtil;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class ToggleSprint {

    private static boolean enabled = true;
    private static final int sprintKeycode = GameAccess.getGS().keyBindSprint.getKeyCode();

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (!enabled) return;
        KeyBinding.setKeyBindState(sprintKeycode, true);
    }

    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event) {
        if (Keybindings.toggle_sprint.isPressed()) {
            enabled = !enabled;
            KeyBinding.setKeyBindState(sprintKeycode, enabled);
            MsgUtil.sendMsg2Player(
                    enabled ? "ToggleSprint has enabled" : "ToggleSprint has disabled",
                    enabled ? EnumChatFormatting.GREEN : EnumChatFormatting.RED
            );
        }
    }
}