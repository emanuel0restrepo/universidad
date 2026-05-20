public class BotonInterno extends Boton {

    public BotonInterno(int piso) {
        super(piso);
    }

    @Override
    public void presionar(Elevador elevador) {

        System.out.println("Seleccionando piso " + piso);

        elevador.moverA(piso);
    }
}