package tech.lab.bravenewworld.infraestructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.lab.bravenewworld.application.port.in.CharacterQuery;
import tech.lab.bravenewworld.domain.model.character.exceptions.CharacterNotFoundException;
import tech.lab.bravenewworld.domain.model.character.Character;


@RestController
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterQuery characterQuery;

    @Autowired
    public CharacterController(CharacterQuery characterQuery) {
        this.characterQuery = characterQuery;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Character> getCharacter(@PathVariable Long id) throws CharacterNotFoundException {
        Character character = characterQuery.getCharacter(id);
        if (character != null) {
            return ResponseEntity.ok(character);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}