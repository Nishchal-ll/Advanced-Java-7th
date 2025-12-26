class Box{
    int length;
    int breadth;
    int height;
    
    Box(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    
    public void display(){
        System.out.println("Length, Breadth and Height are:"+length+","+breadth+","+height);
    }
    public void calculate(){
        int result=length*breadth*height;
        System.out.println("The volume of Box is:"+result);
    }
}
public class Question1 {
    public static void main(String[] args){
        System.out.println("Nishchal Acharya");
        Box b1= new Box(5,4,3);
        b1.display();
        b1.calculate();
    }
    
}
