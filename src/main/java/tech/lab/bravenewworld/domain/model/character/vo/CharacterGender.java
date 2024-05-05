package tech.lab.bravenewworld.domain.model.character.vo;

import java.util.Objects;

public class CharacterGender {
    private final String description;

    public CharacterGender(String title) {
        this.description = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterGender that = (CharacterGender) o;

        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return description != null ? description.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CharacterTitle{" +
                "title='" + description + '\'' +
                '}';
    }
}
