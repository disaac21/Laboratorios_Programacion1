package danieljuarez_lab3p2;

public class Casa extends BienesInmuebles {
    
    public int numero;
    public String referenciaRes;

    public Casa() {
    }
    
    public Casa(int numero, String referenciaRes) {
        this.numero = numero;
        this.referenciaRes = referenciaRes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getReferenciaRes() {
        return referenciaRes;
    }

    public void setReferenciaRes(String referenciaRes) {
        this.referenciaRes = referenciaRes;
    }
    
    
    
}
