import java.util.Date;

public class PCongeladoAire extends ProductoCongelado{
    private int PNitrogeno;
    private int PDCarbono;
    private int PVAgua;
    public PCongeladoAire(Date fcaducidad, Date fEnvasado, int nlote, String pOrigen, int temp, int PNitrogeno, int PVAgua, int PDCarbono) {
        super(fcaducidad, fEnvasado, nlote, pOrigen, temp);
        //TODO Auto-generated constructor stub
        this.PNitrogeno = PNitrogeno;
        this.PDCarbono = PDCarbono;
        this.PVAgua = PVAgua;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.print(
        ", porcentaje de nitrogeno: "+this.PNitrogeno+
        ", porcentaje de dioxido de carbono: "+this.PDCarbono+
        ", porcentaje de vapor de agua: "+this.PVAgua);
        System.out.println("  \n -------------------------------------------------------------------------");
    }
    public int getPNitrogeno() {
        return PNitrogeno;
    }
    public void setPNitrogeno(int pNitrogeno) {
        PNitrogeno = pNitrogeno;
    }
    public int getPDCarbono() {
        return PDCarbono;
    }
    public void setPDCarbono(int pDCarbono) {
        PDCarbono = pDCarbono;
    }
    public int getPVAgua() {
        return PVAgua;
    }
    public void setPVAgua(int pVAgua) {
        PVAgua = pVAgua;
    }
    
}
