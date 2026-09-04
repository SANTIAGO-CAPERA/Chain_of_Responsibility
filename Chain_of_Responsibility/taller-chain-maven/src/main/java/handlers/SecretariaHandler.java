package handlers;

import core.Handler;
import model.Solicitud;
import model.TipoSolicitud;

public class SecretariaHandler extends Handler {

    @Override
    protected boolean puedeResolver(Solicitud solicitud) {
        return solicitud.getTipo() == TipoSolicitud.CERTIFICADO_ACADEMICO;
    }

    @Override
    protected void resolver(Solicitud solicitud) {
        System.out.println("[" + getNombreNivel() + "] resuelve la solicitud: " + solicitud.getDescripcion());
    }

    @Override
    protected String getNombreNivel() {
        return "Secretaria";
    }
}
