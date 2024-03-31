/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1p1_danieljuárez;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Lab1P1_DanielJuárez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp = '1';
        while (resp != '4'){
            System.out.println("1) Notas");
            System.out.println("2) Permutaciones");
            System.out.println("3) Sumatoria");
            System.out.println("4) Salir");
            System.out.print("Ingrese la Opción: ");
            resp = sc.next().charAt(0);
            
            if(resp == '1'){
                System.out.println("Ingrese la Nota del Estudiante: ");
                int nota = sc.nextInt();
                if (nota < 55){
                    System.out.println("Reprobó la Clase con una Calificación F");
                }else if (nota <= 60 && nota >= 55){
                    System.out.println("Reprobó la Clase con una Calificación E");
                }else if (nota <= 70 && nota >= 61){
                    System.out.println("Reprobó la Clase con una Califiación D");
                }else if (nota <= 80 && nota >= 71){
                    System.out.println("Aprobó la Clase con una Calificación C");
                }else if (nota <= 90 && nota >= 81){
                    System.out.println("Aprobó la Clase con una Calificación B");
                }else if (nota <= 100 && nota >=91){
                    System.out.println("Aprobó la Clase con una Calificación A");
                }
                System.out.println();

                
            }else if(resp == '2'){
                System.out.println("Ingrese N: ");
                int N = sc.nextInt();
                System.out.println("Ingrese R: ");
                int R = sc.nextInt();
                int contnum = 1;
                int contden = 1;
                int numerador = 1;
                int denominador = 1;
                int resta = N - R;
                
                while (contnum <= N){
                    numerador *= contnum;
                    contnum++;
                }
                while (contden <= resta){
                    denominador *= contden;
                    contden++;
                }
                
                double resultado = numerador / denominador;
                System.out.println("Las Permutaciones son: " + resultado);
                
                System.out.println("");        
                    
            }else if(resp == '3'){
                System.out.print("Ingrese el numero N: ");
                int N = sc.nextInt();
                int i = 1;
                double total = 0;
                
                while(i <= N){
                    double numerador = 2*i - 1;
                    double denominador = i * (i + 1);
                    double result = numerador/denominador;
                    total = result + total;
                    System.out.print(total);
                    if(i != N){
                        System.out.print(",");
                    }
                    i++;
                }           
                System.out.println();
            }
        }
        // TODO code application logic here
    }
}
        // TODO code application logic her
