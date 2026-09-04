package handlers;

import core.Handler;
import model.Solicitud;
import model.TipoSolicitud;

public class MonitorHandler extends Handler {

    @Override
    protected boolean puedeResolver(Solicitud solicitud) {
        return solicitud.getTipo() == TipoSolicitud.PRESTAMO_EQUIPO
                || solicitud.getTipo() == TipoSolicitud.APERTURA_LABORATORIO;
    }

    @Override
    protected void resolver(Solicitud solicitud) {
        System.out.println("[" + getNombreNivel() + "] resuelve la solicitud: " + solicitud.getDescripcion());
    }

    @Override
    protected String getNombreNivel() {
        return "Monitor";
    }
}
