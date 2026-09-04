package handlers;

import core.Handler;
import model.Solicitud;
import model.TipoSolicitud;

public class CoordinadorHandler extends Handler {

    @Override
    protected boolean puedeResolver(Solicitud solicitud) {
        return solicitud.getTipo() == TipoSolicitud.CAMBIO_DE_GRUPO;
    }

    @Override
    protected void resolver(Solicitud solicitud) {
        System.out.println("[" + getNombreNivel() + "] resuelve la solicitud: " + solicitud.getDescripcion());
    }

    @Override
    protected String getNombreNivel() {
        return "Coordinador";
    }
}
