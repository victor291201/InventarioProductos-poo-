import java.util.Date;

public class PCongeladoNitrogeno extends ProductoCongelado{
    private String MCongelacion;
    private int TNitrogeno;
    public PCongeladoNitrogeno(Date fcaducidad, Date fEnvasado, int nlote, String pOrigen, int temp, int TNitrogeno, String MCongelacion) {
        super(fcaducidad, fEnvasado, nlote, pOrigen, temp);
        //TODO Auto-generated constructor stub
        this.MCongelacion = MCongelacion;
        this.TNitrogeno = TNitrogeno;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.print(
            ", metodo de congelacion: "+this.MCongelacion+
            ", tiempo de exposicion al nitrogeno: "+this.TNitrogeno
        );
        System.out.println("  \n -------------------------------------------------------------------------");
    }
    public String getMCongelacion() {
        return MCongelacion;
    }
    public void setMCongelacion(String mCongelacion) {
        MCongelacion = mCongelacion;
    }
    public int getTNitrogeno() {
        return TNitrogeno;
    }
    public void setTNitrogeno(int tNitrogeno) {
        TNitrogeno = tNitrogeno;
    }
    
}
