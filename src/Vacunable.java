import java.awt.*;

//La clínica lleva registro de vacunación. Los perros y gatos se vacunan; las aves tienen un protocolo distinto que
//por ahora no se implementa. Vacunable declara dos capacidades:

public interface Vacunable {
    //Nombre de la vacuna aplicada
    void registrarVacuna(String nombreVacuna);

    //Cuantas vacunas lleva el animal
    int getVacunasAplicadas();
}