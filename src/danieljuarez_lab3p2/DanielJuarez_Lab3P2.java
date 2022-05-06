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
                    while (menu != 10) {
                        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "--- Casas ---"
                                + "\n1) Crear Casa"
                                + "\n2) Modificar Casa"
                                + "\n3) Eliminar Casa"
                                + "\n \n--- Edificios ---"
                                + "\n4) Crear Edificio"
                                + "\n5) Modificar Edificio"
                                + "\n6) Eliminar Edificio"
                                + "\n \n--- Apartamentos ---"
                                + "\n7) Crear Apartamento"
                                + "\n8) Modificar Apartamento"
                                + "\n9) Eliminar Apartamento"
                                + "\n \n"
                                + "\n10) Modificar Nombre"
                                + "\n11) Salir", "Residencial", JOptionPane.PLAIN_MESSAGE));

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
                            }
                            break;
                            case 3: {
                                Residencial res = Residenciales.get(modres);
                                for (int i = 0; i < res.Casas.size(); i++) {
                                    System.out.println(i + " - " + res.Casas.get(i));
                                }
                                int delete = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número de Casa a Eliminar", JOptionPane.PLAIN_MESSAGE));
                                Residenciales.get(modres).getCasas().remove(delete);
                            }
                            break;

                            //---------------- EDIFICIO
                            case 4: {
                                String tipo = "Edificio";
                                String direccion = JOptionPane.showInputDialog(null, "Ingrese la Dirección del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                String dimensiones = JOptionPane.showInputDialog(null, "Ingrese las Dimensiones del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE));
                                int cantlocales = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero de Locales", JOptionPane.PLAIN_MESSAGE));
                                String nombreEd = JOptionPane.showInputDialog(null, "Ingrese el Numero de Edificios", JOptionPane.PLAIN_MESSAGE);
                                String referenciares = Residenciales.get(modres).getNombreRes();
                                Edificio e = new Edificio(cantlocales, nombreEd, tipo, direccion, dimensiones, id);
                                Residenciales.get(modres).getEdificios().add(e);
                            }
                            break;
                            case 5: {
                                String cambiar = "";
                                Residencial res = Residenciales.get(modres);
                                for (int i = 0; i < res.Edificios.size(); i++) {
                                    cambiar += i + " - " + res.Edificios.get(i) + "\n";
                                }
                                int edit = Integer.parseInt(JOptionPane.showInputDialog(null, cambiar + "\nIngrese el Número de Casa a Editar", "SIU", JOptionPane.PLAIN_MESSAGE));
                                String tipo = "Edificio";
                                String direccion = JOptionPane.showInputDialog(null, "Ingrese la Dirección del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                String dimensiones = JOptionPane.showInputDialog(null, "Ingrese las Dimensiones del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE));
                                int cantlocales = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero de Locales", JOptionPane.PLAIN_MESSAGE));
                                String nombreEd = JOptionPane.showInputDialog(null, "Ingrese el Numero de Edificios", JOptionPane.PLAIN_MESSAGE);
                                String referenciares = Residenciales.get(modres).getNombreRes();
                                Residenciales.get(modres).getEdificios().get(edit).setDireccion(direccion);
                                Residenciales.get(modres).getEdificios().get(edit).setDimensiones(dimensiones);
                                Residenciales.get(modres).getEdificios().get(edit).setId(id);
                                Residenciales.get(modres).getEdificios().get(edit).setCantlocales(cantlocales);
                                Residenciales.get(modres).getEdificios().get(edit).setNombreEd(nombreEd);
                            }
                            break;
                            case 6: {
                                Residencial res = Residenciales.get(modres);
                                for (int i = 0; i < res.Edificios.size(); i++) {
                                    System.out.println(i + " - " + res.Edificios.get(i));
                                }
                                int delete = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número del Edificio a Eliminar", JOptionPane.PLAIN_MESSAGE));
                                Residenciales.get(modres).getEdificios().remove(delete);
                            }
                            //---------------- APARTAMENTO 
                            case 7: {
                                String tipo = "Apartamento";
                                Residencial res = Residenciales.get(modres);
                                for (int i = 0; i < res.Edificios.size(); i++) {
                                    System.out.println(i + " - " + res.Edificios.get(i));
                                }
                                int getedificio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Número del Edificio a Agregar el Apartamento", JOptionPane.PLAIN_MESSAGE));
                                String direccion = JOptionPane.showInputDialog(null, "Ingrese la Dirección del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                String dimensiones = JOptionPane.showInputDialog(null, "Ingrese las Dimensiones del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE));
                                int numerolocal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero del Local", JOptionPane.PLAIN_MESSAGE));
                                String referenciared = Residenciales.get(modres).getEdificios().get(getedificio).getNombreEd();
                                Apartamento a = new Apartamento(numerolocal, referenciared, tipo, direccion, dimensiones, id);
                                Residenciales.get(modres).getEdificios().get(getedificio).getApartamentos().add(a);
                            }
                            break;
                            case 8: {
                                String cambiar = "";
                                Residencial res = Residenciales.get(modres);
                                for (int i = 0; i < res.Edificios.size(); i++) {
                                    cambiar += i + " - " + res.Edificios.get(i) + "\n";
                                }
                                String cambios = "";
                                int edit = Integer.parseInt(JOptionPane.showInputDialog(null, cambiar + "\nIngrese el Número de Apartamento a Editar", "SIU", JOptionPane.PLAIN_MESSAGE));
                                for (int i = 0; i < res.Edificios.get(edit).Apartamentos.size(); i++) {
                                    cambios += i + " - " + res.Edificios.get(edit).Apartamentos.get(i) + "\n";
                                }
                                int getedificio = Integer.parseInt(JOptionPane.showInputDialog(null, cambios + "\nIngrese el Número del Edificio a Agregar el Apartamento", JOptionPane.PLAIN_MESSAGE));
                                String tipo = "Apartamento";
                                String direccion = JOptionPane.showInputDialog(null, "Ingrese la Dirección del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                String dimensiones = JOptionPane.showInputDialog(null, "Ingrese las Dimensiones del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE);
                                int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ID del Bienes Inmuebles", JOptionPane.PLAIN_MESSAGE));
                                int numerolocal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Numero del Local", JOptionPane.PLAIN_MESSAGE));
                                String referenciaed = Residenciales.get(modres).getEdificios().get(getedificio).getNombreEd();

                                Residenciales.get(modres).getEdificios().get(edit).getApartamentos().get(getedificio).setNumlocal(numerolocal);
                                Residenciales.get(modres).getEdificios().get(edit).getApartamentos().get(getedificio).setReferenciaEd(referenciaed);
                                Residenciales.get(modres).getEdificios().get(edit).getApartamentos().get(getedificio).setTipo(tipo);
                                Residenciales.get(modres).getEdificios().get(edit).getApartamentos().get(getedificio).setDireccion(direccion);
                                Residenciales.get(modres).getEdificios().get(edit).getApartamentos().get(getedificio).setDimensiones(dimensiones);
                                Residenciales.get(modres).getEdificios().get(edit).getApartamentos().get(getedificio).setId(id);
                            }
                            break;
                            case 9: {

                                String cambiar = "";
                                Residencial res = Residenciales.get(modres);
                                for (int i = 0; i < res.Edificios.size(); i++) {
                                    cambiar += i + " - " + res.Edificios.get(i) + "\n";
                                }
                                String cambios = "";
                                int edit = Integer.parseInt(JOptionPane.showInputDialog(null, cambiar + "\nIngrese el Número del Edificio del Apartamento", "SIU", JOptionPane.PLAIN_MESSAGE));
                                for (int i = 0; i < res.Edificios.get(edit).Apartamentos.size(); i++) {
                                    cambios += i + " - " + res.Edificios.get(edit).Apartamentos.get(i) + "\n";
                                }
                                int removeapart = Integer.parseInt(JOptionPane.showInputDialog(null, cambios + "\nIngrese el Número del Edificio a Agregar el Apartamento", JOptionPane.PLAIN_MESSAGE));

                                Residenciales.get(modres).getEdificios().get(edit).getApartamentos().remove(removeapart);
                            }
                            break;
                            case 10: {
                                String nombreresidencial = JOptionPane.showInputDialog(null, "Ingrese el Nombre de la Residencial", "Crear Residencial", JOptionPane.PLAIN_MESSAGE);
                                Residenciales.get(modres).setNombreRes(nombreresidencial);
                            }
                            break;
                        }
                    }
                }
                break;
                case 3:{
                    String caso2 = "";
                    for (int i = 0; i < Residenciales.size(); i++) {
                        caso2 += i + " - " + Residenciales.get(i) + "\n";
                    }
                    int modres = 0;
                    modres = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la Residencial a Modificar\n"
                            + caso2, "Modificar Residencial", JOptionPane.PLAIN_MESSAGE));
                    Residenciales.remove(modres);
                }
                break;
                case 4:{
                    
                }
            }
        }
    }

}
