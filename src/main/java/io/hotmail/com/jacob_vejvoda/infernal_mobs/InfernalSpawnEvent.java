package io.hotmail.com.jacob_vejvoda.infernal_mobs;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import io.hotmail.com.jacob_vejvoda.infernal_mobs.InfernalMob;

public class InfernalSpawnEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private Entity ent;
    private boolean cancelled;
    private InfernalMob infernal;

    public InfernalSpawnEvent(Entity ent, InfernalMob infernal){
        this.ent = ent;
        this.infernal = infernal;
    }

    public Entity getEntity(){
        return this.ent;
    }

    public InfernalMob getInfernal(){
        return this.infernal;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}