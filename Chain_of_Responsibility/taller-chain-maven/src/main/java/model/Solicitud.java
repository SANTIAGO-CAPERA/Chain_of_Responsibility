package model;

public class Solicitud {

    private final TipoSolicitud tipo;
    private final String descripcion;

    public Solicitud(TipoSolicitud tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public TipoSolicitud getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
