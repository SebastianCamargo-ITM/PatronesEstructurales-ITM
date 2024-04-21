package bridge;

import models.FormatoArchivo;

public class SistemaGestorConversor extends SistemaGestor {

    private String data;

    public SistemaGestorConversor(FormatoArchivo formatoArchivo) {
        super(formatoArchivo);
    }

    public void cambiarFormatoArchivo(FormatoArchivo nuevoFormatoArchivo) {
        this.formatoArchivo = nuevoFormatoArchivo;
    }

    public void convertirArchivo(String rutaA, String rutaB) {
        System.out.println("Convirtiendo archivo...");
        this.leerArchivo(rutaA);
        this.data = this.formatoArchivo.getData();
        System.out.println("-> Archivo convertido de " + rutaA + " a " + rutaB + " | Contenido: " + data);
    }

}
