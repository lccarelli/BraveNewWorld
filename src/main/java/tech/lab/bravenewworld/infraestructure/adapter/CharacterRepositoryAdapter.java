package tech.lab.bravenewworld.infraestructure.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.lab.bravenewworld.application.port.out.DataAccess;
import tech.lab.bravenewworld.infraestructure.persistence.model.CharacterEntity;
import tech.lab.bravenewworld.infraestructure.persistence.repository.CharacterRepository;

import java.util.Optional;

@Component
public class CharacterRepositoryAdapter implements DataAccess {

    private final CharacterRepository characterRepository;

    @Autowired
    public CharacterRepositoryAdapter(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public CharacterEntity findById(Long id) {
        Optional<CharacterEntity> result = characterRepository.findById(id);
        return result.orElse(null);
    }
}
