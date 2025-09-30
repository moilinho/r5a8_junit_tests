package r5a08_findmyword;

public enum Letter {
    CORRECT,      // Lettre correcte et bien placée
    PART_CORRECT, // Lettre présente mais mal placée (utile plus tard)
    INCORRECT     // Lettre absente du mot
}
