package net.comdude2.plugins.interactivelogger.recording;

import org.bukkit.event.Event;

import java.util.Arrays;
import java.util.HashSet;

public class Record {

    private org.bukkit.event.Event event;
    private long timeStamp;
    private static final HashSet<Class> accepted = new HashSet<Class>(Arrays.asList(org.bukkit.event.block.BlockBreakEvent.class));

    private Record() {}

    public static Record init(Event e) {
        if(!accepted.contains(e.getClass())) {
            Record rc = new Record();
            rc.setEvent(e);
            return rc;
        }
        return null;
    }

    private void setEvent(Event e) {
        this.event = e;
    }

    public void provideTime(long timestamp) {
        this.timeStamp = timestamp;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }
}
