void main() {
    System.out.println("===============================================================");
    // Arreglo de tipo Animal[]
    Animal[] Especies = {
            new Perro("Rocky", 4, "Natalia", "Husky"),
            new Gato("Cosmo", 2, "Mishelle", true),
            new Ave("Loli", 1, "Ruddy", 50.0) // 50 gramos
    };

    // Recorrer el arreglo
    for (Animal a : Especies) {
        a.imprimirFicha();
    }


    System.out.println("\n=== vACUNACIÓN===");
    Perro miPerro = new Perro("Rocco", 3, "Mateo", "Bulldog");
    Gato miGato = new Gato("Luna", 5, "Sofia", false);

    miPerro.registrarVacuna("Rabia");
    miPerro.registrarVacuna("Parvovirus");

    miGato.registrarVacuna("Triple Felina");

    System.out.println("Vacunas de " + miPerro.nombre + ": " + miPerro.getVacunasAplicadas());
    System.out.println("Vacunas de " + miGato.nombre + ": " + miGato.getVacunasAplicadas());


    System.out.println("\n=== 3. PRUEBA DE PÓLIZAS CON ASEGURABLE[] ===");
    Clinica vetCare = new Clinica("VetCare Central", "Calle Principal #123");

    // Arreglo asegurable
    Asegurable[] asegurables = {
            miPerro,
            miGato,
            vetCare
    };

    for (Asegurable aseg : asegurables) {
        System.out.println("Póliza: " + aseg.obtenerNumeroPoliza() + " | Prima Anual: $" + aseg.calcularPrimaSeguro());
    }
}