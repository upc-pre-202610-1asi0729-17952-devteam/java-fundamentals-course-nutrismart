import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[3];
        
        //Pedir datos al usuario
        for(int i=0; i<3; i++){
            System.out.println("Nombre del estudiante " + (i+1) + ": "  );
            String nombre = teclado.nextLine();
            
            System.out.println("Nota de " + nombre + ": ");
            double nota = teclado.nextDouble();
            teclado.nextLine();
            
            //Crear el objeto
            estudiantes[i] = new Estudiante(nombre, 0, nota);
        }
        
        //Calcular el promedio y encontrar la nota más alta
        double suma = 0;
        double notaMaxima = estudiantes[0].getNota();
        String mejorEstudiante = estudiantes[0].getNombre();
        
        for(int i=0; i< estudiantes.length; i++){
            suma += estudiantes[i].getNota();
            
            if(estudiantes[i].getNota() > notaMaxima) {
                notaMaxima = estudiantes[i].getNota();
                mejorEstudiante = estudiantes[i].getNombre();
            }
        }
        
        double promedio = suma / estudiantes.length;
        
        //Mostrar resultados
        
        System.out.println("\n--Resultados--");
        System.out.println("Promedio del grupo: "+ promedio);
        System.out.println("Mejor nota: "+ mejorEstudiante + " con " + notaMaxima);
    }
}
