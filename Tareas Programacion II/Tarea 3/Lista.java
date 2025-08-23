package service;

public class Lista{
    private String nombre;
    private Nodo inicio;
    private Nodo fin;

    public Lista(){
        this.nombre = "";
        this.inicio = null;
        this.fin = null;
    }

    public Lista(String nombre){
        this.nombre = nombre;
        this.inicio = null;
        this.fin = null;
    }

    public boolean EVacio(){
        return inicio == null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public void InsertarAdelante(Object dato){
        Nodo Nodonuevo = new Nodo(dato);
        if(EVacio()){
            inicio = Nodonuevo;
            fin = Nodonuevo;
        } else {
            Nodonuevo.setSiguiente(inicio);
            inicio = Nodonuevo;
        }
    }

    @Override
    public String toString(){
        return "Lista{" +
                "nombre=" + nombre + '\n'+
                ", inicio=" + (inicio != null ? "Nodo" : null) +
                ", fin=" + (fin != null ? "Nodo" : null) +
                '}';
    }

    @Override
    public boolean equals(Object objetos){
        if (this == objetos) return true;
        if (objetos == null || getClass() != objetos.getClass()) return false;
        Lista lista = (Lista) objetos;
        return  toString().equals(lista.toString());
    }

}
