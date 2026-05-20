public class Puerta {

    private String tipo;

    public Puerta(String tipo) {
        this.tipo = tipo;
    }

    public void abrir() {
        System.out.println("Puerta " + tipo + " abriéndose...");
    }

    public void cerrar() {
        System.out.println("Puerta " + tipo + " cerrándose...");
    }
}