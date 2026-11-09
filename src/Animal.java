public abstract class Animal {
    //protected para que las clases hijas puedan acceder sin romper la privacidad
    protected String nombre;
    protected int edad;
    protected String nombreDueno;

    //Constructor de la base para inicializar los datos
    public Animal(String nombre, int edad, String nombreDueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreDueno = nombreDueno;
    }


    //Como cada especie tiene un costo diferente, obliga a sus hijas a usarlo.
    public abstract double calcularCostoConsulta();

    //Imprimir ficha, lo creo acá porque es la misma ficha para todos los animales, segun la especie
    public void imprimirFicha() {
        System.out.println("=====================================");
        System.out.println("FICHA DE ATENCIÓN VETERINARIA VETCARE");
        System.out.println("Nombre del animal: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Dueño: " + nombreDueno);
        System.out.println("Costo de consulta: $" + calcularCostoConsulta());
        System.out.println("=====================================");

    }
}
