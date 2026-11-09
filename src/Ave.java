public class Ave extends Animal{
    double pesoGramos;

    public Ave(String nombreMascota, int edad, String nombreDueño, double pesoGramos) {
        super(nombreMascota, edad, nombreDueño);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularCostoConsulta() {
        double valorPorGramo = 100 * pesoGramos;
        double valorTotal = valorPorGramo + 28000;
        return valorTotal;
    }
}
