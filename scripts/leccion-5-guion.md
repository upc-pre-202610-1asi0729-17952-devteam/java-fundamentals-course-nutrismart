# LECCIÓN 5 — Arrays, Programa Final y Errores Comunes

---

[EN PANTALLA: abrir Replit con tres archivos: `Estudiante.java` (la clase completa de lección anterior), `RegistroEstudiantes.java` vacío, y `Main.java` con el `main` vacío.]

Hola, bienvenidos a la última lección del curso.

En todas las lecciones anteriores aprendieron las piezas: cómo guardar datos en variables, cómo tomar decisiones y repetir acciones, cómo organizar el código en métodos, y cómo crear sus propios tipos de datos con clases y objetos.

Hoy vamos a ensamblar todas esas piezas en un programa real: un sistema de registro de estudiantes. Y al final vamos a ver los errores que comete todo el mundo al empezar, para que sepan cómo detectarlos y solucionarlos.

Abran el Replit de esta lección — el enlace está en la descripción. Vamos.

---

## Arrays: una fila de casilleros

Hasta ahora guardaban un solo dato en cada variable. Pero ¿qué pasa cuando necesitan guardar 30 nombres, o 30 notas? ¿Declaran 30 variables distintas?

Para eso existen los **arrays**: estructuras que guardan múltiples valores del mismo tipo en una sola variable.

Imaginen una fila de casilleros en un colegio. Cada casillero tiene un número — empezando desde el cero — y todos guardan el mismo tipo de cosa. Un array es exactamente eso.

[EN PANTALLA: en `RegistroEstudiantes.java`, escribir:]

```java
String[] nombres = new String[3];
```

[EN PANTALLA: señalar las partes:]

`String[]` indica que es un array de cadenas de texto. `nombres` es el nombre del array. `new String[3]` crea el array con espacio para 3 elementos. Los casilleros están numerados del 0 al 2.

[EN PANTALLA: asignar valores:]

```java
nombres[0] = "María";
nombres[1] = "Carlos";
nombres[2] = "Lucía";
```

[EN PANTALLA: imprimir con un bucle for:]

```java
for (int i = 0; i < nombres.length; i++) {
    System.out.println(nombres[i]);
}
```

[EN PANTALLA: ejecutar y mostrar los tres nombres.]

`nombres.length` devuelve cuántos elementos tiene el array — en este caso 3. El bucle empieza en `i = 0` y termina cuando `i` llega a 3. En cada vuelta imprime el elemento en la posición `i`.

---

## Arrays de objetos

[EN PANTALLA: debajo, agregar:]

```java
Estudiante[] estudiantes = new Estudiante[3];
```

También pueden hacer arrays de objetos. Aquí hay espacio para 3 objetos `Estudiante` — la clase que crearon en la Lección 4.

[EN PANTALLA: llenar el array:]

```java
estudiantes[0] = new Estudiante("María", 15, 18.5);
estudiantes[1] = new Estudiante("Carlos", 16, 14.0);
estudiantes[2] = new Estudiante("Lucía", 17, 16.5);
```

[EN PANTALLA: imprimir con un for:]

```java
for (int i = 0; i < estudiantes.length; i++) {
    System.out.println(estudiantes[i].getNombre() + ": " + estudiantes[i].getNota());
}
```

[EN PANTALLA: ejecutar y mostrar los tres estudiantes con sus notas.]

---

## Cadenas: algunos métodos útiles

[EN PANTALLA: agregar una sección rápida sobre String:]

```java
String texto = "hola mundo";
System.out.println(texto.length());
System.out.println(texto.toUpperCase());
System.out.println(texto.contains("mundo"));
```

[EN PANTALLA: ejecutar y mostrar 10, HOLA MUNDO, true.]

`length()` devuelve cuántos caracteres tiene el texto. `toUpperCase()` lo convierte en mayúsculas. `contains("mundo")` devuelve `true` si el texto contiene esa palabra, `false` si no.

---

## El programa final: registro de estudiantes

[EN PANTALLA: limpiar `Main.java` y empezar el programa final desde cero:]

Ahora vamos a construir el programa completo. Va a hacer lo siguiente: pedirle al usuario el nombre y la nota de 3 estudiantes, guardarlos en un array, y al final calcular el promedio e identificar al estudiante con la nota más alta.

[EN PANTALLA: escribir el `import` de Scanner y el `main` completo, línea por línea:]

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3];

        // Pedir datos al usuario — bucle for de la Lección 2
        for (int i = 0; i < 3; i++) {
            System.out.println("Nombre del estudiante " + (i + 1) + ":");
            String nombre = teclado.nextLine();

            System.out.println("Nota de " + nombre + ":");
            double nota = teclado.nextDouble();
            teclado.nextLine(); // limpiar el buffer del Scanner

            // Crear el objeto — clase de la Lección 4
            estudiantes[i] = new Estudiante(nombre, 0, nota);
        }

        // Calcular el promedio y encontrar la nota más alta
        double suma = 0;
        double notaMaxima = estudiantes[0].getNota();
        String mejorEstudiante = estudiantes[0].getNombre();

        for (int i = 0; i < estudiantes.length; i++) {
            suma += estudiantes[i].getNota();
            if (estudiantes[i].getNota() > notaMaxima) {
                notaMaxima = estudiantes[i].getNota();
                mejorEstudiante = estudiantes[i].getNombre();
            }
        }

        double promedio = suma / estudiantes.length;

        // Mostrar resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio del grupo: " + promedio);
        System.out.println("Mejor nota: " + mejorEstudiante + " con " + notaMaxima);
    }
}
```

[EN PANTALLA: señalar secciones clave mientras se escriben:]

Fíjense en los comentarios. El `for` para pedir datos es de la Lección 2. El `Scanner` es de la Lección 3. El `new Estudiante(...)` y los getters son de la Lección 4. El array es de esta lección. Todo junto en un solo programa.

[EN PANTALLA: ejecutar en Replit, ingresar tres nombres y tres notas, mostrar los resultados.]

---

## Pausa de práctica

[EN PANTALLA: texto en pantalla "¡Tu turno!"]

Pausa el video y personaliza el programa:

Uno: cambia el número de estudiantes de 3 a 5 — modifica el `new Estudiante[3]` a `new Estudiante[5]` y el `for` de `i < 3` a `i < 5`.

Dos: agrega al final la impresión de todos los estudiantes con su nota, no solo el promedio.

Tres: modifica el programa para que también muestre el nombre del estudiante con la nota más baja.

[PAUSA: 8 segundos.]

---

## Errores comunes

[EN PANTALLA: abrir un archivo nuevo en Replit para demostrar los errores.]

Ahora vamos a ver los tres errores que cometen todos al empezar. Reconocerlos les va a ahorrar mucha frustración.

### Error 1: ArrayIndexOutOfBoundsException

[EN PANTALLA: escribir:]

```java
int[] numeros = new int[3];
System.out.println(numeros[3]);
```

[EN PANTALLA: ejecutar — aparece el error `ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3`.]

Este es uno de los errores más comunes con arrays. El array tiene 3 posiciones: índice 0, 1 y 2. Intentar acceder al índice 3 es como intentar abrir el casillero número 4 en una fila de 3 casilleros — no existe. Regla: el último índice válido siempre es `length - 1`.

[EN PANTALLA: corregir a `numeros[2]` y mostrar que funciona.]

### Error 2: Olvidar el punto y coma

[EN PANTALLA: escribir una línea sin punto y coma:]

```java
int x = 5
System.out.println(x);
```

[EN PANTALLA: intentar ejecutar — aparece error de compilación señalando la línea.]

Java no puede compilar sin los puntos y coma. El error aparece en la línea siguiente porque el compilador no sabe que la línea anterior terminó. Si ven un error que señala una línea que parece correcta, revisen la línea anterior.

[EN PANTALLA: agregar el punto y coma y mostrar que funciona.]

### Error 3: Olvidar el return en un método

[EN PANTALLA: escribir un método con tipo de retorno pero sin `return`:]

```java
public static int duplicar(int n) {
    int resultado = n * 2;
    // olvidamos poner return resultado;
}
```

[EN PANTALLA: mostrar el error de compilación: "missing return statement".]

Si un método declara que devuelve un tipo — en este caso `int` — y no tiene `return`, Java da error antes de ejecutar nada. La solución es agregar `return resultado;` al final del método.

[EN PANTALLA: corregir y mostrar que funciona.]

---

## Dónde seguir aprendiendo

[EN PANTALLA: abrir en el navegador docs.oracle.com/javase.]

Si quieren seguir más allá de este curso, hay dos recursos completamente gratuitos que les recomiendo.

El primero: la **documentación oficial de Java** en docs.oracle.com. Es la referencia más completa que existe. Si tienen dudas sobre cualquier clase, método o concepto, búscalo ahí.

[EN PANTALLA: abrir freecodecamp.org.]

El segundo: **freeCodeCamp**, en freecodecamp.org. Tiene cursos interactivos gratuitos de Java y de muchos otros lenguajes. Aprenden programando directamente en el navegador, igual que hicieron en este curso.

---

## Cierre del curso

[EN PANTALLA: mostrar una diapositiva o imagen con un resumen del arco completo de las 5 lecciones.]

Miren lo que aprendieron en este curso.

En la Lección 1 aprendieron qué es Java y cómo guardar datos en variables con tipos definidos.

En la Lección 2 aprendieron a operar con esos datos, a tomar decisiones con `if-else` y a repetir acciones con bucles.

En la Lección 3 aprendieron a organizar el código en métodos reutilizables y a pedir datos al usuario con Scanner.

En la Lección 4 aprendieron a crear sus propios tipos de datos con clases, objetos, constructores y encapsulación.

Y en esta lección aprendieron arrays para manejar colecciones de datos, y combinaron todo en un programa real completo.

Eso es programación orientada a objetos desde cero. Sigan practicando, experimenten con el código, rómpanlo a propósito para ver qué pasa y luego arréglenlo. Así aprenden todos los programadores.

¡Buena suerte!