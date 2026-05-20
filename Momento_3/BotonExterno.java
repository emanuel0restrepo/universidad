public class BotonExterno extends Boton {

    public BotonExterno(int piso) {
        super(piso);
    }

    @Override
    public void presionar(Elevador elevador) {

        System.out.println("Llamando elevador al piso " + piso);

        elevador.moverA(piso);
    }
}