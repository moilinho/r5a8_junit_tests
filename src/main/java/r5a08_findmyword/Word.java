package r5a08_findmyword;

public class Word {
    private final String word;

    public Word(String correctWord) {
        if (correctWord == null || correctWord.isEmpty()) {
            throw new IllegalArgumentException("Le mot ne peut pas être vide.");
        }
        this.word = correctWord;
    }

    public Score guess(String attempt) {
        if (attempt == null || attempt.length() != word.length()) {
            throw new IllegalArgumentException("La tentative doit avoir la même longueur que le mot à deviner.");
        }
        Score score = new Score(word);
        score.assess(attempt);   // encapsulation de la logique dans Score
        return score;
    }
}
