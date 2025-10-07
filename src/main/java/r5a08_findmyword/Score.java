package r5a08_findmyword;

public class Score {

    private final String correct;
    private Letter result = Letter.INCORRECT;

    public Score(String correct) {
        this.correct = correct;
    }

    public Letter letter(int i) {
        return result;
    }

    /**
     * Évalue la lettre proposée à la position donnée.
     */
    public void assess(int position, String attempt) {
        if (this.correct.charAt(position) == attempt.charAt(position)) {
            result = Letter.CORRECT;
        }
    }
}
