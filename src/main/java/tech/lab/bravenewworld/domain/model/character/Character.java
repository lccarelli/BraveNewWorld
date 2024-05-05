package tech.lab.bravenewworld.domain.model.character;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tech.lab.bravenewworld.domain.*;
import tech.lab.bravenewworld.domain.model.character.vo.*;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class Character extends AggregateRoot{
    private CharacterId id;
    private CharacterName name;
    private CharacterStatus status;
    private CharacterSpecies species;
    private CharacterType type;
    private CharacterGender gender;
    private CharacterOrigin origin;
    private CharacterImage image;
    private LocalDateTime created;
    private LocalDateTime updated;
}
