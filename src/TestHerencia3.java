import java.util.ArrayList;
import java.util.Date;

public class TestHerencia3{
    public static void main(String[] args) {
        ArrayList<Producto> productos =  new ArrayList();
        productos.add(new ProductoFresco(new Date(116, 5,3), new Date(118, 5,3), 5, "venezuela"));
        productos.add(new ProductoFresco(new Date(117, 5,6), new Date(118, 9,3), 8, "argentina"));

        productos.add(new ProductoRefrigerado(new Date(117, 5,6), new Date(118, 9,3), 5, "argentina", 50));
        productos.add(new ProductoRefrigerado(new Date(117, 5,6), new Date(118, 9,3), 4, "marruecos", 40));
        productos.add(new ProductoRefrigerado(new Date(117, 5,6), new Date(118, 9,3), 3, "colombia", 30));

        productos.add(new PCongeladoAgua(new Date(117, 5,6), new Date(118, 9,3), 3, "colombia", 30, 50));
        productos.add(new PCongeladoAgua(new Date(117, 5,6), new Date(118, 9,3), 7, "brazil", 20, 30));
        productos.add(new PCongeladoAire(new Date(117, 5,6), new Date(118, 9,3), 7, "brazil", 20, 30, 40, 30));
        productos.add(new PCongeladoAire(new Date(117, 5,6), new Date(118, 9,3), 5, "bolivia", 15, 50, 10, 20));
        productos.add(new PCongeladoNitrogeno(new Date(117, 5,6), new Date(118, 9,3), 5, "bolivia", 15, 15, "sumergimiento"));

        for (Producto producto : productos) {
            producto.mostrar();
        }
    }
}