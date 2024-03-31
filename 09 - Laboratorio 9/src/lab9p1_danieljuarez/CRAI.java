package lab9p1_danieljuarez;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class CRAI {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    ArrayList<String> ListaUsuarios;
    ArrayList<String> LibrosDisponibles;
    ArrayList<String> LibrosUsuarios;

    public CRAI() {
        this.ListaUsuarios = new ArrayList<>();
        this.LibrosDisponibles = new ArrayList<>();
        this.LibrosUsuarios = new ArrayList<>();
    }

    public void AgregarUsuarios() {
        System.out.print("Ingrese el Nombre: ");
        String nombreusuario = lea.nextLine();

        ListaUsuarios.add(nombreusuario);
    } //fin AgregarUsuarios

    public void AgregarLibros() {
        System.out.print("Ingrese el Nombre del Libro: ");
        String nombrelibro = lea.nextLine();

        LibrosDisponibles.add(nombrelibro);
    } //fin AgregarLibros

    public void Eliminar() {
        System.out.println("--- Usuarios Registrados ---");
        for (int i = 0; i < ListaUsuarios.size(); i++) {
            System.out.println(i + ") " + ListaUsuarios.get(i));
        }
        System.out.print("Elegir Usuario a Eliminar: ");
        int delete = lea.nextInt();
        for (int i = 0; i < ListaUsuarios.size(); i++) {
            if (i == delete) {
                LibrosUsuarios.remove(i);
                //HERE Add If: Si ese usuario tiene un libro asignado, este debe ser agregado 
                //devuelta en librosDisponibles.
            }
        }
    } //fin Eliminar

    public void Asignar() {
        System.out.println("--- Usuarios Registrados ---");
        for (int i = 0; i < ListaUsuarios.size(); i++) {
            System.out.println(i + ") " + ListaUsuarios.get(i));
        }
        System.out.println();
        System.out.print("Elegir Usuario: ");
        int pickuser = lea.nextInt();

        System.out.println("\n--- Libros Registrados ---");
        for (int i = 0; i < LibrosDisponibles.size(); i++) {
            System.out.println(i + ") " + LibrosDisponibles.get(i));
        }
        System.out.println();
        System.out.print("Elegir Libro: ");
        int pickbook = lea.nextInt();

        for (int i = 0; i < ListaUsuarios.size(); i++) {
            for (int j = 0; j < LibrosDisponibles.size(); j++) {
                if (i == pickuser && j == pickbook) {
                    LibrosUsuarios.add(ListaUsuarios.get(i) + " Tiene el Libro: " + LibrosDisponibles.get(j));
                    LibrosDisponibles.remove(LibrosDisponibles.get(j));
                }
            }
        }
    } //fin Asignar

    public void Listar() {
        System.out.println("--- Usuarios y Sus Libros ---");
        for (int i = 0; i < LibrosUsuarios.size(); i++) {
            System.out.println(i + ")" + LibrosUsuarios.get(i));
        }
        System.out.println("\n--- Libros Disponibles ---");
        for (int i = 0; i < LibrosDisponibles.size(); i++) {
            System.out.println(i + ")" + LibrosDisponibles.get(i));
        }
    } //fin Listar
}
