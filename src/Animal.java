public abstract class Animal {

    private String nombreMascota;
    private int edad;
    private String nombreDueño;

    public Animal(String nombreMascota, int edad, String nombreDueño){
        if (nombreMascota == null || nombreMascota.isBlank()) {
            throw new IllegalArgumentException("La mascota requiere un nombre.");
        }
        if (edad < 0) {
            throw new IllegalArgumentException("La edad de la mascota no puede ser negativa.");
        }
        if (nombreDueño == null || nombreDueño.isBlank()) {
            throw new IllegalArgumentException("El nombre del dueño requiere un nombre.");
        }

        this.nombreMascota = nombreMascota;
        this.edad = edad;
        this.nombreDueño = nombreDueño;
    }

    public String getNombreMascota(){
        return nombreMascota;
    }

    public int getEdad(){
        return edad;
    }

    public String getNombreDueño(){
        return nombreDueño;
    }

    public abstract double calcularCostoConsulta();

    public String imprimirFicha(){
        return "- " + nombreMascota + "- " + edad + "- " + nombreDueño + "- $" + calcularCostoConsulta();
    }

}
