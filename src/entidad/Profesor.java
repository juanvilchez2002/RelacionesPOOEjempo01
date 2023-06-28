
package entidad;


public class Profesor {
    
    //atributos
    private String nombre;
    private String apellido;
    
    //constructor vacio
    public Profesor() {
    }

    //constructor con parametros
    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //toString
    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
