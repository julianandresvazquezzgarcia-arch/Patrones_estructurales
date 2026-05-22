public class ArmaduraDecorador extends PersonajeDecorador {

    private final int REDUCCION = 10;

    public ArmaduraDecorador(IPersonaje personaje) {
        super(personaje);
    }

    @Override
    public void recibirDano(int dano) {

        int danoReal = dano - REDUCCION;

        if (danoReal < 0) {
            danoReal = 0;
        }

        System.out.println("[Armadura] "
                + getNombre()
                + " reduce dano.");

        personaje.recibirDano(danoReal);
    }

    @Override
    public String getNombre() {
        return personaje.getNombre() + " [Armadura]";
    }
}
