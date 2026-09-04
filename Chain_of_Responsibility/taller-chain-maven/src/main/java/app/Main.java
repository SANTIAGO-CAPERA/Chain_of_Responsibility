package app;

import core.Handler;
import handlers.CoordinadorHandler;
import handlers.DecanaturaHandler;
import handlers.MonitorHandler;
import handlers.ProfesorHandler;
import handlers.SecretariaHandler;
import model.Solicitud;
import model.TipoSolicitud;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Handler monitor = new MonitorHandler();
        Handler profesor = new ProfesorHandler();
        Handler coordinador = new CoordinadorHandler();
        Handler secretaria = new SecretariaHandler();
        Handler decanatura = new DecanaturaHandler();

        monitor.setSiguiente(profesor);
        profesor.setSiguiente(coordinador);
        coordinador.setSiguiente(secretaria);
        secretaria.setSiguiente(decanatura);

        List<Solicitud> solicitudes = new ArrayList<>();
        solicitudes.add(new Solicitud(TipoSolicitud.PRESTAMO_EQUIPO, "Prestamo de videobeam para exposicion"));
        solicitudes.add(new Solicitud(TipoSolicitud.DUDA_TEMA_CLASE, "Duda sobre el tema de recursividad"));
        solicitudes.add(new Solicitud(TipoSolicitud.CAMBIO_DE_GRUPO, "Cambio de grupo de laboratorio"));
        solicitudes.add(new Solicitud(TipoSolicitud.CERTIFICADO_ACADEMICO, "Certificado de notas para practica"));
        solicitudes.add(new Solicitud(TipoSolicitud.HOMOLOGACION_INTERNACIONAL, "Homologacion de materias cursadas en el exterior"));
        solicitudes.add(new Solicitud(TipoSolicitud.APERTURA_LABORATORIO, "Apertura del laboratorio en horario extra"));
        solicitudes.add(new Solicitud(TipoSolicitud.CONVENIO_UNIVERSITARIO_EXTERNO, "Aprobacion de un convenio con una universidad extranjera"));

        for (Solicitud solicitud : solicitudes) {
            System.out.println("----------------------------------------------------");
            monitor.manejarSolicitud(solicitud);
        }
    }
}
