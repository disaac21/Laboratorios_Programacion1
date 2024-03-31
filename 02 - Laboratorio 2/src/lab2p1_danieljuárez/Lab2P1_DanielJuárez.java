/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p1_danieljuárez;
import java.util.Scanner;
/**
 *
 * @author danie
 */
public class Lab2P1_DanielJuárez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        char menu = '1';
        while (menu != '4'){
            System.out.println("1) Multiplicación");
            System.out.println("2) Triple Fibonacci");
            System.out.println("3) sqrt(2)");
            System.out.println("4) Salir");
            System.out.println("Ingrese la Opción: ");
            menu = lea.next().charAt(0);
            System.out.println();
            
            switch(menu){
                case '1':{
                    System.out.println("Ingrese el Primer Número (N): ");
                    int n = lea.nextInt();
                    System.out.println("Ingrese el Segundo Número(M): ");
                    int m = lea.nextInt();
                    int prod = 0;
                    int cont = 1;
                    
                    while(cont <= m){
                        prod = prod + n;
                        cont++;
                    }
                    System.out.println("El Resultado de la Multiplicación es " + prod);
                    System.out.println();
                }break;
                
                case '2':{
                    System.out.println("Ingrese la Cantidad de Números a Mostrar: ");
                    int lim = lea.nextInt();
                    int num1 = 0;
                    int num2 = 1;
                    int num3 = 1;
                    int num4 = 0;
                    int cont = 1;
                    System.out.print(num1 + ", " + num2 + ", " + num3 + ", ");
                    
                    while (cont <= lim - 3){
                        num4 = num1 + num2 + num3;
                        num1 = num2;
                        num2 = num3;
                        num3 = num4;
                        System.out.print(num4);
                        if (cont != lim - 3){
                            System.out.print(", ");  
                        }
                        cont++;
                    }
                    System.out.println();
                    System.out.println();
                }break;
                
                case '3':{
                    System.out.println("Ingrese un Número Entero: ");
                    int N = lea.nextInt();
                    int K = 0;
                    double total = 0;
                    double resp = 1;
                    double sideb = 0;
                    double fraction = 0;
                    
                    while(K <= N){
                        double numerador = 1;
                        double denominador = ((4 * K + 2) * (4 * K + 2));
                        fraction = (numerador / denominador);
                        sideb = (1 - fraction);
                        resp = resp * sideb;
                        K++;
                    }
                    System.out.println(1/resp);
                    System.out.println();
                }break;
            }
        }
    }
}
