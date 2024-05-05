package tech.lab.bravenewworld.domain.model.character.exceptions;

public class CharacterNotFoundException extends Exception {
    public CharacterNotFoundException(String message) {
        super(message);
    }
}