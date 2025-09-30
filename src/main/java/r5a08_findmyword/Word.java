package r5a08_findmyword;

import java.util.HashSet;
import java.util.Set;

public class Word {

    private final String word;               // Le mot à deviner
    private final Set<Character> guessed;    // Lettres déjà proposées
    private int incorrectTries;              // Compteur de tentatives incorrectes

    public Word(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Le mot ne peut pas être vide.");
        }
        this.word = word.toUpperCase();
        this.guessed = new HashSet<>();
        this.incorrectTries = 0;
    }

    /**
     * Propose une lettre et retourne true si elle est correcte,
     * false sinon. Incrémente le compteur d'erreurs si la lettre
     * est incorrecte et non déjà proposée.
     */
    public boolean guess(char letter) {
        char upper = Character.toUpperCase(letter);

        // Si déjà proposée → on ne compte pas deux fois
        if (guessed.contains(upper)) {
            return word.indexOf(upper) >= 0;
        }

        guessed.add(upper);

        if (word.indexOf(upper) >= 0) {
            return true; // Lettre correcte
        } else {
            incorrectTries++;
            return false; // Lettre incorrecte
        }
    }

    /** Retourne le nombre d'essais incorrects. */
    public int getIncorrectTries() {
        return incorrectTries;
    }

    /** Retourne le mot original (utile pour fin de partie). */
    public String getWord() {
        return word;
    }
}