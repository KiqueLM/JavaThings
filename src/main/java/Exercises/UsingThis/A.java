package Exercises.UsingThis;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class A {

    static int val = 0;


    public static void foo(B b) {

        val = 1;
        b.valB = 2;
        System.out.println("Metodo de A");
        System.out.println("Valor de val en A: " + val);

    }

    static class B {
        public static int valB = -1;
        public void foo2() {
            System.out.println("Metodo de B");
            System.out.println("Valor de valB antes de llamado: " + valB);
            new A();
            A.foo(this);
            val = 2;
            System.out.println("Valor de val en B: " + val);
            System.out.println("Valor de valB despues de llamado: " + valB);
        }

    }


    public static void main(String[] args) {
        new B().foo2();
    }

}
