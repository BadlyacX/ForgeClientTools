package com.badlyac.clienttools;

import net.minecraftforge.common.MinecraftForge;

public interface IEventSubscriber {
    default void registerToForgeBus() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
