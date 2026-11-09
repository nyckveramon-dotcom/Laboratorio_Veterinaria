import java.util.ArrayList;

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

    private final ArrayList<String> vacunas = new ArrayList<>();

    @Override
    public void registrarVacuna(String nombre) {
        vacunas.add(nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunas.size();
    }



}
