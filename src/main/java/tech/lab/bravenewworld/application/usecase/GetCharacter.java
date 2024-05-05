package tech.lab.bravenewworld.application.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.lab.bravenewworld.application.port.in.CharacterQuery;
import tech.lab.bravenewworld.application.port.out.DataAccess;
import tech.lab.bravenewworld.domain.mapper.Mapper;
import tech.lab.bravenewworld.domain.model.character.exceptions.CharacterNotFoundException;
import tech.lab.bravenewworld.infraestructure.persistence.model.CharacterEntity;
import tech.lab.bravenewworld.domain.model.character.Character;

@Service
public class GetCharacter implements CharacterQuery {

    private final DataAccess characterRepository;
    private final Mapper mapper;

    @Autowired
    public GetCharacter(DataAccess characterRepository, Mapper mapper ) {
        this.characterRepository = characterRepository;
        this.mapper = mapper;
    }

    @Override
    public Character getCharacter(Long id) throws CharacterNotFoundException {
        CharacterEntity character = characterRepository.findById(id);
        return mapper.toDomain(character);
    }
}
