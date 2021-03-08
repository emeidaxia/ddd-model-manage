package com.ccb.emm.mm.gateway.acl.port;

import  com.ccb.emm.mm.event.Event;
public interface EventPublisher<T extends Event> {
    void publish(T event);
}