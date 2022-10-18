package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }
    
    @Override
    public int compareTo(Object futbolista) {
        var otroJugador = (Jugador) futbolista;
        return super.getEdad() - otroJugador.getEdad() ;
    }

    @Override
    public String toString() {
        return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
    
    @Override
    public boolean jugarConLasManos() {
        return false;
    }    
}
