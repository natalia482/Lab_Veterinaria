//La clínica ofrece planes de seguro. Los perros y gatos pueden asegurarse. También puede asegurarse la
//Clínica como institución, aunque la clínica no es un animal.

public interface Asegurable {

    //Prima anual según las reglas de cada clase
    double calcularPrimaSeguro();

    //Identificador único de la póliza
    String obtenerNumeroPoliza();
}