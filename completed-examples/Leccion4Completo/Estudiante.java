//Clase Estudiante
public class Estudiante {
    
    //Atributos encapsulados de la clase
    private String nombre;
    private int edad;
    private double nota;

    //Constructor y sus parámetros
    public Estudiante(String nombre, int edad, double nota) {
        //'this' diferencia el atributo de la clase del parámetro del constructor
        //this.nombre -> Atributo de la clase
        //nombre -> Parámetro del constructor
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    //Getter para atributo nombre
    public String getNombre() {
        return nombre;
    }

    //Getter para atributo edad
    public int getEdad() {
        return edad;
    }

    //Getter para atributo nota
    public double getNota() {
        return nota;
    }

    //Setter que actualiza la nota solo si se encuentra en el rango de 0 a 20
    public void setNota(double nuevaNota) {
        if (nuevaNota >= 0 && nuevaNota <= 20) {
            this.nota = nuevaNota;
        }
    }
    
}