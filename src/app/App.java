
package app;

import entidad.Curso;
import entidad.Profesor;

public class App {
   
    public static void main(String[] args) {
            Profesor profesor = new Profesor();
            profesor.setNombre("Juan");
            profesor.setApellido("Vilchez");
            
            Curso curso = new Curso();
            curso.setAnio(15);
            curso.setDivision('s');
            curso.setProfesor(profesor);
            
            System.out.println(curso.toString());
            
    }
    
}
