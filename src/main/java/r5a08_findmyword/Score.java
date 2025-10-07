package r5a08_findmyword;

public class Score {

    private final String correct;
    private final Letter[] results;

    public Score(String correct) {
        this.correct = correct;
        this.results = new Letter[correct.length()];
        for (int i = 0; i < results.length; i++) {
            results[i] = Letter.INCORRECT; // par défaut
        }
    }

    public Letter letter(int i) {
        return results[i];
    }

    /**
     * Évalue toute la tentative et calcule le score de chaque position.
     */
    public void assess(String attempt) {
        for (int position = 0; position < correct.length(); position++) {
            if (assertCorrectLetter(position, attempt)) {
                results[position] = Letter.CORRECT;
            }
        }
    }

    /**
     * Vérifie si la lettre proposée à la position donnée est correcte.
     */
    private boolean assertCorrectLetter(int position, String attempt) {
        return this.correct.charAt(position) == attempt.charAt(position);
    }
}
