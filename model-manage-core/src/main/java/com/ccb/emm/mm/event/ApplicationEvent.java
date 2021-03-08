package com.ccb.emm.mm.event;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class ApplicationEvent implements Event {
    protected final String eventId;
    protected final String createdTimestamp;
    protected final String version;

    public ApplicationEvent() {
        this("v1.0");
    }

    public ApplicationEvent(String version) {
        eventId = UUID.randomUUID().toString();
        createdTimestamp = LocalDateTime.now().toString();
        this.version = version;
    }

    @Override
    public String eventId() {
        return eventId;
    }
}