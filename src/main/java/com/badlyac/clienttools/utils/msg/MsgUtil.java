package com.badlyac.clienttools.utils.msg;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class MsgUtil {
    private static final Minecraft mc = Minecraft.getMinecraft();
    public static void sendMsg2Player(String msg, EnumChatFormatting color) {
        mc.thePlayer.addChatMessage(new ChatComponentText( color + msg));
    }
}
