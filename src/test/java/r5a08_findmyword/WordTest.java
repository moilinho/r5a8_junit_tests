package r5a08_findmyword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordTest {

    @Test
    public void should_score_one_correct_letter() {
        // Arrange
        Word word = new Word("E"); // Mot à deviner : "E"

        // Act
        Score actual = word.guess("E"); // résultat obtenu
        Letter expected = Letter.CORRECT; // attendu

        // Assert
        assertEquals(expected, actual.letter(0),
                "La première lettre devrait être CORRECT car la tentative est 'E'.");
    }
}
