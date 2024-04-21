package bridge;

import models.FormatoArchivo;

public abstract class SistemaGestor {
    protected FormatoArchivo formatoArchivo;

    protected SistemaGestor(FormatoArchivo formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public void leerArchivo(String path){
        this.formatoArchivo.leerArchivo(path);
    }

    public void guardarArchivo(String path, String data){
        this.formatoArchivo.guardarArchivo(path, data);
    }
}
