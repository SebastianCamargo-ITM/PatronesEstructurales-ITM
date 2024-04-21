import bridge.SistemaGestorConversor;
import models.implementation.FormatoCSV;
import models.implementation.FormatoJSON;
import models.implementation.FormatoXML;

public class App {
    public static void main(String[] args) throws Exception {
        SistemaGestorConversor conversorCsv = new SistemaGestorConversor(new FormatoCSV());
        conversorCsv.guardarArchivo("/file.csv","Soy un archivo");//Creacion del archivo CSV
        conversorCsv.convertirArchivo("/file.csv","/file.json");
        conversorCsv.cambiarFormatoArchivo(new FormatoJSON());
        conversorCsv.leerArchivo("/file.json");

        System.out.println("\n");

        SistemaGestorConversor conversorJson = new SistemaGestorConversor(new FormatoCSV());
        conversorJson.guardarArchivo("/file.json","Soy otro archivo");//Creacion del archivo JSON
        conversorJson.convertirArchivo("/file.json","/file.xml");
        conversorJson.cambiarFormatoArchivo(new FormatoXML());
        conversorJson.leerArchivo("/file.xml");

        System.out.println("\n");

        SistemaGestorConversor conversorXML = new SistemaGestorConversor(new FormatoXML());
        conversorXML.guardarArchivo("/file.xml","Soy otro archivo mas");//Creacion del archivo JSON
        conversorXML.convertirArchivo("/file.xml","/file.json");
        conversorXML.cambiarFormatoArchivo(new FormatoJSON());
        conversorXML.leerArchivo("/file.json");
    }
}
