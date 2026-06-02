public class Main {
    public static void main(String[] args) {

        //  Operadores aritmeticos 
        int a = 10;
        int b = 3;
        System.out.println("Suma: "           + (a + b));  // 13
        System.out.println("Resta: "          + (a - b));  // 7
        System.out.println("Multiplicacion: " + (a * b));  // 30
        System.out.println("Division: "       + (a / b));  // 3 (entero)
        System.out.println("Modulo: "         + (a % b));  // 1

        // Division con decimales — usar double en al menos una variable
        double c = 10.0;
        System.out.println("Division real: "  + (c / b));  // 3.33...

        //  if / else if / else 
        int edad = 16;
        if (edad >= 18) {
            System.out.println("Puedes votar.");
        } else if (edad >= 16) {
            System.out.println("Casi. En dos anos o menos podras votar.");
        } else {
            System.out.println("Todavia te queda tiempo.");
        }

        //  Bucle for 
        for (int i = 1; i <= 5; i++) {
            System.out.println("Numero: " + i);
        }

        // Bucle while (equivalente al for anterior) 
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        //  Desafio: par o impar 
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
    }
}