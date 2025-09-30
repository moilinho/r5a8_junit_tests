package r5a08_findmyword;
import r5a08_findmyword.Letter;

public class Score {

    private final Letter[] letters;

    public Score(Letter[] letters) {
        this.letters = letters;
    }

    /**
     * Retourne le score d’une lettre à l’index donné.
     */
    public Letter letter(int index) {
        return letters[index];
    }
}
