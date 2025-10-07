package r5a08_findmyword;

import java.util.HashSet;
import java.util.Set;

public class Word {
    private String word;

    public Word(String correctWord) {
        this.word = correctWord;
    }

    public Score guess(String attempt) {
        Score score = new Score(word);

        score.assess(0, attempt);

        return score;
    }

    public int getIncorrectTries() {
        return 0;
    }
}