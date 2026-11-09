//extends Animal. Hereda el nombre, edad y nombre del dueño

public class Ave extends Animal{
    private double pesoGramos;

    public Ave(String nombre, int edad, String nombreDueno, double pesoGramos) {
        super(nombre, edad, nombreDueno);
        this.pesoGramos = pesoGramos;
    }

    //Calcular el costo del perro

    @Override
    public double calcularCostoConsulta() {
        return 28000 + (100 * pesoGramos);
    }

}