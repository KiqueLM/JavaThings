package Exercises.SuperClasses;

public class Proyecto extends Ocupacion {
    private String nombreProyecto;

    public Proyecto(String nombre, String ocupacion, String nombreProyecto){
        super(nombre, ocupacion);
        this.nombreProyecto = nombreProyecto;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    @Override
    public String toString(){
        return super.toString() + " en " + this.nombreProyecto;
    }

}
