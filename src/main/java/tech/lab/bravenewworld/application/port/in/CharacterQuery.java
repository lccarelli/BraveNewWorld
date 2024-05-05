package tech.lab.bravenewworld.application.port.in;

import tech.lab.bravenewworld.domain.model.character.exceptions.CharacterNotFoundException;
import tech.lab.bravenewworld.domain.model.character.Character;


public interface CharacterQuery {
    Character getCharacter(Long id) throws CharacterNotFoundException;
}

