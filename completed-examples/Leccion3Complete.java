import java.util.Scanner;

public class Main {        
    
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "! Bienvenido al programa.");
    }
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu nombre?");
        String nombre = teclado.nextLine();
        
        System.out.println("¿Cuántos años tienes?");
        int edad = teclado.nextInt();
        
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
        
        /*
        saludar("María");
        saludar("Carlos");
        
        int resultado = sumar(8, 5);
        System.out.println("La suma es: " + resultado);
        */
    }
}