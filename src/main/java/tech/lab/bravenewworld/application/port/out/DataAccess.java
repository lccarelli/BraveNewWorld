package tech.lab.bravenewworld.application.port.out;

import tech.lab.bravenewworld.domain.model.character.exceptions.CharacterNotFoundException;
import tech.lab.bravenewworld.infraestructure.persistence.model.CharacterEntity;

public interface DataAccess {
    CharacterEntity findById(Long id) throws CharacterNotFoundException;
}
