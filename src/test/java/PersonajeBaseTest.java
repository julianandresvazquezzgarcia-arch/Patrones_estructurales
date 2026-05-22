import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeBaseTest {

    @Test
    public void personajeDebeIniciarCon100HP() {

        PersonajeBase personaje =
                new PersonajeBase(
                        "Ryu",
                        new AtaqueFuerte()
                );

        assertEquals(100,
                personaje.getPuntosDeVida());
    }

    @Test
    public void personajeDebeRecibirDano() {

        PersonajeBase personaje =
                new PersonajeBase(
                        "Ken",
                        new AtaqueRapido()
                );

        personaje.recibirDano(20);

        assertEquals(80,
                personaje.getPuntosDeVida());
    }
}