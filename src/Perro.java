public class Perro extends Animal implements Vacunable {

    private String raza;

    public Perro(String nombreMascota, int edad, String nombreDueño, String raza) {
        super(nombreMascota, edad, nombreDueño);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        long valorPorAnio = 3000 * getEdad();
        long valorTotal = valorPorAnio + 45000;
        return valorTotal;
    }

    @Override
    public void registrarVacuna(String nombre) {

    }

    @Override
    public int getVacunasAplicadas() {
        return 0;
    }
}
