package Exercises.UsingGenerics;

import Exercises.UsingGenerics.Kia;
import Exercises.UsingGenerics.Ford;

public class Principal {

    public static void main(String[] args) {

        Autos<Kia> autos = new Autos<Kia>(3);
        Kia a1 = new Kia("Rio");
        Kia a2= new Kia("Forte");
        Kia a3= new Kia("Sportage");
        Ford a4 = new Ford("Focus");
        Ford a5 = new Ford("Fiesta");

        autos.add(a1);
        autos.add(a2);
        autos.add(a3);
        //autos.add(a4);   No pueden ser agregados porque la lista "autos" solo acepta elementos Kia
        //autos.add(a5);

        System.out.println("La lista de autos Kia es: ");
        for (Kia kia:autos) {
            System.out.println(kia.getModel());
        }

        Autos<Ford> autos2 = new Autos<Ford>(2);
        autos2.add(a4);
        autos2.add(a5);


        System.out.println();
        System.out.println("La lista de autos Ford es: " );
        for (Ford ford:autos2){
            System.out.println(ford.getModel());
        }

    }

}