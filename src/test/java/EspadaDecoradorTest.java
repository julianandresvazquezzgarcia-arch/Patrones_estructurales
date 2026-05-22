import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EspadaDecoradorTest {

    @Test
    public void espadaDebeAgregarDanoExtra() {

        IPersonaje atacante =
                Mockito.mock(IPersonaje.class);

        IPersonaje defensor =
                Mockito.mock(IPersonaje.class);

        EspadaDecorador espada =
                new EspadaDecorador(atacante);

        espada.atacar(defensor);

        Mockito.verify(defensor)
                .recibirDano(15);
    }
}