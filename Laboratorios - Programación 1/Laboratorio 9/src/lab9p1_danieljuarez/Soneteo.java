package lab9p1_danieljuarez;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import static lab9p1_danieljuarez.Lab9P1_DanielJuarez.lea;

public class Soneteo {

    static Scanner lea = new Scanner(System.in);
    static Random random = new Random();

    ArrayList<String> IPAccept;
    ArrayList<String> IPDenegada;
    String PIPrimera;
    String UIUltima;
    int cantidad;

    public Soneteo(String PrimerIP, String UltimaIP, int cantidad) {
        this.PIPrimera = PrimerIP;
        this.UIUltima = UltimaIP;
        this.cantidad = cantidad;

        this.IPAccept = new ArrayList<>();
        this.IPDenegada = new ArrayList<>();
    }

    public void Validacion() {

        String acum = "";
        int sizearray = 1;
        int inicio = 0;
        int cuentapuntos = 1;
        int t = 0;

        for (int i = 0; i < PIPrimera.length(); i++) {
            if (PIPrimera.charAt(i) == '.') {
                cuentapuntos++;
                sizearray++;
            }
        }
        String array[] = new String[sizearray];
        for (int i = 0; i < PIPrimera.length(); i++) {
            if (PIPrimera.charAt(i) == '.') {
                acum = PIPrimera.substring(inicio, i);
                array[t] = acum;
                inicio = i + 1;
                t++;
                acum = "";
                cuentapuntos--;
                if (cuentapuntos == 1) {
                    acum = PIPrimera.substring(i + 1, PIPrimera.length());
                    array[t] = acum;
                }
            }
        }
        String acum2 = "";
        int sizearray2 = 1;
        int inicio2 = 0;
        int cuentapuntos2 = 1;
        int y = 0;

        for (int i = 0; i < UIUltima.length(); i++) {
            if (UIUltima.charAt(i) == '.') {
                cuentapuntos2++;
                sizearray2++;
            }
        }
        String array2[] = new String[sizearray2];
        for (int i = 0; i < UIUltima.length(); i++) {
            if (UIUltima.charAt(i) == '.') {
                acum2 = UIUltima.substring(inicio2, i);
                array2[y] = acum2;
                inicio2 = i + 1;
                y++;
                acum2 = "";
                cuentapuntos2--;
                if (cuentapuntos2 == 1) {
                    acum2 = UIUltima.substring(i + 1, UIUltima.length());
                    array2[y] = acum2;
                }
            }
        }
        boolean length = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 3) {
                length = false;
            } else {
                length = true;
            }
        }
        while (length != true) {
            System.out.println("Siga el Formato xxx.xxx.xxx.xxx");
            System.out.print("Primer IP Asignable: ");
            String PrimerIP = lea.nextLine();
            System.out.print("Ultima IP Asignable: ");
            String UltimaIP = lea.nextLine();
            acum = "";
            sizearray = 1;
            inicio = 0;
            cuentapuntos = 1;
            t = 0;

            for (int i = 0; i < PIPrimera.length(); i++) {
                if (PIPrimera.charAt(i) == '.') {
                    cuentapuntos++;
                    sizearray++;
                }
            }
            for (int i = 0; i < PIPrimera.length(); i++) {
                if (PIPrimera.charAt(i) == '.') {
                    acum = PIPrimera.substring(inicio, i);
                    array[t] = acum;
                    inicio = i + 1;
                    t++;
                    acum = "";
                    cuentapuntos--;
                    if (cuentapuntos == 1) {
                        acum = PIPrimera.substring(i + 1, PIPrimera.length());
                        array[t] = acum;
                    }
                }
            }
            acum2 = "";
            sizearray2 = 1;
            inicio2 = 0;
            cuentapuntos2 = 1;
            y = 0;

            for (int i = 0; i < UIUltima.length(); i++) {
                if (UIUltima.charAt(i) == '.') {
                    cuentapuntos2++;
                    sizearray2++;
                }
            }

            for (int i = 0; i < UIUltima.length(); i++) {
                if (UIUltima.charAt(i) == '.') {
                    acum2 = UIUltima.substring(inicio2, i);
                    array2[y] = acum2;
                    inicio2 = i + 1;
                    y++;
                    acum2 = "";
                    cuentapuntos2--;
                    if (cuentapuntos2 == 1) {
                        acum2 = UIUltima.substring(i + 1, UIUltima.length());
                        array2[y] = acum2;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i].length() > 3) {
                    length = false;
                } else {
                    length = true;
                }
            }
        }

        int num1 = Integer.valueOf(array[array.length - 1]);
        int num2 = Integer.valueOf(array2[array2.length - 1]);

        for (int i = 1; i < cantidad + 1; i++) {
            System.out.println("Ingrese la IP " + i + ": ");
            String newIP = lea.next();

            acum2 = "";
            sizearray2 = 1;
            inicio2 = 0;
            cuentapuntos2 = 1;
            y = 0;

            for (int j = 0; j < newIP.length(); j++) {
                if (newIP.charAt(j) == '.') {
                    cuentapuntos2++;
                    sizearray2++;
                }
            }
            for (int k = 0; k < newIP.length(); k++) {
                if (newIP.charAt(k) == '.') {
                    acum2 = newIP.substring(inicio2, k);
                    array2[y] = acum2;
                    inicio2 = k + 1;
                    y++;
                    acum2 = "";
                    cuentapuntos2--;
                    if (cuentapuntos2 == 1) {
                        acum2 = newIP.substring(k + 1, newIP.length());
                        array2[y] = acum2;
                    }
                }
            }

            int num = Integer.valueOf(array2[array2.length - 1]);

            if (num > num1 && num < num2) {
                IPAccept.add(newIP);
                System.out.println("Agregada");
                System.out.println("--- IPs Aceptadas ---");
                Accepted();
                System.out.println();
            } else {
                IPDenegada.add(newIP);
                System.out.println("Denegada");
                System.out.println("--- IPs Denegadas ---");
                Denied();
                System.out.println();
            }
        }
    }

    public void Accepted() {

        for (int i = 0; i < IPAccept.size(); i++) {
            System.out.println(IPAccept.get(i));
        }
    }

    public void Denied() {
        for (int i = 0; i < IPDenegada.size(); i++) {
            System.out.println(IPDenegada.get(i));
        }
    }

}
