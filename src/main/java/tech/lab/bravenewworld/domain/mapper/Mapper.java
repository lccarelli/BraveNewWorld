package tech.lab.bravenewworld.domain.mapper;

import tech.lab.bravenewworld.infraestructure.persistence.model.CharacterEntity;
import tech.lab.bravenewworld.domain.model.character.Character;

public interface Mapper {
    Character toDomain(CharacterEntity entity);
    CharacterEntity toEntity(Character domain);
}

