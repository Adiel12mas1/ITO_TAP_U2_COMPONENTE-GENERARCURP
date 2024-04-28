# ITO_TAP_U2_COMPONENTE-GENERARCURP
# Descripcion
Este componente Java nos permite a nosotros y al usuario generar CURP las veces que sean
necesarias. Lo diseñamos para su uso en aplicaciones de Java Swing, permitiendo asi, el
uso del mismo en `JFrame` o `JDialog` facilmente.

Consta de dos clases importantes las cuales son, `VentanaPrincipal` y `GeneradorCurp`, asi
estas dos trabajan de la mano para ser integradas con el objetivo de generar una CURP
dandole al usuario la opcion de ingresarla si es que la conoce o si no la conoce, 
mediante un interfaz grafico practico para todos.

# Usos
1.- Aplicacion de gestion de Personal:
El componente puede ser utilizado por alguna empresa al momento de ingresar un nuevo
empleado a sus filas, y asi registrarlo mediante la CURP, facilitando la manera en
conocer la informacion personal de sus trabajadores a la empresa.
2.- Servicios Publicos:
De igual manera este componente puede ser utilizado por entidades gubernamentales,
para el tramite de servicios publicos siendo la CURP un dato necesario y casi
siempre obligatorio para estos, como los que pueden ser: Becas, Seguros, Ayudas 
sociles, etc...
3.- Tramites de Documentacion Oficial
El uso de la CURP para documentacion oficial es muy recurrnte siendo un dato necesario
para tramites como: Actas de nacimiento, Licencias de Manejo, INE, etc... De esta forma
podria ser implementado en alguna seccion de estos oficios.

# Caracteristicas
* Generacion de la CURP de forma rapida y segura.
* Implementacion con cualquier componente Swing de manera rapida y sencilla.
* Interfaz facil de usar con solo dar click y soltar.
* Facil entendimiento del programa y/o componentes.

# Requisitos
* Java JDK 8 o superior.
* IDE con soporte para Swing para el uso del comomente grafico como en este caso NetBeans

# API

# VentanaPrincipal

# Descripcion
Clase `VentanaPrincipal` es nuestro componente GUI diseñada como un class de java el cual 
permite al usuario generar la CURP de manera visual. El componente da dos opciones al
usuario, la de Aceptar que permite validar si la CURP es correcta o no, y una opcion 
en casa de que no conozca su CURP la cual se encarga de abrir el componenten grafico
y tranferir el resultado de la CURP a un campo de texto externo como resultado.

# Campos 

| Tipo                   |     Campo         | Descrpcion                                          |
|------------------------|-------------------|-----------------------------------------------------|
| `javax.swing.*`        | `JTextField`      |Campo de texto externo para recibir la CURP generada |

# Constructores 

| Constructor               |                                                        Descripcion                                                       |     
|---------------------------|--------------------------------------------------------------------------------------------------------------------------|
|`VentanaPrincipal()`       |Encargado de inicializar el componente, establece los tamaños y configura el medelo de los componentes dentro de el metodo|

# Metodos 

|Nombre                   |  Tipo de Dato que Retorna  | Tipo de Dato que Recibe                    |                                                    Descripcion                                               |
|-------------------------|----------------------------|--------------------------------------------|--------------------------------------------------------------------------------------------------------------|
|`initComponents`         |`void`                      | `javax.swing.*, java.awt.*, java.awt.event`|Establece los componentes, tamaños, posiciones, tipo de letra, el texto a imprimir, y la asignacion de cada  | 
|                         |                            |                                            |boton                                                                                                       | 
|`jButton2ActionPerformed`|`void`                      | `java.awt.event.ActionEventevt`            |Es el boton encargado de avisar al usuario si la CURP ingresada o generada es valida, si no lo es, o si hubo | 
|                         |                            |                                            |error al momento de generar su CURP                                                                         | 
|`jLabel3MouseEntered`    |`void`                      | `java.awt.event.ActionEventevt`            |Es la etiqueta encargada de mandar al usuario a el cuestionario sobre sus datos en caso de no conocer su CURP| 
                                                                                                    
# GeneradorCurp

# Descripcion 
Clase GeneradorCurp es la encargada de generar la CURP basada en parametros muy especificos
los cuales son, separar en vocales, consonates e iniciales, los nombres y apellidos ingresados
por los usuarios, como los ultimos dos digitos de la curp los cuales son generados al azar con 
tal de no generar alguna CURP similar a las otras.

# Campos

| Tipo | Campo | Descripcion                                                                            |
|------|-------|----------------------------------------------------------------------------------------|
|String|UPPER  |Contiene las letras mayusculas de la A a la Z                                           |
|Int   |RANDOM |Contiene numeros al azar del 1 al 10                                                    |
|Int   |CHARAT |Se encarga de recorre los apellidos y el nombre para encontrar las consonantes y vocales|

# Metodos 

| Nombre                  | Tipo de Dato que Retorna | Tipo de Dato que Recibe | Descripcion                                            |
|-------------------------|--------------------------|-------------------------|--------------------------------------------------------|
|obtenerPrimeraConsonante | char                     |char, boolean            | Se encarga de buscar la primera consonante del apellido|
