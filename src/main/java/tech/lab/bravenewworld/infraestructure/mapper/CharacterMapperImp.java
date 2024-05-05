package tech.lab.bravenewworld.infraestructure.mapper;

import org.springframework.stereotype.Service;
import tech.lab.bravenewworld.domain.mapper.Mapper;
import tech.lab.bravenewworld.domain.model.character.vo.*;
import tech.lab.bravenewworld.infraestructure.persistence.model.CharacterEntity;
import tech.lab.bravenewworld.domain.model.character.Character;

@Service
class CharacterMapper implements Mapper {

    @Override
    public Character toDomain(CharacterEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Character(
                new CharacterId(entity.getId()),
                new CharacterName(entity.getName()),
                new CharacterStatus(entity.getStatus()),
                new CharacterSpecies(entity.getSpecies()),
                entity.getType() != null ? new CharacterType(entity.getType()) : null,
                new CharacterGender(entity.getGender()),
                new CharacterOrigin(entity.getOrigin()),
                new CharacterImage(entity.getImage()),
                entity.getCreated(),
                null
        );
    }

    @Override
    public CharacterEntity toEntity(Character domain) {
        if (domain == null) {
            return null;
        }
        CharacterEntity entity = new CharacterEntity();
        entity.setId(Long.valueOf(String.valueOf(domain.getId())));
        entity.setName(String.valueOf(domain.getName()));
        entity.setStatus(String.valueOf(domain.getStatus()));
        entity.setSpecies(String.valueOf(domain.getSpecies()));
        entity.setType(domain.getType() != null ? String.valueOf(domain.getType()) : null);
        entity.setGender(String.valueOf(domain.getGender()));
        entity.setOrigin(String.valueOf(domain.getOrigin()));
        entity.setImage(String.valueOf(domain.getImage()));
        entity.setCreated(domain.getCreated());
        return entity;
    }
}

