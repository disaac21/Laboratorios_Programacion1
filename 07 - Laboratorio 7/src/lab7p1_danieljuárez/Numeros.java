package lab7p1_danieljuárez;

import java.util.Scanner;
import java.util.Random;

public class Numeros {

    Scanner lea = new Scanner(System.in);
    Random random = new Random();

    //Atributos Constructor
    int size;
    int[] Array;

    public Numeros(int size) {
        this.size = size;
        this.Array = new int[size];
    } //fin Constructor Cadenas

    public int[] Llenar() {
        for (int i = 0; i < Array.length; i++) {
            Array[i] = 1 + random.nextInt(25);
        }
        return Array;
    } //fin Llenar

    public void Imprimir() {
        System.out.println("Imprime el Arreglo.");
        for (int i = 0; i < Array.length; i++) {
            System.out.print("[" + Array[i] + "]");
        }
        System.out.println();
    } //fin Imprimir

    public void ImprimirAns(int[] num) {
        System.out.println("Array = ");
        for (int i = 0; i < Array.length; i++) {
            System.out.print("[" + num[i] + "]");
        }
        System.out.println();
    } //fin ImprimirAns

    public int[] LosPrimos() {

        int[] NumsPrimos = new int[Array.length];
        int cont = 0;

        for (int i = 0; i < NumsPrimos.length; i++) {
            int num = Array[i];
            cont = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0 && j == 2) {
                    cont++;
                }
                if (num % j == 0 && j == 3) {
                    cont++;
                }
                if (num % j == 0 && j == 5) {
                    cont++;
                }
                if (num % j == 0 && j == 7) {
                    cont++;
                }
                if (num % j == 0 && j == 11) {
                    cont++;
                }
                if (num % j == 0 && j == 13) {
                    cont++;
                }
                if (num % j == 0 && j == 17) {
                    cont++;
                }
                if (num % j == 0 && j == 19) {
                    cont++;
                }
                if (num % j == 0 && j == 23) {
                    cont++;
                }
            }
            if (cont == 0) {
                cont = -1;
            }
            NumsPrimos[i] = cont;
        }
        return NumsPrimos;
    } //fin LosPrimos

    //-----------------------------------------------------------------------
    public void Sumatoria() {

        int resultado = 0;
        int place = 0;
        
        for (int i = 0; i < Array.length; i++) {
            int numero = Array[i];
            for (int j = 0; j <= numero; j++) {
                resultado = resultado + j;
            }
            System.out.print(resultado + " = ");
            for (int j = 1; j < Array[i]; j++) {
                System.out.print(j + "+");
            }
            System.out.print(Array[i]);
            System.out.println();
            resultado = 0;
            place = 0;

        }
        
    }
}
