import java.util.List;

public class TesisDoctoral extends  PublicacionAcademica{
    private String nombreDirector;
    private String universidadOtorgante;

    public TesisDoctoral(String titulo, String fechaPublicacion, List<String> autores, String nombreDirector, String universidadOtorgante) {
        super(titulo, fechaPublicacion, autores);
        this.nombreDirector = nombreDirector;
        this.universidadOtorgante = universidadOtorgante;
    }

    @Override
    public boolean validarIndexacion() {
        return super.validarIndexacion() && this.nombreDirector != null && this.universidadOtorgante != null;
    }

    @Override
    public String generarReferenciaAPA() {
        return String.join(", ", this.autores) + " (" + this.fechaPublicacion + "). * " + this.titulo + "* (Tesis doctoral no publicada). " + this.universidadOtorgante + ". Director: " + this.nombreDirector + ".";
    }
}
