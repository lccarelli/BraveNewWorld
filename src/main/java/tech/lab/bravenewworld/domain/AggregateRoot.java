package tech.lab.bravenewworld.domain;

import java.util.LinkedList;
import java.util.List;

public abstract class AggregateRoot {
    private List<DomainEvent> recordedDomainEvents = new LinkedList<>();

    public List<DomainEvent> pullDomainEvents() {
        List<DomainEvent> events = this.recordedDomainEvents;
        this.recordedDomainEvents = new LinkedList<>();
        return events;
    }

    protected void record(DomainEvent event) {
        this.recordedDomainEvents.add(event);
    }
}
