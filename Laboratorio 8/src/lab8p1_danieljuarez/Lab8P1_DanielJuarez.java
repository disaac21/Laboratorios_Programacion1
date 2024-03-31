package lab8p1_danieljuarez;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class Lab8P1_DanielJuarez {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        char menu = '1';
        while (menu != '4') {

            String menupane = JOptionPane.showInputDialog("1) Rotar Imagenes \n"
                    + "2) Chones \n"
                    + "3) Espejito \n"
                    + "4) Salir \n"
                    + "Ingrese una Opción: ");
            for (int i = 0; i < menupane.length(); i++) {
                menu = menupane.charAt(i);
            }

            int filas, columnas;
            if (menu == '4' || menu == '2') {
                filas = 0;
                columnas = 0;
            } else {
                filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las Filas."));
                columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las Columnas."));
            }

            int[][] Matriz = new int[filas][columnas];
            Matriz = Llenado(filas, columnas);
            Imagen metim = new Imagen(Matriz);
            Chones metchones = new Chones();

            switch (menu) {
                case '1': {
                    //Rotar Imagenes
                    JOptionPane.showMessageDialog(null, metim.ImprimirPane());
                    JOptionPane.showMessageDialog(null, metim.ImprimirRotar(metim.Rotar()));
                }
                break;

                case '2': {
                    //Chones
                    int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número Impar Mayor o Igual a 7."));
                    while (num % 2 == 0 || num < 7) {
                        if (num % 2 == 0) {
                            JOptionPane.showMessageDialog(null, "El Numero Debe Ser Impar.");
                            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número Impar Mayor o Igual a 7."));
                        } else {
                            JOptionPane.showMessageDialog(null, "El Numero Debe Ser Mayor a 7.");
                            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Número Impar Mayor o Igual a 7."));
                        }

                    }
                    JOptionPane.showMessageDialog(null, metchones.ImprimirPane(metchones.MetodoChones(num)));
                }
                break;

                case '3': {
                    //Espejito
                    JOptionPane.showMessageDialog(null, metim.ImprimirPane());
                    JOptionPane.showMessageDialog(null, metim.ImprimirFlip(metim.Flip()));

                }
                break;
            }
        }
    }

    public static int[][] Llenado(int filas, int columnas) {
        int[][] MatrizLlenado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                MatrizLlenado[i][j] = 1 + random.nextInt(9);
            }
        }
        return MatrizLlenado;
    }
}
