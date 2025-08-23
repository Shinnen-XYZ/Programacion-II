package service;

public class Nodo {
    private Object dato;
    private Nodo siguiente;

    public Nodo() {
        this.dato = null;
        this.siguiente = null;
    }

    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(Object dato, Nodo sigi) {
        this.dato = dato;
        this.siguiente = sigi;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return dato != null ? dato.toString() : "null";
    }
}
