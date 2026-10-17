//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<PublicacionAcademica> repositorio = new ArrayList<>();

    List<String> autores1 = new ArrayList<>();
    autores1.add("Pérez, J.");
    autores1.add("Gómez, M.");
    repositorio.add(new ArticuloIndexado("Machine Learning in Quantum Computing", "2025", autores1, 4.85, "Q1"));
    
    List<String> autores2 = new ArrayList<>();
    autores2.add("Rodríguez, L.");
    repositorio.add(new ActaCongreso("Optimización de redes 6G mediante algoritmos genéticos", "2024", autores2, "Congreso Iberoamericano de Telecomunicaciones", "Madrid, España"));

    List<String> autores3 = new ArrayList<>();
    autores3.add("Martínez, S.");
    repositorio.add(new TesisDoctoral("Análisis estructural de materiales compuestos de grafeno", "2023", autores3, "Dr. Alberto Fernández", "Universidad Nacional de Ingeniería"));

    System.out.println("==========================================================================");
    System.out.println("             REPOSITORIO DE PUBLICACIONES ACADÉMICAS - APA            ");
    System.out.println("==========================================================================\n");

    for (PublicacionAcademica pub : repositorio) {
        System.out.println("-> " + pub.obtenerDetallesGenerales());
        System.out.println("   ¿Indexación Válida?: " + (pub.validarIndexacion() ? "Sí (Aprobado)" : "No"));
        System.out.println("   Referencia bibliográfica (APA):");
        System.out.println("   " + pub.generarReferenciaAPA());
        System.out.println("--------------------------------------------------------------------------");
    }
}
