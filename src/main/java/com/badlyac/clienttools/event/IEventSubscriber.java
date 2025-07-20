package com.badlyac.clienttools.event;

import net.minecraftforge.common.MinecraftForge;

public interface IEventSubscriber {
    default void registerToForgeBus() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
