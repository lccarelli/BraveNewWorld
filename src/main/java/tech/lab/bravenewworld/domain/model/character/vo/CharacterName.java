package tech.lab.bravenewworld.domain.model.character.vo;

import lombok.ToString;

import java.util.Objects;

@ToString
public class CharacterName {
    private final String description;

    public CharacterName(String title) {
        this.description = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterName that = (CharacterName) o;

        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return description != null ? description.hashCode() : 0;
    }
}
