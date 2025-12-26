package javaq;

class A {
    int x = 10;

    A() {
        System.out.println("Constructor of class A");
    }
}

class B extends A {
    int x = 20;

    B() {
        super(); 
        System.out.println("Constructor of class B");
    }

    void show() {
        
        System.out.println("Value of x in class B: " + x);
        System.out.println("Value of x in class A using super: " + super.x);
    }
}

class C extends B {

    C() {
        super(); 
        System.out.println("Constructor of class C");
    }
}

public class Main {
    public static void main(String[] args) {

        C obj = new C();   
        obj.show();
        System.out.println("Nishchal Acharya");
    }
}
