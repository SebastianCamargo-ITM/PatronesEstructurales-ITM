package models.implementation;

import models.FormatoArchivo;

public class FormatoJSON implements FormatoArchivo {

    private String data;

    @Override
    public void leerArchivo(String path) {
        System.out.println("Leyendo archivo JSON desde: " + path);
    }

    @Override
    public void guardarArchivo(String path, String data) {
        this.data = data;
        System.out.println("Guardando datos en archivo JSON en: " + path + ". Datos: " + data);
    }

    @Override
    public String getData() {
        return data;
    }
    
}
