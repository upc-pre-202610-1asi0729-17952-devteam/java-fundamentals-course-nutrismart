# LECCIÓN 2 — Operadores y Estructuras de Control

---

Hola, bienvenidos de vuelta.

En la lección anterior aprendieron a guardar datos en variables: números, texto, verdadero o falso. Pero
guardar datos solos no sirve de mucho, ¿no? Lo interesante es hacer cosas con esos datos: sumarlos,
compararlos, tomar decisiones.

Hoy vamos a ver exactamente eso. Empecemos.

## Operadores aritméticos

[EN PANTALLA: señalar las variables `a = 10` y `b = 3` ya escritas.]

Ya tenemos dos variables. Vamos a operar con ellas.

[EN PANTALLA: agregar y ejecutar:]

```java
System.out.println("Suma: "           + (a + b));
System.out.println("Resta: "          + (a - b));
System.out.println("Multiplicación: " + (a * b));
System.out.println("División: "       + (a / b));
System.out.println("Módulo: "         + (a % b));
```

[EN PANTALLA: ejecutar y mostrar los resultados.]

Los primeros cuatro son los que ya conocen de matemáticas: suma, resta, multiplicación y división. Pero miren
el resultado de la división: `10 / 3` da `3`, no `3.33`. ¿Por qué?

Porque `a` y `b` son del tipo `int`, y cuando divides dos enteros en Java, el resultado también es entero — el
decimal se descarta. Es como hacer la división a la antigua: cuántas veces cabe el `3` en el `10`, sin contar el resto.

Ese resto, justamente, es lo que da el quinto operador: el módulo, representado con `%`. `10 % 3 = 1` porque `3`
cabe `3` veces en `10` y sobra `1`. El módulo es muy útil para saber si un número es par o impar: si `número % 2 == 0`, es par.

[EN PANTALLA: cambiar `int b = 3` por `double b = 3.0` y mostrar que ahora la
división da `3.33`. Luego volver al valor original.]

Si necesitan el resultado con decimales, usen `double` en al menos una de las variables.

## Tomar decisiones: if-else

[EN PANTALLA: limpiar el contenido del `main` y escribir una nueva variable:]

```java
int edad = 16;
```

Imaginen que quieren que su programa haga cosas distintas dependiendo de una condición. Por ejemplo: si la
persona tiene 18 años o más, puede votar; si no, todavía no puede.

Para eso existe el `if-else`. En español: "si... de lo contrario..."

[EN PANTALLA: escribir:]

```java
if (edad >= 18) {
    System.out.println("Puedes votar.");
} else {
    System.out.println("Todavía no puedes votar.");
}
```

[EN PANTALLA: ejecutar y mostrar el resultado.]

La estructura siempre es la misma: `if`, entre paréntesis la condición, y entre llaves lo que pasa si la condición
es verdadera. Después `else` y entre llaves lo que pasa si la condición es falsa.

Los operadores de comparación que pueden usar son: `==` para igual, `!=` para diferente, `>` para mayor que, `<`
para menor que, `>=` para mayor o igual, `<=` para menor o igual.

Importante: en Java `=` es "guarda este dato" y `==` es "compara si son iguales". No los confundan — es uno de
los errores más comunes.

[EN PANTALLA: agregar un `else if` para un caso intermedio:]

```java
if (edad >= 18) {
    System.out.println("Puedes votar.");
} else if (edad >= 16) {
    System.out.println("Casi. En dos años o menos podrás votar.");
} else {
    System.out.println("Todavía te queda tiempo.");
}
```

[EN PANTALLA: cambiar el valor de `edad` a distintos números y ejecutar para mostrar que cambia el resultado.]

Con `else if` agregan más casos intermedios. Java los evalúa en orden y ejecuta el primero que sea
verdadero.

## Repetir acciones: el bucle for

[EN PANTALLA: limpiar el `main` y empezar desde cero:]

Ahora imaginen que quieren imprimir los números del 1 al 5. Podrían escribir cinco líneas de `println`. Pero si
fueran 100 números, eso sería imposible.

Para eso existen los bucles: instrucciones que se repiten automáticamente.

[EN PANTALLA: escribir:]

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Número: " + i);
}
```

[EN PANTALLA: ejecutar y mostrar los 5 números impresos.]

El `for` tiene tres partes separadas por punto y coma, dentro de los paréntesis.

La primera, `int i = 1`, es el punto de partida: creamos una variable `i` que empieza en `1`.
La segunda, `i <= 5`, es la condición: mientras `i` sea menor o igual a `5`, el bucle sigue. Cuando `i` llega a `6`, la
condición es falsa y el bucle se detiene.
La tercera, `i++`, es el incremento: después de cada vuelta, `i` aumenta en `1`. `i++` es una forma corta de escribir
`i = i + 1`.

Piénsenlo así: es como decirle a la computadora "empieza en `1`, sigue mientras no pases de `5`, y cada vez que
des una vuelta cuenta uno más".

## El bucle while

[EN PANTALLA: agregar debajo del `for`:]

```java
int contador = 1;
while (contador <= 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

[EN PANTALLA: ejecutar y mostrar que el resultado es idéntico al del `for`.]

El `while` hace lo mismo pero escrito de otra manera. Su estructura es más simple: solo tiene la condición. El
punto de partida y el incremento los escriben ustedes antes y dentro del bloque.

¿Cuándo usar `for` y cuándo `while`? La regla práctica: usen `for` cuando saben exactamente cuántas veces va a
repetirse el bucle. Usen `while` cuando no lo saben de antemano — por ejemplo, "sigue pidiendo datos al
usuario hasta que escriba 'salir'".

## Pausa de práctica

[EN PANTALLA: texto en pantalla "¡Tu turno!"]

Pausa el video y abre JDoodle en tu navegador.

Uno: cambia el `if-else` de la edad para que también verifique si la persona puede conducir — en muchos
países se puede con 17 o 18 años.

Dos: modifica el `for` para que imprima los números del `1` al `10` en lugar del `1` al `5`.

Tres: agrega dentro del `for` un `if` que imprima `"par"` si el número es par y `"impar"` si no lo es. Pista: usa el
operador `%`.

[PAUSA: 5 segundos.]

## Cierre

Tres cosas para llevarse de esta lección.

Primera: los operadores aritméticos funcionan como en matemáticas, pero cuando divides dos `int` el
resultado es entero. Usa `%` para obtener el residuo.

Segunda: `if-else` le da al programa la capacidad de tomar decisiones. La condición va entre paréntesis y
debe usar `==` para comparar, no `=`.

Tercera: `for` cuando sabes cuántas repeticiones; `while` cuando no lo sabes. Dentro de cualquier bucle puedes
usar `if` para agregar condiciones.

En la siguiente lección vamos a aprender a organizar el código en bloques reutilizables llamados métodos, y a
hacer que el usuario escriba datos desde el teclado. ¡Los espero ahí!