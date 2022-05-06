package danieljuarez_lab3p2;

public class Edificio extends BienesInmuebles {
    
    public int cantlocales;
    public String nombreEd;

    public Edificio() {
    }

    public Edificio(int cantlocales, String nombreEd) {
        this.cantlocales = cantlocales;
        this.nombreEd = nombreEd;
    }

    public int getCantlocales() {
        return cantlocales;
    }

    public void setCantlocales(int cantlocales) {
        this.cantlocales = cantlocales;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }
    
    
    
}
