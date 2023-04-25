package by.teachmeskills.homeworks.hw_100323;

public enum LetterAlphabetPosition {
    A, B, C, D, E, F, G, H, I, J;

    public int getLetterPosition() {
        return ordinal() + 1;
    }

    public static void main(String[] args) {
        System.out.println(LetterAlphabetPosition.A.getLetterPosition());
        System.out.println(LetterAlphabetPosition.B.getLetterPosition());
        System.out.println(LetterAlphabetPosition.C.getLetterPosition());
        System.out.println(LetterAlphabetPosition.D.getLetterPosition());
        System.out.println(LetterAlphabetPosition.E.getLetterPosition());
        System.out.println(LetterAlphabetPosition.F.getLetterPosition());
        System.out.println(LetterAlphabetPosition.G.getLetterPosition());
        System.out.println(LetterAlphabetPosition.H.getLetterPosition());
        System.out.println(LetterAlphabetPosition.I.getLetterPosition());
        System.out.println(LetterAlphabetPosition.J.getLetterPosition());
    }
}
