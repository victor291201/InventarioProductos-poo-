import java.util.Date;

public class ProductoCongelado extends Producto{
    private int Temp;
    public ProductoCongelado(Date fcaducidad, Date fEnvasado, int nlote, String pOrigen, int temp) {
        super(fcaducidad, fEnvasado, nlote, pOrigen);
        //TODO Auto-generated constructor stub
        this.Temp = temp;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.print(
        ", temperatura de mantenimiento: "+this.Temp);
    }
    public int getTemp() {
        return Temp;
    }
    public void setTemp(int temp) {
        Temp = temp;
    }
    
}
