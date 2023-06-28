
package entidad;


public class Curso {
    
    //atributos
    private int anio;
    private char division;
    private Profesor profesor; //relacion 1 a 1 con la clase Profesor
    
    //constructor vacio
    public Curso() {
    }
    
    //constructor con parametros
    public Curso(int anio, char division, Profesor profesor) {
        this.anio = anio;
        this.division = division;
        this.profesor = profesor;
    }
    
    //setters y getters
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }
    
    
    //conexion la clase curso
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Curso{" + "anio=" + anio + ", division=" + division + ", profesor=" + profesor.toString() + '}';
    }
    
}
