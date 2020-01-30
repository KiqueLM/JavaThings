package Exercises.InnerClasses;

class Outer2 {

    void outerMethod() {

        final int x=98;
        System.out.println("inside outerMethod");

        class Inner {
            void innerMethod() {
                System.out.println("x = "+x);
            }

        }

        Inner y = new Inner();
        y.innerMethod();

    }

}

class MethodLocalVariableDemo {

    public static void main(String[] args){
        Outer2 x = new Outer2();
        x.outerMethod();
    }

}