import java.util.List;

public class ActaCongreso extends PublicacionAcademica{
    private String nombreSimposio;
    private String ciudadSede;

    public ActaCongreso(String titulo, String fechaPublicacion, List<String> autores, String nombreSimposio, String ciudadSede) {
        super(titulo, fechaPublicacion, autores);
        this.nombreSimposio = nombreSimposio;
        this.ciudadSede = ciudadSede;
    }

    @Override
    public boolean validarIndexacion() {
        return super.validarIndexacion() && this.nombreSimposio != null && this.ciudadSede != null;
    }

    @Override
    public String generarReferenciaAPA() {
        return String.join(", ", this.autores) + " (" + this.fechaPublicacion + "). " + this.titulo + ". En *Actas del " + this.nombreSimposio + "* (pp. 1-10). " + this.ciudadSede + ".";
    }
}
