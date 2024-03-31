package examen1p1_danieljuárez;
import java.util.Scanner;

public class Examen1P1_DanielJuárez {
    static Scanner lea = new Scanner (System.in);
    
    public static void main(String[] args) {
       
        char menu = '1';
        while (menu != '4'){
            System.out.println("1) equalsIgnoreCase");
            System.out.println("2) Aplicando el substring");
            System.out.println("3) Uso de Contains");
            System.out.println("4) Salir");
            System.out.print("Ingrese una Opción: ");
            menu = lea.next().charAt(0);
            System.out.println();
            
            switch(menu){
                case '1':{
                    //equalsIgnoreCase
                    
                    System.out.println("Ingrese la Primer Cadena: ");
                    lea.nextLine();
                    String cadena1 = lea.nextLine();
                    System.out.println("Ingrese la Segunda Cadena: ");
                    String cadena2 = lea.nextLine();
                   
                    equalsIgnoreCase(cadena1, cadena2);
                    
                }break;
                
                case '2':{
                    //Ordenamiento
                    
                    System.out.println("Ingrese una Cadena: ");
                    lea.nextLine();
                    String cadena1 = lea.nextLine();
                    
                    System.out.println(Ordenamiento(cadena1));
                    System.out.println();
                    
                }break;
                
                case '3':{
                    //El príncipe de Persia
                    
                    System.out.print("Ingrese un Número Mayor o Igual a 4: ");
                    int num = lea.nextInt();
                    System.out.print("Ingrese el Primer Caracter: ");
                    char cara1 = lea.next().charAt(0);
                    System.out.print("Ingrese el Segundo Caracter: ");
                    char cara2 = lea.next().charAt(0);
                    System.out.print("Ingrese el Tercer Caracter: ");
                    char cara3 = lea.next().charAt(0);
                    
                    ElprincipedePersia(num, cara1, cara2, cara3);
                    
                }break;
            }
        } //fin menu
    } //fin main
    
    public static void equalsIgnoreCase(String cadena1, String cadena2){
        
        System.out.println();
        int contiguales = 0;

        if (cadena2.length() == cadena1.length()){
            for (int i = 0; i < cadena1.length(); i++) {
                if (cadena1.charAt(i) == cadena2.charAt(i)) {
                    contiguales++;
                }
                if (cadena1.charAt(i) + 32 == cadena2.charAt(i)) {
                    contiguales++;
                }
                if (cadena1.charAt(i) == cadena2.charAt(i) + 32){
                    contiguales++;
                }else{
                    System.out.print("");
                }
            }

            if (contiguales >= cadena1.length()){
                System.out.println("Son iguales.");
            }else{
                System.out.println("No son iguales.");
            }
        }else{
            System.out.println("No son iguales.");
        }
        System.out.println();
        
    } //fin equalsIgnoreCase
    
    public static int Ordenamiento(String cadena1){
        
        String cadenalower = cadena1.toLowerCase();
        int abc;
        int xyz;
        int contxyz = 0;
        
        for (abc = 97; abc <= 122; abc++) {
            for (int i = 0; i < cadena1.length(); i++){
                if (cadenalower.charAt(i) == abc) {
                    System.out.print(cadenalower.charAt(i));
                }
            }
        }
        
        System.out.println();
        
        for (xyz = 48; xyz <= 57; xyz++){
            for (int j = 0; j < cadena1.length(); j++){
                if (cadenalower.charAt(j) == xyz) {
                    contxyz++;
                }
            }
        }
        
        return contxyz;
    } //fin Ordenamiento
    
    public static void ElprincipedePersia(int num, char cara1, char cara2, char cara3){
        
        while (num < 4){
            System.out.println();
            System.out.println("El Número Debe de Ser Mayor o Igual a 4.");
            System.out.print("Ingrese un Número Mayor o Igual a 4: ");
            num = lea.nextInt();
        }
        while (cara1 == cara2 || cara1 == cara3 || cara2 == cara3){
            System.out.println();
            System.out.println("Hay Caracteres Repetidos.");
            System.out.print("Ingrese el Primer Caracter: ");
            cara1 = lea.next().charAt(0);
            System.out.print("Ingrese el Segundo Caracter: ");
            cara2 = lea.next().charAt(0);
            System.out.print("Ingrese el Tercer Caracter: ");
            cara3 = lea.next().charAt(0);
        }
        
        System.out.println();

        for (int i = 1; i <= 1; i++){
            for (int j = 0; j < num; j++) {
                System.out.print(cara1);
            }
            for (int j = 0; j < num; j++) {
                System.out.print(cara2);
            }
            for (int j = 0; j < num; j++) {
                System.out.print(cara1);
            }
            System.out.println();
        }

        for (int i = 0; i < num - 2; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(cara2);
            }
            for (int j = 0; j < num; j++) {
                System.out.print(cara3);
            }
            for (int j = 0; j < num; j++) {
                System.out.print(cara2);
            }
            System.out.println();
        }

        for (int i = 1; i <= 1; i++){
            for (int j = 0; j < num; j++) {
                System.out.print(cara1);
            }
            for (int j = 0; j < num; j++) {
                System.out.print(cara2);
            }
            for (int j = 0; j < num; j++) {
                System.out.print(cara1);
            }
            System.out.println();
        }
        
        System.out.println();
        
    } //fin ElprincipedePersia
    
} //fin class
