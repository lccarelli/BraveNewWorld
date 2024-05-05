package tech.lab.bravenewworld.domain.model.character.vo;

import lombok.ToString;

import java.util.Objects;

@ToString
public class CharacterId {
    private final Long id;

    public CharacterId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterId that = (CharacterId) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
