# LECCIÓN 3 — Métodos y Entrada del Usuario

---

[EN PANTALLA: abrir JDoodle en jdoodle.com. Seleccionar Java como lenguaje. El editor ya tiene la estructura mínima de la clase con el `main` vacío.]

Hola, bienvenidos de vuelta.

En las lecciones anteriores aprendieron a guardar datos en variables, a hacer operaciones con ellos, y a que el programa tome decisiones y repita acciones. Ahora el código ya hace cosas interesantes, pero tiene un problema: todo el código vive apilado en un solo lugar — el método `main`. Cuando los programas crecen, eso se vuelve imposible de leer y de mantener.

Hoy vamos a aprender a organizar el código en bloques separados y reutilizables. Esos bloques se llaman **métodos**. Y también vamos a aprender a pedirle datos al usuario mientras el programa está corriendo. Empecemos.

---

## ¿Qué es un método?

Piensen en una lavadora. Tiene un botón que dice "lavar". Cuando lo presionan, la lavadora hace todo el proceso: llena de agua, añade jabón, agita, enjuaga, centrifuga. Ustedes no tienen que saber cómo funciona por dentro — solo presionan el botón y reciben la ropa limpia.

Un método en Java funciona igual. Es un bloque de código con nombre que hace una tarea específica. Cuando quieren que se ejecute, lo "llaman" por su nombre — como presionar el botón. Y puede recibir datos de entrada y devolver un resultado.

---

## Crear y llamar un método simple

[EN PANTALLA: en JDoodle, escribir fuera del `main` pero dentro de la clase, justo encima de `public static void main`:]

```java
public static void saludar() {
    System.out.println("¡Hola! Bienvenido al programa.");
}
```

[EN PANTALLA: señalar con el cursor cada parte de la primera línea del método:]

Miren la primera línea de este método. Se llama **firma**. Tiene cuatro partes. `public` significa que otros bloques de código pueden usarlo. `static` es una característica técnica necesaria para llamar el método desde el `main` — por ahora solo recuérdenlo. `void` significa que este método no devuelve ningún resultado — hace su trabajo y listo. Y `saludar` es el nombre que le dimos.

[EN PANTALLA: dentro del `main`, escribir:]

```java
saludar();
```

[EN PANTALLA: presionar el botón Execute en JDoodle y mostrar "¡Hola! Bienvenido al programa." en la consola de abajo.]

Escribir `saludar()` en el `main` es "presionar el botón". El programa salta al bloque del método, ejecuta todo lo que hay dentro, y luego vuelve al punto donde lo llamaron.

La ventaja es que pueden llamarlo las veces que quieran:

[EN PANTALLA: reemplazar la llamada en el `main` por tres llamadas seguidas y ejecutar:]

```java
saludar();
saludar();
saludar();
```

El mismo código se ejecuta tres veces sin haberlo repetido.

---

## Parámetros: darle datos al método

[EN PANTALLA: modificar el método `saludar` para que reciba un parámetro:]

```java
public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre + "! Bienvenido al programa.");
}
```

Ahora el método recibe un dato de entrada — el nombre de la persona. Ese dato se llama **parámetro**: es como el cajón donde entra la ropa sucia antes de que la lavadora empiece a trabajar.

[EN PANTALLA: actualizar las llamadas en el `main`:]

```java
saludar("María");
saludar("Carlos");
```

[EN PANTALLA: presionar Execute y mostrar los dos saludos personalizados en la consola.]

El mismo método, resultados distintos dependiendo del dato que le pasan.

---

## Métodos que devuelven un resultado

[EN PANTALLA: agregar un nuevo método debajo del `saludar`, todavía fuera del `main`:]

```java
public static int sumar(int a, int b) {
    return a + b;
}
```

Este método recibe dos números enteros y devuelve su suma. Noten que ahora en lugar de `void` hay `int` — eso le dice a Java que este método va a devolver un número entero. Y la palabra `return` es la que entrega ese resultado.

[EN PANTALLA: en el `main`, agregar:]

```java
int resultado = sumar(8, 5);
System.out.println("La suma es: " + resultado);
```

[EN PANTALLA: presionar Execute y mostrar "La suma es: 13" en la consola.]

El valor que devuelve `sumar` se guarda en la variable `resultado` y luego se imprime.

---

## Scanner: el usuario escribe datos

[EN PANTALLA: agregar al inicio del archivo, antes de `public class Main`, la línea de import:]

```java
import java.util.Scanner;
```

[EN PANTALLA: señalar esa línea con el cursor.]

Hasta ahora los datos estaban escritos directamente en el código. Pero los programas reales le piden los datos al usuario mientras corren. Para eso Java tiene una herramienta llamada **Scanner**, que "escanea" lo que el usuario escribe.

Esa primera línea, el `import`, le dice a Java que necesitamos usar esa herramienta. Va al inicio del archivo, antes de la declaración de la clase.

[EN PANTALLA: limpiar el contenido del `main` y escribir:]

```java
Scanner teclado = new Scanner(System.in);
```

Esto crea el objeto Scanner. Piénsenlo como abrir la puerta de entrada al teclado: `teclado` es el nombre que le damos a esa puerta, y `System.in` le dice que lea desde el teclado del usuario.

[EN PANTALLA: agregar debajo:]

```java
System.out.println("¿Cuál es tu nombre?");
String nombre = teclado.nextLine();

System.out.println("¿Cuántos años tienes?");
int edad = teclado.nextInt();

System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
```

[EN PANTALLA: en JDoodle, escribir los inputs en la cajita "Stdin" antes de ejecutar — un dato por línea, por ejemplo: María en la primera línea y 17 en la segunda. Luego presionar Execute y mostrar el saludo personalizado en la consola.]

`nextLine()` lee una línea de texto completa — lo que el usuario escribe y luego presiona Enter. `nextInt()` lee un número entero.

Noten la secuencia: primero imprimen la pregunta con `println`, y luego leen la respuesta con el Scanner. Así el usuario sabe qué tiene que escribir.

---

## Pausa de práctica

[EN PANTALLA: mostrar la diapositiva "¡Ahora es tu turno!"]

Pausa el video y abre JDoodle en jdoodle.com.

Uno: crea un método llamado `multiplicar` que reciba dos `int` y devuelva su producto. Llámalo desde el `main` con dos números de tu elección.

Dos: agrega una pregunta más al Scanner — por ejemplo, pide la ciudad del usuario — y úsala en el saludo final.

Tres: usa el método `saludar(String nombre)` pasándole el nombre que el usuario ingresó por Scanner.

[PAUSA: 5 segundos.]

---

## Cierre

Tres cosas para llevarse de esta lección.

Primera: un método es un bloque de código con nombre que hace una tarea. Se define una vez y se puede llamar cuantas veces se necesite.

Segunda: los parámetros son los datos que el método recibe; `return` es el dato que devuelve. Si el método no devuelve nada, su tipo es `void`.

Tercera: `Scanner` con `nextLine()` y `nextInt()` permite que el usuario ingrese datos mientras el programa corre. El `import java.util.Scanner` va siempre al inicio del archivo. Y en JDoodle, recuerden escribir los inputs en la cajita Stdin antes de ejecutar.

En la siguiente lección vamos a dar el paso más importante del curso: crear nuestros propios tipos de datos. Se llaman **clases**, y son la base de la programación orientada a objetos. ¡Los espero ahí!