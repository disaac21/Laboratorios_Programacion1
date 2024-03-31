package lab3p1_danieljuárez;
import java.util.Scanner;

public class Lab3P1_DanielJuárez {

    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        char menu = '1';
        while (menu != '4'){
            System.out.println("1) Sumatoria");
            System.out.println("2) Casita");
            System.out.println("3) Alternos");
            System.out.println("4) Salir");
            System.out.print("Ingrese una Opción: ");
            menu = lea.next().charAt(0);
            System.out.println();
            
            switch(menu){
                case '1':{
                    //Sumatoria
                    
                    System.out.print("Ingrese un Entero Positivo Menor a 10: ");
                    double x = lea.nextInt();
                    double answer = 0;
                    double opdeno = 0;
                    //Fin para Imprimir
                    
                    while (x < 0 || x > 10){
                        System.out.println("Dato Incorrecto. ");
                        System.out.print("Ingrese un Entero Positivo Menor a 10: ");
                        x = lea.nextInt();
                    }
                    
                    //For Denominador
                    for (int contdeno = 0; contdeno <= 100; contdeno++){
                        opdeno = (2 * contdeno) + 1;
                        //Same, Usar para Exponent
                        
                    //Intro Factorial
                        double fact = opdeno;
                        double deno = fact;
                        for (double intofact = fact - 1; intofact > 0; intofact--){
                            double medio = deno * intofact;
                            deno = medio;
                        }
                        
                        double nume = 0;
                            if (contdeno % 2 == 0){
                                nume = 1;
                            }else{
                                nume = -1;
                            }
                        
                        //Renaming
                        double parte1 = nume / deno;
                        double power = (2 * contdeno) + 1;
                        double parte2 = x;
                        
                        for (double y = 1; y < power; y++){
                            double fin = parte2 * x;
                            parte2 = fin;
                        }
                        //Final Print
                        double finansw = parte1 * parte2;
                        answer = answer + finansw;
                    }
                    
                    System.out.println(answer);
                    System.out.println();                    
                }break;
                
                case '2':{
                    //Casita
                    
                    System.out.print("Ingrese un Entero Positivo Mayor o Igual a 4: ");
                    int N = lea.nextInt();
                    
                    while (N < 4){
                        System.out.println("Dato Incorrecto.");
                        System.out.print("Ingrese un Entero Positivo Mayor o Igual a 4: ");
                        N = lea.nextInt();
                    }
                        
                        //Techo
                        for(int pir = 1; pir <= N; pir++){
                            int rest = N - pir;
                            for(int esps = 1; esps <= rest; esps++){
                                System.out.print(" ");
                            }
                            int mult = pir * 2;
                            for(int asts = 1; asts <= mult - 1; asts++){
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        
                        //Base
                        for (int i = 1; i <= N; i++){
                            for (int j = 1; j <= (N*2-1); j++){
                                System.out.print("+");
                            }
                            System.out.println();
                        }
                        System.out.println();
                    
                }break;
                
                case '3':{
                    //Alternos
                    
                    System.out.print("Ingrese un Entero Mayor o Igual a 4: ");
                    int N = lea.nextInt();
                    
                    while (N < 4){
                        System.out.println("Dato Incorrecto.");
                        System.out.print("Ingrese un Entero Positivo Mayor o Igual a 4: ");
                        N = lea.nextInt();
                    }
                    
                    System.out.print("Ingrese un Primer Caracter: ");
                    char char1 = lea.next().charAt(0);
                    System.out.print("Ingrese un Segundo Caracter: ");
                    char char2 = lea.next().charAt(0);
                    
                    //Upper
                    for(int i = 0; i < N; i++) {
                        if(i % 2 == 0){
                            System.out.print(char2);
                        }else{
                        System.out.print(char1);
                        }
                    }
                    System.out.println();
                    
                    //Mid
                    for(int i = 0; i < N-2; i++) {
                        if(i % 2 != 0){
                            System.out.print(char2);
                        }else{
                        System.out.print(char1);
                        }
                        for(int j = 0; j < N-2; j++) {
                            System.out.print(" ");
                        }
                        if(i % 2 == 0){
                            System.out.print(char1);
                        }else{
                        System.out.print(char2);
                        }
                        System.out.println();
                    }

                    //Lower
                    for(int i = 0; i < N; i++) {
                        if(i % 2 == 0){
                            System.out.print(char2);
                        }else{
                        System.out.print(char1);
                        }
                    }
                    System.out.println();
                    System.out.println();
                }break;
                
                default:
            } //switch menu
        } //while
    } //main
} //class
