# Conjunto100_example
Este proyecto contiene una clase la cual representa un cojunto de 1 a 100.

Contiene dos archivos .scala AppConjunto100.scala; representa la clase principal, la cual será ejecutada al utilizar los comando de sbt, y Cojunto100.scala este archivo contiene la definicón de la clase.


## Probar el ejemplo

### Requerimientos 

* SBT installado (versión 1.3.13)
* Scala instalado (versión 1.8.0)
* java (versión 2.13.3)
* Git instalado

### Steps para su ejecución 

1. Clonar el repostorio con el siguiente comando

```
git clone https://github.com/AlejandroAl/Conjunto100_example.git
```

2. Ingresar a la ruta donde se encuentra el projecto

```
cd {directorioDeDescarga}/Conjunto100_example/Conjunto100_proyecto
```

3. Ejecutar el comando para compilar las clases y sus dependencias

```
sbt compile
```

4. Ejecutar el comando para correr la clase principal e iniciar el ejemplo

```
sbt run
```

5. Ingresar el valor que se desea extraer de la lista de 1 - 100. En caso de ingresar un valor que no se encuentre en este rango, la clase generara un error con el siguiente mensaje 

```
"El elemento deseado se encuentra fuera del rango 1 - 100" 
```

6. Se solicitará saber si se quiere validar el valor que se extrajo de la lista, ingresar true para si o false para indicar lo contrario, a continuación el proceso mostrará el elemento que fue extraido.

7. Se solicitará saber si desea volver a intentarlo, ingresar true para volver a hacerlo o false para indicar lo contrario y salir del proceso.






