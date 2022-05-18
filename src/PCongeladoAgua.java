import java.util.Date;

public class PCongeladoAgua extends ProductoCongelado{
    private int Psal;
    public PCongeladoAgua(Date fcaducidad, Date fEnvasado, int nlote, String pOrigen, int temp, int Psal) {
        super(fcaducidad, fEnvasado, nlote, pOrigen, temp);
        //TODO Auto-generated constructor stub
        this.Psal = Psal;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.print(
            ", porcentaje salinidad: "+this.Psal
        );
        System.out.println("  \n -------------------------------------------------------------------------");
    }
    public int getPsal() {
        return Psal;
    }
    public void setPsal(int psal) {
        Psal = psal;
    }
    
}