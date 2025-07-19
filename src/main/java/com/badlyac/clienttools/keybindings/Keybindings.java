package com.badlyac.clienttools.keybindings;

import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class Keybindings {
    public static final KeyBinding toggle_night_vision =
            new KeyBinding(
                    "key.toggle_night_vision",
                    Keyboard.KEY_NONE,
                    "key.categories.clienttools"
            );
}
