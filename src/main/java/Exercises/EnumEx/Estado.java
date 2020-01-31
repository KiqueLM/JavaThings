package Exercises.EnumEx;

import java.io.PrintStream;

public enum Estado {

    POR_INICIAR("El proceso aún no ha iniciado. Estado: [ %s ]. Mi número random es: %s ", "56"),

    EN_PROGRESO("El proceso se encuentra en progreso. Estado: [ %s ]. Mi número random es:  %s ", "4"),

    FINALIZADO("El proceso finalizó correctamente. Estado: [ %s ]. Mi número random es: %s ", "123"),

    ERROR("El proceso finalizo con errores. Estado: [ %s ]. Mi número random es: %s ", "27");


    private String mensaje;
    private String numRandom;

    //private Estado(String mensaje) {
    //    this.mensaje = mensaje;
    //}

    private Estado(String mensaje, String numRandom ) {
        //this(mensaje);
        this.mensaje = mensaje;
        this.numRandom = numRandom;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public String getNumRandom(){
        return this.numRandom;
    }

}