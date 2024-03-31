package lab7p1_danieljuárez;

import java.util.Scanner;
import java.util.Random;

public class Cadenas {

    Scanner lea = new Scanner(System.in);
    Random random = new Random();

    //Atributos Constructor
    String cadena;
    char caracter;

    public Cadenas(String cadena, char caracter) {
        this.cadena = cadena;
        this.caracter = caracter;
    } //fin Constructor Cadenas

    public void ImprimirCadenas(String[] arraycadena) {
        System.out.println("Imprime el Arreglo.");
        for (int i = 0; i < arraycadena.length; i++) {
            System.out.print("[" + arraycadena[i] + "]");
        }
        System.out.println();
    }

    public String[] CadenaCaracter(String cadena, char caracter) {

        int sizecc = 1;
        int start = 0;
        int cuentachar = 1;
        int t = 0;
        String acumcadena = "";

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                cuentachar++;
                sizecc++;
            }
        }

        String arraycadena[] = new String[sizecc];

        if (sizecc != 1) {
            for (int i = 0; i < cadena.length(); i++) { //recorre cadena
                if (cadena.charAt(i) == caracter) { //encuentra el caracter
                    acumcadena = cadena.substring(start, i); //obtiene trozo                
                    arraycadena[t] = acumcadena;
                    start = i + 1;
                    t++;
                    acumcadena = "";
                    cuentachar--;
                    if (cuentachar == 1) {
                        acumcadena = cadena.substring(i + 1, cadena.length());
                        arraycadena[t] = acumcadena;
                    }
                }
            }
        } else {
            arraycadena[t] = cadena;
        }

        return arraycadena;
    } //fin CadenaCaracter

}
