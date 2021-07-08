package Home.Libraries;

public class Reservadas {
    private String nombre;
    private String definicion;

    public Reservadas() {

    }

    public Reservadas(String nombre, String definicion) {
        this.nombre = nombre;
        this.definicion = definicion;
    }


    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + "-" + definicion;
    }
}
