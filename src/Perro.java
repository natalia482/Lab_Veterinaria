import java.util.List;

//extends Animal. Hereda el nombre, edad y nombre del dueño
//implements Vacunable y Aseguable,
public class Perro extends  Animal implements Vacunable, Asegurable {
    private String raza;
    private List<String> listaVacunas;

    public Perro(String nombre, int edad, String nombreDueno, String raza) {
        super(nombre, edad, nombreDueno);
        this.raza = raza;
    }

    //Calcular el costo del perroa
    @Override
    public double calcularCostoConsulta() {
        return 45000 + (3000*edad);
    }

    //Métodos de la interfaz vacunable
    @Override
    public void registrarVacuna(String nombreVacuna) {
        listaVacunas.add(nombreVacuna);
    }

    @Override
    public int getVacunasAplicadas() {
        return listaVacunas.size();
    }

    //Métodos de la interfaz asegurable

    @Override
    public double calcularPrimaSeguro() {
        return 80000*edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre.toUpperCase();
    }
}
