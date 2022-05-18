import java.rmi.server.UID;
import java.util.Date;
import java.util.UUID;

public class ProductoRefrigerado extends Producto{
    private String cod;
    private int Temp;
    public ProductoRefrigerado(Date fcaducidad, Date fEnvasado, int nlote, String pOrigen, int temp) {
        super(fcaducidad, fEnvasado, nlote, pOrigen);
        //TODO Auto-generated constructor stub
        this.cod = UUID.randomUUID().toString();
        this.Temp = temp;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.print(
        ", codigo de entidad sanitaria: "+this.cod+
        ", temperatura de mantenimiento: "+this.Temp);
        System.out.println("  \n -------------------------------------------------------------------------");
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public int getTemp() {
        return Temp;
    }
    public void setTemp(int temp) {
        Temp = temp;
    }

}
