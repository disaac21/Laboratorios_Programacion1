package lab4p1_danieljuárez;
import java.util.Scanner;

public class Lab4P1_DanielJuárez {

    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
        char menu = '1';
        while (menu != '4'){
            System.out.println("1) fString");
            System.out.println("2) ¿Sera que cabe?");
            System.out.println("3) Ordenando");
            System.out.println("4) Salir");
            System.out.print("Ingrese una Opción: ");
            menu = lea.next().charAt(0);
            System.out.println();
            
            switch(menu){
                case '1':{
                    //fString
                    
                    System.out.println("Ingrese una Frase:");
                    lea.nextLine();
                    String frase = lea.nextLine();
                    System.out.println("Ingrese un Número:");
                    String num = lea.next();
                    
                    for (int i = 0; i < frase.length(); i++){
                        char letra = frase.charAt(i);
                        if (letra != '%'){
                            System.out.print(letra);
                        }else{
                            if (i != frase.length() - 1  && frase.charAt(i + 1) == 'd'){
                                System.out.print(num);
                                i++;
                            }
                            if (frase.charAt(i + 1) == '%') {
                                System.out.print("%");
                            }
                        }
                    }
                    System.out.println();
                    System.out.println();
                }break;
                
                case '2':{
                    //¿Sera que cabe?
                    
                    System.out.println("Ingrese una Palabra: ");
                    lea.nextLine();
                    String frase1 = lea.nextLine();
                    
                    System.out.println("Ingrese una Segunda Palabra: ");
                    //lea.nextLine();
                    String frase2 = lea.nextLine();
                    
                    System.out.println();
                    
//                    System.out.println(frase1);
//                    System.out.println(frase2);
                    
                    int lengthp1 = frase1.length();
                    int lengthp2 = frase2.length();
                    int lengthp3;
                    
                    while (frase1.length() == frase2.length()){
                        System.out.println("La Longitud de las Frases es Igual");
                            System.out.println("Ingrese una Palabra: ");
                            lea.nextLine();
                            frase1 = lea.nextLine();

                            System.out.println("Ingrese una Segunda Palabra: ");
                            //lea.nextLine();
                            frase2 = lea.nextLine();
                    }
                    
                    String frase3;
                    int cont = 0;
                    
                    if (lengthp1 < lengthp2){
                        frase3 = frase2;
                        frase2 = frase1;
                        frase1 = frase3;
                        
                        lengthp3 = lengthp2;
                        lengthp2 = lengthp1;
                        lengthp1 = lengthp3;
                        
                    }
                    
                    for (int i = 0; i < lengthp2; i++) {
                        for (int j = 0; j < lengthp1; j++) {
                            if (frase2.charAt(i) == frase1.charAt(j)){
                                cont++;
                            }
                        }
                    }
                    if (cont >= frase2.length()){
                        System.out.println("Si Se Puede Armar " + frase2);
                    }else{
                        System.out.println("No Se Puede Armar " + frase2);
                    }
                    System.out.println();
                }break;
                
                case '3':{
                    //Ordenado
                    
                    System.out.println("Ingrese una Cadena de Números y Letras: ");
                    lea.nextLine();
                    String frase = lea.nextLine();
                    String newfrase = "";
                    
                    String nums = "";
                    String letters = "";
                    
                    for (int i = 0; i < frase.length(); i++){
                        if (frase.charAt(i) == '0' || frase.charAt(i) == '1' || frase.charAt(i) == '2' || frase.charAt(i) == '3' || frase.charAt(i) == '4' || frase.charAt(i) == '5' || frase.charAt(i) == '6' || frase.charAt(i) == '7' || frase.charAt(i) == '8' || frase.charAt(i) == '9'){
                            nums = nums + frase.charAt(i);
                        }else{
                            letters = letters + frase.charAt(i);
                        }
                    }    
                    System.out.println(nums + letters);
                    System.out.println();
                }break;
            } //switch
        } //menu
    } //main
} //class