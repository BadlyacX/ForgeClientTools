package com.badlyac.clienttools.PlayerController;


import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;

public class PlayerMovements {

    enum Direction9 {
        EAST,
        WEST,
        NORTH,
        SOUTH,
        NORTH_EAST,
        NORTH_WEST,
        SOUTH_EAST,
        SOUTH_WEST,
        ALL_DIRECTION
    }

    public static void moveInDirection(Direction9 direction) {
        switch (direction) {
            case NORTH:
                moveForward(true);
                break;
            case SOUTH:
                moveBackward(true);
                break;
            case EAST:
                moveRight(true);
                break;
            case WEST:
                moveLeft(true);
                break;
            case NORTH_EAST:
                moveForward(true);
                moveRight(true);
                break;
            case NORTH_WEST:
                moveForward(true);
                moveLeft(true);
                break;
            case SOUTH_EAST:
                moveBackward(true);
                moveRight(true);
                break;
            case SOUTH_WEST:
                moveBackward(true);
                moveLeft(true);
                break;
        }
    }

    public static void stopMoveInDirection(Direction9 direction) {
        switch (direction) {
            case NORTH:
                moveForward(false);
                break;
            case SOUTH:
                moveBackward(false);
                break;
            case EAST:
                moveRight(false);
                break;
            case WEST:
                moveLeft(false);
                break;
            case NORTH_EAST:
                moveForward(false);
                moveRight(false);
                break;
            case NORTH_WEST:
                moveForward(false);
                moveLeft(false);
                break;
            case SOUTH_EAST:
                moveBackward(false);
                moveRight(false);
                break;
            case SOUTH_WEST:
                moveBackward(false);
                moveLeft(false);
                break;
            case ALL_DIRECTION:
                moveRight(false);
                moveLeft(false);
                moveBackward(false);
                moveForward(false);

        }
    }

    public static void moveForward(boolean pressed) {
        setKey(Minecraft.getMinecraft().gameSettings.keyBindForward, pressed);
    }

    public static void moveBackward(boolean pressed) {
        setKey(Minecraft.getMinecraft().gameSettings.keyBindBack, pressed);
    }

    public static void moveLeft(boolean pressed) {
        setKey(Minecraft.getMinecraft().gameSettings.keyBindLeft, pressed);
    }

    public static void moveRight(boolean pressed) {
        setKey(Minecraft.getMinecraft().gameSettings.keyBindRight, pressed);
    }

    public static void jump(boolean pressed) {
        setKey(Minecraft.getMinecraft().gameSettings.keyBindJump, pressed);
    }

    private static void setKey(KeyBinding key, boolean active) {
        int code = key.getKeyCode();
        KeyBinding.setKeyBindState(code, active);
    }
}
