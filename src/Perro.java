import java.util.ArrayList;

public class Perro extends Animal implements Vacunable, Asegurable {

    private String raza;

    public Perro(String nombreMascota, int edad, String nombreDueño, String raza) {
        super(nombreMascota, edad, nombreDueño);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        double valorPorAnio = 3000 * getEdad();
        double valorTotal = valorPorAnio + 45000;
        return valorTotal;
    }

    private final ArrayList<String> vacunas = new ArrayList<>();

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }

    @Override
    public double calcularPrimaSeguro() {
        double valorPorAnio = 80000 * getEdad();
        return valorPorAnio;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "Perro-" + getNombreMascota();
    }
}
