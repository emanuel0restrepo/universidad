public class Piso {

    private int numero;
    private BotonExterno boton;

    public Piso(int numero) {

        this.numero = numero;

        boton = new BotonExterno(numero);
    }

    public void llamarElevador(Elevador elevador) {

        boton.presionar(elevador);
    }

    public int getNumero() {
        return numero;
    }
}