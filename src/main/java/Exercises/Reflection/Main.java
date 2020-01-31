package Exercises.Reflection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Ordenador> lista = new ArrayList<Ordenador>();
        Ordenador o1 = new Ordenador("A1", "Ordenador gaming", 4);
        Ordenador o2 = new Ordenador("B1", "Ordenador oficina", 2);
        lista.add(o1);
        lista.add(o2);

        for (Ordenador o : lista) {
            System.out.println(o.getId());
            System.out.println(o.getPotencia());
            System.out.println(o.getDescripcion());
        }

        Lavadora l1= new Lavadora("L1","Standard","Lavadora normal");
        Lavadora l2= new Lavadora("L2","VIP","Lavadora avanzada");

        List<Lavadora> lista2= new ArrayList<Lavadora>();
        lista2.add(l1);
        lista2.add(l2);

        for (Lavadora l : lista2) {
            System.out.println(l.getId());
            System.out.println(l.getModelo());
            System.out.println(l.getDescripcion());
        }
    }
}