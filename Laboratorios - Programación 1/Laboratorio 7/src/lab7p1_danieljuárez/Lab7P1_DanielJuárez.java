package lab7p1_danieljuárez;

import java.util.Scanner;
import java.util.Random;

public class Lab7P1_DanielJuárez {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        char menu = '1';
        while (menu != '4') {

            System.out.println("1) Tokenizer");
            System.out.println("2) Los Primos");
            System.out.println("3) Mini Sumatorias");
            System.out.println("4) Salir");
            System.out.print("Ingrese una Opción: ");
            menu = lea.next().charAt(0);
            System.out.println();

            switch (menu) {
                case '1': {
                    //Tokenizer

                    System.out.print("Ingrese una Cadena: ");
                    String cadena = lea.next();
                    System.out.print("Ingrese un Caracter: ");
                    char caracter = lea.next().charAt(0);

                    Cadenas cadenas = new Cadenas(cadena, caracter);

                    cadenas.ImprimirCadenas(cadenas.CadenaCaracter(cadena, caracter));
                    System.out.println();

                }
                break;

                case '2': {
                    //Los Primos

                    System.out.print("Ingrese el Tamaño del Arreglo: ");
                    int size = lea.nextInt();

                    while (size == 0) {
                        System.out.println("Ingrese un Número Mayor a 0");
                        System.out.print("Ingrese el Tamaño del Arreglo: ");
                        size = lea.nextInt();
                    }

                    Numeros numeros = new Numeros(size);

                    numeros.Llenar();
                    numeros.Imprimir();
                    System.out.println();
                    
                    int[] NumsPrimos = numeros.LosPrimos();
                    numeros.ImprimirAns(NumsPrimos);
                    System.out.println();

                }
                break;

                case '3': {
                    //Mini Sumatorias

                    System.out.print("Ingrese el Tamaño del Arreglo: ");
                    int size = lea.nextInt();

                    while (size == 0) {
                        System.out.println("Ingrese un Número Positivo");
                        System.out.print("Ingrese el Tamaño del Arreglo: ");
                        size = lea.nextInt();
                    }
                    
                    Numeros numeros = new Numeros(size);
                    numeros.Llenar();
                    System.out.println();
                    
                    numeros.Imprimir();
                    
                    System.out.println();
                    System.out.println("Sumatoria de los Números:");
                    numeros.Sumatoria();
                    
                    System.out.println();
                }
                break;
            }
        }
    }
}
