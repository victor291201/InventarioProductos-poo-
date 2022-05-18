import java.util.Date;

public class Producto{
    private Date Fcaducidad;
    private Date FEnvasado;
    private int Nlote;
    private String POrigen;
    
    public Producto(Date fcaducidad, Date fEnvasado, int nlote, String pOrigen) {
        this.Fcaducidad = fcaducidad;
        this.FEnvasado = fEnvasado;
        this.Nlote = nlote;
        this.POrigen = pOrigen;
    }
    public void mostrar(){
        System.out.print("fecha caducidad: "+getFcaducidad().toString()+
        ", fecha envasado: "+getFEnvasado().toString()+
        ", numero de lote: "+getNlote()+
        ", pais de origen: "+getPOrigen());
    }
    public Date getFcaducidad() {
        return Fcaducidad;
    }
    public void setFcaducidad(Date fcaducidad) {
        Fcaducidad = fcaducidad;
    }
    public Date getFEnvasado() {
        return FEnvasado;
    }
    public void setFEnvasado(Date fEnvasado) {
        FEnvasado = fEnvasado;
    }
    public int getNlote() {
        return Nlote;
    }
    public void setNlote(int nlote) {
        Nlote = nlote;
    }
    public String getPOrigen() {
        return POrigen;
    }
    public void setPOrigen(String pOrigen) {
        POrigen = pOrigen;
    }
    
}