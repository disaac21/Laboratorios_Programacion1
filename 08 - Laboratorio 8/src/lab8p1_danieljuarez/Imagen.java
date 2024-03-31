package lab8p1_danieljuarez;

import java.util.Scanner;

public class Imagen {

    static Scanner lea = new Scanner(System.in);

    int[][] iMatriz;

    public Imagen(int[][] Matriz) {
        this.iMatriz = Matriz;
    }

    public int[][] Rotar() {

        int filas = iMatriz.length - 1;
        int columnas = 0;

        int[][] MatrizRotar = new int[iMatriz[0].length][iMatriz.length];

        for (int i = 0; i < MatrizRotar.length; i++) {
            for (int j = 0; j < MatrizRotar[i].length; j++) {
                MatrizRotar[i][j] = iMatriz[filas][i];
                filas--;
                if (filas < 0 || columnas == iMatriz[0].length) {
                    filas = iMatriz.length - 1;
                    columnas = 0;
                }
            }
        }
        return MatrizRotar;
    }

    public int[][] Flip() {

        int filas, columnas;
        int[][] MatrizFlip = new int[iMatriz.length][iMatriz[0].length];

        if (iMatriz.length != iMatriz[0].length) {
            filas = iMatriz.length;
            columnas = iMatriz[0].length - 1;
            for (int i = 0; i < MatrizFlip.length; i++) {
                for (int j = 0; j < MatrizFlip[i].length; j++) {
//                    System.out.println("[" + i + "][" + j + "]=[" + i + "][" + columnas + "]=");
                    MatrizFlip[i][j] = iMatriz[i][columnas];
                    columnas--;
                    if (filas < 0 || columnas < 0) {
                        filas = iMatriz.length - 1;
                        columnas = iMatriz.length;
                    }

                }
            }
        } else {
            columnas = iMatriz[0].length - 1;
            for (int i = 0; i < MatrizFlip.length; i++) {
                for (int j = 0; j < MatrizFlip[i].length; j++) {
//                    System.out.println("[" + i + "][" + j + "]=[" + i + "][" + columnas + "]=");
                    MatrizFlip[i][j] = iMatriz[i][columnas];
                    columnas--;
                    if (columnas < 0) {
                        columnas = iMatriz[0].length - 1;
                    }
                }
            }
        }
        return MatrizFlip;
    }

    public String ImprimirPane() {
        String resultado = "";
        for (int i = 0; i < iMatriz.length; i++) {
            for (int j = 0; j < iMatriz[i].length; j++) {
                resultado += iMatriz[i][j];
                resultado += "     ";
            }
            resultado += "\n";
        }
        return resultado;
    }

    public String ImprimirRotar(int[][] MatrizRotar) {
        String resultado = "";
        for (int i = 0; i < MatrizRotar.length; i++) {
            for (int j = 0; j < MatrizRotar[i].length; j++) {
                resultado += MatrizRotar[i][j];
                resultado += "     ";
            }
            resultado += "\n";
        }
        return resultado;
    }

    public String ImprimirFlip(int[][] MatrizRotar) {
        String resultado = "";
        for (int i = 0; i < MatrizRotar.length; i++) {
            for (int j = 0; j < MatrizRotar[i].length; j++) {
                resultado += MatrizRotar[i][j];
                resultado += "     ";
            }
            resultado += "\n";
        }
        return resultado;
    }

}
