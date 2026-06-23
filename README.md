# Práctica: Árboles Binarios de Búsqueda (BST)

## Datos del Estudiante
- **Nombre:** Michelle Marca
- **Curso:** Estructura de Datos
- **Fecha:** 17 de Junio del 2026

---

## 1. Implementación de Árbol Binario Genérico

**Fecha:** 17 de junio del 2026

**Descripción:**

En esta práctica se implementaron árboles binarios de búsqueda en Java utilizando clases genéricas. Se trabajó con `BinaryTree<T>` e `IntTree` para comprender las operaciones básicas de inserción y los diferentes tipos de recorrido: preOrder, posOrder, inOrder y por niveles. Además se calculó la altura y el peso del árbol de forma recursiva.

### Captura de salida en consola

![alt text](<Captura de pantalla 2026-06-19 234118.png>)

### Captura de App.java


### Captura del código - BinaryTree.java

**Descripción:**
Se implementó la clase genérica `BinaryTree<T extends Comparable<T>>` que permite insertar cualquier tipo de objeto comparable. La inserción es recursiva: si el valor es menor va a la izquierda, si es mayor va a la derecha.

![alt text](<Captura de pantalla 2026-06-23 122618.png>)
![alt text](<Captura de pantalla 2026-06-23 122630.png>)
![alt text](<Captura de pantalla 2026-06-23 122640.png>)

### Captura del código - IntTree.java
![alt text](<Captura de pantalla 2026-06-23 121513.png>)
![alt text](<Captura de pantalla 2026-06-23 121528.png>)
![alt text](<Captura de pantalla 2026-06-23 121541.png>)
![alt text](<Captura de pantalla 2026-06-23 121549.png>)
![alt text](<Captura de pantalla 2026-06-23 121556.png>)
![alt text](<Captura de pantalla 2026-06-23 121605.png>)
**Descripción:**
Se implementó `IntTree`, una versión específica para enteros. Incluye el método `peso()` para calcular el peso de forma recursiva y `getPeso()` que usa una variable acumulada durante la inserción.

![alt text](<Captura de pantalla 2026-06-23 121845.png>)
---

## 2. Árbol Binario con Objetos - PersonTree

**Fecha:** 17 de junio del 2026

**Descripción:**
Se implementó el uso del árbol genérico con objetos de tipo `Person`. La clase `Person` se tiene el metodo `Comparable<Person>` comparando primero por la edad y luego por nombre alfabéticamente, lo que permite identificar la posición de cada nodo en el árbol.

### Método compareTo implementado

![alt text](<Captura de pantalla 2026-06-23 121222.png>)
### Captura de salida en consola

![alt text](<Captura de pantalla 2026-06-23 121405.png>)

## 3. Comparativa de Rendimiento - Peso Variable vs Recursivo

**Fecha:** 17 de junio del 2026

**Descripción:**
Se realizó la comparacion del rendimiento entre las dos formas de calcular el peso del árbol con 50,000 nodos. El metodo  `getPeso()` retorna una variable que se incrementa en cada inserción, mientras que `peso()` recorre todo el árbol recursivamente. Se midió el tiempo de cada uno con `System.nanoTime()` para ver cual es mas rapido con esa cantidad de nodos ya que ese numero varia ya que puede ser aun mas grande.

### Método implementado
![alt text](<Captura de pantalla 2026-06-23 122412.png>)
### Captura de salida en consola
![alt text](<Captura de pantalla 2026-06-23 120907.png>)