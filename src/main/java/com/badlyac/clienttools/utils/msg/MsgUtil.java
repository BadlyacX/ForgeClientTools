package com.badlyac.clienttools.utils.msg;

import com.badlyac.clienttools.utils.gameaccess.GameAccess;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class MsgUtil {
    public static void sendMsg2Player(String msg, EnumChatFormatting color) {
        GameAccess.getPlayer().addChatMessage(new ChatComponentText( color + msg));
    }
}
