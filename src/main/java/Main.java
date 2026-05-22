public class Main {

    public static void main(String[] args) {

        IPersonaje jugador1 =
                new EspadaDecorador(
                        new PersonajeBase(
                                "Julian",
                                new AtaqueFuerte()
                        )
                );

        IPersonaje jugador2 =
                new ArmaduraDecorador(
                        new PersonajeBase(
                                "Mariana",
                                new AtaqueRapido()
                        )
                );

        JuegoLucha juego =
                new JuegoLucha(jugador1, jugador2);

        juego.iniciarPelea();
    }
}
