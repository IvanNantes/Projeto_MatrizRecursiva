import  java.util.Random;

public class Main {

    public static void main(String[] args) {

        int valorx = 4;
        int valory = 6;

        int [][]matriz = new int [valorx][valory];

        Random rand = new Random();
        int valorMaximo = 50;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(valorMaximo);
            }
        }
        lerMatriz(0, 0, matriz);
    }

    public static void lerMatriz(int i, int j, int [][]matriz) {

        if (i == matriz.length) {
            return;
        }
        if (j == matriz[i].length){
            System.out.println();
            lerMatriz(i + 1, 0, matriz);
        } else {
            System.out.print(matriz[i][j]+ " - ");
            lerMatriz(i,j + 1, matriz);
        }
    }
}