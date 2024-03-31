package lab8p1_danieljuarez;

import java.util.Scanner;

public class Chones {

    static Scanner lea = new Scanner(System.in);

    public char[][] MetodoChones(int num) {

        char[][] Chones = new char[num][num];
        int legs = num / 2;

        for (int i = 0; i < Chones.length; i++) {
            for (int j = 0; j < Chones[i].length; j++) {
                if (i == 0) {
                    Chones[i][j] = '*';
                } else {
                    Chones[i][j] = '+';
                }
                if (j == 0 || j == num - 1) {
                    Chones[i][j] = '*';
                } else {
                    Chones[i][j] = '+';
                }
                if (i == 0 && j < num) {
                    Chones[i][j] = '*';
                }
                if (i == num - 1) {
                    Chones[i][j] = '*';
                }
                if (i == legs && j >= legs - 1 && j <= legs + 1) {
                    Chones[i][j] = '*';
                }
                if (i > legs && i < num && j >= legs - 1 && j <= legs + 1) {
                    Chones[i][j] = '*';
                }
                if (j == legs && i > legs) {
                    Chones[i][j] = ' ';
                }
                if (i == num - 1 && j == legs) {
                    Chones[i][j] = ' ';
                }
            }
        }
        return Chones;
    }

    public String ImprimirPane(char[][] Chones) {
        String resultado = "";
        for (int i = 0; i < Chones.length; i++) {
            for (int j = 0; j < Chones[i].length; j++) {
                System.out.print(Chones[i][j]);
                resultado += Chones[i][j];
                resultado += " ";
            }
            System.out.println();
            resultado += "\n";
        }
        System.out.println();
        return resultado;
    }

}
