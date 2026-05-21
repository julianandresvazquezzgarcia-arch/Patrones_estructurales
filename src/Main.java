public class Main {

    public static void main(String[] args) {

        IPersonaje jugador1 =
                new EspadaDecorador(
                        new PersonajeBase(
                                "Ryu",
                                new AtaqueFuerte()
                        )
                );

        IPersonaje jugador2 =
                new ArmaduraDecorador(
                        new PersonajeBase(
                                "Ken",
                                new AtaqueRapido()
                        )
                );

        JuegoLucha juego =
                new JuegoLucha(jugador1, jugador2);

        juego.iniciarPelea();
    }
}
