package service;

public class B_Producto {
    private String sku;

    public B_Producto(){
    }
    public B_Producto(String sku){
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String toString(){
        return "B_Producto: " + sku;
    }
}
