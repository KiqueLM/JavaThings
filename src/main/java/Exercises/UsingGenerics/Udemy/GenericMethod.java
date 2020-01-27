package Exercises.UsingGenerics.Udemy;

public class GenericMethod {

    public <T> void showArray(T[] array){

        for (T item : array){
            System.out.print(item.toString() + " -> ");
        }
        System.out.println("");

    }

    public <T> T showItem(T t) {

        System.out.println("The item is: " + t.toString());
        return t;

    }

}
