package tech.lab.bravenewworld.application.publish;

import tech.lab.bravenewworld.domain.DomainEvent;

import java.util.List;

public interface EventBus {

    void publish(final List<DomainEvent> events);
}
