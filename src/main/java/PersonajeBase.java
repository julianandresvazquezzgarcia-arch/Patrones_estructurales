public class PersonajeBase implements IPersonaje {

    private String nombre;
    private int puntosDeVida;
    private EstrategiaAtaque estrategia;

    public PersonajeBase(String nombre, EstrategiaAtaque estrategia) {

        this.nombre = nombre;
        this.estrategia = estrategia;
        this.puntosDeVida = 100;
    }

    @Override
    public void atacar(IPersonaje oponente) {

        int dano = estrategia.atacar();

        oponente.recibirDano(dano);

        System.out.println(nombre +
                " causa " + dano + " puntos de daño.");
    }

    @Override
    public void recibirDano(int dano) {

        puntosDeVida -= dano;

        if (puntosDeVida < 0) {
            puntosDeVida = 0;
        }
    }

    @Override
    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getPuntosDeVida() {
        return puntosDeVida;
    }
}
