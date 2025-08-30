package Consecionario;
import lombok.Getter;
import lombok.ToString;
@Getter
@ToString

public class Llanta {

    private int rin;

    public Llanta( int rin ) {
        setRin( rin );
    }

    public Llanta(){
        this(0);
    }
    public void setRin( int rin ) {
        this.rin = ( rin > 0 ) ? rin : 10;
    }


    public int getRin() {
        return rin;
    }
     @Override
    public boolean equals(Object objectos){
        if( this == objectos) return true;
        if(objectos == null || getClass() != objectos.getClass() ) return false;
        Llanta b = (Llanta) objectos;
        return toString().equals(b.toString());
     }
}
