import java.util.List;

//extends Animal. Hereda el nombre, edad y nombre del dueño
//implements Vacunable y Aseguable

public class Gato extends  Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private List<String> listaVacunas;

    public Gato(String nombre, int edad, String nombreDueno, boolean esEsterilizado) {
        super(nombre, edad, nombreDueno);
        this.esEsterilizado = esEsterilizado;
    }

    //Calcular el costo del perro
    @Override
    public double calcularCostoConsulta() {
        return 38000;
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
        if (esEsterilizado){
            return 120000;
        }else {
            return 200000;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombre.toUpperCase();
    }
}
