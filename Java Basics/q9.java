package javaq;

class Outer {

    int x = 10;
    static int y = 20;

    // (a) Static nested class
    static class StaticNested {
        void display() {
            System.out.println("Static nested class");
            System.out.println("Static variable y = " + y);
        }
    }

    // (b) Non-static nested class (Inner class)
    class Inner {
        void show() {
            System.out.println("Non-static inner class");
            System.out.println("Outer class variable x = " + x);
        }
    }

    void outerMethod() {

        // (c) Local inner class
        class LocalInner {
            void print() {
                System.out.println("Local inner class");
                System.out.println("Sum = " + (x + y));
            }
        }

        LocalInner li = new LocalInner();
        li.print();
    }
}

public class Main {
    public static void main(String[] args) {

        // Static nested class object
        Outer.StaticNested sn = new Outer.StaticNested();
        sn.display();

        // Non-static inner class object
        Outer outer = new Outer();
        Outer.Inner in = outer.new Inner();
        in.show();

        // Local inner class method call
        outer.outerMethod();
    }
}
