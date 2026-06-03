public class Main {
    public static void main(String[] args) {

        int edad = 16;

        // Ejercicio 1: votar y conducir
        if (edad >= 18) {
            System.out.println("Puedes votar.");
        } else if (edad >= 17) {
            System.out.println("Puedes conducir.");
        } else {
            System.out.println("Todavia no puedes votar ni conducir.");
        }

        // Ejercicio 2 y 3: for del 1 al 10 con par e impar
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - par");
            } else {
                System.out.println(i + " - impar");
            }
        }

    }
}