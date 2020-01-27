package Exercises.Autobox;

// El autoboxing / unboxing se lleva a cabo con parámetros de método y valores devueltos.

class Autobox {

    //Este método tiene un parámetro Integer.
    static void m (Integer v){
        System.out.println("m() recibe "+v);
    }

    //Este método devuelve un int
    static int m2(){
        return 10;
    }

    //Este método devuelve un Integer
    static Integer m3(){
        return 99;
    }

    public static void main(String[] args) {

        //Pasar una int a m().
        //Debido a que m() tiene un parámetro Integer,
        //el valor int pasado es automáticamente encapsulado.
        m(199);

        //Aquí, iOb recibe el valor int devuelto por m2().
        //Este valor se encapsula automáticamente
        //para que pueda asignarse a iOb
        Integer iOb=m2();
        System.out.println("El valor de retorno de m2() es: "+iOb);

        //A continuación, se llama m3().
        //Esto devuelve un valor Integer
        //que se desencapsula automáticamente en un int.
        int i=m3();
        System.out.println("El valor de retorno de m3() es: "+i);

        //A continuación, se llama a Math.sqrt() con iOb como argumento.
        //En este caso, iOb se desencapsula automáticamente
        //y su valor se promociona a double, que es el tipo que necesita sqrt().
        iOb=100;
        System.out.println("La raíz cuadrada de iOb es: "+Math.sqrt(iOb));

    }

}