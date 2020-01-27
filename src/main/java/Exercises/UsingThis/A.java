package Exercises.UsingThis;


public class A {

    public static void foo(B b) {

        b.valB = 2;
        System.out.println("Metodo de A");

    }

    static class B {

        public static int valB = -1;
        public void foo2() {
            System.out.println("Metodo de B");
            System.out.println("Valor de valB antes de llamado: " + valB);

            A.foo(this);

            System.out.println("Valor de valB despues de llamado: " + valB);

        }

    }


    public static void main(String[] args) {

        new B().foo2();

    }

}
