# Ada-Java-Challenge

En este reto se crea un CRUD para peliculas utilizando MVC como patron de diseño.

## Descripción

Este proyecto esa aplicacion creada con Java 17. El proyecto permite gestionar peliculas, proporcionando funcionalidades para crear, obtener, actualizar y eliminar dichas peliculas.

El proyecto sigue los principios de diseño SOLID y el patrón de diseño Modelo Vista Controlador (MVC) para asegurar un código limpio, modular y fácilmente escalable.

## ¿Qué se puede destacar de este proyecto?

Este proyecto sigue los principios de diseño SOLID y utiliza el patrón de diseño Modelo Vista Controlador (MVC) para una estructura de código clara y mantenible.

## ¿Qué se debe tener en cuenta durante la revisión?

Por favor, asegúrese de tener una versión de Java compatible instalada (Java 17.0.2)

## Diagrama de aplicación - Java App

![ApplicationJava](https://github.com/Gabean01/Ada-Java-Challenge/blob/main/resources/diagram.png)

## Justificacion

- [Punto #1] Validar si la información del diagrama de clases es correcta y completar en caso de ser necesario(Argumentar la respuesta)
  - Respuesta: El diagrama contiene errores en la declaracion de la key "autor" para el modelo de Pelicula, ademas hacen falta ciertos valores que son basicos en la creacion de un modelo de datos como lo es el ID de la Pelicula, el createdAt y updatedAt con los cuales podemos tener facilidad para verificar fechas de creacion y actualizacion de cada item. Así mismo, con el ID se puede hacer la busqueda de cada pelicula ya que este es unico.

- [Punto #2] 
  - Respuesta: Los métodos `findMin()` y `findMax()` buscan el valor mínimo y máximo en la lista data respectivamente, mientras que el método `average()` calcula el promedio de los elementos en la lista utilizando un método de la clase Utils. Asegúrate de que los métodos estén bien implementados y probados para cubrir todos los casos posibles.
  - 
- [Punto #3] 
  - Respuesta: La función `reversedString` utiliza un bucle for que recorre el texto desde el último índice hasta el primero, construyendo la cadena invertida mediante un objeto StringBuilder. Al final, se convierte el StringBuilder a un objeto String y se retorna el text invertido.

- Crear, editar, eliminar y listar peliculas.

## Tecnologías

- Java

## Arquitectura

- MVC
- SOLID

## Cómo empezar

### Requisitos

- IntelliJ IDEA
- JDK

### Configuración del proyecto

1. Clona este repositorio en tu máquina local.
2. Dentro de src ejecuta el comando `javac Main.java` para compilar el projecto.

### Ejecución del proyecto

Para correr el proyect ejecuta el comando `java Main` en la terminal.


### Menu

- **1 - Create**
    - Descripción: Al seleccionar esta opción en el menu, podra crear una pelicula.
    - Ingresar:
      - Nombre de la pelicula
      - Nombre del autor
      - Fecha de publicación

- **2 - Update**
    - Descripción: Al seleccionar esta opción en el menu, podra actualizar los datos de una pelicula.
    - Ingresar:
        - Nombre de la pelicula
        - Nombre del autor
        - Fecha de publicación

- **3 - Delete**
    - Descripción: Al seleccionar esta opción en el menu, podra eliminar una pelicula.
    - Ingresar:
        - ID de la pelicula

- **3 - List movies**
    - Descripción: Al seleccionar esta opción en el menu, podra ver la lista de peliculas agregadas.
    - Resultado:
      - [Movie(), Movie(), ..]
     
- **4 - List movies**
    - Descripción: Al seleccionar esta opción en el menu, podra ver la lista de peliculas agregadas.
    - Resultado:
      - [Movie(), Movie(), ..]

- **5 - Secound point solution**
    - Descripción: Aqui se podra ver la solucion al problema de Listas.
    - Resultado:
      - El minimo de la lista, el maximo y el promedio.
     
- **6 - Third point solution**
    - Descripción: Aqui se podra invertir un texto.
    - Resultado:
      - "esternocleidomastoideo" retorne "oediotsamodielconretse"
        
- **7 - Four point solution**
    - Descripción: Se calcula el interes de un prestamo basado en el dinero, la fecha de inicio, la fecha fin y el interes mensual.
    - Resultado:
      - Amount, Interest y Total
## Evidencias
Para ver las evidencias por favor ingresar a la carpeta de resources
