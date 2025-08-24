package service;

public class B_Producto {
    private String prod;

    public B_Producto(){
    }
    public B_Producto(String prod){
        this.prod = prod;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String toString(){
        return "B_Producto: " + prod;
    }
}
