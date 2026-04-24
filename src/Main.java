import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre jugador 1: ");
        String nombre1 = sc.nextLine();

        IPersonaje jugador1 = elegirEquipamiento(nombre1, sc);

        System.out.print("Nombre jugador 2: ");
        String nombre2 = sc.nextLine();

        IPersonaje jugador2 = elegirEquipamiento(nombre2, sc);

        JuegoLucha juego = new JuegoLucha(jugador1, jugador2);

        juego.iniciarPelea();

        sc.close();
    }

    public static IPersonaje elegirEquipamiento(String nombre, Scanner sc) {

        IPersonaje personaje = new PersonajeBase(nombre);

        System.out.println("Equipamiento para " + nombre);
        System.out.println("1. Normal");
        System.out.println("2. Espada");
        System.out.println("3. Armadura");
        System.out.println("4. Escudo");
        System.out.println("5. Espada + Armadura");
        System.out.print("Opcion: ");

        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 2:
                personaje = new EspadaDecorador(personaje);
                break;

            case 3:
                personaje = new ArmaduraDecorador(personaje);
                break;

            case 4:
                personaje = new EscudoDecorador(personaje);
                break;

            case 5:
                personaje = new ArmaduraDecorador(
                                new EspadaDecorador(personaje));
                break;
        }

        return personaje;
    }
}
