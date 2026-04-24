public class EspadaDecorador extends PersonajeDecorador {

    private final int BONO_DANO = 15;

    public EspadaDecorador(IPersonaje personaje) {
        super(personaje);
    }

    @Override
    public void atacar(IPersonaje oponente) {
        personaje.atacar(oponente);

        oponente.recibirDano(BONO_DANO);

        System.out.println("[Espada] "
                + getNombre()
                + " causa " + BONO_DANO
                + " puntos extra.");
    }

    @Override
    public String getNombre() {
        return personaje.getNombre() + " [Espada]";
    }
}
