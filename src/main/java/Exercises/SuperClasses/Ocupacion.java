package Exercises.SuperClasses;

public class Ocupacion extends Persona {

    private String ocupacion;

    public Ocupacion(String nombre, String ocupacion) {
            super(nombre);
            this.ocupacion = ocupacion;
        }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.ocupacion;
    }

}