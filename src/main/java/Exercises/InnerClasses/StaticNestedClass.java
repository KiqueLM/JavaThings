package Exercises.InnerClasses;

class Outer3 {

    private static void outerMethod() {
        System.out.println("inside outerMethod");
    }

    // A static inner class
    static class StaticNestedClass {

        public static void main(String[] args) {
            System.out.println("inside inner class Method");
            outerMethod();
        }

    }

}