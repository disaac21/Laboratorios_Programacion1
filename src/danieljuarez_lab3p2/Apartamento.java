package danieljuarez_lab3p2;


public class Apartamento extends BienesInmuebles {
    
    public int numlocal;
    public String referenciaEd;

    public Apartamento() {
    }

    public Apartamento(int numlocal, String referenciaEd) {
        this.numlocal = numlocal;
        this.referenciaEd = referenciaEd;
    }

    public int getNumlocal() {
        return numlocal;
    }

    public void setNumlocal(int numlocal) {
        this.numlocal = numlocal;
    }

    public String getReferenciaEd() {
        return referenciaEd;
    }

    public void setReferenciaEd(String referenciaEd) {
        this.referenciaEd = referenciaEd;
    }
    
    
    
}
