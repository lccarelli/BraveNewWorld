package tech.lab.bravenewworld.domain.model.character;

import tech.lab.bravenewworld.domain.DomainEvent;
import tech.lab.bravenewworld.domain.model.character.vo.CharacterDescription;
import tech.lab.bravenewworld.domain.model.character.vo.CharacterTitle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class CharacterPublished extends DomainEvent {

    private static final String FULL_QUALIFIED_EVENT_NAME = "braveness.domain.character.event.1.character.published";

    private final CharacterTitle title;
    private final CharacterDescription description;


    public CharacterPublished(CharacterTitle title, CharacterDescription description) {
        this.title = title;
        this.description = description;
    }

    public static CharacterPublished publish(CharacterTitle title, CharacterDescription description){
        return new CharacterPublished(title, description);
    }

    public List<DomainEvent> pullDomainEvents(){
        //todo: implement me
        return null;
    }

    public String fullQualifiedEventName() {
        return FULL_QUALIFIED_EVENT_NAME;
    }

    public CharacterTitle title() {
        return title;
    }

    public CharacterDescription description() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterPublished that = (CharacterPublished) o;

        if (!title.equals(that.title)) return false;
        return description.equals(that.description);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String eventName() {
        return "";
    }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return null;
    }

    @Override
    public DomainEvent fromPrimitives(String aggregateId, HashMap<String, Serializable> body, String eventId, String occurredOn) {
        return null;
    }
}
