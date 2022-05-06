package danieljuarez_lab3p2;

import java.util.ArrayList;

public class Residencial {

    public ArrayList<BienesInmuebles> Casas = new ArrayList<>();
    public ArrayList<BienesInmuebles> Edificios = new ArrayList<>();
    public String nombreRes;

    public Residencial() {
    }

    public Residencial(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public String getNombreRes() {
        return nombreRes;
    }

    public void setNombreRes(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public ArrayList<BienesInmuebles> getCasas() {
        return Casas;
    }

    public void setCasas(ArrayList<BienesInmuebles> Casas) {
        this.Casas = Casas;
    }

    public ArrayList<BienesInmuebles> getEdificios() {
        return Edificios;
    }

    public void setEdificios(ArrayList<BienesInmuebles> Edificios) {
        this.Edificios = Edificios;
    }

}
