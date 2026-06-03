# LECCIÓN 4 — Clases, Objetos y Encapsulación

---

[EN PANTALLA: abrir JDoodle con dos archivos: Estudiante.java vacío y Main.java con el main vacío.]

Hola, bienvenidos de vuelta.

En las lecciones anteriores aprendieron variables, operadores, estructuras de control y métodos. Todas esas herramientas son poderosas, pero en programas reales necesitamos algo más: la capacidad de crear nuestros propios tipos de datos, que representen cosas del mundo real.

Eso es exactamente lo que hace la **programación orientada a objetos** — a la que de ahora en adelante vamos a llamar POO. Y el concepto central de la POO es la **clase**.

## Clase y objeto: el molde y la galleta

Piensen en un molde de galletas. El molde define la forma: puede ser una estrella, un círculo, un corazón. Pero el molde solo no es una galleta — es la plantilla para hacer galletas. Cada galleta que haces con ese molde es real, puede tener distintos colores o sabores, pero todas comparten la misma forma.

En POO: una **clase** es el molde. Un **objeto** es la galleta que hiciste con ese molde.

Si creo una clase Estudiante, esa clase define qué información tiene todo estudiante: nombre, edad, nota.
Cada Estudiante concreto que creo en el programa es un objeto diferente, con sus propios datos, pero
todos siguen el mismo molde.

## Crear la clase Estudiante

[EN PANTALLA: hacer clic en Estudiante.java y empezar a escribir:]


```
public class Estudiante {
}
```
Ya tenemos la caja. Ahora vamos a definir qué información tiene cada estudiante. A esos datos se les llama
**atributos**.

[EN PANTALLA: dentro de la clase, agregar los atributos:]

```
public class Estudiante {
private String nombre;
private int edad;
private double nota;
}
```
Noten la palabra private antes de cada atributo. private significa privado — solo la propia clase puede acceder directamente a esos datos. Nadie de afuera puede entrar a modificarlos sin permiso.

¿Por qué protegerlos así? Imaginen que los atributos de una clase son el interior de una caja fuerte. Si cualquiera pudiera meter la mano y cambiar la nota de un estudiante sin ningún control, el programa sería caótico. private es el cerrojo de esa caja fuerte.

## El constructor: la receta para hacer una galleta

[EN PANTALLA: dentro de la clase, después de los atributos, agregar:]

```
public Estudiante(String nombre, int edad, double nota) {
this.nombre = nombre;
this.edad = edad;
this.nota = nota;
}
```

El **constructor** es el método especial que se ejecuta en el momento en que crean un nuevo objeto. Es como lareceta: le dice a Java cómo "armar" un nuevo estudiante con los datos que le pasen.

this.nombre se refiere al atributo de la clase, para distinguirlo del parámetro que tiene el mismo nombre.
this significa "yo mismo" — el objeto que se está creando.

## Crear un objeto en Main

[EN PANTALLA: ir a Main.java y escribir dentro del main:]


```
Estudiante e1 = new Estudiante("María", 15 , 18.5);
Estudiante e2 = new Estudiante("Carlos", 16 , 14.0);
```
[EN PANTALLA: ejecutar y comprobar que no hay error (el programa corre sin imprimir nada todavía).]

new Estudiante(...) es la instrucción que crea el objeto — la que "fabrica la galleta". Los tres datos entre paréntesis van al constructor, que los guarda en los atributos.

Ahora tienen dos objetos distintos: e1 es María con nota 18.5, y e2 es Carlos con nota 14.0. Mismo molde, datos distintos.

## Getters y setters: la ventanilla controlada

Los atributos son privados. Entonces, ¿cómo acceden a ellos desde Main? Con **getters** y **setters**.

Un **getter** es un método que devuelve el valor de un atributo — como una ventanilla de información donde pueden ver el dato pero no tocarlo directamente.

Un **setter** es un método que permite cambiar el valor de un atributo de forma controlada — como la única puerta de entrada a la caja fuerte.

[EN PANTALLA: volver a Estudiante.java y agregar los getters y setters:]

```
public String getNombre() {
return nombre;
}
public int getEdad() {
return edad;
}
public double getNota() {
return nota;
}
public void setNota(double nuevaNota) {
if (nuevaNota >= 0 && nuevaNota <= 20 ) {
this.nota = nuevaNota;
}
}
```

Miren el setter de nota. Antes de cambiar el valor, verifica que la nueva nota esté entre 0 y 20. Si alguien intenta poner una nota de 25 o de -5, el setter lo rechaza. Eso es **encapsulación** : los datos están protegidos y solo se pueden modificar de manera controlada.

## Usar los getters desde Main


[EN PANTALLA: volver a Main.java y agregar:]

```
System.out.println("Estudiante: " + e1.getNombre());
System.out.println("Nota: " + e1.getNota());
e1.setNota(19.0);
System.out.println("Nueva nota: " + e1.getNota());
```

[EN PANTALLA: ejecutar y mostrar los resultados en consola.]

e1.getNombre() llama al getter del objeto e1 y devuelve su nombre. e1.setNota(19.0) cambia la nota de ese estudiante específico — solo el de e1, no el de e2.

## Pausa de práctica

[EN PANTALLA: texto en pantalla "¡Tu turno!"]

Pausa el video y abre el JDoodle de esta lección.
Primero: agrega un tercer atributo a Estudiante — por ejemplo private String ciudad — con su getter y setter correspondientes.

Segundo: crea un tercer objeto e3 con datos distintos a e1 y e2, e imprime su nombre y nota.

Tercero: llama al setNota de e2 con un valor mayor a 20 y observa que no cambia gracias a la validación del setter.

[PAUSA: 5 segundos.]

## Cierre

Tres cosas para llevarse de esta lección.

Primera: una clase es el molde; un objeto es la instancia concreta creada con new. Pueden crear tantos objetos como necesiten de la misma clase.

Segunda: los atributos con private están protegidos — nadie puede modificarlos directamente desde afuera.

Tercera: los getters y setters son la interfaz controlada para leer y modificar los atributos. El setter puede incluir validaciones para proteger la integridad de los datos. A eso se le llama encapsulación.

En la siguiente lección vamos a combinar todo lo que aprendieron — variables, bucles, métodos, clases — para construir un programa completo y real. ¡Los espero ahí!