package Exercises.InnerClasses;

class NestedOuter {
    // Simple nested inner class
    class NestedInner {

        public void show() {
            System.out.println("In a nested class method");
        }

    }

}

class NestedInnerClass {

    public static void main(String[] args) {
        NestedOuter.NestedInner in = new NestedOuter().new NestedInner();
        in.show();
    }

}