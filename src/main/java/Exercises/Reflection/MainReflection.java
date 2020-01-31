package Exercises.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MainReflection {

    public static void main(String[] args) {

        List<Ordenador> lista = new ArrayList<Ordenador>();
        Ordenador o1 = new Ordenador("PC1", "Ordenador gaming", 4);
        Ordenador o2 = new Ordenador("PC2", "Ordenador oficina", 2);
        lista.add(o1);
        lista.add(o2);

        Lavadora l1= new Lavadora("L1","Standard","Lavadora normal");
        Lavadora l2= new Lavadora("L2","VIP","Lavadora avanzada");

        List<Lavadora> lista2= new ArrayList<Lavadora>();
        lista2.add(l1);
        lista2.add(l2);

        imprimirListaCualquiera(lista);
        imprimirListaCualquiera(lista2);

    }

    public static void imprimirListaCualquiera(List<?> lista) {

        for(Object c: lista) {

            Method[] metodos=c.getClass().getMethods();
            for(Method m: metodos) {

                //System.out.println(m.getName());

                if (m.getName().equals("getId") || m.getName().equals("getDescripcion")) {

                    try {

                        String cadena=(String) m.invoke(c, null);
                        System.out.println("El campo es: " + cadena + " y su returnType es: " + m.getReturnType());

                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }
        }

    }
}