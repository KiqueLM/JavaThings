package Exercises.UsingGenerics.Udemy;

public class classEight {

    public  static <T extends Comparable<T>> T calculateMin(T t1, T t2){
        if (t1.compareTo(t2) < 0) {
            return t1;
        } else {
            return t2;
        }

    }

    public static void main(String[] args) {
        System.out.println(calculateMin("Pedro", "Armando"));
    }

}
