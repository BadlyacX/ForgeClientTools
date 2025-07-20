package com.badlyac.clienttools.keybindings;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.input.Keyboard;

public class Keybindings {

    public static void register() {
        ClientRegistry.registerKeyBinding(toggle_night_vision);
        ClientRegistry.registerKeyBinding(toggle_sprint);
    }

    public static final KeyBinding toggle_night_vision =
            new KeyBinding(
                    "key.toggle_night_vision",
                    Keyboard.KEY_NONE,
                    "key.categories.clienttools"
            );
    public static final KeyBinding toggle_sprint =
            new KeyBinding(
                    "key.toggle_sprint",
                    Keyboard.KEY_X,
                    "key.categories.clienttools"
            );

}