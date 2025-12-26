package javaq;

abstract class figure{
    abstract void area();
}

class rectangle extends figure{
    int l=5,b=6;
    
    @Override
    void area(){
        System.out.println("The area of rectangle is "+l*b);
    }
}

class triangle extends figure{
    int b=6,h=7;
    
    void area(){
        System.out.println("The area of triangle is "+(b*h)/2);
    }
}

interface demo1{
    void show();
}
interface demo2{
    void show1();
}

class Maindemo implements demo1,demo2{
    public void show(){
        System.out.println("This is interface of demo1");
    }

       public void show1(){
        System.out.println("This is interface of demo2");
    }
}
public class Main {
    public static void main(String[] args) {
figure f;
f= new rectangle();
f.area();
       
f= new triangle();
f.area();

Maindemo md= new Maindemo();
md.show();
md.show1();
System.out.println("Nishchal Acharya");
    }
}
