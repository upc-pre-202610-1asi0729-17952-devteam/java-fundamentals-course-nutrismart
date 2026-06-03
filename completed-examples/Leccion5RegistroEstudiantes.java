public class RegistroEstudiantes {
    public static void main(String args[]) {
        String[] nombres = new String[3];
    
        nombres[0] = "Maria";
        nombres[1] = "Carlos";
        nombres[2] = "Lucia";
        
        for(int i=0; i< nombres.length; i++){
            System.out.println(nombres[i]);
        }
        
        Estudiante[] estudiantes = new Estudiante[3];
        
        estudiantes[0] = new Estudiante("Maria", 15, 18.5);
        estudiantes[1] = new Estudiante("Carlos", 16, 14.0);
        estudiantes[2] = new Estudiante("Lucia", 17, 16.5);
        
        for(int i=0; i<estudiantes.length; i++){
            System.out.println(estudiantes[i].getNombre() + ": " + estudiantes[i].getNota());
        }
        
        String texto = "hola mundo";
        System.out.println(texto.length());
        System.out.println(texto.toUpperCase());
        System.out.println(texto.contains("mundo"));
    }
}