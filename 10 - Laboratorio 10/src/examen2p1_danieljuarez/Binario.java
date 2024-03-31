package examen2p1_danieljuarez;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Binario {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    public String Dec2Bin(int numero) {
        String binary = "";
        String addceros = "[";
        
        while (numero > 0) {
            if (numero % 2 == 0) {
                binary = "0" + binary;
            } else {
                binary = "1" + binary;
            }
            numero = (int) numero / 2;
        }
        
        if (binary.length() < 9){
            int ceros = 8 - binary.length();
            for (int i = 0; i < ceros; i++) {
                addceros += "0";
            }
        }
        binary = addceros + binary + "]";
        return binary;
    }

}
