public abstract class PersonajeDecorador implements IPersonaje {

    protected IPersonaje personaje;

    public PersonajeDecorador(IPersonaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void atacar(IPersonaje oponente) {
        personaje.atacar(oponente);
    }

    @Override
    public void recibirDano(int dano) {
        personaje.recibirDano(dano);
    }

    @Override
    public boolean estaVivo() {
        return personaje.estaVivo();
    }

    @Override
    public String getNombre() {
        return personaje.getNombre();
    }

    @Override
    public int getPuntosDeVida() {
        return personaje.getPuntosDeVida();
    }
}
