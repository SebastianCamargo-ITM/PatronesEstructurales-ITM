package models.implementation;

import models.FormatoArchivo;

public class FormatoCSV implements FormatoArchivo {

    private String data;

    @Override
    public void leerArchivo(String path) {
        System.out.println("Leyendo archivo CSV desde: " + path);
    }

    @Override
    public void guardarArchivo(String path, String data) {
        this.data = data;
        System.out.println("Guardando datos en archivo CSV en: " + path + ". Datos: " + data);
    }
    
    @Override
    public String getData() {
        return data;
    }
}
