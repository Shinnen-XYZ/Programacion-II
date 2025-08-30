package Consecionario;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

public class Automovil {
    private final int TAM = 4;

    public int getTAM() {
        return TAM;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    @Getter
    @Setter

    private Llanta []llantas;
    public Automovil(){
        llantas = new Llanta[TAM];
        for( int i = 0; i < TAM; i++ )
            llantas[i] =  new Llanta();

    }
    @Override
    public String toString() {
        return "Automovil{" +
                "TAM=" + TAM +
                ", llantas=" + Arrays.toString(llantas) +
                '}';
    }
}
