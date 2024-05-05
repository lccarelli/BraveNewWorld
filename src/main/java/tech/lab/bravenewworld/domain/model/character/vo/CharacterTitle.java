package tech.lab.bravenewworld.domain.model.character.vo;

import java.util.Objects;

public class CharacterTitle {
    private final String title;

    public CharacterTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterTitle that = (CharacterTitle) o;

        return Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "CharacterTitle{" +
                "title='" + title + '\'' +
                '}';
    }
}
