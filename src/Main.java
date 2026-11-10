
public class Main {

    public static void main(String[] args) {

        Perro perro = new Perro("Cliford", 5, "Carlos", "Labrador");
        Gato gato = new Gato("Martin", 3, "Laura", true);

        Ave ave = new Ave("Cleo", 2, "Andrés", 350);

        Conejo conejo = new Conejo("Nube", 1, "Sofía");

        Clinica clinica = new Clinica(
                "VetCare",
                "Calle 10 # 20-30",
                true
        );

        Animal[] animales = {perro, gato, ave, conejo};

        System.out.println("===== FICHAS DE LOS ANIMALES =====");

        for (Animal animal : animales) {
            System.out.println(animal.imprimirFicha());
        }

        System.out.println("\n===== REGISTRO DE VACUNAS =====");

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");

        gato.registrarVacuna("Triple felina");
        gato.registrarVacuna("Rabia");

        System.out.println("Vacunas de Cliford: " + perro.getVacunasAplicadas());
        System.out.println("Vacunas de Martin: " + gato.getVacunasAplicadas());

        Asegurable[] asegurables = {perro, gato, clinica};

        System.out.println("\n===== SEGUROS Y PÓLIZAS =====");

        for (Asegurable asegurable : asegurables) {
            System.out.println("Prima del seguro: $"
                    + asegurable.calcularPrimaSeguro());

            System.out.println("Número de póliza: "
                    + asegurable.obtenerNumeroPoliza());

            System.out.println("------------------------");
        }
    }
}

