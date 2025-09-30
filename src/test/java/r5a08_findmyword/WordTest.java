package r5a08_findmyword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordTest {

    @Test
    public void should_check_one_incorrect_letter() {
        // Arrange
        Word word = new Word("E"); // Le mot à deviner fait une lettre

        // Act
        boolean result = word.guess('A'); // On essaie une lettre incorrecte

        // Assert
        assertFalse(result, "La lettre 'A' ne devrait pas être reconnue comme correcte pour le mot 'E'.");
        assertEquals(1, word.getIncorrectTries(), "Le compteur d'erreurs devrait être incrémenté.");
    }
}

