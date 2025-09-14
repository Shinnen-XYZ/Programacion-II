package service;

public class Fotografia {
    private String tipoArchivo;
    private String pathArchivo;
    private double tamanoKb;

    public Fotografia() {
    }

    public Fotografia(String tipoArchivo, String pathArchivo, double tamanoKb) {
        this.tipoArchivo = tipoArchivo;
        this.pathArchivo = pathArchivo;
        this.tamanoKb = tamanoKb;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public String getPathArchivo() {
        return pathArchivo;
    }

    public void setPathArchivo(String pathArchivo) {
        this.pathArchivo = pathArchivo;
    }

    public double getTamanoKb() {
        return tamanoKb;
    }

    public void setTamanoKb(double tamanoKb) {
        this.tamanoKb = tamanoKb;
    }

    @Override
    public String toString() {
        return "Fotografia{" +
                "tipoArchivo='" + tipoArchivo + '\'' +
                ", pathArchivo='" + pathArchivo + '\'' +
                ", tamanoKb=" + tamanoKb +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fotografia foto = (Fotografia) obj;
        return toString().equals(foto.toString());
    }
}
