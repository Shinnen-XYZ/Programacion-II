package service;
import java.util.ArrayList;
public class B_Inventario {
    private ArrayList<B_Producto> productos;

    public B_Inventario(){
        productos = new ArrayList<B_Producto>();
    }

    public void agrgarProducto(B_Producto producto){
        productos.add(producto);
    }

    public String toString(){
        String resultado = "Inventario:\n";
        for(int i = 0; i < productos.size(); i++){
            resultado = resultado + productos.get(i).toString() + "\n";
        }
        return resultado;
    }
}
