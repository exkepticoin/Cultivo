# Reto 3: Grupo P2_C2
Número máximo de ficheros: 4.
Tipo de trabajo:  Individual.
Ejercicio incluido en el Ciclo 2 del programa MisionTIC2022 del MinTIC Colombia.
## Reto 3: Módulo de cultivos de la finca Doña Martha
La finca Doña Martha le ha solicitado a usted como programador, la creación de una clase en Java que pueda integrar a su sistema de administración de la finca, haciendo uso de la base de datos de la finca.
Según las necesidades de los administradores de la finca, se requiere que la clase tenga las siguientes funciones:

### •	**obtenerCultivos(lista)**:
Dada una lista de cultivos (lista) que contiene nombres de los cultivos que están siendo sembrado en las diferentes hectáreas, la función debe generar una lista de los cultivos sin repetición.
####Ejemplo:
Dada la siguiente entrada:
lista = ["MORA","PAPA", "MORA", "CURUBA", "CEBOLLA", CEBOLLA, "MORA", "PAPA", "NARANJA"]

La función debe retornar la siguiente lista:
["MORA","PAPA", "CURUBA", "CEBOLLA", "NARANJA"]

### •	**obtenerCultivosPendientes(posh, pendientes, cultivo)**:
Dada una lista con los identificadores de las hectáreas de los cultivos que hacen falta por cosechar, los cultivos pendientes de cosechar y el nombre de un cultivo, se debe obtener la lista con los identificadores de las hectáreas de los cultivos que hacen falta por cosechar.
#### Ejemplo:
Dadas las siguientes entradas:
posh = [0, 2, 4, 7]

pendientes = ["PAPA", "MORA", "MORA", "CURUBA", "CEBOLLA", "NARANJA", "MORA", "PAPA"]

cultivo = "PAPA"

Se debe retornar la siguiente lista:
[0, 7]

### •	**obtenerFaltantes(l_otrafinca, l_fincamartha)**:
Para poder realizar un intercambio de cultivos entre diferentes fincas, dada la lista de cultivos de cosecharan otra finca, y la lista de cultivos que tiene la finca de Doña Martha actualmente, retorna la lista de cultivos que son de interés para los administradores de la finca de Doña Martha de la otra finca.
#### Ejemplo:
Dadas las siguientes entradas:
l_otrafinca = ["MORA", "PLATANO", "LIMON", "PAPA", "CURUBA", "FRIJOL", "NARANJA"]

l_fincamartha = ["MORA","PAPA", "CURUBA", "CEBOLLA", "NARANJA"]

La función debe retornar una lista que contiene:
["PLATANO", "LIMON", "FRIJOL"]

### •	obtenerExcedentesIntercambiables(l_otrafinca, l_fincamartha):
Dadas la lista de cultivos excedentes de otra finca y los que en la finca de Doña Martha son excedentes, debe retornar el número de cultivos que se pueden intercambiar entre sí.
#### Ejemplo:
Si se tiene como entrada:
l_otrafinca = ["MORA", "PLATANO", "LIMON", "PAPA", "CURUBA", "FRIJOL", "NARANJA"]

l_fincamartha = ["MORA","PAPA", "CURUBA", "CEBOLLA", "NARANJA"]

La salida de la función es:
1

Dado que a la otra finca le interesan un (1) cultivo de la finca de Doña Martha. A la finca de Doña Martha, le interesan tres (3) repuestos de la otra finca, luego podrían intercambiar máximo 1.
Para que sea evaluada correctamente, la función debe retornar un Integer.

### Entrada:
Este programa no requiere entrada. Ni generará salida. Se requiere que el estudiante genere un archivo con el nombre Cultivo.java sin main y que definan los nombres de las funciones dadas y sus parámetros tal cual está especificado en el enunciado.

### Puntuación:
Si la finca de Doña Martha puede importar la clase se tiene un punto. Para cada funcionalidad que cumpla con lo establecido se tiene un punto. Esto produce un total de 5 puntos.

