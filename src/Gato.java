public class Gato extends Animal implements Vacunable{

    private boolean esEsterilizado;
    public Gato(String nombreMascota, int edad, String nombreDueño, boolean esEsterilizado) {
        super(nombreMascota, edad, nombreDueño);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
    }

    @Override
    public void registrarVacuna(String nombre) {

    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }
}
