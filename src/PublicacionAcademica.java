import java.util.ArrayList;
import java.util.List;

public class PublicacionAcademica {
    String titulo;
    String fechaPublicacion;
    List<String>autores;

    public PublicacionAcademica(String titulo, String fechaPublicacion,  List<String>autores){
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autores = new ArrayList<>();
    }

    public boolean validarIndexacion() {
        return this.titulo != null && !this.titulo.isEmpty() && !this.autores.isEmpty();
    }

    public String generarReferenciaAPA() {
        return String.join(", ", this.autores) + " (" + this.fechaPublicacion + "). * " + this.titulo + "*.";
    }

    public String obtenerDetallesGenerales() {
        return "Título: " + this.titulo + " | Fecha: " + this.fechaPublicacion + " | Autores: " + String.join(", ", this.autores);
    }

}
