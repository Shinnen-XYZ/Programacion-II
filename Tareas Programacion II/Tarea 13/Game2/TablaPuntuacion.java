package Game2;

public class TablaPuntuacion {

    package Cocumber;

public class TablaPuntuacion {

    private Integer empate;
    private Integer ganadas;
    private Integer perdidas;

    public TablaPuntuacion() {
        empate = 0;
        ganadas = 0;
        perdidas = 0;
    }

    public Integer getEmpate() {
        return empate;
    }

    public Integer getGanadas() {
        return ganadas;
    }

    public Integer getPerdidas() {
        return perdidas;
    }

    public void incrementarGanadas() {
        ganadas++;
    }

    public void incrementarPerdidas() {
        perdidas++;
    }

    public void incrementarEmpate() {
        empate++;
    }
}
