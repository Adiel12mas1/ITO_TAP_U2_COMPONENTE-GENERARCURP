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
Clase `GeneradorCurp` es la encargada de generar la CURP basada en parametros muy especificos
los cuales son, separar en vocales, consonates e iniciales, los nombres y apellidos ingresados
por los usuarios, como los ultimos dos digitos de la curp los cuales son generados al azar con 
tal de no generar alguna CURP similar a las otras.

# Campos

| Tipo   | Campo   | Descripcion                                                                            |
|--------|---------|----------------------------------------------------------------------------------------|
|`String`|`UPPER`  |Contiene las letras mayusculas de la A a la Z                                           |
|`Int`   |`RANDOM` |Contiene numeros al azar del 1 al 10                                                    |
|`Int`   |`CHARAT` |Se encarga de recorre los apellidos y el nombre para encontrar las consonantes y vocales|

# Metodos 

| Nombre                    | Tipo de Dato que Retorna   | Tipo de Dato que Recibe       |                                    Descripcion                                          |
|---------------------------|----------------------------|-------------------------------|-----------------------------------------------------------------------------------------|
|`obtenerPrimeraConsonante` | `char`                     |`char, boolean`                | Se encarga de buscar la primera consonante del nombre, apellido paterno y materno       |
|`encontrarPrimeraVocal`    | `char`                     |`char`                         | Se encarga de buscar la primera vocal del apellido paterno                              |
|`btnAceptarActionPerformed`| `void`                     |`java.awt.event.ActionEventevt`| Se encarga de generar la CURP basada en los datos ingresados por el usuario             |
|`getGeneradorCurp`         | `String`                   |`String`                       | Es el encargado de concatenar todos los datos y mandarlos a imprimir en el formato CURP |
|`cboEstadoMouseEntered`    | `void`                     |`java.awt.event.MouseEventevt` | Se encarga de leer el archivo csv de los estados con sus abreviaciones                  |

# Instalacion 

Para poder hacer uso de este componente es necesario que siga los siguientes pasos:

1.- Obtener el repositorio Clona con el siguiente comando 

   git clone https://github.com/Adiel12mas1/ITO_TAP_U2_COMPONENTE-GENERARCURP.git

Otra opcion es descargar `ZIP`
![image](https://github.com/Adiel12mas1/ITO_TAP_U2_COMPONENTE-GENERARCURP/assets/168316306/bbaab38a-bdda-475f-879d-8599385287e6)





2.- Importa el proyecto en tu IDE preferido (NetBeans).
3.- Asegurate de que el proyecto se compila sin errores para crear el `.jar` segun la 
version de tu java.

# Uso 

1.- Compila tu proyecto para crear el archivo `.jar`

![image](https://github.com/Adiel12mas1/ITO_TAP_U2_COMPONENTE-GENERARCURP/assets/168316306/3d28ca81-25b6-46fb-bb39-64d1a33f6093)






Posteriormente presionar `Shift + F11`
2.- Agrega el componente a tu paleta de componentes. Da click derecho en la paleta
y selecciona Palette Manager y seleciona Add From Jar

Navega hasta la carpeta dist del proyecto y selecciona el `.jar`.
![image](https://github.com/Adiel12mas1/ITO_TAP_U2_COMPONENTE-GENERARCURP/assets/168316306/d5be72bd-ecfc-4a81-89ec-452de56eb9da)
![image](https://github.com/Adiel12mas1/ITO_TAP_U2_COMPONENTE-GENERARCURP/assets/168316306/87c9233b-f8a9-468e-b58e-495f68392a0c)
![image](https://github.com/Adiel12mas1/ITO_TAP_U2_COMPONENTE-GENERARCURP/assets/168316306/62da0a7f-3684-40f2-9c4b-23e81a45912d)















3.- Ya esta lsito para usar y arrastrar a tus componentes.

4.- Prueba ya sea en un JFrame o JDialog si funciona.

![image](https://github.com/Adiel12mas1/ITO_TAP_U2_COMPONENTE-GENERARCURP/assets/168316306/3e3a227c-da4f-46ca-a24d-49fd2cb645ea)







Ya puedes generar CURP segun las necesidades de los usuarios o a tu gusto.

Dato importante a tomar en cuenta al momento de descargar el componente, puede que al descargar todas las clases no
permite convertir a `.jar`, para solucionar este problema deberas crear un nuevo proyecto y ahi colocar las dos 
clases correspondientes.
![image](https://github.com/Adiel12mas1/ITO_TAP_U2_COMPONENTE-GENERARCURP/assets/168316306/65d42af4-2603-46cc-a009-7fcba8b63622)






Tambien es importante mencionar que el csv de los estados se tiene que descargar para pegarlo dentro de los documentos de 
el proyecto donde tienes las dos clases de nuestros componentes para que no haya problemas al momento de seleccionar
los estados en el combo box del componente grafico.
![image](https://github.com/Adiel12mas1/ITO_TAP_U2_COMPONENTE-GENERARCURP/assets/168316306/22121140-5e41-40b6-a545-bc7db895eafa)








# Funcionamiento 

¡Descubre como funciona este componente visual Generador de CURP!

Haz click para ver el video de su funcionamiento ahora mismo 
link 

# Contribuir 
Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1.- Haz un fork del repositorio.

2.- Crea una nueva rama para tu caracteristica o correcion de erores.

3.- Haz tus cambios.

4.- Envia un pull request.

# Autores 
* Cruz Castro Carlos Adiel - Estudiante del ITO
  CONTACTO:(Adiel12mas1(github.com))
* Juan Manuel

# Agradecimientos 
* Gracias por leer este post y por tomarse el tiempo de contribuir a mejorar nuestro proyecto.
* A la maestra Adelina de la carrera de Sistemas por impartir la materia de Topicos
y enseñarnos lo que otros maestros no hicieron.
* Y a Juan por poner las excepciones del codigo.
