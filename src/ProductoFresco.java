import java.util.Date;

public class ProductoFresco extends Producto{
    
    public ProductoFresco(Date fcaducidad, Date fEnvasado, int nlote, String pOrigen) {
        super(fcaducidad, fEnvasado, nlote, pOrigen);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("  \n -------------------------------------------------------------------------");
    }

}