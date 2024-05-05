package tech.lab.bravenewworld.application.publish;

import tech.lab.bravenewworld.domain.model.character.CharacterPublished;
import tech.lab.bravenewworld.domain.model.character.vo.CharacterDescription;
import tech.lab.bravenewworld.domain.model.character.vo.CharacterTitle;

public class CharacterPublisher {
    private final EventBus eventBus;

    public CharacterPublisher(Object eventBus) {
        this.eventBus = (EventBus) eventBus;
    }

    public void publish(String rawTitle, String rawDescription) {
        CharacterTitle title = new CharacterTitle(rawTitle);
        CharacterDescription description = new CharacterDescription(rawDescription);
        CharacterPublished characterPublished = CharacterPublished.publish(title, description);
        eventBus.publish(characterPublished.pullDomainEvents());
    }
}
