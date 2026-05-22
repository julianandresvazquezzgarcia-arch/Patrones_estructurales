import java.util.Random;

public class EscudoDecorador extends PersonajeDecorador {

    public EscudoDecorador(IPersonaje personaje) {
        super(personaje);
    }

    @Override
    public void recibirDano(int dano) {

        Random rand = new Random();
        int probabilidad = rand.nextInt(100);

        if (probabilidad < 30) {
            System.out.println("[Escudo] "
                    + getNombre()
                    + " bloquea el ataque.");
        } else {
            personaje.recibirDano(dano);
        }
    }

    @Override
    public String getNombre() {
        return personaje.getNombre() + " [Escudo]";
    }
}
