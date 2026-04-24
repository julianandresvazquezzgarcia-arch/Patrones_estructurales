public class JuegoLucha {

    private IPersonaje jugador1;
    private IPersonaje jugador2;

    public JuegoLucha(IPersonaje jugador1, IPersonaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {

        System.out.println("==================================");
        System.out.println("INICIA LA PELEA");
        System.out.println(jugador1.getNombre()
                + " VS "
                + jugador2.getNombre());
        System.out.println("==================================");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {

            turno(jugador1, jugador2);

            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        System.out.println("==================================");

        if (jugador1.estaVivo()) {
            System.out.println(jugador1.getNombre() + " GANA");
        } else {
            System.out.println(jugador2.getNombre() + " GANA");
        }
    }

    private void turno(IPersonaje atacante, IPersonaje defensor) {

        System.out.println("----------------------------------");
        System.out.println("Turno de " + atacante.getNombre());

        atacante.atacar(defensor);

        System.out.println(defensor.getNombre()
                + " tiene "
                + defensor.getPuntosDeVida()
                + " HP");
    }
}
