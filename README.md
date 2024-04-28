# ITO_TAP_U2_COMPONENTE-GENERARCURP
# Descripcion
Este componente Java nos permite a nosotros y al usuario generar CURP las veces que sean
necesarias. Lo diseñamos para su uso en aplicaciones de Java Swing, permitiendo asi, el
uso del mismo en <JFrame> o < JDialog > facilmente.

Consta de dos clases importantes las cuales son, <VentanaPrincipal> y <GeneradorCurp>, asi
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
Clase <VentanaPrincipal> es nuestra encargada de generar la CURP pidiendo al usuario mediante
una interfaz grafica, los datos necesarios para generar la misma, utilizando parametros como
longitudes y numeros para encontrar las vocales, iniciales y consonantes. Para los ultimos
dos digitos de la CURP utiliza un enfoque aleatorio para generar que ninguna CURP se repita.

