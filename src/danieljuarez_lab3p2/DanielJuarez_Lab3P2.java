package danieljuarez_lab3p2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DanielJuarez_Lab3P2 {

    static ArrayList<Residencial> Residenciales = new ArrayList();

    public static void main(String[] args) {

        int first = 0;
        while (first != 5) {
            first = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1) Crear Residencial"
                    + "\n2) Modificar Residencial"
                    + "\n3) Eliminar Residencial"
                    + "\n4) Clientes"
                    + "\n5) Salir", "Residencial", JOptionPane.PLAIN_MESSAGE));

            switch (first) {
                case 1: {
                    String nombreresidencial = JOptionPane.showInputDialog(null, "Ingrese el Nombre de la Residencial", "Crear Residencial", JOptionPane.PLAIN_MESSAGE);
                    Residencial res = new Residencial(nombreresidencial);
                    Residenciales.add(res);
                }
                break;
                case 2: {
                    int menu = 0;
                    while (menu != 6) {
                        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "--- Casas ---"
                                + "\n1) Crear Casa"
                                + "\n2) Modificar Casa"
                                + "\n3) Eliminar Casa"
                                + "\n \n--- Apartamentos ---"
                                + "\n4) Crear Apartamento"
                                + "\n5) Modificar Apartamento"
                                + "\n6) Eliminar Apartamento"
                                + "\n \n--- Edificios ---"
                                + "\n7) Crear Edificio"
                                + "\n8) Modificar Edificio"
                                + "\n9) Eliminar Edificio"
                                + "\n \n"
                                + "\n4) Imprimir Ganadores"
                                + "\n5) Ganadores y sus Manos"
                                + "\n10) Salir", "Residencial", JOptionPane.PLAIN_MESSAGE));

                        switch (menu) {
                            case 1: {
                                
                            }
                        }
                    }

                }
            }
        }
    }
}
