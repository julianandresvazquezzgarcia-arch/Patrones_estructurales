import java.util.Random;

public class AtaqueMagico implements EstrategiaAtaque {

    @Override
    public int atacar() {

        Random rand = new Random();

        return rand.nextInt(31) + 15;
    }
}
