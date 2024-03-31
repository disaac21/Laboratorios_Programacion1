package lab9p1_danieljuarez;

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Lab9P1_DanielJuarez {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        CRAI crai = new CRAI();

        char mainmenu = '1';
        while (mainmenu != '3') {
            System.out.println("\nMenú Principal");
            System.out.println("1) Soneteo");
            System.out.println("2) CRAI");
            System.out.println("3) Salir");
            System.out.print("Ingrese una Opción: ");
            mainmenu = lea.next().charAt(0);

            switch (mainmenu) {
                case '1': {
                    //Soneteo
                    System.out.print("Ingrese la Cantidad de IP's a Evaluar: ");
                    int cantidad = lea.nextInt();

                    System.out.println("Siga el Formato xxx.xxx.xxx.xxx");
                    System.out.print("Primer IP Asignable: ");
                    lea.nextLine();
                    String PrimerIP = lea.nextLine();
                    System.out.print("Ultima IP Asignable: ");
                    String UltimaIP = lea.nextLine();

                    Soneteo soneteo = new Soneteo(PrimerIP, UltimaIP, cantidad);
                    
                    soneteo.Validacion();
                    System.out.println("--- IPs Aceptadas ---");
                    soneteo.Accepted();
                    System.out.println();
                    System.out.println("--- IPs Denegadas ---");
                    soneteo.Denied();
                    System.out.println();

                }
                break;
                case '2': {
                    //CRAI

                    char menucrai = '1';
                    while (menucrai != '6') {
                        System.out.println();
                        System.out.println("Bienvenido al CRAI");
                        System.out.println("1) Agregar Usuario");
                        System.out.println("2) Agregar Libro");
                        System.out.println("3) Eliminar");
                        System.out.println("4) Asignar");
                        System.out.println("5) Listar");
                        System.out.println("6) Salir");
                        System.out.print("Ingrese una Opción: ");
                        menucrai = lea.next().charAt(0);

                        switch (menucrai) {
                            case '1': {
                                //Agregar Usuario
                                crai.AgregarUsuarios();
                            }
                            break;
                            case '2': {
                                //Agregar Libro
                                crai.AgregarLibros();
                            }
                            break;
                            case '3': {
                                //Eliminar
                                crai.Eliminar();
                            }
                            break;
                            case '4': {
                                //Asignar
                                crai.Asignar();
                            }
                            break;
                            case '5': {
                                //Listar
                                crai.Listar();
                            }
                            break;
                            case '6': {
                                System.out.println("Gracias Por Visitar El CRAI!");
                            }
                        } //fin switch menucrai
                    } //fin while menucrai
                } //fin case2
                break;
            } //fin switch mainmenu
        } //fin while mainmenu
    } //fin main
} //fin class
