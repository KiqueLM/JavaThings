package Exercises.InnerClasses;

class Demo {

    void show() {
        System.out.println("i am in show method of super class");
    }

}

class AnonymousInnerClass {
    //  An anonymous class with Demo as base class
    private static Demo d = new Demo() {

        void show() {
            super.show();
            System.out.println("i am in AnonymousInnerClass class");
        }

    };

    public static void main(String[] args){
        d.show();
    }

}