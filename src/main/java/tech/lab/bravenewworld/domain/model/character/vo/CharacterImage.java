package tech.lab.bravenewworld.domain.model.character.vo;

import java.util.Objects;

public class CharacterImage {
    private final String description;

    public CharacterImage(String title) {
        this.description = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterImage that = (CharacterImage) o;

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
