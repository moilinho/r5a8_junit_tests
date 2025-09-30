package r5a08_findmyword;
import r5a08_findmyword.Letter;


import java.util.HashSet;
import java.util.Set;


public class Word {

    private final String word;

    public Word(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Le mot ne peut pas être vide.");
        }
        this.word = word.toUpperCase();
    }

    /**
     * Évalue une tentative et renvoie un Score.
     * Pour l’instant : implémentation simple pour le cas d’un mot d’une seule lettre.
     */
    public Score guess(String attempt) {
        if (attempt == null || attempt.isEmpty()) {
            throw new IllegalArgumentException("La tentative ne peut pas être vide.");
        }

        Letter[] result = new Letter[word.length()];

        // Implémentation KISS : on compare chaque lettre
        for (int i = 0; i < word.length(); i++) {
            char expected = word.charAt(i);
            char actual = Character.toUpperCase(attempt.charAt(i));

            if (expected == actual) {
                result[i] = Letter.CORRECT;
            } else {
                result[i] = Letter.INCORRECT;
            }
        }

        return new Score(result);
    }
}
