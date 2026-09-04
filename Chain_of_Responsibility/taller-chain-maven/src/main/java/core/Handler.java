package core;

import model.Solicitud;

public abstract class Handler {

    protected Handler siguiente;

    public void setSiguiente(Handler siguiente) {
        this.siguiente = siguiente;
    }

    public void manejarSolicitud(Solicitud solicitud) {
        System.out.println("[" + getNombreNivel() + "] recibe la solicitud: " + solicitud.getDescripcion());

        if (puedeResolver(solicitud)) {
            resolver(solicitud);
        } else if (siguiente != null) {
            System.out.println("[" + getNombreNivel() + "] no tiene competencia para resolverla, la escala al siguiente nivel");
            siguiente.manejarSolicitud(solicitud);
        } else {
            System.out.println("La solicitud llego al final de la cadena sin ser resuelta: " + solicitud.getDescripcion());
        }
    }

    protected abstract boolean puedeResolver(Solicitud solicitud);

    protected abstract void resolver(Solicitud solicitud);

    protected abstract String getNombreNivel();
}
