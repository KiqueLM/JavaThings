package Exercises.UsingGenerics.Udemy;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildcard {

    public static void sum(List<? extends Number> list) {
     double sum = 0.0;

     for (Number n : list) {
         sum = sum + n.doubleValue();
     }
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        sum(Arrays.asList(1.1,2.2,3.3,4.5));
    }

}
