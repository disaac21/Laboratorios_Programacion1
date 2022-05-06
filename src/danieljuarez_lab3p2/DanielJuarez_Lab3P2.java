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
                    String caso2 = "";
                    for (int i = 0; i < Residenciales.size(); i++) {
                        caso2 += i + " - " + Residenciales.get(i) + "\n";
                    }
                    int modres = 0;
                    modres = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Residencial a Modificar\n"
                            + caso2, "Modificar Residencial", JOptionPane.PLAIN_MESSAGE));
                    int menu = 0;
                    System.out.println(modres);
                    while (menu != 10) {
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
                                + "\n10) Salir", "Residencial", JOptionPane.PLAIN_MESSAGE));

                        switch (menu) {
                            case 1: {
                                String tipo = "Casa";
                                String direccion = JOptionPane.showInputDialog(null, "Ingrese la Dirección del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                String dimensiones = JOptionPane.showInputDialog(null, "Ingrese las Dimensiones del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE));
                                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero de la Casa", JOptionPane.PLAIN_MESSAGE));
                                String referenciares = Residenciales.get(modres).getNombreRes();
                                Casa c = new Casa(numero, referenciares, tipo, direccion, dimensiones, id);
                                Residenciales.get(modres).getCasas().add(c);
                            }
                            break;
                            case 2: {
                                String cambiar = "";
                                Residencial res = Residenciales.get(modres);
                                for (int i = 0; i < res.Casas.size(); i++) {
                                    cambiar += i + " - " + res.Casas.get(i) + "\n";
                                }
                                int edit = Integer.parseInt(JOptionPane.showInputDialog(null, cambiar + "\nIngrese el Número de Casa a Editar", "SIU", JOptionPane.PLAIN_MESSAGE));
                                String tipo = "Casa";
                                String direccion = JOptionPane.showInputDialog(null, "Ingrese la Dirección del Bienes Inmuebles", "SIU", JOptionPane.PLAIN_MESSAGE);
                                String dimensiones = JOptionPane.showInputDialog(null, "Ingrese las Dimensiones del Bienes Inmuebles", "SIU", JOptionPane.PLAIN_MESSAGE);
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE));
                                int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero de la Casa", JOptionPane.PLAIN_MESSAGE));
                                String referenciares = Residenciales.get(modres).getNombreRes();
                                Residenciales.get(modres).getCasas().get(edit).setDireccion(direccion);
                                Residenciales.get(modres).getCasas().get(edit).setDimensiones(dimensiones);
                                Residenciales.get(modres).getCasas().get(edit).setId(id);
                                Residenciales.get(modres).getCasas().get(edit).setNumero(numero);
                                Residenciales.get(modres).getCasas().get(edit).setReferenciaRes(referenciares);
                            }
                            break;
                            case 3: {
                                Residencial res = new Residencial();
                                for (int i = 0; i < res.Casas.size(); i++) {
                                    System.out.println(i + " - " + res.Casas.get(i));
                                }
                                int delete = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número de Casa a Eliminar", JOptionPane.PLAIN_MESSAGE));
                                Residenciales.get(modres).getCasas().remove(delete);
                            }
                            break;
                        }
                    }

                }
            }
        }
    }

}
