package javaq;
class Student{
    int roll_no;
    
    void read(int r){
        roll_no=r;
    }
    void displayroll(){
        System.out.println("The roll number is "+roll_no);
    }
}

class Test extends Student{
    int marks1;
    int marks2;
    
    void readmarks(int m1,int m2){
        marks1=m1;
        marks2=m2;
    }
    void showmarks(){
        System.out.println("The marks of subjects are:"+marks1+","+marks2);
    }
}
class Result extends Test{
    int total;
    void calculateTotal(){
    total = marks1 + marks2;

}
    void showTotal(){
    System.out.println("The total marks is " + total);
}

}
public class Main {
    public static void main(String[] args) {
         Result r = new Result();   // Result object (inherits Student and Test)
        r.read(101);               // from Student class
        r.readmarks(45, 55);       // from Test class
        r.calculateTotal();        // from Result class
        r.displayroll();           // display roll number
        r.showmarks();             // display marks
        r.showTotal();  
        System.out.println("Nishchal Acharya");
    }
}
