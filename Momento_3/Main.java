import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Elevador elevador = new Elevador();

        Piso[] pisos = new Piso[5];

        for (int i = 0; i < 5; i++) {
            pisos[i] = new Piso(i);
        }

        while (true) {

            System.out.println("\nPiso actual: " + elevador.getPisoActual());

            System.out.println("1. Llamar elevador");
            System.out.println("2. Elegir piso");
            System.out.println("3. Salir");

            int opcion = sc.nextInt();

            if (opcion == 1) {

                System.out.print("Ingrese piso: ");

                int piso = sc.nextInt();

                pisos[piso].llamarElevador(elevador);
            }

            else if (opcion == 2) {

                System.out.print("Destino: ");

                int destino = sc.nextInt();

                BotonInterno boton = new BotonInterno(destino);

                boton.presionar(elevador);
            }

            else if (opcion == 3) {
                break;
            }
        }

        sc.close();
    }
}