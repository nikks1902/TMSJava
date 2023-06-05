package by.teachmeskills.homeworks.hw100323.part1_task1;

public enum LetterAlphabetPosition {
    A, B, C, D, E, F, G, H, I, J, K, L, M,
    N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

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
        System.out.println(LetterAlphabetPosition.K.getLetterPosition());
        System.out.println(LetterAlphabetPosition.L.getLetterPosition());
        System.out.println(LetterAlphabetPosition.M.getLetterPosition());
        System.out.println(LetterAlphabetPosition.N.getLetterPosition());
        System.out.println(LetterAlphabetPosition.O.getLetterPosition());
        System.out.println(LetterAlphabetPosition.P.getLetterPosition());
        System.out.println(LetterAlphabetPosition.Q.getLetterPosition());
        System.out.println(LetterAlphabetPosition.R.getLetterPosition());
        System.out.println(LetterAlphabetPosition.S.getLetterPosition());
        System.out.println(LetterAlphabetPosition.T.getLetterPosition());
        System.out.println(LetterAlphabetPosition.U.getLetterPosition());
        System.out.println(LetterAlphabetPosition.V.getLetterPosition());
        System.out.println(LetterAlphabetPosition.W.getLetterPosition());
        System.out.println(LetterAlphabetPosition.X.getLetterPosition());
        System.out.println(LetterAlphabetPosition.Y.getLetterPosition());
        System.out.println(LetterAlphabetPosition.Z.getLetterPosition());
    }
}
