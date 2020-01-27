package Exercises.UsingGenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class Autos<T> implements Iterable<T>{
    private ArrayList<T> lista= new ArrayList<T>();
    private int tope;

    public Autos(int tope){
        super();
        this.tope = tope;
    }

    public void add(T objeto ) {
        if (lista.size() <= tope) {
            lista.add(objeto);
        }else {
            throw new RuntimeException("No caben más objetos");
        }
    }

    public Iterator<T> iterator() {
        return lista.iterator();
    }

}
