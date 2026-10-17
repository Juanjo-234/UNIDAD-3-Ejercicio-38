import java.util.List;

public class ArticuloIndexado extends PublicacionAcademica{
    private double factorImpacto;
    private String cuartil;

    public ArticuloIndexado(String titulo, String fechaPublicacion, List<String> autores, double factorImpacto, String cuartil) {
        super(titulo, fechaPublicacion, autores);
        this.factorImpacto = factorImpacto;
        this.cuartil = cuartil;
    }

    @Override
    public boolean validarIndexacion() {
        return super.validarIndexacion() && this.factorImpacto > 0.0 && (this.cuartil.equals("Q1") || this.cuartil.equals("Q2") || this.cuartil.equals("Q3"));
    }

    @Override
    public String generarReferenciaAPA() {
        return String.join(", ", this.autores) + " (" + this.fechaPublicacion + "). " + this.titulo + ". *Revista Científica Internacional*, Factor de impacto: " + this.factorImpacto + " (" + this.cuartil + ").";
    }
}
