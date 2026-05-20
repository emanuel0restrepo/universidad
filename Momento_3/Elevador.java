public class Elevador {

    private int pisoActual = 0;

    private Puerta puertaInterna;
    private Puerta puertaExterna;

    public Elevador() {
        puertaInterna = new Puerta("interna");
        puertaExterna = new Puerta("externa");
    }

    public void moverA(int destino) {

        puertaInterna.cerrar();
        puertaExterna.cerrar();

        while (pisoActual != destino) {

            if (pisoActual < destino) {
                pisoActual++;
            } else {
                pisoActual--;
            }

            System.out.println("Piso actual: " + pisoActual);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        puertaInterna.abrir();
        puertaExterna.abrir();
    }

    public int getPisoActual() {
        return pisoActual;
        
    }
}