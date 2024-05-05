package tech.lab.bravenewworld.domain.model.character.vo;

import lombok.ToString;

import java.util.Objects;

@ToString
public class CharacterDescription {
    private final String description;

    public CharacterDescription(String title) {
        this.description = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterDescription that = (CharacterDescription) o;

        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return description != null ? description.hashCode() : 0;
    }

}
