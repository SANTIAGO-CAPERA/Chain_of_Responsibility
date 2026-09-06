## Explicación del patrón Chain of Responsibility

## Eddie Santiago Rondon Capera
## Codigo:20251020108
## Oscar Santiago Montoya Amaya
## Codigo:20212020076
## Modelos de programacion grupo 020-81
El patrón **Chain of Responsibility** resulta apropiado para este sistema porque permite procesar las solicitudes universitarias mediante una cadena de responsables, evitando que una única clase tenga que conocer y controlar todos los tipos de solicitudes.

En la solución, la cadena está formada por **Monitor → Profesor → Coordinador → Secretaría → Decanatura**. Cada responsable verifica si puede solucionar la solicitud recibida. Si puede resolverla, la procesa; de lo contrario, la envía al siguiente responsable de la cadena.

Esta estructura permite mantener el código organizado y facilita agregar, eliminar o modificar responsables sin afectar directamente al resto del sistema. Además, cada nivel tiene responsabilidades específicas, por lo que una solicitud puede ser atendida en el nivel más adecuado.

Por ejemplo, una solicitud sencilla puede ser resuelta por el Monitor, mientras que una solicitud que requiere mayor autoridad puede avanzar hasta Coordinación, Secretaría o Decanatura. Si ningún responsable puede atenderla, la solicitud llega al final de la cadena y se informa que no pudo ser resuelta.

Por estas características, **Chain of Responsibility** es adecuado para representar un sistema universitario en el que diferentes niveles de atención reciben solicitudes y determinan quién tiene la responsabilidad de resolverlas.

## Diagrama UML

[📄 Ver diagrama UML en PNG]<img width="8191" height="3086" alt="Solicitud Handling Pipeline-2026-09-04-175108" src="https://github.com/user-attachments/assets/3346e8f6-b749-4cd2-8de9-c10abed17c3d" />
