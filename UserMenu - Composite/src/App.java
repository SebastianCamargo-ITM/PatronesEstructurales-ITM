import java.util.Iterator;

import models.MenuComponent;
import models.implementation.MenuCompuesto;
import models.implementation.MenuOpcion;

public class App {
    
    public static void main(String[] args) throws Exception {
        MenuComponent crearUsuario = new MenuOpcion("Crear usuario");
        MenuComponent modificarUsuario = new MenuOpcion("Modificar usuario");
        MenuComponent eliminarUsuario = new MenuOpcion("Eliminar usuario");
        MenuCompuesto menuUsuarios = new MenuCompuesto("Gestionar Usuarios");
        menuUsuarios.agregar(crearUsuario);
        menuUsuarios.agregar(modificarUsuario);
        menuUsuarios.agregar(eliminarUsuario);

        MenuComponent crearRol = new MenuOpcion("Crear rol");
        MenuComponent asignarRol = new MenuOpcion("Asignar rol a usuario");
        MenuCompuesto menuRoles = new MenuCompuesto("Gestionar Roles");
        menuRoles.agregar(crearRol);
        menuRoles.agregar(asignarRol);

        MenuComponent crearPermiso = new MenuOpcion("Crear permiso");
        MenuComponent asignarPermiso = new MenuOpcion("Asignar permiso a rol");
        MenuCompuesto menuPermisos = new MenuCompuesto("Gestionar Permisos");
        menuPermisos.agregar(crearPermiso);
        menuPermisos.agregar(asignarPermiso);

        MenuComponent copiaSeguridad = new MenuOpcion("Realizar copia de seguridad");

        MenuComponent administrador = new MenuOpcion("Administrador");
        MenuCompuesto menuPrincipal = new MenuCompuesto("Menú Principal");
        menuPrincipal.agregar(administrador);
        menuPrincipal.agregar(menuUsuarios);
        menuPrincipal.agregar(menuRoles);
        menuPrincipal.agregar(menuPermisos);
        menuPrincipal.agregar(copiaSeguridad);

        // Usar Iterator para recorrer el menú
        System.out.println("\nRecorriendo menú con Iterator:\n");
        recorrerMenu(menuPrincipal.crearIterador());
    }

    private static void recorrerMenu(Iterator<MenuComponent> iterator) {
        while (iterator.hasNext()) {
            MenuComponent componente = iterator.next();
            componente.mostrar();
            if (componente instanceof MenuCompuesto) {
                recorrerMenu(((MenuCompuesto) componente).crearIterador());
                System.out.println("--------------------------\n");
            }
        }
    }
}
