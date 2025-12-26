package javaq;
class Student {
    String name;
    int age;
  
    Student() {
        name = "Unknown";
        age = 0;
       
    }
    Student(String n, int a) {
        name = n;
        age = a;
       
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
   Student s1 = new Student();
        Student s2 = new Student("Ram", 20);
        s1.display();
        s2.display();
        System.out.println("Nishchal Acharya");
    }
}
