# CONVERTIDOR DE FORMATO DE ARCHIVOS (BRIDGE) 

Se necesita desarrollar una aplicación que facilite la gestión de diversos formatos de archivo, como JSON, XML y CSV. La aplicación debe ofrecer a los usuarios la capacidad de crear, guardar y leer archivos en estos formatos con facilidad. Es crucial que la aplicación garantice la integridad de la información durante todas estas operaciones, asegurando que los datos se mantengan intactos independientemente del formato en el que se encuentren. Además, la herramienta debe ser capaz de realizar conversiones entre formatos de Archivo, permitiendo a los usuarios cambiar el tipo de formato de un archivo existente sin perder datos o calidad en la información. 

Para abordar este problema, se escoge el patrón Bridge para el desarrollo de la solución. Este patrón ofrece una gestión de archivos flexible, mantenible y escalable. Nos brinda la capacidad de añadir nuevos formatos en el futuro con solo crear una nueva implementación de los Formatos de Archivo, o realizar cambios en los existentes sin afectar la funcionalidad principal de la aplicación. Al separar la lógica general de gestión de archivos de los detalles específicos de cada formato, el patrón Bridge facilita el mantenimiento del código, la corrección de errores y garantiza la integridad de los datos durante las operaciones de conversión entre formatos. 

 

### Diagrama de Clases 

![Diagrama Entrega 2 - Patrones-File Converter - Bridge drawio](https://github.com/SebastianCamargo-ITM/PatronesEstructurales-ITM/blob/main/diagrams/Diagrama%20Entrega%202%20-%20Patrones-File%20Converter%20-%20Bridge.drawio.png)



# PERSONALIZACION DE AUTOMOVILES (DECORATOR) 

Se necesita desarrollar una aplicación que permita la personalización de vehículos para la venta. La aplicación debe ofrecer la capacidad de comenzar con un vehículo base que tiene un precio inicial. Posteriormente, los usuarios deben poder agregar características opcionales al vehículo, como sistema de navegación, aire acondicionado, entre otros. Cada característica adicional debe sumar un costo al valor inicial del vehículo. Finalmente, la aplicación debe ser capaz de calcular y mostrar el costo total del vehículo con todas las características incorporadas. 

Con el patrón Decorator, podemos añadir características opcionales al vehículo base de manera dinámica. Cada característica se implementa como un decorador que envuelve al vehículo base y añade un costo adicional a su precio. Este patrón ofrece una estructura flexible y modular. Gracias a la separación de responsabilidades que proporciona, podemos incorporar nuevas características en el futuro y calcular el costo total del vehículo sin afectar su estructura original. 



### Diagrama de Clases 

![Diagrama Entrega 2 - Patrones-Car Customizer - Decorator drawio](https://github.com/SebastianCamargo-ITM/PatronesEstructurales-ITM/blob/main/diagrams/Diagrama%20Entrega%202%20-%20Patrones-Car%20Customizer%20-%20Decorator.drawio.png)



# MENU DE GESTION DE USUARIO (COMPOSITE) 

Se necesita desarrollar una funcionalidad para un menú de opciones de gestión de usuario. Esta funcionalidad debe ofrecer opciones tanto compuestas como individuales. Las opciones compuestas permiten agrupar múltiples opciones individuales, mientras que las opciones individuales representan acciones específicas que puede realizar el usuario. La estructura del menú debe ser flexible, permitiendo la disposición de opciones de manera individual o agrupada según las necesidades. 

El menú debe ser capaz de adaptarse a diferentes niveles de profundidad en la jerarquía, es decir, opciones compuestas que contengan otras opciones compuestas, y así sucesivamente.  

Se selecciona el patrón Composite como la solución más adecuada. Con el patrón Composite, podemos construir una estructura jerárquica de opciones de menú. Las opciones compuestas pueden contener otras opciones (tanto compuestas como individuales), permitiendo así agrupar múltiples acciones bajo una sola opción. Esto proporciona una forma modular y flexible de construir y gestionar la funcionalidad del menú, facilitando la adición, eliminación o modificación de opciones de manera dinámica. 

Además, este patrón facilita la implementación de un Iterador para recorrer todos los componentes, sin importar la complejidad de la estructura del menú. 


 
### Diagrama de Clases 

![Diagrama Entrega 2 - Patrones-UserMenu - Composite drawio](https://github.com/SebastianCamargo-ITM/PatronesEstructurales-ITM/blob/main/diagrams/Diagrama%20Entrega%202%20-%20Patrones-UserMenu%20-%20Composite.drawio.png)
