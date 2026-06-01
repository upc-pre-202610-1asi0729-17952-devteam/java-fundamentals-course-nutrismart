public class Main{
    public static void main(String args[]) {
        
        //Creación de 2 objetos: e1 y e2
        Estudiante e1 = new Estudiante("María", 15, 18.5);
        Estudiante e2 = new Estudiante("Carlos", 16, 14.0);

        //Uso de los getters para nombre y nota de e1 
        System.out.println("Estudiante: " + e1.getNombre());
        System.out.println("Nota: " + e1.getNota());

        //Uso de setter y getter para nota de e1 
        e1.setNota(19.0);
        System.out.println("Nueva nota: " + e1.getNota());
    }
}