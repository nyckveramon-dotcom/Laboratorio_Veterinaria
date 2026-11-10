public class Conejo extends Animal {

    public Conejo(String nombreMascota, int edad, String nombreDueño){
        super(nombreMascota, edad, nombreDueño);
    }

    @Override
    public double calcularCostoConsulta() {
        return 35000;
    }
}
