package net.comdude2.plugins.interactivelogger.recording;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import javax.annotation.Nullable;

public class Record {

    private final String pName, eventName, mobName;
    private final Location loc;
    private long timeStamp;

    public Record(@Nullable Entity ent, @javax.annotation.Nonnull Location l, @javax.annotation.Nonnull String eventName) {
        this.pName = ent instanceof Player ? ((Player) ent).getPlayer().getName() : null;
        this.mobName = ent instanceof Player ? null : ent.getName();
        this.loc = l;
        this.eventName = eventName;
    }

    public Location getLoc() {
        return this.loc;
    }

    public String getEntityName() {
        return this.isPlayer() ? pName : mobName;
    }

    public boolean isPlayer() {
        return pName == null;
    }

    public String getName() {
        return this.pName;
    }
    public void provideTime(long timestamp) {
        this.timeStamp = timestamp;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }
}
