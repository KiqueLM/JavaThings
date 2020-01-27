package Exercises.UsingGenerics.Udemy;

public class IniciarApp {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        //genericMethod.showItem("Hellow t item");
        //System.out.println("The returned item is: " + genericMethod.showItem("Hellow"));

        Integer[] integerArray = {12, 13, 6, 20, 2};
        String[] stringArray = {"Paco", "Luis", "Pedro"};

        genericMethod.showArray(integerArray);
        genericMethod.showArray(stringArray);
    }
}
