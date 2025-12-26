package javaq;

interface Shape{
    void area(double x,double y);
    void perimeter(double x,double y);
}

class Rectangle implements Shape{
   
     double length;
    double breadth;
    
    @Override
    public void area(double x, double y) {
        length=x;
        breadth=y;
        System.out.println("The area is:"+(length+breadth));
    }

    @Override
    public void perimeter(double x, double y) {
        length=x;
        breadth=y;
        System.out.println("The perimeter is:"+2*(length+breadth));
    }
}


public class Main {
    public static void main(String[] args) {

       Rectangle r1= new Rectangle();
       r1.area(2,4);
       r1.perimeter(5,7);

        System.out.println("Nishchal Acharya");
    }
}
