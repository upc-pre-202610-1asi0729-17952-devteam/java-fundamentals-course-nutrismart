# LECCIÓN 1 — Introducción a Java y Variables
**Narrador: Joel | Duración estimada: ~12 minutos**

---

[EN PANTALLA: mostrar la diapositiva de introduccion]

Hola, bienvenidos. Me alegra que estén aquí.

En este video vamos a responder una pregunta que quizás nunca se han hecho: ¿cómo sabe una computadora qué hacer? ¿Quién le da las instrucciones?

La respuesta es: los programadores. Y hoy van a empezar a serlo.

No necesitan instalar ningún programa. No necesitan saber nada de computadoras. Solo necesitan el navegador que ya tienen abierto. Empecemos.

---

## ¿Qué es programar?

Piensen en seguir una receta de cocina. La receta le dice al cocinero exactamente qué hacer, en qué orden, con qué ingredientes. Si el cocinero sigue todos los pasos, el resultado siempre es el mismo plato.

Un programa de computadora es exactamente eso: una receta que le dice a la computadora qué hacer, paso por paso. La computadora no improvisa, no adivina, no interpreta. Hace exactamente lo que le dicen, en el orden en que se lo dicen.

Eso, lo que escriben ustedes para darle instrucciones a la computadora, se llama **código**.

---

## ¿Qué es Java?

Java es un lenguaje de programación. Así como el español es un idioma para que las personas se comuniquen entre sí, Java es un idioma para que las personas se comuniquen con las computadoras.

¿Por qué Java? Porque es uno de los lenguajes más usados en el mundo. Las aplicaciones de Android, los sistemas de los bancos, plataformas como LinkedIn y Twitter — todo eso está escrito en Java o en lenguajes que funcionan de manera muy similar.

Y lo importante para este curso: Java es un excelente lenguaje para aprender a programar porque te obliga a ser preciso y ordenado desde el principio.

---

## El primer programa: Hola mundo

[EN PANTALLA: en JDoodle, abrir el archivo Main.java. Está en blanco o tiene solo la estructura mínima de la clase.]

Todo programa en Java vive dentro de lo que se llama una **clase**. Por ahora no se preocupen por entender exactamente qué es — lo van a ver en detalle más adelante. Solo sepan que es la "caja" que contiene el código.

[EN PANTALLA: escribir lentamente:]

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }
}
```

[EN PANTALLA: presionar el botón de ejecutar (Run) y mostrar la consola con "Hola mundo".]

Ahí está. "Hola mundo" en la consola. Acaban de ejecutar su primer programa en Java.

Déjenme explicar las tres líneas más importantes.

La primera, `public class Main`, es la declaración de la clase. Es como poner el nombre a la "caja" que contiene el programa. En JDoodle, el archivo se llama `Main.java` y la clase también se llama `Main` — siempre tienen que coincidir.

La segunda, `public static void main(String[] args)`, es la puerta de entrada del programa. Cuando ejecutan el código, Java busca exactamente esta línea y empieza por ahí. No pueden cambiar su nombre ni su forma — tiene que ser exactamente así.

La tercera, `System.out.println("Hola mundo")`, es la instrucción que imprime texto en la consola. `System.out.println` significa "imprimir una línea en la salida del sistema". Todo lo que escriban entre las comillas va a aparecer en pantalla.

---

## Variables: las cajas donde guardamos datos

[EN PANTALLA: debajo de la línea de `println`, agregar comentario y empezar a escribir variables:]

Imaginen que necesitan guardar el nombre de un estudiante, su edad y su nota. ¿Dónde lo guardan?

En programación, los datos se guardan en **variables**. Una variable es como una caja con nombre: tiene una etiqueta que dice qué guarda y un espacio donde se guarda el dato.

En Java, cada variable tiene un **tipo**, que le dice a la computadora qué clase de dato va a guardar. Y ese tipo no puede cambiar: si la caja es para números enteros, no puedes meter texto. Java es estricto con eso.

[EN PANTALLA: escribir, línea por línea, dentro del método `main`:]

```java
int edad = 15;
```

[EN PANTALLA: señalar con el cursor cada parte mientras se describe.]

Miren esta línea. Tiene cuatro partes. La primera es `int`, que es el tipo: aquí van a ir números enteros — sin decimales, sin letras, solo números enteros como 0, 15 o -3. La segunda es `edad`, que es el nombre que le damos a la variable — pueden ponerle cualquier nombre que tenga sentido para ustedes. La tercera es el signo `=`, que no significa "igual" como en matemáticas sino "guarda esto en esa caja". Y la cuarta es `15`, el dato que estamos guardando.

[EN PANTALLA: agregar la siguiente variable:]

```java
double nota = 18.5;
```

Ahora `double`. Este tipo es para números con decimales, como notas, precios, temperaturas. El nombre `double` viene de "doble precisión" — no se preocupen por eso; solo recuerden que `double` = números con punto decimal.

[EN PANTALLA: agregar:]

```java
String nombre = "María";
```

`String` es para texto: palabras, frases, nombres. La diferencia visible es que el valor va entre comillas dobles. Fíjense que `String` empieza con mayúscula — en Java eso importa: `String` con mayúscula es correcto; `string` con minúscula da error.

[EN PANTALLA: agregar:]

```java
boolean aprobado = true;
```

Y `boolean` es para guardar solo dos posibles valores: `true` o `false`. Verdadero o falso. Sirve para representar estados: ¿aprobó o no aprobó? ¿Está activo o no? ¿Tiene descuento o no?

[EN PANTALLA: agregar líneas de `println` para cada variable:]

```java
System.out.println("Nombre: " + nombre);
System.out.println("Edad: " + edad);
System.out.println("Nota: " + nota);
System.out.println("Aprobado: " + aprobado);
```

[EN PANTALLA: ejecutar el programa y mostrar la consola con los cuatro datos impresos.]

¿Ven? El `+` entre las comillas y la variable une el texto con el valor de la variable. A eso se le llama concatenación — unir textos. Y el programa imprime cada dato en su propia línea.

---

## Pausa de práctica

[EN PANTALLA: texto en pantalla "¡Tu turno!"]

Pausa el video y abre el JDoodle de esta lección — el enlace está en la descripción.

Si aún no tienes cuenta en JDoodle, regístrate gratis en jdoodle.com — solo necesitas un correo.

Una vez dentro, haz clic en **Fork** para crear tu propia copia editable del código.

Antes de hacer los cambios, repite en tu JDoodle lo que vimos en el video siguiendo los comentarios como guía. Cuando tengas el código completo, haz estas modificaciones:

Uno: cambia el valor de `nombre` por tu nombre real y ejecuta el programa.

Dos: cambia el valor de `edad` por tu edad real y vuelve a ejecutar.

Tres: agrega una variable nueva. Por ejemplo: `String ciudad = "Lima";` y después imprime su valor con `System.out.println`.

Los demás valores los puedes dejar igual o cambiarlos si gustas.

[PAUSA: 5 segundos.]

---

## Cierre

Tres cosas para llevarse de esta lección.

Primera: un programa es una secuencia de instrucciones que la computadora sigue al pie de la letra. `System.out.println` imprime texto en consola.

Segunda: las variables son cajas con nombre y tipo donde guardamos datos. Los cuatro tipos básicos son `int` para enteros, `double` para decimales, `String` para texto y `boolean` para verdadero/falso.

Tercera: en Java cada línea termina con punto y coma, y el tipo de una variable no puede cambiar después de declararse.

En la siguiente lección vamos a aprender a hacer cosas con esos datos: operaciones matemáticas, comparaciones y cómo hacer que el programa tome decisiones. ¡Los espero ahí!