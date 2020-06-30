public class Galaktyka {

    public static void main(String[] args) {

        int telescopeSize, matrixWidth, matrixHeight, ind;
        telescopeSize = 2;
        matrixWidth = telescopeSize + 2;
        matrixHeight = telescopeSize + 3;

//        String[][] matrixOfStars={
//                {"*","*","*","*"},
//                {".",".",".","*"},
//                {"*","*",".","*"},
//                {"*",".",".","*"},
//                {"*","*","*","*"}
//        };

        String[][] matrixOfStars = new String[matrixHeight][matrixWidth];

        //dwie pierwsze linie są podobne w każdym wzorze
        //zaczynamy w 3 od pozycji równej telescopeSize
        //wykonujemy tyle pętli ile wynosi telescopeSize
        //są 4 kierunki wypełniania - zrobić dzielenie wskażnika pętli modulo 4 (0,1,2,3)
        //w zależności o wyniku modulo wypełniaj w dół, w lewo, w górę, w prawo

//        ind = 0;
//
//        for (int i = 0; i < matrixHeight; i++) {
//            for (int j = 0; j < matrixWidth; j++) {
//                matrixOfStars[i][j] = String.format("%-3s", Integer.toString(ind));
//                ind++;
//            }
//        }

        for (int i = 0; i < matrixWidth; i++) {
            matrixOfStars[0][i] = "*";
        }

        //main loop, telescopeSize + 2
        for (int i = 0; i < telescopeSize + 2; i++) {

        }


        //printing in orientation

        //W
        for (int i = 0; i < matrixHeight; i++) {
            for (int j = 0; j < matrixWidth; j++) {
                System.out.print(matrixOfStars[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        //E
        for (int i = matrixHeight - 1; i >= 0; i--) {
            for (int j = matrixWidth - 1; j >= 0; j--) {
                System.out.print(matrixOfStars[i][j]);
            }
            System.out.println();
        }


        System.out.println();

        //N
        for (int j = 0; j < matrixWidth; j++) {
            for (int i = matrixHeight - 1; i >= 0; i--) {
                System.out.print(matrixOfStars[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        //S
        for (int j = matrixWidth - 1; j >= 0; j--) {
            for (int i = 0; i < matrixHeight; i++) {
                System.out.print(matrixOfStars[i][j]);
            }
            System.out.println();
        }


    }
}
