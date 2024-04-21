package models;

public interface FormatoArchivo {
    void leerArchivo(String path);
    void guardarArchivo(String path, String data);
    String getData();
}
