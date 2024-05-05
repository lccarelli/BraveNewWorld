package tech.lab.bravenewworld.infraestructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.lab.bravenewworld.infraestructure.persistence.model.CharacterEntity;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {
}
