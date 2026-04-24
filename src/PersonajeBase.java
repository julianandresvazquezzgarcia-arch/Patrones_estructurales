import java.util.Random;

public class PersonajeBase implements IPersonaje {

    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    public PersonajeBase(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100;
    }

    @Override
    public void atacar(IPersonaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;

        oponente.recibirDano(dano);

        System.out.println(nombre + " ataca a "
                + oponente.getNombre()
                + " causando " + dano + " puntos de dano.");
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
