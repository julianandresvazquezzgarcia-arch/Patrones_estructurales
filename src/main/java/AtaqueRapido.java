import java.util.Random;

public class AtaqueRapido implements EstrategiaAtaque {

    @Override
    public int atacar() {

        Random rand = new Random();

        return rand.nextInt(11) + 10;
    }
}
