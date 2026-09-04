package handlers;

import core.Handler;
import model.Solicitud;
import model.TipoSolicitud;

public class ProfesorHandler extends Handler {

    @Override
    protected boolean puedeResolver(Solicitud solicitud) {
        return solicitud.getTipo() == TipoSolicitud.DUDA_TEMA_CLASE;
    }

    @Override
    protected void resolver(Solicitud solicitud) {
        System.out.println("[" + getNombreNivel() + "] resuelve la solicitud: " + solicitud.getDescripcion());
    }

    @Override
    protected String getNombreNivel() {
        return "Profesor";
    }
}
