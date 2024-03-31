package examen2p1_danieljuarez;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Numerito {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    public void Distancia(int numero) {

        String cadenafromnum = numero + "";
        int numeros[] = new int[cadenafromnum.length()];
        
        for (int i = 0; i < cadenafromnum.length(); i++) {
            char changechar = cadenafromnum.charAt(i);
            String changestring = Character.toString(changechar);
            int changenums = Integer.parseInt(changestring);
            numeros[i] = changenums;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("[" + i + "]=[" + numeros[i] + "]");
        }
        
        for (int i = 0; i < numeros.length; i++) {
            // :\
        }
        
    }

}
