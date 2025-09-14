package service;

import java.util.List;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellidos;
    private Perfil perfil;
    private List<Lugar> lugares;
    private List<Fotografia> fotografias;

    public Persona() {
        this.lugares = new ArrayList<Lugar>();
        this.fotografias = new ArrayList<Fotografia>();
    }

    public Persona(String nombre, String apellidos, Perfil perfil) {
        this();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.perfil = perfil;
    }

    public void agregarLugar(Lugar lugar) {
        if (lugar != null) {
            lugares.add(lugar);
        }
    }

    public void agregarFotografia(Fotografia foto) {
        if (foto != null) {
            fotografias.add(foto);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public List<Fotografia> getFotografias() {
        return fotografias;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", perfil=" + perfil +
                ", lugares=" + lugares.size() + " lugares" +
                ", fotografias=" + fotografias.size() + " fotos" +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return toString().equals(persona.toString());
    }
}
