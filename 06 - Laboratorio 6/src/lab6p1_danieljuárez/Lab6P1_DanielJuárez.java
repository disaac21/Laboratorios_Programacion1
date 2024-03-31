package lab6p1_danieljuárez;

import java.util.Scanner;
import java.util.Random;

public class Lab6P1_DanielJuárez {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        char menu = '1';
        while (menu != '4') {

            System.out.println("1) múltiplos");
            System.out.println("2) Turing");
            System.out.println("3) Promedio");
            System.out.println("4) Salir");
            System.out.print("Ingrese una Opción: ");
            menu = lea.next().charAt(0);
            System.out.println();

            switch (menu) {
                case '1': {
                    //múltiplos
                    System.out.print("Ingrese el Tamaño del Arreglo: ");
                    int size = lea.nextInt();

                    int Numeros[] = new int[size];

                    Numeros = Llenar100(size);

                    Imprimir(Numeros);

                    System.out.println();

                    Imprimir(Multiplos(Numeros, size));
                    System.out.println();

                }
                break;

                case '2': {
                    //Turing

                    System.out.print("Ingrese el Tamaño del Arreglo: ");
                    int size = lea.nextInt();

                    int Numeros[] = new int[size];

                    Numeros = Llenar09(size);

                    Imprimir(Numeros);
                    System.out.println();

                    System.out.println("Ingrese una Cadena: ");
                    String cadenaturing = lea.next();
                    System.out.println();

                    Turing(Numeros, cadenaturing);
                    System.out.println();

                }
                break;

                case '3': {
                    //Promedio

                    System.out.print("Ingrese el Tamaño del Arreglo: ");
                    int size = lea.nextInt();

                    int Numeros[] = new int[size];

                    Numeros = Llenar100(size);

                    Imprimir(Numeros);
                    System.out.println();

                    System.out.println("El Promedio de Todos los Números es: " + Promedio(Numeros));
                    System.out.println();

                }
                break;
            }
        }
    }

    public static int[] Llenar100(int size) {

        int Temporal[] = new int[size];
        for (int i = 0; i < Temporal.length; i++) {
            Temporal[i] = 1 + random.nextInt(100);
        }
        return Temporal;
    } //fin Llenar

    public static int[] Llenar09(int size) {
        int Temporal[] = new int[size];
        for (int i = 0; i < Temporal.length; i++) {
            Temporal[i] = 0 + random.nextInt(9);
        }
        return Temporal;
    }

    public static void Imprimir(int[] Numeros) {

        System.out.println("Imprime el Arreglo.");
        for (int i = 0; i < Numeros.length; i++) {
            System.out.println("[" + i + "] = " + Numeros[i]);
        }
    } //fin Imprimir

    public static int[] Multiplos(int[] Numeros, int size) {

        int ArregloMultiplos[] = new int[size];
        int contmult = 0;
        int j = 0;

        for (int i = 0; i < size; i++) {

            if (Numeros[i] % size == 0) {
                contmult++;
                ArregloMultiplos[j] = contmult;
            }
            if (Numeros[i] % size != 0 && contmult == 0) {
                ArregloMultiplos[j] = Numeros[i];
            } else {
                ArregloMultiplos[j] = contmult;
            }
            j++;
        }
        return ArregloMultiplos;
    } //fin Multiplos

    public static String Turing(int[] Numeros, String cadenaturing) {

        String salida = "";
        int j = 0;

        for (int i = 0; i < cadenaturing.length(); i++) {
            if (cadenaturing.charAt(i) == 'R' || cadenaturing.charAt(i) == 'r') {
                if (j == cadenaturing.length()) {
                    j = 0;
                } else {
                    j++;
                }
            }
            if (cadenaturing.charAt(i) == 'L' || cadenaturing.charAt(i) == 'l') {
                if (j == 0) {
                    j = cadenaturing.length();
                } else {
                    j--;
                }
            }
            if (cadenaturing.charAt(i) == 'X' || cadenaturing.charAt(i) == 'x') {
                System.out.println(Numeros[j]);
            }
        }
        return salida;
    } //fin Turing

    public static float Promedio(int[] Numeros) {

        float suma = 0;

        for (int i = 0; i < Numeros.length; i++) {
            suma = suma + Numeros[i];
        }

        float prom = suma / (Numeros.length);

        return prom;
    }

}
