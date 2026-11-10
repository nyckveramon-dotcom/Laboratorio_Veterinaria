public class Clinica implements Asegurable{

    private String nombreClinica;
    private String direccion;
    private boolean puedeAsegurarse;

    public Clinica(String nombreClinica, String direccion, boolean puedeAsegurarse){
        if (nombreClinica == null || nombreClinica.isBlank()) {
            throw new IllegalArgumentException("La clinica debe tener un nombre.");
        }

        if (direccion == null || direccion.isBlank()) {
            throw new IllegalArgumentException("Se debe completar la información de la dirección.");
        }

        this.nombreClinica = nombreClinica;
        this.direccion = direccion;
        this.puedeAsegurarse = puedeAsegurarse;
    }

    public String getNombreClinica(){
        return nombreClinica;
    }

    public String getDireccion(){
        return direccion;
    }

    public boolean isPuedeAsegurarse(){
        return puedeAsegurarse;
    }


    @Override
    public double calcularPrimaSeguro() {
        return 5000000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + getNombreClinica();
    }
}
